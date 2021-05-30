
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
   // $FF: renamed from: bh int
   public static final int field_3764 = 81;


   // $FF: renamed from: f () jw[]
   static class_313[] method_5574() {
      return new class_313[]{field_3762, field_3761};
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_313 var10000 = new class_313(51, 27, 800, 0, 16, 16);
      field_3762 = var10000;
      var10000 = new class_313(25, 28, 800, 656, 40, 40);
      field_3761 = var10000;
   }

   // $FF: renamed from: n () jw[]
   static class_313[] method_5576() {
      return new class_313[]{field_3762, field_3761};
   }

   // $FF: renamed from: <init> (int, int, int, int, int, int) void
   class_313(int var1, int var2, int var3, int var4, int var5, int var6) {
      super();
      try {
         this.field_3760 = var5 * 1199166777;
         this.field_3763 = -1929935585 * var6;
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "jw.<init>(" + ')');
      }
   }

   // $FF: renamed from: b (int, byte) int
   public static int method_5578(int var0, byte var1) {
      try {
         long var3 = class_255.field_2883[var0];
         int var2 = (int)(var3 >>> 14 & 3L);
         return var2;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "jw.b(" + ')');
      }
   }
}
