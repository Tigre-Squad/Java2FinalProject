
/**
multithread server
Evan Jurdan
C:\Users\Evan\Desktop\java2\ccpresent3,28,2020\MultiThreadServer
java MultServ


**/
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class MultServV4 extends JFrame {
   String record = "";
   ArrayList<Conn> list = new ArrayList<Conn>();

   public static void main(String[] args) {
      new MultServV4();
   }

   public MultServV4() {
      JTextArea jtaBig;
      JButton jbLoad;
      JPanel jpTop;
      JPanel jpBot;
      setLayout(new BorderLayout(10, 10));
      jbLoad = new JButton("LOAD");
      jpTop = new JPanel();
      jpBot = new JPanel();
      jpTop.setLayout(new GridLayout(1, 0));
      jpBot.setLayout(new BorderLayout());
      jtaBig = new JTextArea(30, 30);
      jtaBig.setEditable(false);
      JScrollPane jspScroll = new JScrollPane(jtaBig, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
      jpBot.add(jbLoad, BorderLayout.CENTER);
      jpTop.add(jspScroll);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      add(jpTop, BorderLayout.CENTER);
      add(jpBot, BorderLayout.SOUTH);
      pack();
      setVisible(true);

      ActionListener alSnd = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            jtaBig.setText(record);
         }
      };

      jbLoad.addActionListener(alSnd);

      ServerSocket ss = null;

      try {
         System.out.println("getLocalHost " + InetAddress.getLocalHost());
         System.out.println("getByName " + InetAddress.getByName("localhost"));
         ss = new ServerSocket(16789);
         Socket cs = null;
         while (true) {
            cs = ss.accept();
            ThreadServer ths = new ThreadServer(cs);

            ths.start();
         }

      } catch (BindException bd) {
         System.out.println("something already running on this port");
      } catch (IOException eh) {
         System.out.println("IO ERROR weird");
      }

   }

   class ThreadServer extends Thread {
      Socket cs;
      String username = "";

      public ThreadServer(Socket _cs) {
         cs = _cs;
         // list.add(cs);

      }

      public void run() {
         int msgNum = 0;
         int servNum = 0;
         BufferedReader buff;
         PrintWriter pwr;
         String clientMsg;
         String Msg;
         while (true) {

            try {
               buff = new BufferedReader(new InputStreamReader(cs.getInputStream()));
               while (true) {
                  boolean shh = false;
                  clientMsg = buff.readLine();
                  Msg = "";
                  if (clientMsg != null) {
                     String[] user = clientMsg.split(":");
                     if (msgNum == 0) {
                        System.out.println(user[0]);
                        username = user[0];
                        servNum = list.size();
                        Conn add = new Conn(username, cs);
                        list.add(add);

                        System.out.println(cs);
                     } else if (user[0].equals("wisper")) {
                        boolean contt = true;
                        int temp = 0;
                        while (contt) {

                           System.out.print(temp);
                           // make an object and have it be used to store socket and uName and make a
                           // single array to read that
                           if (user[1].equals(((Conn) list.get(temp)).getUnam())) {
                              Msg += ((Conn) list.get(servNum)).getUnam();
                              Msg += (":" + clientMsg);
                              pwr = new PrintWriter(
                                    new OutputStreamWriter((((Conn) list.get(temp)).getSocket()).getOutputStream()));
                              pwr.println(Msg);
                              pwr.flush();

                              contt = false;
                           } else {
                           }
                           temp++;
                           if (temp >= list.size()) {
                              contt = false;
                           } else {
                           }
                        }
                        shh = true;
                     } else {
                     }
                     // boolean cont = true;
                     // while(cont){
                     // int temp = 0;
                     // if(cs == list.get(temp)){
                     // Msg+=uName.get(temp);
                     // Msg+=(":"+clientMsg);
                     // cont=false;
                     // }
                     // else{}
                     // temp++;
                     if (!shh) {
                        Msg += ((Conn) list.get(servNum)).getUnam();
                        Msg += (":" + clientMsg);

                        // cont=false;
                        // }
                        System.out.println("Server read:" + clientMsg);
                        for (int i = 0; i < list.size(); i++) {
                           pwr = new PrintWriter(
                                 new OutputStreamWriter((((Conn) list.get(i)).getSocket()).getOutputStream()));
                           // pwr.println(clientMsg);
                           pwr.println(Msg);
                           pwr.flush();
                        }
                        record += ("\n" + Msg);
                     } else {
                     }
                     // String[] user = clientMsg.split(":");
                     // if(msgNum==0){
                     // System.out.println(user[0]);
                     // username = user[0];
                     // list.add(cs);
                     // uName.add(username);
                     // }
                     // else{}
                     msgNum++;
                     System.out.print("msg DONE\n");
                  } else {
                  }
               }
            } catch (IOException eh) {
               // System.out.println("IO ERROR writer");
            } catch (NullPointerException none) {

            }
         }

      }

   }

   public class Conn {
      Socket sock;
      String User;

      public Conn(String Unam, Socket soc) {
         sock = soc;
         User = Unam;
      }

      public String getUnam() {
         return User;
      }

      public Socket getSocket() {
         return sock;
      }
   }

}