
// $FF: renamed from: jw
public class class_313 {

   // $FF: renamed from: f int
   final int field_3760;
   // $FF: renamed from: n jw
   static final class_313 field_3761;
   // $FF: renamed from: v jw
   static final class_313 field_3762;
   // $FF: renamed from: y int
   final int field_3763;


    // $FF: renamed from: <clinit> () void
   static {
      class_313 var10000 = new class_313(16, 16);
      field_3762 = var10000;
      var10000 = new class_313(40, 40);
      field_3761 = var10000;
   }

    // $FF: renamed from: <init> (int, int, int, int, int, int) void
   class_313(int var5, int var6) {
      super();
      try {
         this.field_3760 = var5 * 1199166777;
         this.field_3763 = -1929935585 * var6;
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: b (int, byte) int
   public static int method_5578(int var0) {
      try {
         long var3 = class_255.field_2883[var0];
         int var2 = (int)(var3 >>> 14 & 3L);
         return var2;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }
}
