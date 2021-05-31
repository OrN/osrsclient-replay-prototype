
// $FF: renamed from: t
public class class_115 extends class_111 {

    // $FF: renamed from: v int
   int field_1288;
   // $FF: synthetic field
   final class_167 this$0;
   // $FF: renamed from: kh int
   static int field_1289;
   // $FF: renamed from: t java.lang.String
   public static String homeDirectory;


   // $FF: renamed from: ii (int, int, int) void
   static void method_2243(int var0, int var1) {
      try {
         class_40 var3 = class_112.method_2238(class_266.field_3126, client.field_1463.isaac, (byte)8);
         var3.networkBuffer.method_185(var1);
         var3.networkBuffer.writeIntAltReversed(var0);
         client.field_1463.method_4079(var3);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: v (nd, int) void
   void method_2231(Buffer var1, int var2) {
      try {
         this.field_1288 = var1.readShort() * 824813057;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: n (l, byte) void
   void method_2232(class_171 var1) {
      try {
         var1.method_3659(242899457 * this.field_1288, -888167097);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: f (nd) void
   void method_2234(Buffer var1) {
      this.field_1288 = var1.readShort() * -2005811828;
   }

   // $FF: renamed from: <init> (f) void
   class_115(class_167 var1) {
      super();
      try {
         this.this$0 = var1;
         this.field_1288 = -824813057;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: y (nd) void
   void method_2233(Buffer var1) {
      this.field_1288 = var1.readShort() * 824813057;
   }

   // $FF: renamed from: n (int) hq
   public static class_40 method_2245(int var0) {
      try {
         class_40 var1;
         if(0 == class_40.field_266 * -227614929) {
            if(var0 <= -242226211) {
               throw new IllegalStateException();
            }

            class_40 var10000 = new class_40();
            var1 = var10000;
         } else {
            var1 = class_40.field_268[(class_40.field_266 -= 1843709903) * -227614929];
         }

         var1.field_267 = null;
         var1.field_262 = 0;
         NetworkBuffer var10001 = new NetworkBuffer(5000);
         var1.networkBuffer = var10001;
         return var1;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: p (l) void
   void method_2230(class_171 var1) {
      var1.method_3659(242899457 * this.field_1288, -888167097);
   }
}
