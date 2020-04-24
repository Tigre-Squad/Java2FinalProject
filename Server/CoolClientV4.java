
/**
cool client
Evan Jurdan
C:\Users\Evan\Desktop\java2\ccobj
java MultServ

cd Desktop\java2\ccobj
java CoolClient

**/
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class CoolClientV4 extends JFrame {
   /**
    *
    */
   private static final long serialVersionUID = 1L;
   JTextArea jtaBig;
   JTextField jtfWord;
   JTextField jtfIP;
   JTextField jtfUserName;
   JTextField jtfPort;
   JTextField jtfWisper;
   JButton jbConnect;
   JButton jbDisConnect;
   JButton jbSend;
   JButton jbWisper;
   JPanel jpTTop;
   JPanel jpTop;
   JPanel jpBot;
   JPanel jpBotIn;
   String USERNAME;
   String SERVER;
   JButton jbLeave;
   Socket s;
   boolean bigCont = false;
   boolean noconect = true;

   public static void main(String[] args) {

      // System.out.print("Enter Username: ");
      // Scanner in = new Scanner(System.in);
      // String user = in.nextLine();
      CoolClientV4 meow = new CoolClientV4();

   }

   public void noCare() {
      noconect = false;
   }

   public void tryAgain() {
      JOptionPane.showMessageDialog(null, "server or port not availible, try again", "error",
            JOptionPane.ERROR_MESSAGE);
   }

   public void setSocket(String server, int port) {
      try {
         // s = new Socket("localhost" , 16789);
         s = new Socket(server, port);
      } catch (UnknownHostException noknow) {
         System.out.println("no host");
         tryAgain();
         bigCont = false;
      } catch (IOException eh) {

      }
      noconect = false;
   }

   public void sendthing(String thing, Socket s, String username) {
      if (bigCont) {
         try {

            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();
            PrintWriter pout = new PrintWriter(out);
            pout.println(thing);
            pout.flush();
            // Listener listen = new Listener(s);
            // listen.start();

         } catch (UnknownHostException noknow) {
            System.out.println("no host");
         } catch (IOException eh) {

         }
      } else {
      }
   }

   public void connect(String server, String username, String port) {
      SERVER = server;
      USERNAME = username;
      Scanner temp = new Scanner(port);
      int Port = 1;
      boolean cont = true;
      try {
         Port = temp.nextInt();
      } catch (NoSuchElementException eh) {
         cont = false;
         JOptionPane.showMessageDialog(null, "enter a valid port number", "error", JOptionPane.ERROR_MESSAGE);
      }
      // System.out.print(username+USERNAME+"");
      if (cont) {
         bigCont = true;
         setSocket(server, Port);
         if (bigCont) {
            Listener listen = new Listener(s);
            listen.start();
            sendthing(username + ":(CONNECTED)", s, username);
            jtaBig.append(username + ":(CONNECTED)");
            jbConnect.setEnabled(false);
            jbDisConnect.setEnabled(true);
         }
      } else {
      }
   }

   public CoolClientV4() {
      // SERVER = server;
      // USERNAME = username;
      // System.out.print(username+USERNAME+"");
      jbSend = new JButton("SEND");
      jbWisper = new JButton("WISPER");
      jtfWisper = new JTextField(10);

      setLayout(new BorderLayout(10, 10));
      jpTop = new JPanel();
      jpBot = new JPanel();
      jpBotIn = new JPanel();
      jpTTop = new JPanel();
      jpTop.setLayout(new GridLayout(1, 0));
      jpBot.setLayout(new BorderLayout());
      jpBotIn.setLayout(new FlowLayout());
      jtfWord = new JTextField(13);
      jtaBig = new JTextArea(30, 30);
      jtaBig.setEditable(false);
      JScrollPane jspScroll = new JScrollPane(jtaBig, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
      jpTTop.setLayout(new FlowLayout());
      jpTTop.add(new JLabel("IP adress:"));
      jtfIP = new JTextField(10);
      jpTTop.add(jtfIP);
      jpTTop.add(new JLabel("Port:"));
      jtfPort = new JTextField(6);
      jpTTop.add(jtfPort);
      jpTTop.add(new JLabel("User Name:"));
      jtfUserName = new JTextField(7);
      jpTTop.add(jtfUserName);

      jbConnect = new JButton("CONNECT");
      jpTTop.add(jbConnect);
      jbDisConnect = new JButton("DISCONNECT");
      jpTTop.add(jbDisConnect);
      jbDisConnect.setEnabled(false);

      jpBot.add(jtfWord, BorderLayout.NORTH);
      jpBot.add(jpBotIn, BorderLayout.CENTER);
      jpBotIn.add(jbSend);
      jpBotIn.add(jbWisper);
      jpBotIn.add(jtfWisper);
      jpTop.add(jspScroll);

      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent q) {
            if (bigCont) {
               sendthing(USERNAME + "(LEFT THE CHAT)", s, USERNAME);
            }
            dispose();
         }
      });
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      add(jpTTop, BorderLayout.NORTH);
      add(jpTop, BorderLayout.CENTER);
      add(jpBot, BorderLayout.SOUTH);
      pack();
      setVisible(true);

      // sendthing(username+": connected",s,username);

      System.out.print("DID IT");

      ActionListener alSnd = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            jbSend.setEnabled(false);
            System.out.println(jtfWord.getText());
            sendthing(jtfWord.getText(), s, USERNAME);
            jtfWord.setText("");
            jtfWord.requestFocus();
            jbSend.setEnabled(true);
         }
      };

      ActionListener alW = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            jbWisper.setEnabled(false);
            System.out.println("Wisper to " + jtfWisper.getText() + ":" + jtfWord.getText());
            sendthing("wisper:" + jtfWisper.getText() + ":" + jtfWord.getText(), s, USERNAME);
            jtfWord.setText("");
            jtfWord.requestFocus();
            jbWisper.setEnabled(true);
         }
      };

      jbSend.addActionListener(alSnd);
      jbWisper.addActionListener(alW);
      ActionListener alCon = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            noCare();
            String serv = jtfIP.getText();
            String use = jtfUserName.getText();
            String port = jtfPort.getText();
            connect(serv, use, port);

         }
      };

      jbConnect.addActionListener(alCon);

      ActionListener alDCon = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            sendthing(USERNAME + "(LEFT THE CHAT)", s, USERNAME);
            // look
            try {
               noconect = true;
               s.close();
               jtaBig.append("\n" + USERNAME + "(LEFT THE CHAT)" + "\n");
               jbDisConnect.setEnabled(false);
               jbConnect.setEnabled(true);
               noconect = true;
            } catch (IOException eh) {
            }
         }
      };

      jbDisConnect.addActionListener(alDCon);

   }

   class Listener extends Thread {
      Socket s;

      public Listener(Socket ss) {
         s = ss;
      }

      public void run() {
         try {
            InputStream in = s.getInputStream();
            BufferedReader buff = new BufferedReader(new InputStreamReader(in));
            while (!noconect) {
               String readout = "";
               try {
                  readout = buff.readLine();
               } catch (IOException eh) {
               }
               System.out.print(readout);
               jtaBig.append("\n" + readout);

            }
            System.out.print("ThreadDead ");

         } catch (IOException eh) {
            System.out.print("ERROR");
         }

      }

   }

}
//// connection over distance issue(fucked)
// make it wait to connect
// make wisper////////////////////////////////
// close button always work/ make catch things
// make a dice roller
// make a list of currently connected to the server in server gui
// vectors
