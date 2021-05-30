
// $FF: renamed from: ge
public class class_43 extends class_27 {

   // $FF: renamed from: n int
   int field_310;
   // $FF: renamed from: ak int
   static int field_311;
   // $FF: renamed from: f int[]
   int[] field_312;
   // $FF: renamed from: y int[][]
   int[][] field_313;
   // $FF: renamed from: v int
   int field_314;
   // $FF: renamed from: k int
   public static final int field_315 = 512;


   // $FF: renamed from: s (int, int, int, int) int
   static final int method_492(int var0, int var1, int var2) {
      try {
         int var4 = var0 / var2;
         int var5 = var0 & var2 - 1;
         int var6 = var1 / var2;
         int var7 = var1 & var2 - 1;
         int var8 = class_247.method_4714(var4, var6);
         int var9 = class_247.method_4714(var4 + 1, var6);
         int var10 = class_247.method_4714(var4, var6 + 1);
         int var11 = class_247.method_4714(1 + var4, 1 + var6);
         int var13 = 65536 - class_70.field_559[var5 * 1024 / var2] >> 1;
         int var12 = (var8 * (65536 - var13) >> 16) + (var13 * var9 >> 16);
         int var14 = class_154.method_3248(var10, var11, var5, var2);
         int var16 = 65536 - class_70.field_559[1024 * var7 / var2] >> 1;
         int var15 = (var14 * var16 >> 16) + (var12 * (65536 - var16) >> 16);
         return var15;
      } catch (RuntimeException var17) {
         throw class_223.method_4281(var17);
      }
   }

   // $FF: renamed from: <init> (int, byte[]) void
   class_43(int var1, byte[] var2) {
      super();
      try {
         this.field_314 = var1 * -1802035127;
         Buffer var10000 = new Buffer(var2);
         Buffer var3 = var10000;
         this.field_310 = var3.readUnsignedByte() * 951375625;
         this.field_312 = new int[this.field_310 * -1780750535];
         this.field_313 = new int[-1780750535 * this.field_310][];

         int var4;
         for(var4 = 0; var4 < this.field_310 * -1780750535; ++var4) {
            this.field_312[var4] = var3.readUnsignedByte();
         }

         for(var4 = 0; var4 < -1780750535 * this.field_310; ++var4) {
            this.field_313[var4] = new int[var3.readUnsignedByte()];
         }

         for(var4 = 0; var4 < this.field_310 * -1780750535; ++var4) {
            for(int var5 = 0; var5 < this.field_313[var4].length; ++var5) {
               this.field_313[var4][var5] = var3.readUnsignedByte();
            }
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: r (int) void
   static void method_494() {
      try {
         class_364 var10000 = new class_364(32);
         class_49.field_361 = var10000;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: ay (int, ii, boolean, int) void
   static void method_495(int var0, class_280 var1, boolean var2) {
      try {
         class_230 var4 = class_46.method_534().method_6356(var0, -1848369284);
         int var5 = 671262203 * class_164.field_2044.field_1163;
         int var6 = 697161691 * class_243.field_2700 + (class_164.field_2044.field_1077 * -130212619 >> 7);
         int var7 = (1248597615 * class_164.field_2044.field_1076 >> 7) + class_154.field_1929 * -27903763;
         class_280 var10000 = new class_280(var5, var6, var7);
         class_280 var8 = var10000;
         class_46.method_534().method_6521(var4, var8, var1, var2, 1149896139);
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9);
      }
   }

   // $FF: renamed from: v (int, int) int
   public static int method_496(int var0) {
      try {
         class_89 var2 = class_373.method_6618(var0, 743368656);
         int var3 = -2059144841 * var2.field_894;
         int var4 = var2.field_896 * -1506226221;
         int var5 = var2.field_895 * -354172645;
         int var6 = class_282.field_3248[var5 - var4];
         return class_282.field_3246[var3] >> var4 & var6;
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }
}
