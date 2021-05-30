
// $FF: renamed from: lm
public class class_353 {

   // $FF: renamed from: n lm
   public static final class_353 field_3958;
   // $FF: renamed from: v lm
   static final class_353 field_3959;
   // $FF: renamed from: f lm
   static final class_353 field_3960;
   // $FF: renamed from: y int
   public final int field_3961;
   // $FF: renamed from: p int
   public static final int field_3962 = 6;


   // $FF: renamed from: n (int) lm
   public static class_353 method_6232(int var0) {
      class_353[] var1 = new class_353[]{field_3959, field_3958, field_3960};
      class_353[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class_353 var4 = var2[var3];
         if(var0 == var4.field_3961 * 597658710) {
            return var4;
         }
      }

      return null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6233() {
      class_353 var10000 = new class_353;
      var10000.method_6234(0);
      field_3959 = var10000;
      var10000 = new class_353;
      var10000.method_6234(1);
      field_3958 = var10000;
      var10000 = new class_353;
      var10000.method_6234(2);
      field_3960 = var10000;
   }

   // $FF: renamed from: <init> (int) void
   void method_6234(int var1) {
      try {
         super();
         this.field_3961 = var1 * 914046243;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "lm.<init>(" + ')');
      }
   }

   // $FF: renamed from: f (int) lm
   public static class_353 method_6235(int var0) {
      class_353[] var1 = new class_353[]{field_3959, field_3958, field_3960};
      class_353[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class_353 var4 = var2[var3];
         if(var0 == var4.field_3961 * -767370613) {
            return var4;
         }
      }

      return null;
   }
}
