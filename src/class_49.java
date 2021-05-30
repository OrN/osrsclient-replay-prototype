
// $FF: renamed from: cj
public class class_49 extends class_27 {

   // $FF: renamed from: n int[]
   int[] field_360;
   // $FF: renamed from: v md
   static class_364 field_361;
   // $FF: renamed from: f int[]
   int[] field_362;
   // $FF: renamed from: b boolean
   public static boolean field_363;


   // $FF: renamed from: <clinit> () void
   static void method_552() {
      class_364 var10000 = new class_364;
      var10000.method_6538(32);
      field_361 = var10000;
   }

   // $FF: renamed from: <init> () void
   void method_105() {
      try {
         super.method_105();
         this.field_360 = new int[]{-1};
         this.field_362 = new int[]{0};
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "cj.<init>(" + ')');
      }
   }

   // $FF: renamed from: b (int, int) int
   static int method_553(int var0, int var1) {
      class_49 var2 = (class_49)field_361.method_6523((long)var0);
      return var2 == null?-1:(var1 >= 0 && var1 < var2.field_360.length?var2.field_360[var1]:-1);
   }

   // $FF: renamed from: d (int, int) int
   static int method_554(int var0, int var1) {
      class_49 var2 = (class_49)field_361.method_6523((long)var0);
      return var2 == null?-1:(var1 >= 0 && var1 < var2.field_360.length?var2.field_360[var1]:-1);
   }

   // $FF: renamed from: s (int, int) int
   static int method_555(int var0, int var1) {
      class_49 var2 = (class_49)field_361.method_6523((long)var0);
      return var2 == null?-1:(var1 >= 0 && var1 < var2.field_360.length?var2.field_360[var1]:-1);
   }

   // $FF: renamed from: u (int, int) int
   static int method_556(int var0, int var1) {
      class_49 var2 = (class_49)field_361.method_6523((long)var0);
      return var2 == null?-1:(var1 >= 0 && var1 < var2.field_360.length?var2.field_360[var1]:-1);
   }

   // $FF: renamed from: l (int, int) int
   static int method_557(int var0, int var1) {
      class_49 var2 = (class_49)field_361.method_6523((long)var0);
      return null == var2?0:(var1 >= 0 && var1 < var2.field_362.length?var2.field_362[var1]:0);
   }

   // $FF: renamed from: o (int, int) int
   static int method_558(int var0, int var1) {
      class_49 var2 = (class_49)field_361.method_6523((long)var0);
      return null == var2?0:(var1 >= 0 && var1 < var2.field_362.length?var2.field_362[var1]:0);
   }

   // $FF: renamed from: c (int, int) int
   static int method_559(int var0, int var1) {
      class_49 var2 = (class_49)field_361.method_6523((long)var0);
      if(null == var2) {
         return 0;
      } else if(-1 == var1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.field_362.length; ++var4) {
            if(var1 == var2.field_360[var4]) {
               var3 += var2.field_362[var4];
            }
         }

         return var3;
      }
   }

   // $FF: renamed from: e (int, int) int
   static int method_560(int var0, int var1) {
      class_49 var2 = (class_49)field_361.method_6523((long)var0);
      if(null == var2) {
         return 0;
      } else if(-1 == var1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.field_362.length; ++var4) {
            if(var1 == var2.field_360[var4]) {
               var3 += var2.field_362[var4];
            }
         }

         return var3;
      }
   }

   // $FF: renamed from: g (int, int, int, int) void
   static void method_561(int var0, int var1, int var2, int var3) {
      class_49 var4 = (class_49)field_361.method_6523((long)var0);
      if(null == var4) {
         class_49 var10000 = new class_49;
         var10000.method_105();
         var4 = var10000;
         field_361.method_6525(var4, (long)var0);
      }

      if(var4.field_360.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.field_360.length; ++var7) {
            var5[var7] = var4.field_360[var7];
            var6[var7] = var4.field_362[var7];
         }

         for(var7 = var4.field_360.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.field_360 = var5;
         var4.field_362 = var6;
      }

      var4.field_360[var1] = var2;
      var4.field_362[var1] = var3;
   }

   // $FF: renamed from: a (int, int, int, int) void
   static void method_562(int var0, int var1, int var2, int var3) {
      class_49 var4 = (class_49)field_361.method_6523((long)var0);
      if(null == var4) {
         class_49 var10000 = new class_49;
         var10000.method_105();
         var4 = var10000;
         field_361.method_6525(var4, (long)var0);
      }

      if(var4.field_360.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.field_360.length; ++var7) {
            var5[var7] = var4.field_360[var7];
            var6[var7] = var4.field_362[var7];
         }

         for(var7 = var4.field_360.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.field_360 = var5;
         var4.field_362 = var6;
      }

      var4.field_360[var1] = var2;
      var4.field_362[var1] = var3;
   }

   // $FF: renamed from: k (int) void
   static void method_563(int var0) {
      class_49 var1 = (class_49)field_361.method_6523((long)var0);
      if(null != var1) {
         for(int var2 = 0; var2 < var1.field_360.length; ++var2) {
            var1.field_360[var2] = -1;
            var1.field_362[var2] = 0;
         }

      }
   }

   // $FF: renamed from: m (int) void
   static void method_564(int var0) {
      class_49 var1 = (class_49)field_361.method_6523((long)var0);
      if(null != var1) {
         for(int var2 = 0; var2 < var1.field_360.length; ++var2) {
            var1.field_360[var2] = -1;
            var1.field_362[var2] = 0;
         }

      }
   }

   // $FF: renamed from: x (int) void
   static void method_565(int var0) {
      class_49 var1 = (class_49)field_361.method_6523((long)var0);
      if(null != var1) {
         for(int var2 = 0; var2 < var1.field_360.length; ++var2) {
            var1.field_360[var2] = -1;
            var1.field_362[var2] = 0;
         }

      }
   }

   // $FF: renamed from: z () void
   static void method_566() {
      class_364 var10000 = new class_364;
      var10000.method_6538(32);
      field_361 = var10000;
   }

   // $FF: renamed from: w () void
   static void method_567() {
      class_364 var10000 = new class_364;
      var10000.method_6538(32);
      field_361 = var10000;
   }
}
