
// $FF: renamed from: fh
public class class_223 {

   // $FF: renamed from: v int
   final int field_2521;
   // $FF: renamed from: n int
   final int field_2522;
   // $FF: renamed from: al int
   static final int field_2523 = 0;
   // $FF: renamed from: ci int
   static final int field_2524 = 14;
   // $FF: renamed from: d int
   static int field_2525;
   // $FF: renamed from: f int
   final int field_2526;
   // $FF: renamed from: ad int
   static final int field_2527 = 4;
   // $FF: renamed from: hf op[]
   static class_66[] field_2528;
   // $FF: renamed from: y int[]
   public static int[] field_2529;


   // $FF: renamed from: <init> (int, int, int) void
   class_223(int var1, int var2, int var3) {
      super();
      try {
         this.field_2521 = var1 * -1613171285;
         this.field_2522 = 725393889 * var2;
         this.field_2526 = -1937775429 * var3;
      } catch (RuntimeException var4) {
         throw method_4281(var4);
      }
   }

   // $FF: renamed from: hb (int, int, int) int
   static int method_4280(int var0, int var1, int var2) {
      try {
         int var3 = var1 - 334;
         if(var3 < 0) {
            if(var2 != -1091351445) {
               throw new IllegalStateException();
            }

            var3 = 0;
         } else if(var3 > 100) {
            if(var2 != -1091351445) {
               throw new IllegalStateException();
            }

            var3 = 100;
         }

         int var4 = client.field_1672 + (client.field_1673 - client.field_1672) * var3 / 100;
         return var0 * var4 / 256;
      } catch (RuntimeException var5) {
         throw method_4281(var5);
      }
   }

   // $FF: renamed from: n (java.lang.Throwable, java.lang.String) oz
   public static class_405 method_4281(Throwable var0) {
      /*try {
         class_405 var2;
         if(var0 instanceof class_405) {
            var2 = (class_405)var0;
            var2.field_4293 = var2.field_4293 + ' ' + var1;
         } else {
            class_405 var10000 = new class_405(var0, var1);
            var2 = var10000;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw method_4281(var3, "fh.n(" + ')');
      }*/

      // TODO: Better Logger
      var0.printStackTrace();
      //System.exit(0);
      return null;
   }
}
