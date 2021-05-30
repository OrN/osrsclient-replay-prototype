
// $FF: renamed from: hi
public class class_260 {

   // $FF: renamed from: v int[]
   static int[] field_2904;


   // $FF: renamed from: a (int, int, int) int
   public static int method_4970(int var0, int var1, int var2) {
      int var3 = class_240.method_4644(var2 - var1 + 1, 1306725260);
      var3 <<= var1;
      var0 |= var3;
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static {
      new Object();
      field_2904 = new int[33];
      field_2904[0] = 0;
      int var0 = 2;

      for(int var1 = 1; var1 < 33; ++var1) {
         field_2904[var1] = var0 - 1;
         var0 += var0;
      }

   }

   // $FF: renamed from: k (int, int, int) int
   public static int method_4972(int var0, int var1, int var2) {
      int var3 = class_240.method_4644(var2 - var1 + 1, 1403813853);
      var3 <<= var1;
      var0 |= var3;
      return var0;
   }

   // $FF: renamed from: <init> () void
   class_260() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "hi.<init>(" + ')');
      }
   }

   // $FF: renamed from: s (int) int
   public static int method_4974(int var0) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1338426873);
      var0 = (var0 & 858993459) + (var0 >>> 2 & 1758289674);
      var0 = (var0 >>> 4) + var0 & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 1831988391;
   }

   // $FF: renamed from: x (int, int, int) int
   public static int method_4975(int var0, int var1, int var2) {
      int var3 = class_240.method_4644(var2 - var1 + 1, 1914543075);
      var3 <<= var1;
      var0 |= var3;
      return var0;
   }

   // $FF: renamed from: d (int) int
   public static int method_4976(int var0) {
      return field_2904[var0];
   }

   // $FF: renamed from: o (int) int
   public static int method_4977(int var0) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 240216500);
      var0 = (var0 & -1775707829) + (var0 >>> 2 & 858993459);
      var0 = (var0 >>> 4) + var0 & 280727147;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & -530333311;
   }

   // $FF: renamed from: m (int, int, int) int
   public static int method_4978(int var0, int var1, int var2) {
      int var3 = class_240.method_4644(var2 - var1 + 1, 1012631188);
      var3 <<= var1;
      var0 |= var3;
      return var0;
   }

   // $FF: renamed from: e (int, int, int) int
   public static int method_4979(int var0, int var1, int var2) {
      int var3 = class_240.method_4644(var2 - var1 + 1, 1826217235);
      var3 <<= var1;
      return var0 & ~var3;
   }

   // $FF: renamed from: u (int) int
   public static int method_4980(int var0) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
      var0 = (var0 >>> 4) + var0 & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }

   // $FF: renamed from: g (int, int, int) int
   public static int method_4981(int var0, int var1, int var2) {
      int var3 = class_240.method_4644(var2 - var1 + 1, 1314870539);
      var3 <<= var1;
      return var0 & ~var3;
   }

   // $FF: renamed from: c (int, int, int) int
   public static int method_4982(int var0, int var1, int var2) {
      int var3 = class_240.method_4644(var2 - var1 + 1, 2120984523);
      var3 <<= var1;
      return var0 & ~var3;
   }

   // $FF: renamed from: b (int) int
   public static int method_4983(int var0) {
      return field_2904[var0];
   }

   // $FF: renamed from: l (int) int
   public static int method_4984(int var0) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
      var0 = (var0 >>> 4) + var0 & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }

   // $FF: renamed from: z (int) int
   public static int method_4985(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return 1 + var0;
   }

   // $FF: renamed from: w (int) int
   public static int method_4986(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return 1 + var0;
   }

   // $FF: renamed from: t (int) int
   public static int method_4987(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return 1 + var0;
   }

   // $FF: renamed from: h (int) int
   public static int method_4988(int var0) {
      int var1 = 0;
      if(var0 < 0 || var0 >= 1181653667) {
         var0 >>>= 16;
         var1 += 16;
      }

      if(var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if(var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if(var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if(var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var0 + var1;
   }

   // $FF: renamed from: q (int) int
   public static int method_4989(int var0) {
      int var1 = 0;
      if(var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if(var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if(var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if(var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if(var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var0 + var1;
   }

   // $FF: renamed from: i (int) int
   public static int method_4990(int var0) {
      int var1 = 0;
      if(var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if(var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if(var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if(var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if(var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var0 + var1;
   }
}
