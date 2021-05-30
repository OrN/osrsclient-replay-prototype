
// $FF: renamed from: br
public class class_57 extends class_27 {

   // $FF: renamed from: s int
   static int field_423;
   // $FF: renamed from: n int
   int field_424;
   // $FF: renamed from: f int
   int field_425;
   // $FF: renamed from: y int
   int field_426;
   // $FF: renamed from: p int
   int field_427;
   // $FF: renamed from: j boolean
   boolean field_428;
   // $FF: renamed from: b int
   static int field_429;
   // $FF: renamed from: ap float[]
   static float[] field_430;
   // $FF: renamed from: d int
   static int field_431;
   // $FF: renamed from: a int[]
   static int[] field_432;
   // $FF: renamed from: z int
   int field_433;
   // $FF: renamed from: l bs[]
   static class_155[] field_434;
   // $FF: renamed from: i float[]
   static float[] field_435;
   // $FF: renamed from: c bl[]
   static class_152[] field_436;
   // $FF: renamed from: e bz[]
   static class_161[] field_437;
   // $FF: renamed from: g boolean[]
   static boolean[] field_438;
   // $FF: renamed from: ar int
   int field_439;
   // $FF: renamed from: x int
   int field_440;
   // $FF: renamed from: m float[]
   float[] field_441;
   // $FF: renamed from: k boolean
   static boolean field_442;
   // $FF: renamed from: o an[]
   static class_134[] field_443;
   // $FF: renamed from: w boolean
   boolean field_444;
   // $FF: renamed from: t float[]
   static float[] field_445;
   // $FF: renamed from: h float[]
   static float[] field_446;
   // $FF: renamed from: q float[]
   static float[] field_447;
   // $FF: renamed from: u int
   static int field_448;
   // $FF: renamed from: ae float[]
   static float[] field_449;
   // $FF: renamed from: v byte[][]
   byte[][] field_450;
   // $FF: renamed from: ab float[]
   static float[] field_451;
   // $FF: renamed from: al int[]
   static int[] field_452;
   // $FF: renamed from: ad int[]
   static int[] field_453;
   // $FF: renamed from: ai byte[]
   byte[] field_454;
   // $FF: renamed from: r byte[]
   static byte[] field_455;
   // $FF: renamed from: ag int
   int field_456;


   // $FF: renamed from: d (jv, int, int) br
   static class_57 method_594(class_306 var0, int var1, int var2) {
      if(!method_614(var0)) {
         var0.method_5383(var1, var2, (byte)38);
         return null;
      } else {
         byte[] var3 = var0.method_5381(var1, var2);
         if(var3 == null) {
            return null;
         } else {
            class_57 var10000 = new class_57(var3);
            return var10000;
         }
      }
   }

   // $FF: renamed from: t (byte[]) void
   static void method_595(byte[] var0) {
      method_631(var0, 0);
      field_423 = 1 << method_599(4);
      field_448 = 1 << method_599(4);
      field_445 = new float[field_448];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0?field_448:field_423;
         var3 = var2 >> 1;
         var4 = var2 >> 2;
         var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for(int var7 = 0; var7 < var4; ++var7) {
            var6[2 * var7] = (float)Math.cos((double)(4 * var7) * 3.141592653589793D / (double)var2);
            var6[2 * var7 + 1] = -((float)Math.sin((double)(4 * var7) * 3.141592653589793D / (double)var2));
         }

         float[] var19 = new float[var3];

         for(int var8 = 0; var8 < var4; ++var8) {
            var19[2 * var8] = (float)Math.cos((double)(2 * var8 + 1) * 3.141592653589793D / (double)(2 * var2));
            var19[2 * var8 + 1] = (float)Math.sin((double)(2 * var8 + 1) * 3.141592653589793D / (double)(2 * var2));
         }

         float[] var20 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var20[2 * var9] = (float)Math.cos((double)(4 * var9 + 2) * 3.141592653589793D / (double)var2);
            var20[2 * var9 + 1] = -((float)Math.sin((double)(4 * var9 + 2) * 3.141592653589793D / (double)var2));
         }

         int[] var21 = new int[var5];
         int var10 = class_240.method_4642(var5 - 1, 531587632);

         for(int var11 = 0; var11 < var5; ++var11) {
            int var15 = var11;
            int var16 = var10;

            int var17;
            for(var17 = 0; var16 > 0; --var16) {
               var17 = var17 << 1 | var15 & 1;
               var15 >>>= 1;
            }

            var21[var11] = var17;
         }

         if(var1 != 0) {
            field_449 = var6;
            field_430 = var19;
            field_451 = var20;
            field_453 = var21;
         } else {
            field_446 = var6;
            field_447 = var19;
            field_435 = var20;
            field_452 = var21;
         }
      }

      var1 = method_599(8) + 1;
      field_434 = new class_155[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         class_155[] var10000 = field_434;
         class_155 var10002 = new class_155();
         var10000[var2] = var10002;
      }

      var2 = method_599(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         method_599(16);
      }

      var2 = method_599(6) + 1;
      field_443 = new class_134[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         class_134[] var22 = field_443;
         class_134 var25 = new class_134();
         var22[var3] = var25;
      }

      var3 = method_599(6) + 1;
      field_436 = new class_152[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         class_152[] var23 = field_436;
         class_152 var26 = new class_152();
         var23[var4] = var26;
      }

      var4 = method_599(6) + 1;
      field_437 = new class_161[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         class_161[] var24 = field_437;
         class_161 var27 = new class_161();
         var24[var5] = var27;
      }

      var5 = method_599(6) + 1;
      field_438 = new boolean[var5];
      field_432 = new int[var5];

      for(int var18 = 0; var18 < var5; ++var18) {
         field_438[var18] = method_596() != 0;
         method_599(16);
         method_599(16);
         field_432[var18] = method_599(8);
      }

   }

   // $FF: renamed from: f () int
   static int method_596() {
      int var0 = field_455[field_429] >> field_431 & 1;
      ++field_431;
      field_429 += field_431 >> 3;
      field_431 &= 7;
      return var0;
   }

   // $FF: renamed from: ad (jv) boolean
   static boolean method_597(class_306 var0) {
      if(!field_442) {
         byte[] var1 = var0.method_5381(0, 0);
         if(var1 == null) {
            return false;
         }

         method_618(var1);
         field_442 = true;
      }

      return true;
   }

   // $FF: renamed from: p (byte[]) void
   void method_598(byte[] var1) {
      Buffer var10000 = new Buffer(var1);
      Buffer var2 = var10000;
      this.field_424 = var2.method_135();
      this.field_425 = var2.method_135();
      this.field_426 = var2.method_135();
      this.field_427 = var2.method_135();
      if(this.field_427 < 0) {
         this.field_427 = ~this.field_427;
         this.field_428 = true;
      }

      int var3 = var2.method_135();
      this.field_450 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.readUnsignedByte();
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method_267(var7, 0, var5, 728624452);
         this.field_450[var4] = var7;
      }

   }

   // $FF: renamed from: y (int) int
   static int method_599(int var0) {
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var0 >= 8 - field_431; var0 -= var3) {
         var3 = 8 - field_431;
         int var4 = (1 << var3) - 1;
         var1 += (field_455[field_429] >> field_431 & var4) << var2;
         field_431 = 0;
         ++field_429;
         var2 += var3;
      }

      if(var0 > 0) {
         var3 = (1 << var0) - 1;
         var1 += (field_455[field_429] >> field_431 & var3) << var2;
         field_431 += var0;
      }

      return var1;
   }

   // $FF: renamed from: r (int) float[]
   float[] method_600(int var1) {
      method_631(this.field_450[var1], 0);
      method_596();
      int var2 = method_599(class_240.method_4642(field_432.length - 1, -687702354));
      boolean var3 = field_438[var2];
      int var4 = var3?field_448:field_423;
      boolean var5 = false;
      boolean var6 = false;
      if(var3) {
         var5 = method_596() != 0;
         var6 = method_596() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if(var3 && !var5) {
         var8 = (var4 >> 2) - (field_423 >> 2);
         var9 = (var4 >> 2) + (field_423 >> 2);
         var10 = field_423 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if(var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (field_423 >> 2);
         var12 = var4 - (var4 >> 2) + (field_423 >> 2);
         var13 = field_423 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class_161 var14 = field_437[field_432[var2]];
      int var16 = var14.field_2002;
      int var17 = var14.field_2004[var16];
      boolean var15 = !field_443[var17].method_2918();
      boolean var40 = var15;

      for(var17 = 0; var17 < var14.field_2003; ++var17) {
         class_152 var18 = field_436[var14.field_2005[var17]];
         float[] var19 = field_445;
         var18.method_3218(var19, var4 >> 1, var40);
      }

      int var41;
      if(!var15) {
         var17 = var14.field_2002;
         var41 = var14.field_2004[var17];
         field_443[var41].method_2919(field_445, var4 >> 1);
      }

      int var42;
      if(var15) {
         for(var17 = var4 >> 1; var17 < var4; ++var17) {
            field_445[var17] = 0.0F;
         }
      } else {
         var17 = var4 >> 1;
         var41 = var4 >> 2;
         var42 = var4 >> 3;
         float[] var20 = field_445;

         int var21;
         for(var21 = 0; var21 < var17; ++var21) {
            var20[var21] *= 0.5F;
         }

         for(var21 = var17; var21 < var4; ++var21) {
            var20[var21] = -var20[var4 - var21 - 1];
         }

         float[] var46 = var3?field_449:field_446;
         float[] var22 = var3?field_430:field_447;
         float[] var23 = var3?field_451:field_435;
         int[] var24 = var3?field_453:field_452;

         int var25;
         float var26;
         float var27;
         float var28;
         float var29;
         for(var25 = 0; var25 < var41; ++var25) {
            var26 = var20[4 * var25] - var20[var4 - 4 * var25 - 1];
            var27 = var20[4 * var25 + 2] - var20[var4 - 4 * var25 - 3];
            var28 = var46[2 * var25];
            var29 = var46[2 * var25 + 1];
            var20[var4 - 4 * var25 - 1] = var26 * var28 - var27 * var29;
            var20[var4 - 4 * var25 - 3] = var26 * var29 + var27 * var28;
         }

         float var30;
         float var31;
         for(var25 = 0; var25 < var42; ++var25) {
            var26 = var20[var17 + 3 + 4 * var25];
            var27 = var20[var17 + 1 + 4 * var25];
            var28 = var20[4 * var25 + 3];
            var29 = var20[4 * var25 + 1];
            var20[var17 + 3 + 4 * var25] = var26 + var28;
            var20[var17 + 1 + 4 * var25] = var27 + var29;
            var30 = var46[var17 - 4 - 4 * var25];
            var31 = var46[var17 - 3 - 4 * var25];
            var20[4 * var25 + 3] = (var26 - var28) * var30 - (var27 - var29) * var31;
            var20[4 * var25 + 1] = (var27 - var29) * var30 + (var26 - var28) * var31;
         }

         var25 = class_240.method_4642(var4 - 1, 288932322);

         int var47;
         int var48;
         int var49;
         int var50;
         for(var47 = 0; var47 < var25 - 3; ++var47) {
            var48 = var4 >> var47 + 2;
            var49 = 8 << var47;

            for(var50 = 0; var50 < 2 << var47; ++var50) {
               int var51 = var4 - var48 * 2 * var50;
               int var52 = var4 - var48 * (2 * var50 + 1);

               for(int var32 = 0; var32 < var4 >> var47 + 4; ++var32) {
                  int var33 = 4 * var32;
                  float var34 = var20[var51 - 1 - var33];
                  float var35 = var20[var51 - 3 - var33];
                  float var36 = var20[var52 - 1 - var33];
                  float var37 = var20[var52 - 3 - var33];
                  var20[var51 - 1 - var33] = var34 + var36;
                  var20[var51 - 3 - var33] = var35 + var37;
                  float var38 = var46[var32 * var49];
                  float var39 = var46[var32 * var49 + 1];
                  var20[var52 - 1 - var33] = (var34 - var36) * var38 - (var35 - var37) * var39;
                  var20[var52 - 3 - var33] = (var35 - var37) * var38 + (var34 - var36) * var39;
               }
            }
         }

         for(var47 = 1; var47 < var42 - 1; ++var47) {
            var48 = var24[var47];
            if(var47 < var48) {
               var49 = 8 * var47;
               var50 = 8 * var48;
               var30 = var20[var49 + 1];
               var20[var49 + 1] = var20[var50 + 1];
               var20[var50 + 1] = var30;
               var30 = var20[var49 + 3];
               var20[var49 + 3] = var20[var50 + 3];
               var20[var50 + 3] = var30;
               var30 = var20[var49 + 5];
               var20[var49 + 5] = var20[var50 + 5];
               var20[var50 + 5] = var30;
               var30 = var20[var49 + 7];
               var20[var49 + 7] = var20[var50 + 7];
               var20[var50 + 7] = var30;
            }
         }

         for(var47 = 0; var47 < var17; ++var47) {
            var20[var47] = var20[2 * var47 + 1];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var20[var4 - 1 - 2 * var47] = var20[4 * var47];
            var20[var4 - 2 - 2 * var47] = var20[4 * var47 + 1];
            var20[var4 - var41 - 1 - 2 * var47] = var20[4 * var47 + 2];
            var20[var4 - var41 - 2 - 2 * var47] = var20[4 * var47 + 3];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var27 = var23[2 * var47];
            var28 = var23[2 * var47 + 1];
            var29 = var20[var17 + 2 * var47];
            var30 = var20[var17 + 2 * var47 + 1];
            var31 = var20[var4 - 2 - 2 * var47];
            float var53 = var20[var4 - 1 - 2 * var47];
            float var54 = var28 * (var29 - var31) + var27 * (var30 + var53);
            var20[var17 + 2 * var47] = (var29 + var31 + var54) * 0.5F;
            var20[var4 - 2 - 2 * var47] = (var29 + var31 - var54) * 0.5F;
            var54 = var28 * (var30 + var53) - var27 * (var29 - var31);
            var20[var17 + 2 * var47 + 1] = (var30 - var53 + var54) * 0.5F;
            var20[var4 - 1 - 2 * var47] = (-var30 + var53 + var54) * 0.5F;
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var47] = var20[2 * var47 + var17] * var22[2 * var47] + var20[2 * var47 + 1 + var17] * var22[2 * var47 + 1];
            var20[var17 - 1 - var47] = var20[2 * var47 + var17] * var22[2 * var47 + 1] - var20[2 * var47 + 1 + var17] * var22[2 * var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var4 - var41 + var47] = -var20[var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var47] = var20[var41 + var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var41 + var47] = -var20[var41 - var47 - 1];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var17 + var47] = var20[var4 - var47 - 1];
         }

         for(var47 = var8; var47 < var9; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var8) + 0.5D) / (double)var10 * 0.5D * 3.141592653589793D);
            field_445[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }

         for(var47 = var11; var47 < var12; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            field_445[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }
      }

      float[] var43 = null;
      if(this.field_440 > 0) {
         var41 = this.field_440 + var4 >> 2;
         var43 = new float[var41];
         int var45;
         if(!this.field_444) {
            for(var42 = 0; var42 < this.field_433; ++var42) {
               var45 = (this.field_440 >> 1) + var42;
               var43[var42] += this.field_441[var45];
            }
         }

         if(!var15) {
            for(var42 = var8; var42 < var4 >> 1; ++var42) {
               var45 = var43.length - (var4 >> 1) + var42;
               var43[var45] += field_445[var42];
            }
         }
      }

      float[] var44 = this.field_441;
      this.field_441 = field_445;
      field_445 = var44;
      this.field_440 = var4;
      this.field_433 = var12 - (var4 >> 1);
      this.field_444 = var15;
      return var43;
   }

   // $FF: renamed from: <init> (byte[]) void
   class_57(byte[] var1) {
      super();
      this.method_598(var1);
   }

   // $FF: renamed from: e (byte[], int) void
   static void method_602(byte[] var0, int var1) {
      field_455 = var0;
      field_429 = var1;
      field_431 = 0;
   }

   // $FF: renamed from: g (byte[], int) void
   static void method_603(byte[] var0, int var1) {
      field_455 = var0;
      field_429 = var1;
      field_431 = 0;
   }

   // $FF: renamed from: s (int[]) au
   class_110 method_604(int[] var1) {
      if(var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if(this.field_454 == null) {
            this.field_440 = 0;
            this.field_441 = new float[field_448];
            this.field_454 = new byte[this.field_425];
            this.field_439 = 0;
            this.field_456 = 0;
         }

         for(; this.field_456 < this.field_450.length; ++this.field_456) {
            if(var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method_600(this.field_456);
            if(var2 != null) {
               int var3 = this.field_439;
               int var4 = var2.length;
               if(var4 > this.field_425 - var3) {
                  var4 = this.field_425 - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.field_454[var3++] = (byte)(var6 - 128);
               }

               if(var1 != null) {
                  var1[0] -= var3 - this.field_439;
               }

               this.field_439 = var3;
            }
         }

         this.field_441 = null;
         byte[] var7 = this.field_454;
         this.field_454 = null;
         class_110 var10000 = new class_110(this.field_424, var7, this.field_426, this.field_427, this.field_428);
         return var10000;
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_442 = false;
   }

   // $FF: renamed from: u (int) float
   static float method_606(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if(var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   // $FF: renamed from: ar (jv, int, int) br
   static class_57 method_607(class_306 var0, int var1, int var2) {
      if(!method_614(var0)) {
         var0.method_5383(var1, var2, (byte)32);
         return null;
      } else {
         byte[] var3 = var0.method_5381(var1, var2);
         if(var3 == null) {
            return null;
         } else {
            class_57 var10000 = new class_57(var3);
            return var10000;
         }
      }
   }

   // $FF: renamed from: o (int) float
   static float method_608(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & -1742357369;
      int var3 = (var0 & 2145386496) >> 21;
      if(var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - -984788394)));
   }

   // $FF: renamed from: c (byte[], int) void
   static void method_609(byte[] var0, int var1) {
      field_455 = var0;
      field_429 = var1;
      field_431 = 0;
   }

   // $FF: renamed from: h (byte[]) void
   static void method_610(byte[] var0) {
      method_631(var0, 0);
      field_423 = 1 << method_599(4);
      field_448 = 1 << method_599(4);
      field_445 = new float[field_448];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0?field_448:field_423;
         var3 = var2 >> 1;
         var4 = var2 >> 2;
         var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for(int var7 = 0; var7 < var4; ++var7) {
            var6[2 * var7] = (float)Math.cos((double)(4 * var7) * 3.141592653589793D / (double)var2);
            var6[2 * var7 + 1] = -((float)Math.sin((double)(4 * var7) * 3.141592653589793D / (double)var2));
         }

         float[] var19 = new float[var3];

         for(int var8 = 0; var8 < var4; ++var8) {
            var19[2 * var8] = (float)Math.cos((double)(2 * var8 + 1) * 3.141592653589793D / (double)(2 * var2));
            var19[2 * var8 + 1] = (float)Math.sin((double)(2 * var8 + 1) * 3.141592653589793D / (double)(2 * var2));
         }

         float[] var20 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var20[2 * var9] = (float)Math.cos((double)(4 * var9 + 2) * 3.141592653589793D / (double)var2);
            var20[2 * var9 + 1] = -((float)Math.sin((double)(4 * var9 + 2) * 3.141592653589793D / (double)var2));
         }

         int[] var21 = new int[var5];
         int var10 = class_240.method_4642(var5 - 1, 1274588484);

         for(int var11 = 0; var11 < var5; ++var11) {
            int var15 = var11;
            int var16 = var10;

            int var17;
            for(var17 = 0; var16 > 0; --var16) {
               var17 = var17 << 1 | var15 & 1;
               var15 >>>= 1;
            }

            var21[var11] = var17;
         }

         if(var1 != 0) {
            field_449 = var6;
            field_430 = var19;
            field_451 = var20;
            field_453 = var21;
         } else {
            field_446 = var6;
            field_447 = var19;
            field_435 = var20;
            field_452 = var21;
         }
      }

      var1 = method_599(8) + 1;
      field_434 = new class_155[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         class_155[] var10000 = field_434;
         class_155 var10002 = new class_155();
         var10000[var2] = var10002;
      }

      var2 = method_599(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         method_599(16);
      }

      var2 = method_599(6) + 1;
      field_443 = new class_134[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         class_134[] var22 = field_443;
         class_134 var25 = new class_134();
         var22[var3] = var25;
      }

      var3 = method_599(6) + 1;
      field_436 = new class_152[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         class_152[] var23 = field_436;
         class_152 var26 = new class_152();
         var23[var4] = var26;
      }

      var4 = method_599(6) + 1;
      field_437 = new class_161[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         class_161[] var24 = field_437;
         class_161 var27 = new class_161();
         var24[var5] = var27;
      }

      var5 = method_599(6) + 1;
      field_438 = new boolean[var5];
      field_432 = new int[var5];

      for(int var18 = 0; var18 < var5; ++var18) {
         field_438[var18] = method_596() != 0;
         method_599(16);
         method_599(16);
         field_432[var18] = method_599(8);
      }

   }

   // $FF: renamed from: as (int[]) au
   class_110 method_611(int[] var1) {
      if(var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if(this.field_454 == null) {
            this.field_440 = 0;
            this.field_441 = new float[field_448];
            this.field_454 = new byte[this.field_425];
            this.field_439 = 0;
            this.field_456 = 0;
         }

         for(; this.field_456 < this.field_450.length; ++this.field_456) {
            if(var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method_600(this.field_456);
            if(var2 != null) {
               int var3 = this.field_439;
               int var4 = var2.length;
               if(var4 > this.field_425 - var3) {
                  var4 = this.field_425 - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.field_454[var3++] = (byte)(var6 - 577255268);
               }

               if(var1 != null) {
                  var1[0] -= var3 - this.field_439;
               }

               this.field_439 = var3;
            }
         }

         this.field_441 = null;
         byte[] var7 = this.field_454;
         this.field_454 = null;
         class_110 var10000 = new class_110(this.field_424, var7, this.field_426, this.field_427, this.field_428);
         return var10000;
      }
   }

   // $FF: renamed from: a () int
   static int method_612() {
      int var0 = field_455[field_429] >> field_431 & 1;
      ++field_431;
      field_429 += field_431 >> 3;
      field_431 &= 7;
      return var0;
   }

   // $FF: renamed from: k () int
   static int method_613() {
      int var0 = field_455[field_429] >> field_431 & 1;
      ++field_431;
      field_429 += field_431 >> 3;
      field_431 &= 7;
      return var0;
   }

   // $FF: renamed from: b (jv) boolean
   static boolean method_614(class_306 var0) {
      if(!field_442) {
         byte[] var1 = var0.method_5381(0, 0);
         if(var1 == null) {
            return false;
         }

         method_618(var1);
         field_442 = true;
      }

      return true;
   }

   // $FF: renamed from: x (byte[]) void
   void method_615(byte[] var1) {
      Buffer var10000 = new Buffer(var1);
      Buffer var2 = var10000;
      this.field_424 = var2.method_135();
      this.field_425 = var2.method_135();
      this.field_426 = var2.method_135();
      this.field_427 = var2.method_135();
      if(this.field_427 < 0) {
         this.field_427 = ~this.field_427;
         this.field_428 = true;
      }

      int var3 = var2.method_135();
      this.field_450 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.readUnsignedByte();
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method_267(var7, 0, var5, 1437213151);
         this.field_450[var4] = var7;
      }

   }

   // $FF: renamed from: z (byte[]) void
   void method_616(byte[] var1) {
      Buffer var10000 = new Buffer(var1);
      Buffer var2 = var10000;
      this.field_424 = var2.method_135();
      this.field_425 = var2.method_135();
      this.field_426 = var2.method_135();
      this.field_427 = var2.method_135();
      if(this.field_427 < 0) {
         this.field_427 = ~this.field_427;
         this.field_428 = true;
      }

      int var3 = var2.method_135();
      this.field_450 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.readUnsignedByte();
            var5 += var6;
         } while(var6 >= -1811845834);

         byte[] var7 = new byte[var5];
         var2.method_267(var7, 0, var5, 1610138167);
         this.field_450[var4] = var7;
      }

   }

   // $FF: renamed from: w (byte[]) void
   void method_617(byte[] var1) {
      Buffer var10000 = new Buffer(var1);
      Buffer var2 = var10000;
      this.field_424 = var2.method_135();
      this.field_425 = var2.method_135();
      this.field_426 = var2.method_135();
      this.field_427 = var2.method_135();
      if(this.field_427 < 0) {
         this.field_427 = ~this.field_427;
         this.field_428 = true;
      }

      int var3 = var2.method_135();
      this.field_450 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.readUnsignedByte();
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method_267(var7, 0, var5, 1109069848);
         this.field_450[var4] = var7;
      }

   }

   // $FF: renamed from: j (byte[]) void
   static void method_618(byte[] var0) {
      method_631(var0, 0);
      field_423 = 1 << method_599(4);
      field_448 = 1 << method_599(4);
      field_445 = new float[field_448];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0?field_448:field_423;
         var3 = var2 >> 1;
         var4 = var2 >> 2;
         var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for(int var7 = 0; var7 < var4; ++var7) {
            var6[2 * var7] = (float)Math.cos((double)(4 * var7) * 3.141592653589793D / (double)var2);
            var6[2 * var7 + 1] = -((float)Math.sin((double)(4 * var7) * 3.141592653589793D / (double)var2));
         }

         float[] var19 = new float[var3];

         for(int var8 = 0; var8 < var4; ++var8) {
            var19[2 * var8] = (float)Math.cos((double)(2 * var8 + 1) * 3.141592653589793D / (double)(2 * var2));
            var19[2 * var8 + 1] = (float)Math.sin((double)(2 * var8 + 1) * 3.141592653589793D / (double)(2 * var2));
         }

         float[] var20 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var20[2 * var9] = (float)Math.cos((double)(4 * var9 + 2) * 3.141592653589793D / (double)var2);
            var20[2 * var9 + 1] = -((float)Math.sin((double)(4 * var9 + 2) * 3.141592653589793D / (double)var2));
         }

         int[] var21 = new int[var5];
         int var10 = class_240.method_4642(var5 - 1, 1687348355);

         for(int var11 = 0; var11 < var5; ++var11) {
            int var15 = var11;
            int var16 = var10;

            int var17;
            for(var17 = 0; var16 > 0; --var16) {
               var17 = var17 << 1 | var15 & 1;
               var15 >>>= 1;
            }

            var21[var11] = var17;
         }

         if(var1 != 0) {
            field_449 = var6;
            field_430 = var19;
            field_451 = var20;
            field_453 = var21;
         } else {
            field_446 = var6;
            field_447 = var19;
            field_435 = var20;
            field_452 = var21;
         }
      }

      var1 = method_599(8) + 1;
      field_434 = new class_155[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         class_155[] var10000 = field_434;
         class_155 var10002 = new class_155();
         var10000[var2] = var10002;
      }

      var2 = method_599(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         method_599(16);
      }

      var2 = method_599(6) + 1;
      field_443 = new class_134[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         class_134[] var22 = field_443;
         class_134 var25 = new class_134();
         var22[var3] = var25;
      }

      var3 = method_599(6) + 1;
      field_436 = new class_152[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         class_152[] var23 = field_436;
         class_152 var26 = new class_152();
         var23[var4] = var26;
      }

      var4 = method_599(6) + 1;
      field_437 = new class_161[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         class_161[] var24 = field_437;
         class_161 var27 = new class_161();
         var24[var5] = var27;
      }

      var5 = method_599(6) + 1;
      field_438 = new boolean[var5];
      field_432 = new int[var5];

      for(int var18 = 0; var18 < var5; ++var18) {
         field_438[var18] = method_596() != 0;
         method_599(16);
         method_599(16);
         field_432[var18] = method_599(8);
      }

   }

   // $FF: renamed from: ap (int) float[]
   float[] method_619(int var1) {
      method_631(this.field_450[var1], 0);
      method_596();
      int var2 = method_599(class_240.method_4642(field_432.length - 1, -853285890));
      boolean var3 = field_438[var2];
      int var4 = var3?field_448:field_423;
      boolean var5 = false;
      boolean var6 = false;
      if(var3) {
         var5 = method_596() != 0;
         var6 = method_596() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if(var3 && !var5) {
         var8 = (var4 >> 2) - (field_423 >> 2);
         var9 = (var4 >> 2) + (field_423 >> 2);
         var10 = field_423 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if(var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (field_423 >> 2);
         var12 = var4 - (var4 >> 2) + (field_423 >> 2);
         var13 = field_423 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class_161 var14 = field_437[field_432[var2]];
      int var16 = var14.field_2002;
      int var17 = var14.field_2004[var16];
      boolean var15 = !field_443[var17].method_2918();
      boolean var40 = var15;

      for(var17 = 0; var17 < var14.field_2003; ++var17) {
         class_152 var18 = field_436[var14.field_2005[var17]];
         float[] var19 = field_445;
         var18.method_3218(var19, var4 >> 1, var40);
      }

      int var41;
      if(!var15) {
         var17 = var14.field_2002;
         var41 = var14.field_2004[var17];
         field_443[var41].method_2919(field_445, var4 >> 1);
      }

      int var42;
      if(var15) {
         for(var17 = var4 >> 1; var17 < var4; ++var17) {
            field_445[var17] = 0.0F;
         }
      } else {
         var17 = var4 >> 1;
         var41 = var4 >> 2;
         var42 = var4 >> 3;
         float[] var20 = field_445;

         int var21;
         for(var21 = 0; var21 < var17; ++var21) {
            var20[var21] *= 0.5F;
         }

         for(var21 = var17; var21 < var4; ++var21) {
            var20[var21] = -var20[var4 - var21 - 1];
         }

         float[] var46 = var3?field_449:field_446;
         float[] var22 = var3?field_430:field_447;
         float[] var23 = var3?field_451:field_435;
         int[] var24 = var3?field_453:field_452;

         int var25;
         float var26;
         float var27;
         float var28;
         float var29;
         for(var25 = 0; var25 < var41; ++var25) {
            var26 = var20[4 * var25] - var20[var4 - 4 * var25 - 1];
            var27 = var20[4 * var25 + 2] - var20[var4 - 4 * var25 - 3];
            var28 = var46[2 * var25];
            var29 = var46[2 * var25 + 1];
            var20[var4 - 4 * var25 - 1] = var26 * var28 - var27 * var29;
            var20[var4 - 4 * var25 - 3] = var26 * var29 + var27 * var28;
         }

         float var30;
         float var31;
         for(var25 = 0; var25 < var42; ++var25) {
            var26 = var20[var17 + 3 + 4 * var25];
            var27 = var20[var17 + 1 + 4 * var25];
            var28 = var20[4 * var25 + 3];
            var29 = var20[4 * var25 + 1];
            var20[var17 + 3 + 4 * var25] = var26 + var28;
            var20[var17 + 1 + 4 * var25] = var27 + var29;
            var30 = var46[var17 - 4 - 4 * var25];
            var31 = var46[var17 - 3 - 4 * var25];
            var20[4 * var25 + 3] = (var26 - var28) * var30 - (var27 - var29) * var31;
            var20[4 * var25 + 1] = (var27 - var29) * var30 + (var26 - var28) * var31;
         }

         var25 = class_240.method_4642(var4 - 1, 720681331);

         int var47;
         int var48;
         int var49;
         int var50;
         for(var47 = 0; var47 < var25 - 3; ++var47) {
            var48 = var4 >> var47 + 2;
            var49 = 8 << var47;

            for(var50 = 0; var50 < 2 << var47; ++var50) {
               int var51 = var4 - var48 * 2 * var50;
               int var52 = var4 - var48 * (2 * var50 + 1);

               for(int var32 = 0; var32 < var4 >> var47 + 4; ++var32) {
                  int var33 = 4 * var32;
                  float var34 = var20[var51 - 1 - var33];
                  float var35 = var20[var51 - 3 - var33];
                  float var36 = var20[var52 - 1 - var33];
                  float var37 = var20[var52 - 3 - var33];
                  var20[var51 - 1 - var33] = var34 + var36;
                  var20[var51 - 3 - var33] = var35 + var37;
                  float var38 = var46[var32 * var49];
                  float var39 = var46[var32 * var49 + 1];
                  var20[var52 - 1 - var33] = (var34 - var36) * var38 - (var35 - var37) * var39;
                  var20[var52 - 3 - var33] = (var35 - var37) * var38 + (var34 - var36) * var39;
               }
            }
         }

         for(var47 = 1; var47 < var42 - 1; ++var47) {
            var48 = var24[var47];
            if(var47 < var48) {
               var49 = 8 * var47;
               var50 = 8 * var48;
               var30 = var20[var49 + 1];
               var20[var49 + 1] = var20[var50 + 1];
               var20[var50 + 1] = var30;
               var30 = var20[var49 + 3];
               var20[var49 + 3] = var20[var50 + 3];
               var20[var50 + 3] = var30;
               var30 = var20[var49 + 5];
               var20[var49 + 5] = var20[var50 + 5];
               var20[var50 + 5] = var30;
               var30 = var20[var49 + 7];
               var20[var49 + 7] = var20[var50 + 7];
               var20[var50 + 7] = var30;
            }
         }

         for(var47 = 0; var47 < var17; ++var47) {
            var20[var47] = var20[2 * var47 + 1];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var20[var4 - 1 - 2 * var47] = var20[4 * var47];
            var20[var4 - 2 - 2 * var47] = var20[4 * var47 + 1];
            var20[var4 - var41 - 1 - 2 * var47] = var20[4 * var47 + 2];
            var20[var4 - var41 - 2 - 2 * var47] = var20[4 * var47 + 3];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var27 = var23[2 * var47];
            var28 = var23[2 * var47 + 1];
            var29 = var20[var17 + 2 * var47];
            var30 = var20[var17 + 2 * var47 + 1];
            var31 = var20[var4 - 2 - 2 * var47];
            float var53 = var20[var4 - 1 - 2 * var47];
            float var54 = var28 * (var29 - var31) + var27 * (var30 + var53);
            var20[var17 + 2 * var47] = (var29 + var31 + var54) * 0.5F;
            var20[var4 - 2 - 2 * var47] = (var29 + var31 - var54) * 0.5F;
            var54 = var28 * (var30 + var53) - var27 * (var29 - var31);
            var20[var17 + 2 * var47 + 1] = (var30 - var53 + var54) * 0.5F;
            var20[var4 - 1 - 2 * var47] = (-var30 + var53 + var54) * 0.5F;
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var47] = var20[2 * var47 + var17] * var22[2 * var47] + var20[2 * var47 + 1 + var17] * var22[2 * var47 + 1];
            var20[var17 - 1 - var47] = var20[2 * var47 + var17] * var22[2 * var47 + 1] - var20[2 * var47 + 1 + var17] * var22[2 * var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var4 - var41 + var47] = -var20[var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var47] = var20[var41 + var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var41 + var47] = -var20[var41 - var47 - 1];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var17 + var47] = var20[var4 - var47 - 1];
         }

         for(var47 = var8; var47 < var9; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var8) + 0.5D) / (double)var10 * 0.5D * 3.141592653589793D);
            field_445[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }

         for(var47 = var11; var47 < var12; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            field_445[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }
      }

      float[] var43 = null;
      if(this.field_440 > 0) {
         var41 = this.field_440 + var4 >> 2;
         var43 = new float[var41];
         int var45;
         if(!this.field_444) {
            for(var42 = 0; var42 < this.field_433; ++var42) {
               var45 = (this.field_440 >> 1) + var42;
               var43[var42] += this.field_441[var45];
            }
         }

         if(!var15) {
            for(var42 = var8; var42 < var4 >> 1; ++var42) {
               var45 = var43.length - (var4 >> 1) + var42;
               var43[var45] += field_445[var42];
            }
         }
      }

      float[] var44 = this.field_441;
      this.field_441 = field_445;
      field_445 = var44;
      this.field_440 = var4;
      this.field_433 = var12 - (var4 >> 1);
      this.field_444 = var15;
      return var43;
   }

   // $FF: renamed from: q (byte[]) void
   static void method_620(byte[] var0) {
      method_631(var0, 0);
      field_423 = 1 << method_599(4);
      field_448 = 1 << method_599(4);
      field_445 = new float[field_448];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0?field_448:field_423;
         var3 = var2 >> 1;
         var4 = var2 >> 2;
         var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for(int var7 = 0; var7 < var4; ++var7) {
            var6[2 * var7] = (float)Math.cos((double)(4 * var7) * 3.141592653589793D / (double)var2);
            var6[2 * var7 + 1] = -((float)Math.sin((double)(4 * var7) * 3.141592653589793D / (double)var2));
         }

         float[] var19 = new float[var3];

         for(int var8 = 0; var8 < var4; ++var8) {
            var19[2 * var8] = (float)Math.cos((double)(2 * var8 + 1) * 3.141592653589793D / (double)(2 * var2));
            var19[2 * var8 + 1] = (float)Math.sin((double)(2 * var8 + 1) * 3.141592653589793D / (double)(2 * var2));
         }

         float[] var20 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var20[2 * var9] = (float)Math.cos((double)(4 * var9 + 2) * 3.141592653589793D / (double)var2);
            var20[2 * var9 + 1] = -((float)Math.sin((double)(4 * var9 + 2) * 3.141592653589793D / (double)var2));
         }

         int[] var21 = new int[var5];
         int var10 = class_240.method_4642(var5 - 1, 1292495107);

         for(int var11 = 0; var11 < var5; ++var11) {
            int var15 = var11;
            int var16 = var10;

            int var17;
            for(var17 = 0; var16 > 0; --var16) {
               var17 = var17 << 1 | var15 & 1;
               var15 >>>= 1;
            }

            var21[var11] = var17;
         }

         if(var1 != 0) {
            field_449 = var6;
            field_430 = var19;
            field_451 = var20;
            field_453 = var21;
         } else {
            field_446 = var6;
            field_447 = var19;
            field_435 = var20;
            field_452 = var21;
         }
      }

      var1 = method_599(8) + 1;
      field_434 = new class_155[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         class_155[] var10000 = field_434;
         class_155 var10002 = new class_155();
         var10000[var2] = var10002;
      }

      var2 = method_599(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         method_599(16);
      }

      var2 = method_599(6) + 1;
      field_443 = new class_134[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         class_134[] var22 = field_443;
         class_134 var25 = new class_134();
         var22[var3] = var25;
      }

      var3 = method_599(6) + 1;
      field_436 = new class_152[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         class_152[] var23 = field_436;
         class_152 var26 = new class_152();
         var23[var4] = var26;
      }

      var4 = method_599(6) + 1;
      field_437 = new class_161[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         class_161[] var24 = field_437;
         class_161 var27 = new class_161();
         var24[var5] = var27;
      }

      var5 = method_599(6) + 1;
      field_438 = new boolean[var5];
      field_432 = new int[var5];

      for(int var18 = 0; var18 < var5; ++var18) {
         field_438[var18] = method_596() != 0;
         method_599(16);
         method_599(16);
         field_432[var18] = method_599(8);
      }

   }

   // $FF: renamed from: m (byte[]) void
   void method_621(byte[] var1) {
      Buffer var10000 = new Buffer(var1);
      Buffer var2 = var10000;
      this.field_424 = var2.method_135();
      this.field_425 = var2.method_135();
      this.field_426 = var2.method_135();
      this.field_427 = var2.method_135();
      if(this.field_427 < 0) {
         this.field_427 = ~this.field_427;
         this.field_428 = true;
      }

      int var3 = var2.method_135();
      this.field_450 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.readUnsignedByte();
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method_267(var7, 0, var5, 1624589879);
         this.field_450[var4] = var7;
      }

   }

   // $FF: renamed from: ae (byte[]) void
   static void method_622(byte[] var0) {
      method_631(var0, 0);
      field_423 = 1 << method_599(4);
      field_448 = 1 << method_599(4);
      field_445 = new float[field_448];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0?field_448:field_423;
         var3 = var2 >> 1;
         var4 = var2 >> 2;
         var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for(int var7 = 0; var7 < var4; ++var7) {
            var6[2 * var7] = (float)Math.cos((double)(4 * var7) * 3.141592653589793D / (double)var2);
            var6[2 * var7 + 1] = -((float)Math.sin((double)(4 * var7) * 3.141592653589793D / (double)var2));
         }

         float[] var19 = new float[var3];

         for(int var8 = 0; var8 < var4; ++var8) {
            var19[2 * var8] = (float)Math.cos((double)(2 * var8 + 1) * 3.141592653589793D / (double)(2 * var2));
            var19[2 * var8 + 1] = (float)Math.sin((double)(2 * var8 + 1) * 3.141592653589793D / (double)(2 * var2));
         }

         float[] var20 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var20[2 * var9] = (float)Math.cos((double)(4 * var9 + 2) * 3.141592653589793D / (double)var2);
            var20[2 * var9 + 1] = -((float)Math.sin((double)(4 * var9 + 2) * 3.141592653589793D / (double)var2));
         }

         int[] var21 = new int[var5];
         int var10 = class_240.method_4642(var5 - 1, 213245660);

         for(int var11 = 0; var11 < var5; ++var11) {
            int var15 = var11;
            int var16 = var10;

            int var17;
            for(var17 = 0; var16 > 0; --var16) {
               var17 = var17 << 1 | var15 & 1;
               var15 >>>= 1;
            }

            var21[var11] = var17;
         }

         if(var1 != 0) {
            field_449 = var6;
            field_430 = var19;
            field_451 = var20;
            field_453 = var21;
         } else {
            field_446 = var6;
            field_447 = var19;
            field_435 = var20;
            field_452 = var21;
         }
      }

      var1 = method_599(8) + 1;
      field_434 = new class_155[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         class_155[] var10000 = field_434;
         class_155 var10002 = new class_155();
         var10000[var2] = var10002;
      }

      var2 = method_599(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         method_599(16);
      }

      var2 = method_599(6) + 1;
      field_443 = new class_134[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         class_134[] var22 = field_443;
         class_134 var25 = new class_134();
         var22[var3] = var25;
      }

      var3 = method_599(6) + 1;
      field_436 = new class_152[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         class_152[] var23 = field_436;
         class_152 var26 = new class_152();
         var23[var4] = var26;
      }

      var4 = method_599(6) + 1;
      field_437 = new class_161[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         class_161[] var24 = field_437;
         class_161 var27 = new class_161();
         var24[var5] = var27;
      }

      var5 = method_599(6) + 1;
      field_438 = new boolean[var5];
      field_432 = new int[var5];

      for(int var18 = 0; var18 < var5; ++var18) {
         field_438[var18] = method_596() != 0;
         method_599(16);
         method_599(16);
         field_432[var18] = method_599(8);
      }

   }

   // $FF: renamed from: l (int) float
   static float method_623(int var0) {
      int var1 = var0 & -242100964;
      int var2 = var0 & -1091040604;
      int var3 = (var0 & 1171444551) >> 21;
      if(var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - -12960526)));
   }

   // $FF: renamed from: ab (jv) boolean
   static boolean method_624(class_306 var0) {
      if(!field_442) {
         byte[] var1 = var0.method_5381(0, 0);
         if(var1 == null) {
            return false;
         }

         method_618(var1);
         field_442 = true;
      }

      return true;
   }

   // $FF: renamed from: al (jv) boolean
   static boolean method_625(class_306 var0) {
      if(!field_442) {
         byte[] var1 = var0.method_5381(0, 0);
         if(var1 == null) {
            return false;
         }

         method_618(var1);
         field_442 = true;
      }

      return true;
   }

   // $FF: renamed from: i (byte[]) void
   static void method_626(byte[] var0) {
      method_631(var0, 0);
      field_423 = 1 << method_599(4);
      field_448 = 1 << method_599(4);
      field_445 = new float[field_448];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0?field_448:field_423;
         var3 = var2 >> 1;
         var4 = var2 >> 2;
         var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for(int var7 = 0; var7 < var4; ++var7) {
            var6[2 * var7] = (float)Math.cos((double)(4 * var7) * 3.141592653589793D / (double)var2);
            var6[2 * var7 + 1] = -((float)Math.sin((double)(4 * var7) * 3.141592653589793D / (double)var2));
         }

         float[] var19 = new float[var3];

         for(int var8 = 0; var8 < var4; ++var8) {
            var19[2 * var8] = (float)Math.cos((double)(2 * var8 + 1) * 3.141592653589793D / (double)(2 * var2));
            var19[2 * var8 + 1] = (float)Math.sin((double)(2 * var8 + 1) * 3.141592653589793D / (double)(2 * var2));
         }

         float[] var20 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var20[2 * var9] = (float)Math.cos((double)(4 * var9 + 2) * 3.141592653589793D / (double)var2);
            var20[2 * var9 + 1] = -((float)Math.sin((double)(4 * var9 + 2) * 3.141592653589793D / (double)var2));
         }

         int[] var21 = new int[var5];
         int var10 = class_240.method_4642(var5 - 1, 1838380157);

         for(int var11 = 0; var11 < var5; ++var11) {
            int var15 = var11;
            int var16 = var10;

            int var17;
            for(var17 = 0; var16 > 0; --var16) {
               var17 = var17 << 1 | var15 & 1;
               var15 >>>= 1;
            }

            var21[var11] = var17;
         }

         if(var1 != 0) {
            field_449 = var6;
            field_430 = var19;
            field_451 = var20;
            field_453 = var21;
         } else {
            field_446 = var6;
            field_447 = var19;
            field_435 = var20;
            field_452 = var21;
         }
      }

      var1 = method_599(8) + 1;
      field_434 = new class_155[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         class_155[] var10000 = field_434;
         class_155 var10002 = new class_155();
         var10000[var2] = var10002;
      }

      var2 = method_599(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         method_599(16);
      }

      var2 = method_599(6) + 1;
      field_443 = new class_134[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         class_134[] var22 = field_443;
         class_134 var25 = new class_134();
         var22[var3] = var25;
      }

      var3 = method_599(6) + 1;
      field_436 = new class_152[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         class_152[] var23 = field_436;
         class_152 var26 = new class_152();
         var23[var4] = var26;
      }

      var4 = method_599(6) + 1;
      field_437 = new class_161[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         class_161[] var24 = field_437;
         class_161 var27 = new class_161();
         var24[var5] = var27;
      }

      var5 = method_599(6) + 1;
      field_438 = new boolean[var5];
      field_432 = new int[var5];

      for(int var18 = 0; var18 < var5; ++var18) {
         field_438[var18] = method_596() != 0;
         method_599(16);
         method_599(16);
         field_432[var18] = method_599(8);
      }

   }

   // $FF: renamed from: ai (jv, int, int) br
   static class_57 method_627(class_306 var0, int var1, int var2) {
      if(!method_614(var0)) {
         var0.method_5383(var1, var2, (byte)8);
         return null;
      } else {
         byte[] var3 = var0.method_5381(var1, var2);
         if(var3 == null) {
            return null;
         } else {
            class_57 var10000 = new class_57(var3);
            return var10000;
         }
      }
   }

   // $FF: renamed from: v (int) float
   static float method_628(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if(var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   // $FF: renamed from: ag (int[]) au
   class_110 method_629(int[] var1) {
      if(var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if(this.field_454 == null) {
            this.field_440 = 0;
            this.field_441 = new float[field_448];
            this.field_454 = new byte[this.field_425];
            this.field_439 = 0;
            this.field_456 = 0;
         }

         for(; this.field_456 < this.field_450.length; ++this.field_456) {
            if(var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method_600(this.field_456);
            if(var2 != null) {
               int var3 = this.field_439;
               int var4 = var2.length;
               if(var4 > this.field_425 - var3) {
                  var4 = this.field_425 - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.field_454[var3++] = (byte)(var6 - 273470785);
               }

               if(var1 != null) {
                  var1[0] -= var3 - this.field_439;
               }

               this.field_439 = var3;
            }
         }

         this.field_441 = null;
         byte[] var7 = this.field_454;
         this.field_454 = null;
         class_110 var10000 = new class_110(this.field_424, var7, this.field_426, this.field_427, this.field_428);
         return var10000;
      }
   }

   // $FF: renamed from: ax (int[]) au
   class_110 method_630(int[] var1) {
      if(var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if(this.field_454 == null) {
            this.field_440 = 0;
            this.field_441 = new float[field_448];
            this.field_454 = new byte[this.field_425];
            this.field_439 = 0;
            this.field_456 = 0;
         }

         for(; this.field_456 < this.field_450.length; ++this.field_456) {
            if(var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method_600(this.field_456);
            if(var2 != null) {
               int var3 = this.field_439;
               int var4 = var2.length;
               if(var4 > this.field_425 - var3) {
                  var4 = this.field_425 - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.field_454[var3++] = (byte)(var6 - 128);
               }

               if(var1 != null) {
                  var1[0] -= var3 - this.field_439;
               }

               this.field_439 = var3;
            }
         }

         this.field_441 = null;
         byte[] var7 = this.field_454;
         this.field_454 = null;
         class_110 var10000 = new class_110(this.field_424, var7, this.field_426, this.field_427, this.field_428);
         return var10000;
      }
   }

   // $FF: renamed from: n (byte[], int) void
   static void method_631(byte[] var0, int var1) {
      field_455 = var0;
      field_429 = var1;
      field_431 = 0;
   }
}
