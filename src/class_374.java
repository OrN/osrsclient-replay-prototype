
// $FF: renamed from: na
public class class_374 implements class_14 {

   // $FF: renamed from: b int
   final int field_4125;
   // $FF: renamed from: n na
   static final class_374 field_4126;
   // $FF: renamed from: f na
   static final class_374 field_4127;
   // $FF: renamed from: y na
   static final class_374 field_4128;
   // $FF: renamed from: v na
   public static final class_374 field_4129;
   // $FF: renamed from: j na
   static final class_374 field_4130;
   // $FF: renamed from: r int
   final int field_4131;
   // $FF: renamed from: p na
   static final class_374 field_4132;


   // $FF: renamed from: <clinit> () void
   static {
      class_374 var10000 = new class_374(0, 0);
      field_4129 = var10000;
      var10000 = new class_374(3, 2);
      field_4126 = var10000;
      var10000 = new class_374(5, 5);
      field_4127 = var10000;
      var10000 = new class_374(2, 6);
      field_4128 = var10000;
      var10000 = new class_374(1, 7);
      field_4132 = var10000;
      var10000 = new class_374(4, 8);
      field_4130 = var10000;
   }

   // $FF: renamed from: v (int) int
   public int method_50(int var1) {
      try {
         return this.field_4125 * -1356390723;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "na.v(" + ')');
      }
   }

   // $FF: renamed from: <init> (int, int) void
   class_374(int var1, int var2) {
      super();
      try {
         this.field_4131 = var1 * -1003897275;
         this.field_4125 = var2 * -659075947;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "na.<init>(" + ')');
      }
   }

   // $FF: renamed from: n () int
   public int method_49() {
      return this.field_4125 * 729120800;
   }

   // $FF: renamed from: v (int, int, byte) int
   public static int method_6622(int var0, int var1, byte var2) {
      try {
         int var3;
         if(var1 > var0) {
            var3 = var0;
            var0 = var1;
            var1 = var3;
         }

         while(0 != var1) {
            if(var2 == 1) {
               throw new IllegalStateException();
            }

            var3 = var0 % var1;
            var0 = var1;
            var1 = var3;
         }

         return var0;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "na.v(" + ')');
      }
   }

   // $FF: renamed from: f () int
   public int method_51() {
      return this.field_4125 * -1356390723;
   }
}
