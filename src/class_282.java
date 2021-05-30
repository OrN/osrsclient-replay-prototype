import java.util.Iterator;

// $FF: renamed from: ik
public class class_282 {

   // $FF: renamed from: f int[]
   public static int[] field_3246;
   // $FF: renamed from: n int[]
   public static int[] field_3247;
   // $FF: renamed from: v int[]
   static int[] field_3248;
   // $FF: renamed from: bd java.lang.String
   static String field_3249;
   // $FF: renamed from: af int
   static final int field_3250 = 56;


   // $FF: renamed from: y (int, int) void
   public static void method_5172(int var0, int var1) {
      class_89 var3 = (class_89)class_89.field_893.method_5065((long)var0);
      class_89 var2;
      if(var3 != null) {
         var2 = var3;
      } else {
         byte[] var4 = class_89.field_897.method_5381(14, var0, -26460885);
         class_89 var10000 = new class_89();
         var3 = var10000;
         if(var4 != null) {
            class_28 var10001 = new class_28(var4);
            var3.method_1569(var10001, 659571256);
         }

         class_89.field_893.method_5064(var3, (long)var0);
         var2 = var3;
      }

      int var8 = var2.field_894 * -2059144841;
      int var5 = -1506226221 * var2.field_896;
      int var6 = var2.field_895 * -354172645;
      int var7 = field_3248[var6 - var5];
      if(var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      field_3246[var8] = field_3246[var8] & ~var7 | var1 << var5 & var7;
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_3248 = new int[32];
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field_3248[var1] = var0 - 1;
         var0 += var0;
      }

      field_3247 = new int[4000];
      field_3246 = new int[4000];
   }

   // $FF: renamed from: <init> () void
   class_282() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ik.<init>(" + ')');
      }
   }

   // $FF: renamed from: j (int, int) void
   public static void method_5175(int var0, int var1) {
      class_89 var3 = (class_89)class_89.field_893.method_5065((long)var0);
      class_89 var2;
      if(var3 != null) {
         var2 = var3;
      } else {
         byte[] var4 = class_89.field_897.method_5381(14, var0, -26460885);
         class_89 var10000 = new class_89();
         var3 = var10000;
         if(var4 != null) {
            class_28 var10001 = new class_28(var4);
            var3.method_1569(var10001, -942699285);
         }

         class_89.field_893.method_5064(var3, (long)var0);
         var2 = var3;
      }

      int var8 = var2.field_894 * -2059144841;
      int var5 = -1506226221 * var2.field_896;
      int var6 = var2.field_895 * -354172645;
      int var7 = field_3248[var6 - var5];
      if(var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      field_3246[var8] = field_3246[var8] & ~var7 | var1 << var5 & var7;
   }

   // $FF: renamed from: f (int) int
   public static int method_5176(int var0) {
      class_89 var1 = class_373.method_6618(var0, -1405000154);
      int var2 = -2059144841 * var1.field_894;
      int var3 = var1.field_896 * -1506226221;
      int var4 = var1.field_895 * 428404210;
      int var5 = field_3248[var4 - var3];
      return field_3246[var2] >> var3 & var5;
   }

   // $FF: renamed from: p (int, int) void
   public static void method_5177(int var0, int var1) {
      class_89 var3 = (class_89)class_89.field_893.method_5065((long)var0);
      class_89 var2;
      if(var3 != null) {
         var2 = var3;
      } else {
         byte[] var4 = class_89.field_897.method_5381(14, var0, -26460885);
         class_89 var10000 = new class_89();
         var3 = var10000;
         if(var4 != null) {
            class_28 var10001 = new class_28(var4);
            var3.method_1569(var10001, 318753339);
         }

         class_89.field_893.method_5064(var3, (long)var0);
         var2 = var3;
      }

      int var8 = var2.field_894 * -2059144841;
      int var5 = -1506226221 * var2.field_896;
      int var6 = var2.field_895 * -354172645;
      int var7 = field_3248[var6 - var5];
      if(var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      field_3246[var8] = field_3246[var8] & ~var7 | var1 << var5 & var7;
   }

   // $FF: renamed from: kt (byte) void
   static final void method_5178(byte var0) {
      try {
         for(int var1 = 0; var1 < class_195.field_2313 * -1143549299; ++var1) {
            if(var0 != -1) {
               throw new IllegalStateException();
            }

            class_100 var2 = client.field_1605[class_195.field_2318[var1]];
            var2.method_1826((byte)11);
         }

         Iterator var4 = class_197.field_2334.iterator();

         while(var4.hasNext()) {
            if(var0 != -1) {
               throw new IllegalStateException();
            }

            class_101 var5 = (class_101)var4.next();
            var5.method_1907(1400910895);
         }

         if(class_233.field_2617 != null) {
            if(var0 != -1) {
               throw new IllegalStateException();
            }

            class_233.field_2617.method_6148(308669829);
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "ik.kt(" + ')');
      }
   }
}
