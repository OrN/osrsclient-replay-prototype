
// $FF: renamed from: na
public class class_374 implements class_14 {

   // $FF: renamed from: b int
   final int field_4125;
    // $FF: renamed from: v na
   public static final class_374 field_4129;


    // $FF: renamed from: <clinit> () void
   static {
      class_374 var10000 = new class_374(0, 0);
      field_4129 = var10000;
      var10000 = new class_374(3, 2);
        var10000 = new class_374(5, 5);
        var10000 = new class_374(2, 6);
        var10000 = new class_374(1, 7);
        var10000 = new class_374(4, 8);
    }

   // $FF: renamed from: v (int) int
   public int method_50() {
      try {
         return this.field_4125 * -1356390723;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: <init> (int, int) void
   class_374(int var1, int var2) {
      super();
      try {
          this.field_4125 = var2 * -659075947;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
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
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: f () int
   public int method_51() {
      return this.field_4125 * -1356390723;
   }
}
