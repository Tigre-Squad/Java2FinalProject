
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

public class MultServeV5 extends JFrame {
   String record = "";
   ArrayList<Conn> list = new ArrayList<Conn>();

   public static void main(String[] args) {
      new MultServeV5();
   }

   public MultServeV5() {
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

      }

      public void run() {
         int msgNum = 0;
         int servNum = 0;
         // ObjectInputStream buff;
         PrintWriter pwr;
         Object ting;
         String clientMsg;
         String Msg;
         // while(true){

         try {
            InputStream in = cs.getInputStream();
            OutputStream out = cs.getOutputStream();
            ObjectInputStream buff = new ObjectInputStream(in);
            ObjectOutputStream pout = new ObjectOutputStream(out);
            Object read = buff.readObject();
            String first = (String) read;

            String[] u = first.split(":");
            System.out.println(u[0]);
            username = u[0];
            servNum = list.size();
            Conn add = new Conn(username, cs, in, out, pout, buff);
            list.add(add);
            System.out.print(read);
            for (int i = 0; i < list.size(); i++) {
               System.out.print("sending");
               ObjectOutputStream poutt = ((Conn) list.get(i)).getOout();
               System.out.print("sending2");
               // poutt.writeObject(read);
               poutt.writeObject("ahhh");
               System.out.print("sending3");
               poutt.flush();
               poutt.close();
               System.out.print("sent");

            }
            System.out.println(cs + "\n" + username);

            while (true) {
               System.out.println("start");
               boolean shh = false;
               ting = buff.readObject();
               while ((ting) != null) {
                  System.out.print("thing");

                  if (ting instanceof String) {
                     clientMsg = (String) ting;
                     Msg = "";
                     if (clientMsg != null) {
                        String[] user = clientMsg.split(":");
                        // if(msgNum==0){
                        // System.out.println(user[0]);
                        // username = user[0];
                        // servNum = list.size();
                        // Conn add = new Conn(username, cs);
                        // list.add(add);
                        //
                        // System.out.println(cs+"\n");
                        // }
                        if (user[0].equals("wisper")) {
                           boolean contt = true;
                           int temp = 0;
                           while (contt) {

                              System.out.print(temp);
                              if (user[1].equals(((Conn) list.get(temp)).getUnam())) {
                                 Msg += ((Conn) list.get(servNum)).getUnam();
                                 Msg += (":" + clientMsg);
                                 ObjectOutputStream poutt = ((Conn) list.get(temp)).getOout();
                                 pout.writeObject(Msg);
                                 pout.flush();

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

                        if (!shh) {
                           Msg += ((Conn) list.get(servNum)).getUnam();
                           Msg += (":" + clientMsg);

                           System.out.println("Server read:" + clientMsg);
                           for (int i = 0; i < list.size(); i++) {
                              ObjectOutputStream poutt = ((Conn) list.get(i)).getOout();
                              poutt.writeObject(Msg);
                              poutt.flush();
                              poutt.close();

                           }
                           record += ("\n" + Msg);
                        } else {
                        }

                        msgNum++;
                        System.out.print("msg DONE\n");
                     } else {
                     }
                  }
                  ting = null;
               }
            }
         } catch (IOException eh) {
            // System.out.println("IO ERROR writer");
         } catch (NullPointerException none) {

         } catch (ClassNotFoundException noo) {

         }

      }

      // }

   }

   // put output stream into this object and then call it instead of making a new
   // one
   public class Conn {
      Socket sock;
      String User;
      InputStream in;
      OutputStream out;
      ObjectOutputStream oOut;
      ObjectInputStream oIn;

      public Conn(String Unam, Socket soc, InputStream inp, OutputStream outt, ObjectOutputStream poutt,
            ObjectInputStream oinn) {
         sock = soc;
         User = Unam;
      }

      public String getUnam() {
         return User;
      }

      public Socket getSocket() {
         return sock;
      }

      public InputStream getIn() {
         return in;
      }

      public OutputStream getOut() {
         return out;
      }

      public ObjectInputStream getOin() {
         return oIn;
      }

      public ObjectOutputStream getOout() {
         return oOut;
      }
   }

}