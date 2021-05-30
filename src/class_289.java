
// $FF: renamed from: iw
public class class_289 {

   // $FF: renamed from: f int[]
   public static int[] field_3282;
   // $FF: renamed from: v int
   public static final int field_3283 = 25;
   // $FF: renamed from: ck cb
   static class_163 field_3284;
   // $FF: renamed from: n boolean[]
   public static final boolean[] field_3285;


   // $FF: renamed from: <init> () void
   void method_5282() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "iw.<init>(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_5283() {
      field_3285 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
      field_3282 = new int[99];
      int var0 = 0;

      for(int var1 = 0; var1 < 99; ++var1) {
         int var2 = 1 + var1;
         int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var3;
         field_3282[var1] = var0 / 4;
      }

   }
}
