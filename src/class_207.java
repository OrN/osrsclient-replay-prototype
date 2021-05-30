import java.io.IOException;
import java.net.Socket;

// $FF: renamed from: lg
public class class_207 extends class_206 {

   // $FF: renamed from: n lw
   class_358 field_2402;
   // $FF: renamed from: v java.net.Socket
   Socket field_2403;
   // $FF: renamed from: f le
   class_348 field_2404;


   // $FF: renamed from: z (byte[], int, int) int
   public int method_4136(byte[] var1, int var2, int var3) throws IOException {
      return this.field_2402.method_6250(var1, var2, var3, -2052981444);
   }

   // $FF: renamed from: y (int, int) boolean
   public boolean method_4118(int var1, int var2) throws IOException {
      try {
         return this.field_2402.method_6248(var1, (byte)6);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "lg.y(" + ')');
      }
   }

   // $FF: renamed from: f (int) int
   public int method_4117(int var1) throws IOException {
      try {
         return this.field_2402.method_6249(-2046252752);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "lg.f(" + ')');
      }
   }

   // $FF: renamed from: b () void
   public void method_4124() {
      this.field_2404.method_6188((byte)-116);

      try {
         this.field_2403.close();
      } catch (IOException var2) {
         ;
      }

      this.field_2402.method_6246(118502592);
   }

   // $FF: renamed from: x (byte[], int, int) int
   public int method_4122(byte[] var1, int var2, int var3) throws IOException {
      return this.field_2402.method_6250(var1, var2, var3, -1140817776);
   }

   protected void finalize() {
      try {
         this.method_4123(2057029315);
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "lg.finalize(" + ')');
      }
   }

   // $FF: renamed from: n (int) int
   public int method_4120(int var1) throws IOException {
      try {
         return this.field_2402.method_6252(963599553);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "lg.n(" + ')');
      }
   }

   // $FF: renamed from: r (byte[], int, int, int) void
   public void method_4132(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         this.field_2404.method_6190(var1, var2, var3, 1271901026);
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "lg.r(" + ')');
      }
   }

   protected void abr() {
      this.method_4123(2139642875);
   }

   // $FF: renamed from: <init> (java.net.Socket, int, int) void
   public class_207(Socket var1, int var2, int var3) throws IOException {
      super();
      try {
         this.field_2403 = var1;
         this.field_2403.setSoTimeout(30000);
         this.field_2403.setTcpNoDelay(true);
         this.field_2403.setReceiveBufferSize(65536);
         this.field_2403.setSendBufferSize(65536);
         class_358 var10001 = new class_358(this.field_2403.getInputStream(), var2);
         this.field_2402 = var10001;
         class_348 var5 = new class_348(this.field_2403.getOutputStream(), var3);
         this.field_2404 = var5;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "lg.<init>(" + ')');
      }
   }

   // $FF: renamed from: s () void
   public void method_4126() {
      this.field_2404.method_6188((byte)84);

      try {
         this.field_2403.close();
      } catch (IOException var2) {
         ;
      }

      this.field_2402.method_6246(-1169497696);
   }

   protected void abj() {
      this.method_4123(2125373281);
   }

   // $FF: renamed from: p (byte[], int, int, int) int
   public int method_4121(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         return this.field_2402.method_6250(var1, var2, var3, -989264976);
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "lg.p(" + ')');
      }
   }

   protected void abm() {
      this.method_4123(1659371582);
   }

   // $FF: renamed from: u () int
   public int method_4127() throws IOException {
      return this.field_2402.method_6252(770922775);
   }

   // $FF: renamed from: l () int
   public int method_4128() throws IOException {
      return this.field_2402.method_6252(1706359465);
   }

   // $FF: renamed from: o () int
   public int method_4137() throws IOException {
      return this.field_2402.method_6249(-1598609091);
   }

   // $FF: renamed from: c () int
   public int method_4130() throws IOException {
      return this.field_2402.method_6249(-179454534);
   }

   // $FF: renamed from: d () void
   public void method_4125() {
      this.field_2404.method_6188((byte)-71);

      try {
         this.field_2403.close();
      } catch (IOException var2) {
         ;
      }

      this.field_2402.method_6246(1653794583);
   }

   // $FF: renamed from: g (int) boolean
   public boolean method_4134(int var1) throws IOException {
      return this.field_2402.method_6248(var1, (byte)6);
   }

   // $FF: renamed from: a (int) boolean
   public boolean method_4133(int var1) throws IOException {
      return this.field_2402.method_6248(var1, (byte)6);
   }

   // $FF: renamed from: k (int) boolean
   public boolean method_4129(int var1) throws IOException {
      return this.field_2402.method_6248(var1, (byte)6);
   }

   // $FF: renamed from: m (byte[], int, int) int
   public int method_4119(byte[] var1, int var2, int var3) throws IOException {
      return this.field_2402.method_6250(var1, var2, var3, 628444529);
   }

   // $FF: renamed from: e () int
   public int method_4131() throws IOException {
      return this.field_2402.method_6249(-414137287);
   }

   // $FF: renamed from: v (int) void
   public void method_4123(int var1) {
      try {
         this.field_2404.method_6188((byte)21);

         try {
            this.field_2403.close();
         } catch (IOException var3) {
            ;
         }

         this.field_2402.method_6246(715878078);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "lg.v(" + ')');
      }
   }

   // $FF: renamed from: h (byte[], int, int) void
   public void method_4138(byte[] var1, int var2, int var3) throws IOException {
      this.field_2404.method_6190(var1, var2, var3, 1885508786);
   }

   // $FF: renamed from: q (byte[], int, int) void
   public void method_4139(byte[] var1, int var2, int var3) throws IOException {
      this.field_2404.method_6190(var1, var2, var3, 136944451);
   }
}
