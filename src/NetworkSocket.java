import java.io.IOException;
import java.net.Socket;

// $FF: renamed from: lg
public class NetworkSocket extends GameSocket {

   // $FF: renamed from: n lw
   NetworkInput networkInput;
   // $FF: renamed from: v java.net.Socket
   Socket socket;
   // $FF: renamed from: f le
   NetworkOutput networkOutput;

   // $FF: renamed from: y (int, int) boolean
   public boolean method_4118(int var1, int var2) throws IOException {
      try {
         return this.networkInput.method_6248(var1, (byte)6);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: f (int) int
   public int method_4117(int var1) throws IOException {
      try {
         return this.networkInput.method_6249(-2046252752);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: x (byte[], int, int) int
   public int method_4122(byte[] var1, int var2, int var3) throws IOException {
      return this.networkInput.method_6250(var1, var2, var3, -1140817776);
   }

   protected void finalize() {
      try {
         this.close(2057029315);
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: n (int) int
   public int method_4120(int var1) throws IOException {
      try {
         return this.networkInput.method_6252(963599553);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: r (byte[], int, int, int) void
   public void write(byte[] src, int offset, int len) throws IOException {
      try {
         this.networkOutput.write(src, offset, len, 1271901026);
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   protected void abr() {
      this.close(2139642875);
   }

   // $FF: renamed from: <init> (java.net.Socket, int, int) void
   public NetworkSocket(Socket var1, int var2, int var3) throws IOException {
      super();
      try {
         this.socket = var1;
         this.socket.setSoTimeout(30000);
         this.socket.setTcpNoDelay(true);
         this.socket.setReceiveBufferSize(65536);
         this.socket.setSendBufferSize(65536);
         NetworkInput var10001 = new NetworkInput(this.socket.getInputStream(), var2);
         this.networkInput = var10001;
         NetworkOutput var5 = new NetworkOutput(this.socket.getOutputStream(), var3);
         this.networkOutput = var5;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   protected void abj() {
      this.close(2125373281);
   }

   // $FF: renamed from: p (byte[], int, int, int) int
   public int read(byte[] src, int offset, int length, int var4) throws IOException {
      try {
         return this.networkInput.method_6250(src, offset, length, -989264976);
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   protected void abm() {
      this.close(1659371582);
   }

   // $FF: renamed from: u () int
   public int method_4127() throws IOException {
      return this.networkInput.method_6252(770922775);
   }

   // $FF: renamed from: l () int
   public int method_4128() throws IOException {
      return this.networkInput.method_6252(1706359465);
   }

   // $FF: renamed from: o () int
   public int method_4137() throws IOException {
      return this.networkInput.method_6249(-1598609091);
   }

   // $FF: renamed from: c () int
   public int method_4130() throws IOException {
      return this.networkInput.method_6249(-179454534);
   }

   // $FF: renamed from: g (int) boolean
   public boolean method_4134(int var1) throws IOException {
      return this.networkInput.method_6248(var1, (byte)6);
   }

   // $FF: renamed from: a (int) boolean
   public boolean method_4133(int var1) throws IOException {
      return this.networkInput.method_6248(var1, (byte)6);
   }

   // $FF: renamed from: k (int) boolean
   public boolean method_4129(int var1) throws IOException {
      return this.networkInput.method_6248(var1, (byte)6);
   }

   // $FF: renamed from: m (byte[], int, int) int
   public int method_4119(byte[] var1, int var2, int var3) throws IOException {
      return this.networkInput.method_6250(var1, var2, var3, 628444529);
   }

   // $FF: renamed from: e () int
   public int method_4131() throws IOException {
      return this.networkInput.method_6249(-414137287);
   }

   // $FF: renamed from: v (int) void
   public void close(int var1) {
      try {
         this.networkOutput.method_6188();

         try {
            this.socket.close();
         } catch (IOException var3) {
            ;
         }

         this.networkInput.method_6246();
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }

      if (Settings.ENABLE_REPLAY_SUPPORT)
         Replay.stop();
   }

   // $FF: renamed from: h (byte[], int, int) void
   public void method_4138(byte[] var1, int var2, int var3) throws IOException {
      this.networkOutput.write(var1, var2, var3, 1885508786);
   }

   // $FF: renamed from: q (byte[], int, int) void
   public void method_4139(byte[] var1, int var2, int var3) throws IOException {
      this.networkOutput.write(var1, var2, var3, 136944451);
   }
}
