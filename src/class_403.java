
// $FF: renamed from: ox
public class class_403 {

   // $FF: renamed from: au int
   static final int field_4275 = 4;
   // $FF: renamed from: n int
   static int field_4276;
   // $FF: renamed from: v int
   static int field_4277;
   // $FF: renamed from: j int[]
   public static int[] field_4278;
   // $FF: renamed from: d byte[][]
   public static byte[][] field_4279;


   // $FF: renamed from: as () op[]
   static class_66[] method_6809() {
      class_66[] var0 = new class_66[-522791973 * field_4277];

      for(int var1 = 0; var1 < -522791973 * field_4277; ++var1) {
         class_66 var10002 = new class_66();
         class_66 var2 = var0[var1] = var10002;
         var2.field_497 = -1099363635 * field_4276;
         var2.field_494 = class_380.field_4201 * -821679425;
         var2.field_495 = class_223.field_2529[var1];
         var2.field_496 = class_284.field_3260[var1];
         var2.field_498 = field_4278[var1];
         var2.field_492 = class_318.field_3787[var1];
         var2.field_491 = class_192.field_2300;
         var2.field_493 = field_4279[var1];
      }

      class_192.method_3958();
      return var0;
   }

   // $FF: renamed from: aj () oh[]
   static class_67[] method_6810() {
      class_67[] var0 = new class_67[-522791973 * field_4277];

      for(int var1 = 0; var1 < field_4277 * -522791973; ++var1) {
         class_67 var10002 = new class_67();
         class_67 var2 = var0[var1] = var10002;
         var2.field_501 = field_4276 * -879351184;
         var2.field_505 = class_380.field_4201 * -821679425;
         var2.field_504 = class_223.field_2529[var1];
         var2.field_503 = class_284.field_3260[var1];
         var2.field_508 = field_4278[var1];
         var2.field_500 = class_318.field_3787[var1];
         int var3 = var2.field_508 * var2.field_500;
         byte[] var4 = field_4279[var1];
         var2.field_502 = new int[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            var2.field_502[var5] = class_192.field_2300[var4[var5] & -140164403];
         }
      }

      class_192.method_3958();
      return var0;
   }

   // $FF: renamed from: a (jv, int, int) op
   static class_66 method_6811(class_306 var0, int var1, int var2) {
      if(!class_370.method_6606(var0, var1, var2, (byte)103)) {
         return null;
      } else {
         class_66 var10000 = new class_66();
         class_66 var4 = var10000;
         var4.field_497 = field_4276 * -1099363635;
         var4.field_494 = class_380.field_4201 * -821679425;
         var4.field_495 = class_223.field_2529[0];
         var4.field_496 = class_284.field_3260[0];
         var4.field_498 = field_4278[0];
         var4.field_492 = class_318.field_3787[0];
         var4.field_491 = class_192.field_2300;
         var4.field_493 = field_4279[0];
         class_192.method_3958();
         return var4;
      }
   }

   // $FF: renamed from: i (jv, java.lang.String, java.lang.String) op
   public static class_66 method_6812(class_306 var0, String var1, String var2) {
      int var3 = var0.method_5399(var1);
      int var4 = var0.method_5400(var3, var2);
      return class_277.method_5140(var0, var3, var4, 1690865732);
   }

   // $FF: renamed from: m (jv, int, int) oh[]
   public static class_67[] method_6813(class_306 var0, int var1, int var2) {
      return !class_370.method_6606(var0, var1, var2, (byte)41)?null:class_209.method_4162((byte)21);
   }

   // $FF: renamed from: x (jv, int, int) oh
   public static class_67 method_6814(class_306 var0, int var1, int var2) {
      byte[] var4 = var0.method_5381(var1, var2);
      boolean var3;
      if(var4 == null) {
         var3 = false;
      } else {
         class_253.method_4899(var4, (byte)1);
         var3 = true;
      }

      if(!var3) {
         return null;
      } else {
         class_67 var10000 = new class_67();
         class_67 var5 = var10000;
         var5.field_501 = field_4276 * -1099363635;
         var5.field_505 = 923229541 * class_380.field_4201;
         var5.field_504 = class_223.field_2529[0];
         var5.field_503 = class_284.field_3260[0];
         var5.field_508 = field_4278[0];
         var5.field_500 = class_318.field_3787[0];
         int var6 = var5.field_508 * var5.field_500;
         byte[] var7 = field_4279[0];
         var5.field_502 = new int[var6];

         for(int var8 = 0; var8 < var6; ++var8) {
            var5.field_502[var8] = class_192.field_2300[var7[var8] & -1854632650];
         }

         class_192.method_3958();
         return var5;
      }
   }

   // $FF: renamed from: z (jv, jv, int, int) kt
   public static class_69 method_6815(class_306 var0, class_306 var1, int var2, int var3) {
      byte[] var5 = var0.method_5381(var2, var3);
      boolean var4;
      if(var5 == null) {
         var4 = false;
      } else {
         class_253.method_4899(var5, (byte)1);
         var4 = true;
      }

      if(!var4) {
         return null;
      } else {
         byte[] var6 = var1.method_5381(var2, var3);
         class_69 var8;
         if(null == var6) {
            var8 = null;
         } else {
            class_69 var10000 = new class_69(var6, class_223.field_2529, class_284.field_3260, field_4278, class_318.field_3787, field_4279);
            class_69 var7 = var10000;
            class_192.method_3958();
            var8 = var7;
         }

         return var8;
      }
   }

   // $FF: renamed from: q (jv, java.lang.String, java.lang.String) op
   public static class_66 method_6816(class_306 var0, String var1, String var2) {
      int var3 = var0.method_5399(var1);
      int var4 = var0.method_5400(var3, var2);
      return class_277.method_5140(var0, var3, var4, 1690865732);
   }

   // $FF: renamed from: t (jv, jv, int, int) kt
   public static class_69 method_6817(class_306 var0, class_306 var1, int var2, int var3) {
      byte[] var5 = var0.method_5381(var2, var3);
      boolean var4;
      if(var5 == null) {
         var4 = false;
      } else {
         class_253.method_4899(var5, (byte)1);
         var4 = true;
      }

      if(!var4) {
         return null;
      } else {
         byte[] var6 = var1.method_5381(var2, var3);
         class_69 var8;
         if(null == var6) {
            var8 = null;
         } else {
            class_69 var10000 = new class_69(var6, class_223.field_2529, class_284.field_3260, field_4278, class_318.field_3787, field_4279);
            class_69 var7 = var10000;
            class_192.method_3958();
            var8 = var7;
         }

         return var8;
      }
   }

   // $FF: renamed from: w (jv, jv, int, int) kt
   public static class_69 method_6818(class_306 var0, class_306 var1, int var2, int var3) {
      byte[] var5 = var0.method_5381(var2, var3);
      boolean var4;
      if(var5 == null) {
         var4 = false;
      } else {
         class_253.method_4899(var5, (byte)1);
         var4 = true;
      }

      if(!var4) {
         return null;
      } else {
         byte[] var6 = var1.method_5381(var2, var3);
         class_69 var8;
         if(null == var6) {
            var8 = null;
         } else {
            class_69 var10000 = new class_69(var6, class_223.field_2529, class_284.field_3260, field_4278, class_318.field_3787, field_4279);
            class_69 var7 = var10000;
            class_192.method_3958();
            var8 = var7;
         }

         return var8;
      }
   }

   // $FF: renamed from: am (jv, int, int) boolean
   static boolean method_6819(class_306 var0, int var1, int var2) {
      byte[] var3 = var0.method_5381(var1, var2);
      if(var3 == null) {
         return false;
      } else {
         class_253.method_4899(var3, (byte)1);
         return true;
      }
   }

   // $FF: renamed from: ap (jv, java.lang.String, java.lang.String) op
   public static class_66 method_6820(class_306 var0, String var1, String var2) {
      int var3 = var0.method_5399(var1);
      int var4 = var0.method_5400(var3, var2);
      return class_277.method_5140(var0, var3, var4, 1690865732);
   }

   // $FF: renamed from: al (jv, java.lang.String, java.lang.String) oh[]
   public static class_67[] method_6821(class_306 var0, String var1, String var2) {
      int var3 = var0.method_5399(var1);
      int var4 = var0.method_5400(var3, var2);
      return class_80.method_1338(var0, var3, var4);
   }

   // $FF: renamed from: az (jv, int) boolean
   static boolean method_6822(class_306 var0, int var1) {
      byte[] var2 = var0.method_5388(var1, (byte)-119);
      if(var2 == null) {
         return false;
      } else {
         class_253.method_4899(var2, (byte)1);
         return true;
      }
   }

   // $FF: renamed from: ab (jv, java.lang.String, java.lang.String) op
   public static class_66 method_6823(class_306 var0, String var1, String var2) {
      int var3 = var0.method_5399(var1);
      int var4 = var0.method_5400(var3, var2);
      return class_277.method_5140(var0, var3, var4, 1690865732);
   }

   // $FF: renamed from: k (jv, int, int) op
   static class_66 method_6824(class_306 var0, int var1, int var2) {
      if(!class_370.method_6606(var0, var1, var2, (byte)66)) {
         return null;
      } else {
         class_66 var10000 = new class_66();
         class_66 var4 = var10000;
         var4.field_497 = field_4276 * -1099363635;
         var4.field_494 = class_380.field_4201 * -821679425;
         var4.field_495 = class_223.field_2529[0];
         var4.field_496 = class_284.field_3260[0];
         var4.field_498 = field_4278[0];
         var4.field_492 = class_318.field_3787[0];
         var4.field_491 = class_192.field_2300;
         var4.field_493 = field_4279[0];
         class_192.method_3958();
         return var4;
      }
   }

   // $FF: renamed from: ad (jv, java.lang.String, java.lang.String) oh[]
   public static class_67[] method_6825(class_306 var0, String var1, String var2) {
      int var3 = var0.method_5399(var1);
      int var4 = var0.method_5400(var3, var2);
      return class_80.method_1338(var0, var3, var4);
   }

   // $FF: renamed from: ai (jv, java.lang.String, java.lang.String) oh[]
   public static class_67[] method_6826(class_306 var0, String var1, String var2) {
      int var3 = var0.method_5399(var1);
      int var4 = var0.method_5400(var3, var2);
      return class_80.method_1338(var0, var3, var4);
   }

   // $FF: renamed from: ar (jv, jv, java.lang.String, java.lang.String) kt
   public static class_69 method_6827(class_306 var0, class_306 var1, String var2, String var3) {
      int var4 = var0.method_5399(var2);
      int var5 = var0.method_5400(var4, var3);
      return class_306.method_5485(var0, var1, var4, var5, (byte)-1);
   }

   // $FF: renamed from: ag (jv, int) op
   public static class_66 method_6828(class_306 var0, int var1) {
      if(!class_148.method_3128(var0, var1, 1251620127)) {
         return null;
      } else {
         class_66 var10000 = new class_66();
         class_66 var3 = var10000;
         var3.field_497 = -1099363635 * field_4276;
         var3.field_494 = class_380.field_4201 * -821679425;
         var3.field_495 = class_223.field_2529[0];
         var3.field_496 = class_284.field_3260[0];
         var3.field_498 = field_4278[0];
         var3.field_492 = class_318.field_3787[0];
         var3.field_491 = class_192.field_2300;
         var3.field_493 = field_4279[0];
         class_192.method_3958();
         return var3;
      }
   }

   // $FF: renamed from: ax (jv, int) op
   public static class_66 method_6829(class_306 var0, int var1) {
      if(!class_148.method_3128(var0, var1, -685077015)) {
         return null;
      } else {
         class_66 var10000 = new class_66();
         class_66 var3 = var10000;
         var3.field_497 = -1099363635 * field_4276;
         var3.field_494 = class_380.field_4201 * -821679425;
         var3.field_495 = class_223.field_2529[0];
         var3.field_496 = class_284.field_3260[0];
         var3.field_498 = field_4278[0];
         var3.field_492 = class_318.field_3787[0];
         var3.field_491 = class_192.field_2300;
         var3.field_493 = field_4279[0];
         class_192.method_3958();
         return var3;
      }
   }

   // $FF: renamed from: h (jv, java.lang.String, java.lang.String) op
   public static class_66 method_6830(class_306 var0, String var1, String var2) {
      int var3 = var0.method_5399(var1);
      int var4 = var0.method_5400(var3, var2);
      return class_277.method_5140(var0, var3, var4, 1690865732);
   }

   // $FF: renamed from: ae (jv, java.lang.String, java.lang.String) op
   public static class_66 method_6831(class_306 var0, String var1, String var2) {
      int var3 = var0.method_5399(var1);
      int var4 = var0.method_5400(var3, var2);
      return class_277.method_5140(var0, var3, var4, 1690865732);
   }

   // $FF: renamed from: aq () void
   public static void method_6832() {
      class_223.field_2529 = null;
      class_284.field_3260 = null;
      field_4278 = null;
      class_318.field_3787 = null;
      class_192.field_2300 = null;
      field_4279 = (byte[][])null;
   }

   // $FF: renamed from: <init> () void
   class_403() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: av (jv, int) boolean
   static boolean method_6834(class_306 var0, int var1) {
      byte[] var2 = var0.method_5388(var1, (byte)-107);
      if(var2 == null) {
         return false;
      } else {
         class_253.method_4899(var2, (byte)1);
         return true;
      }
   }

   // $FF: renamed from: ac (byte[]) void
   public static void method_6835(byte[] var0) {
      Buffer var10000 = new Buffer(var0);
      Buffer var1 = var10000;
      var1.offset = (var0.length - 2) * -1025691571;
      field_4277 = var1.readShort() * -2047545261;
      class_223.field_2529 = new int[-1850208477 * field_4277];
      class_284.field_3260 = new int[field_4277 * 531091577];
      field_4278 = new int[field_4277 * -522791973];
      class_318.field_3787 = new int[-522791973 * field_4277];
      field_4279 = new byte[field_4277 * -522791973][];
      var1.offset = 806439913 * (var0.length - 7 - 2056009991 * field_4277);
      field_4276 = var1.readShort() * 1394733573;
      class_380.field_4201 = var1.readShort() * -410368705;
      int var2 = (var1.readUnsignedByte() & 255) + 1;

      int var3;
      for(var3 = 0; var3 < field_4277 * -1528777444; ++var3) {
         class_223.field_2529[var3] = var1.readShort();
      }

      for(var3 = 0; var3 < field_4277 * -522791973; ++var3) {
         class_284.field_3260[var3] = var1.readShort();
      }

      for(var3 = 0; var3 < field_4277 * -522791973; ++var3) {
         field_4278[var3] = var1.readShort();
      }

      for(var3 = 0; var3 < -617908552 * field_4277; ++var3) {
         class_318.field_3787[var3] = var1.readShort();
      }

      var1.offset = -2048482271 * (var0.length - 7 - field_4277 * 112631512 - (var2 - 1) * 3);
      class_192.field_2300 = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         class_192.field_2300[var3] = var1.method_134();
         if(class_192.field_2300[var3] == 0) {
            class_192.field_2300[var3] = 1;
         }
      }

      var1.offset = 0;

      for(var3 = 0; var3 < field_4277 * -842275335; ++var3) {
         int var4 = field_4278[var3];
         int var5 = class_318.field_3787[var3];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         field_4279[var3] = var7;
         int var8 = var1.readUnsignedByte();
         int var9;
         if(var8 == 0) {
            for(var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.readByte();
            }
         } else if(1 == var8) {
            for(var9 = 0; var9 < var4; ++var9) {
               for(int var10 = 0; var10 < var5; ++var10) {
                  var7[var4 * var10 + var9] = var1.readByte();
               }
            }
         }
      }

   }

   // $FF: renamed from: at (byte[]) void
   public static void method_6836(byte[] var0) {
      Buffer var10000 = new Buffer(var0);
      Buffer var1 = var10000;
      var1.offset = (var0.length - 2) * -1025691571;
      field_4277 = var1.readShort() * -2047545261;
      class_223.field_2529 = new int[-522791973 * field_4277];
      class_284.field_3260 = new int[field_4277 * -522791973];
      field_4278 = new int[field_4277 * -522791973];
      class_318.field_3787 = new int[-522791973 * field_4277];
      field_4279 = new byte[field_4277 * -522791973][];
      var1.offset = -1025691571 * (var0.length - 7 - 112631512 * field_4277);
      field_4276 = var1.readShort() * 1394733573;
      class_380.field_4201 = var1.readShort() * -410368705;
      int var2 = (var1.readUnsignedByte() & 255) + 1;

      int var3;
      for(var3 = 0; var3 < field_4277 * -522791973; ++var3) {
         class_223.field_2529[var3] = var1.readShort();
      }

      for(var3 = 0; var3 < field_4277 * -522791973; ++var3) {
         class_284.field_3260[var3] = var1.readShort();
      }

      for(var3 = 0; var3 < field_4277 * -522791973; ++var3) {
         field_4278[var3] = var1.readShort();
      }

      for(var3 = 0; var3 < -522791973 * field_4277; ++var3) {
         class_318.field_3787[var3] = var1.readShort();
      }

      var1.offset = -1025691571 * (var0.length - 7 - field_4277 * 112631512 - (var2 - 1) * 3);
      class_192.field_2300 = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         class_192.field_2300[var3] = var1.method_134();
         if(class_192.field_2300[var3] == 0) {
            class_192.field_2300[var3] = 1;
         }
      }

      var1.offset = 0;

      for(var3 = 0; var3 < field_4277 * -522791973; ++var3) {
         int var4 = field_4278[var3];
         int var5 = class_318.field_3787[var3];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         field_4279[var3] = var7;
         int var8 = var1.readUnsignedByte();
         int var9;
         if(var8 == 0) {
            for(var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.readByte();
            }
         } else if(1 == var8) {
            for(var9 = 0; var9 < var4; ++var9) {
               for(int var10 = 0; var10 < var5; ++var10) {
                  var7[var4 * var10 + var9] = var1.readByte();
               }
            }
         }
      }

   }

   // $FF: renamed from: ah () void
   public static void method_6837() {
      class_223.field_2529 = null;
      class_284.field_3260 = null;
      field_4278 = null;
      class_318.field_3787 = null;
      class_192.field_2300 = null;
      field_4279 = (byte[][])null;
   }

   // $FF: renamed from: ao () void
   public static void method_6838() {
      class_223.field_2529 = null;
      class_284.field_3260 = null;
      field_4278 = null;
      class_318.field_3787 = null;
      class_192.field_2300 = null;
      field_4279 = (byte[][])null;
   }

   // $FF: renamed from: g (jv, int, int) op[]
   public static class_66[] method_6839(class_306 var0, int var1, int var2) {
      return !class_370.method_6606(var0, var1, var2, (byte)117)?null:class_176.method_3749((short)-7294);
   }
}
