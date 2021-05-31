
// $FF: renamed from: em
public class class_212 implements class_14 {

   // $FF: renamed from: n em
   static final class_212 field_2432;
   // $FF: renamed from: f em
   static final class_212 field_2433;
   // $FF: renamed from: p int
   final int field_2434;
   // $FF: renamed from: v em
   static final class_212 field_2435;
   // $FF: renamed from: y int
   public final int field_2436;


    // $FF: renamed from: n () int
   public int method_49() {
      return 506997158 * this.field_2434;
   }

   // $FF: renamed from: v (int) int
   public int method_50() {
      try {
         return 76672001 * this.field_2434;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: f () int
   public int method_51() {
      return 76672001 * this.field_2434;
   }

    // $FF: renamed from: g (java.lang.String, int, int) void
   static final void method_4177(String var0, int var1) {
      try {
         class_40 var3 = class_112.newPacket(ClientOpcode.OPCODE_49, client.field_1463.isaac, (byte)8);
         var3.networkBuffer.writeByte(class_166.method_3598(var0) + 1);
         var3.networkBuffer.writeString(var0);
         var3.networkBuffer.method_148(var1);
         client.field_1463.method_4079(var3);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

    // $FF: renamed from: <clinit> () void
   static {
      class_212 var10000 = new class_212(0, 0);
      field_2435 = var10000;
      var10000 = new class_212(1, 1);
      field_2432 = var10000;
      var10000 = new class_212(2, 2);
      field_2433 = var10000;
   }

   // $FF: renamed from: <init> (int, int) void
   class_212(int var1, int var2) {
      super();
      try {
         this.field_2436 = var1 * 389708817;
         this.field_2434 = var2 * 1828590593;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: v (jv, int, int, int) op[]
   public static class_66[] method_4182(class_306 var0, int var1, int var2) {
      try {
         return !class_370.method_6606(var0, var1, var2, (byte)47)?null:class_176.method_3749((short)-29644);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }
}
