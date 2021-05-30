
// $FF: renamed from: cg
public final class class_166 {

   // $FF: renamed from: m int[]
   static final int[] field_2068;
   // $FF: renamed from: n byte[][][]
   static byte[][][] field_2069;
   // $FF: renamed from: f int
   static int field_2070;
   // $FF: renamed from: y byte[][][]
   static byte[][][] field_2071;
   // $FF: renamed from: l int[]
   static int[] field_2072;
   // $FF: renamed from: g int
   static final int field_2073 = 585;
   // $FF: renamed from: w int[]
   static final int[] field_2074;
   // $FF: renamed from: k int
   static final int field_2075 = 2340;
   // $FF: renamed from: x int[]
   static final int[] field_2076;
   // $FF: renamed from: z int[]
   static final int[] field_2077;
   // $FF: renamed from: v int[][][]
   static int[][][] field_2078;
   // $FF: renamed from: t int[]
   static final int[] field_2079;
   // $FF: renamed from: h int[]
   static final int[] field_2080;
   // $FF: renamed from: q int
   static int field_2081;
   // $FF: renamed from: i int
   static int field_2082;
   // $FF: renamed from: p bg[]
   static class_149[] field_2083;
   // $FF: renamed from: e int
   static final int field_2084 = 16;


   // $FF: renamed from: h (int, int, int, int) void
   static final void method_3559(int var0, int var1, int var2, int var3) {
      for(int var4 = var1; var4 <= var3 + var1; ++var4) {
         for(int var5 = var0; var5 <= var0 + var2; ++var5) {
            if(var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 1699071271) {
               class_391.field_4244[0][var5][var4] = (byte)1118365974;
               if(var5 == var0 && var5 > 0) {
                  field_2078[0][var5][var4] = field_2078[0][var5 - 1][var4];
               }

               if(var5 == var2 + var0 && var5 < 103) {
                  field_2078[0][var5][var4] = field_2078[0][1 + var5][var4];
               }

               if(var4 == var1 && var4 > 0) {
                  field_2078[0][var5][var4] = field_2078[0][var5][var4 - 1];
               }

               if(var4 == var1 + var3 && var4 < -599676864) {
                  field_2078[0][var5][var4] = field_2078[0][var5][var4 + 1];
               }
            }
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static {
      field_2078 = new int[4][105][105];
      field_2069 = new byte[4][104][104];
      field_2070 = 185062409;
      field_2068 = new int[]{1, 2, 4, 8};
      field_2076 = new int[]{16, 32, 64, 128};
      field_2077 = new int[]{1, 0, -1, 0};
      field_2074 = new int[]{0, -1, 0, 1};
      field_2079 = new int[]{1, -1, -1, 1};
      field_2080 = new int[]{-1, -1, 1, 1};
      field_2081 = ((int)(Math.random() * 17.0D) - 8) * 1500379875;
      field_2082 = ((int)(Math.random() * 33.0D) - 16) * -1028308467;
   }

   // $FF: renamed from: au (int, int) int
   static final int method_3561(int var0, int var1) {
      if(var0 == -2) {
         return 716430883;
      } else if(var0 == -1) {
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 908447140) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = -1878931991;
         }

         return (var0 & 1418009219) + var1;
      }
   }

   // $FF: renamed from: x () void
   static void method_3562() {
      field_2070 = 185062409;
      field_2071 = new byte[4][104][104];
      class_273.field_3195 = new byte[4][104][104];
      class_52.field_389 = new byte[4][104][104];
      class_278.field_3226 = new byte[4][104][104];
      class_200.field_2350 = new int[4][105][105];
      class_391.field_4244 = new byte[4][105][105];
      class_267.field_3157 = new int[105][105];
      class_175.field_2172 = new int[104];
      class_121.field_1335 = new int[104];
      field_2072 = new int[104];
      class_86.field_795 = new int[104];
      class_349.field_3937 = new int[104];
   }

   // $FF: renamed from: at (int, int, int, int) int
   static final int method_3563(int var0, int var1, int var2, int var3) {
      int var4 = 65536 - class_70.field_559[var2 * 329350050 / var3] >> 1;
      return ((1195665831 - var4) * var0 >> 16) + (var4 * var1 >> 16);
   }

   // $FF: renamed from: i (byte[], int, int, int, int, fz[]) void
   static final void method_3564(byte[] var0, int var1, int var2, int var3, int var4, class_240[] var5) {
      int var7;
      int var8;
      for(int var6 = 0; var6 < 4; ++var6) {
         for(var7 = 0; var7 < -49810781; ++var7) {
            for(var8 = 0; var8 < 930749145; ++var8) {
               if(var1 + var7 > 0 && var1 + var7 < -946898592 && var2 + var8 > 0 && var8 + var2 < 103) {
                  var5[var6].field_2679[var1 + var7][var8 + var2] &= 1120097185;
               }
            }
         }
      }

      class_28 var10000 = new class_28(var0);
      class_28 var10 = var10000;

      for(var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 1769502927; ++var8) {
            for(int var9 = 0; var9 < -1943580923; ++var9) {
               class_231.method_4435(var10, var7, var1 + var8, var2 + var9, var3, var4, 0, (byte)-2);
            }
         }
      }

   }

   // $FF: renamed from: w () void
   static void method_3565() {
      field_2071 = (byte[][][])null;
      class_273.field_3195 = (byte[][][])null;
      class_52.field_389 = (byte[][][])null;
      class_278.field_3226 = (byte[][][])null;
      class_200.field_2350 = (int[][][])null;
      class_391.field_4244 = (byte[][][])null;
      class_267.field_3157 = (int[][])null;
      class_175.field_2172 = null;
      class_121.field_1335 = null;
      field_2072 = null;
      class_86.field_795 = null;
      class_349.field_3937 = null;
   }

   // $FF: renamed from: t () void
   static void method_3566() {
      field_2071 = (byte[][][])null;
      class_273.field_3195 = (byte[][][])null;
      class_52.field_389 = (byte[][][])null;
      class_278.field_3226 = (byte[][][])null;
      class_200.field_2350 = (int[][][])null;
      class_391.field_4244 = (byte[][][])null;
      class_267.field_3157 = (int[][])null;
      class_175.field_2172 = null;
      class_121.field_1335 = null;
      field_2072 = null;
      class_86.field_795 = null;
      class_349.field_3937 = null;
   }

   // $FF: renamed from: ai (byte[], int, int, int, int, int, int, int, gt, fz[]) void
   static final void method_3567(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class_251 var8, class_240[] var9) {
      class_28 var10000 = new class_28(var0);
      class_28 var10 = var10000;
      int var11 = -1;

      while(true) {
         int var12 = var10.method_124(-1225252005);
         if(0 == var12) {
            return;
         }

         var11 += var12;
         int var13 = 0;

         while(true) {
            int var14 = var10.method_144((byte)33);
            if(0 == var14) {
               break;
            }

            var13 += var14 - 1;
            int var15 = var13 & 63;
            int var16 = var13 >> 6 & 63;
            int var17 = var13 >> 12;
            int var18 = var10.method_130(-719779355);
            int var19 = var18 >> 2;
            int var20 = var18 & 3;
            if(var17 == var4 && var16 >= var5 && var16 < 8 + var5 && var15 >= var6 && var15 < 8 + var6) {
               class_87 var21 = class_121.method_2269(var11, 188463269);
               int var24 = var16 & 7;
               int var25 = var15 & 7;
               int var27 = var21.field_839 * -211556302;
               int var28 = var21.field_851 * 472472780;
               int var29;
               if(1 == (var20 & 1)) {
                  var29 = var27;
                  var27 = var28;
                  var28 = var29;
               }

               int var26 = var7 & 3;
               int var23;
               if(var26 == 0) {
                  var23 = var24;
               } else if(var26 == 1) {
                  var23 = var25;
               } else if(2 == var26) {
                  var23 = 7 - var24 - (var27 - 1);
               } else {
                  var23 = 7 - var25 - (var28 - 1);
               }

               var29 = var23 + var2;
               int var30 = var3 + class_229.method_4361(var16 & 7, var15 & 7, var7, 1058702687 * var21.field_839, -1812944985 * var21.field_851, var20, (short)4030);
               if(var29 > 0 && var30 > 0 && var29 < 1979428108 && var30 < 103) {
                  int var31 = var1;
                  if(2 == (field_2069[1][var29][var30] & 2)) {
                     var31 = var1 - 1;
                  }

                  class_240 var32 = null;
                  if(var31 >= 0) {
                     var32 = var9[var31];
                  }

                  class_178.method_3803(var1, var29, var30, var11, var20 + var7 & 3, var19, var8, var32, (byte)13);
               }
            }
         }
      }
   }

   // $FF: renamed from: q (int, int, int, int) void
   static final void method_3568(int var0, int var1, int var2, int var3) {
      for(int var4 = var1; var4 <= var3 + var1; ++var4) {
         for(int var5 = var0; var5 <= var0 + var2; ++var5) {
            if(var5 >= 0 && var5 < -641295148 && var4 >= 0 && var4 < 104) {
               class_391.field_4244[0][var5][var4] = (byte)514054708;
               if(var5 == var0 && var5 > 0) {
                  field_2078[0][var5][var4] = field_2078[0][var5 - 1][var4];
               }

               if(var5 == var2 + var0 && var5 < 103) {
                  field_2078[0][var5][var4] = field_2078[0][1 + var5][var4];
               }

               if(var4 == var1 && var4 > 0) {
                  field_2078[0][var5][var4] = field_2078[0][var5][var4 - 1];
               }

               if(var4 == var1 + var3 && var4 < 309163264) {
                  field_2078[0][var5][var4] = field_2078[0][var5][var4 + 1];
               }
            }
         }
      }

   }

   // $FF: renamed from: k () void
   static void method_3569() {
      field_2070 = 185062409;
      field_2071 = new byte[4][104][104];
      class_273.field_3195 = new byte[4][104][104];
      class_52.field_389 = new byte[4][104][104];
      class_278.field_3226 = new byte[4][104][104];
      class_200.field_2350 = new int[4][105][105];
      class_391.field_4244 = new byte[4][105][105];
      class_267.field_3157 = new int[105][105];
      class_175.field_2172 = new int[104];
      class_121.field_1335 = new int[104];
      field_2072 = new int[104];
      class_86.field_795 = new int[104];
      class_349.field_3937 = new int[104];
   }

   // $FF: renamed from: m () void
   static void method_3570() {
      field_2070 = 185062409;
      field_2071 = new byte[4][104][104];
      class_273.field_3195 = new byte[4][104][104];
      class_52.field_389 = new byte[4][104][104];
      class_278.field_3226 = new byte[4][104][104];
      class_200.field_2350 = new int[4][105][105];
      class_391.field_4244 = new byte[4][105][105];
      class_267.field_3157 = new int[105][105];
      class_175.field_2172 = new int[104];
      class_121.field_1335 = new int[104];
      field_2072 = new int[104];
      class_86.field_795 = new int[104];
      class_349.field_3937 = new int[104];
   }

   // $FF: renamed from: ap (int, int, int) void
   static final void method_3571(int var0, int var1, int var2) {
      int var3;
      for(var3 = 0; var3 < 8; ++var3) {
         for(int var4 = 0; var4 < 8; ++var4) {
            field_2078[var0][var3 + var1][var4 + var2] = 0;
         }
      }

      if(var1 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            field_2078[var0][var1][var3 + var2] = field_2078[var0][var1 - 1][var3 + var2];
         }
      }

      if(var2 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            field_2078[var0][var3 + var1][var2] = field_2078[var0][var1 + var3][var2 - 1];
         }
      }

      if(var1 > 0 && field_2078[var0][var1 - 1][var2] != 0) {
         field_2078[var0][var1][var2] = field_2078[var0][var1 - 1][var2];
      } else if(var2 > 0 && field_2078[var0][var1][var2 - 1] != 0) {
         field_2078[var0][var1][var2] = field_2078[var0][var1][var2 - 1];
      } else if(var1 > 0 && var2 > 0 && field_2078[var0][var1 - 1][var2 - 1] != 0) {
         field_2078[var0][var1][var2] = field_2078[var0][var1 - 1][var2 - 1];
      }

   }

   // $FF: renamed from: ab (int, int, int) void
   static final void method_3572(int var0, int var1, int var2) {
      int var3;
      for(var3 = 0; var3 < 8; ++var3) {
         for(int var4 = 0; var4 < 8; ++var4) {
            field_2078[var0][var3 + var1][var4 + var2] = 0;
         }
      }

      if(var1 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            field_2078[var0][var1][var3 + var2] = field_2078[var0][var1 - 1][var3 + var2];
         }
      }

      if(var2 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            field_2078[var0][var3 + var1][var2] = field_2078[var0][var1 + var3][var2 - 1];
         }
      }

      if(var1 > 0 && field_2078[var0][var1 - 1][var2] != 0) {
         field_2078[var0][var1][var2] = field_2078[var0][var1 - 1][var2];
      } else if(var2 > 0 && field_2078[var0][var1][var2 - 1] != 0) {
         field_2078[var0][var1][var2] = field_2078[var0][var1][var2 - 1];
      } else if(var1 > 0 && var2 > 0 && field_2078[var0][var1 - 1][var2 - 1] != 0) {
         field_2078[var0][var1][var2] = field_2078[var0][var1 - 1][var2 - 1];
      }

   }

   // $FF: renamed from: al (nd, int, int, int, int, int, int) void
   static final void method_3573(class_28 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      if(var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         field_2069[var1][var2][var3] = 0;

         while(true) {
            var7 = var0.method_130(100646743);
            if(0 == var7) {
               if(0 == var1) {
                  int[] var14 = field_2078[0][var2];
                  int var11 = var2 + 932731 + var4;
                  int var12 = var5 + var3 + 556238;
                  int var13 = class_43.method_492(var11 + '\ub135', var12 + 91923, 4, -1159816174) - 128 + (class_43.method_492(10294 + var11, '\u93bd' + var12, 2, 1665360966) - 128 >> 1) + (class_43.method_492(var11, var12, 1, -1737510862) - 128 >> 2);
                  var13 = 35 + (int)((double)var13 * 0.3D);
                  if(var13 < 10) {
                     var13 = 10;
                  } else if(var13 > 60) {
                     var13 = 60;
                  }

                  var14[var3] = -var13 * 8;
               } else {
                  field_2078[var1][var2][var3] = field_2078[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if(1 == var7) {
               int var8 = var0.method_130(1868834360);
               if(var8 == 1) {
                  var8 = 0;
               }

               if(0 == var1) {
                  field_2078[0][var2][var3] = -var8 * 8;
               } else {
                  field_2078[var1][var2][var3] = field_2078[var1 - 1][var2][var3] - var8 * 8;
               }
               break;
            }

            if(var7 <= 49) {
               class_273.field_3195[var1][var2][var3] = var0.method_131((byte)-62);
               class_52.field_389[var1][var2][var3] = (byte)((var7 - 2) / 4);
               class_278.field_3226[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
            } else if(var7 <= 81) {
               field_2069[var1][var2][var3] = (byte)(var7 - 49);
            } else {
               field_2071[var1][var2][var3] = (byte)(var7 - 81);
            }
         }
      } else {
         while(true) {
            var7 = var0.method_130(-1073492828);
            if(var7 == 0) {
               break;
            }

            if(var7 == 1) {
               var0.method_130(-750818541);
               break;
            }

            if(var7 <= 49) {
               var0.method_130(-1819271160);
            }
         }
      }

   }

   // $FF: renamed from: ad (nd, int, int, int, int, int, int) void
   static final void method_3574(class_28 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      if(var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         field_2069[var1][var2][var3] = 0;

         while(true) {
            var7 = var0.method_130(-2047132735);
            if(0 == var7) {
               if(0 == var1) {
                  int[] var14 = field_2078[0][var2];
                  int var11 = var2 + 932731 + var4;
                  int var12 = var5 + var3 + 556238;
                  int var13 = class_43.method_492(var11 + '\ub135', var12 + 91923, 4, 1098430934) - 128 + (class_43.method_492(10294 + var11, '\u93bd' + var12, 2, 1079323852) - 128 >> 1) + (class_43.method_492(var11, var12, 1, -2072441394) - 128 >> 2);
                  var13 = 35 + (int)((double)var13 * 0.3D);
                  if(var13 < 10) {
                     var13 = 10;
                  } else if(var13 > 60) {
                     var13 = 60;
                  }

                  var14[var3] = -var13 * 8;
               } else {
                  field_2078[var1][var2][var3] = field_2078[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if(1 == var7) {
               int var8 = var0.method_130(-801777087);
               if(var8 == 1) {
                  var8 = 0;
               }

               if(0 == var1) {
                  field_2078[0][var2][var3] = -var8 * 8;
               } else {
                  field_2078[var1][var2][var3] = field_2078[var1 - 1][var2][var3] - var8 * 8;
               }
               break;
            }

            if(var7 <= 49) {
               class_273.field_3195[var1][var2][var3] = var0.method_131((byte)0);
               class_52.field_389[var1][var2][var3] = (byte)((var7 - 2) / 4);
               class_278.field_3226[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
            } else if(var7 <= 81) {
               field_2069[var1][var2][var3] = (byte)(var7 - 49);
            } else {
               field_2071[var1][var2][var3] = (byte)(var7 - 81);
            }
         }
      } else {
         while(true) {
            var7 = var0.method_130(-562862639);
            if(var7 == 0) {
               break;
            }

            if(var7 == 1) {
               var0.method_130(-287180535);
               break;
            }

            if(var7 <= 49) {
               var0.method_130(-2085405542);
            }
         }
      }

   }

   // $FF: renamed from: av (int, int, int) int
   static final int method_3575(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = class_247.method_4714(var3, var5, (byte)87);
      int var8 = class_247.method_4714(var3 + 1, var5, (byte)81);
      int var9 = class_247.method_4714(var3, var5 + 1, (byte)83);
      int var10 = class_247.method_4714(1 + var3, 1 + var5, (byte)82);
      int var12 = 65536 - class_70.field_559[var4 * -1156443671 / var2] >> 1;
      int var11 = (var7 * (770609280 - var12) >> 16) + (var12 * var8 >> 16);
      int var13 = class_154.method_3248(var9, var10, var4, var2, (byte)-12);
      int var15 = 65536 - class_70.field_559[143118718 * var6 / var2] >> 1;
      int var14 = (var13 * var15 >> 16) + (var11 * (-1340948664 - var15) >> 16);
      return var14;
   }

   // $FF: renamed from: ar (byte[], int, int, int, int, int, int, int, gt, fz[]) void
   static final void method_3576(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class_251 var8, class_240[] var9) {
      class_28 var10000 = new class_28(var0);
      class_28 var10 = var10000;
      int var11 = -1;

      while(true) {
         int var12 = var10.method_124(-1225252005);
         if(0 == var12) {
            return;
         }

         var11 += var12;
         int var13 = 0;

         while(true) {
            int var14 = var10.method_144((byte)-12);
            if(0 == var14) {
               break;
            }

            var13 += var14 - 1;
            int var15 = var13 & 63;
            int var16 = var13 >> 6 & 63;
            int var17 = var13 >> 12;
            int var18 = var10.method_130(-1553067896);
            int var19 = var18 >> 2;
            int var20 = var18 & 3;
            if(var17 == var4 && var16 >= var5 && var16 < 8 + var5 && var15 >= var6 && var15 < 8 + var6) {
               class_87 var21 = class_121.method_2269(var11, 373904856);
               int var24 = var16 & 7;
               int var25 = var15 & 7;
               int var27 = var21.field_839 * -288612135;
               int var28 = var21.field_851 * -1812944985;
               int var29;
               if(1 == (var20 & 1)) {
                  var29 = var27;
                  var27 = var28;
                  var28 = var29;
               }

               int var26 = var7 & 3;
               int var23;
               if(var26 == 0) {
                  var23 = var24;
               } else if(var26 == 1) {
                  var23 = var25;
               } else if(2 == var26) {
                  var23 = 7 - var24 - (var27 - 1);
               } else {
                  var23 = 7 - var25 - (var28 - 1);
               }

               var29 = var23 + var2;
               int var30 = var3 + class_229.method_4361(var16 & 7, var15 & 7, var7, -288612135 * var21.field_839, -1812944985 * var21.field_851, var20, (short)4030);
               if(var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) {
                  int var31 = var1;
                  if(2 == (field_2069[1][var29][var30] & 2)) {
                     var31 = var1 - 1;
                  }

                  class_240 var32 = null;
                  if(var31 >= 0) {
                     var32 = var9[var31];
                  }

                  class_178.method_3803(var1, var29, var30, var11, var20 + var7 & 3, var19, var8, var32, (byte)-74);
               }
            }
         }
      }
   }

   // $FF: renamed from: z () void
   static void method_3577() {
      field_2071 = (byte[][][])null;
      class_273.field_3195 = (byte[][][])null;
      class_52.field_389 = (byte[][][])null;
      class_278.field_3226 = (byte[][][])null;
      class_200.field_2350 = (int[][][])null;
      class_391.field_4244 = (byte[][][])null;
      class_267.field_3157 = (int[][])null;
      class_175.field_2172 = null;
      class_121.field_1335 = null;
      field_2072 = null;
      class_86.field_795 = null;
      class_349.field_3937 = null;
   }

   // $FF: renamed from: aj (gt, fz[]) void
   static final void method_3578(class_251 var0, class_240[] var1) {
      int var2;
      int var3;
      int var4;
      int var5;
      for(var2 = 0; var2 < 4; ++var2) {
         for(var3 = 0; var3 < 104; ++var3) {
            for(var4 = 0; var4 < 104; ++var4) {
               if(1 == (field_2069[var2][var3][var4] & 1)) {
                  var5 = var2;
                  if(2 == (field_2069[1][var3][var4] & 2)) {
                     var5 = var2 - 1;
                  }

                  if(var5 >= 0) {
                     var1[var5].method_4641(var3, var4, -1025691571);
                  }
               }
            }
         }
      }

      field_2081 += ((int)(Math.random() * 5.0D) - 2) * 1500379875;
      if(-760931637 * field_2081 < -8) {
         field_2081 = 881862888;
      }

      if(field_2081 * -760931637 > 8) {
         field_2081 = -881862888;
      }

      field_2082 += ((int)(Math.random() * 5.0D) - 2) * -1028308467;
      if(field_2082 * 696638661 < -16) {
         field_2082 = -726933712;
      }

      if(696638661 * field_2082 > 16) {
         field_2082 = 726933712;
      }

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var18;
      for(var2 = 0; var2 < 4; ++var2) {
         byte[][] var42 = class_391.field_4244[var2];
         var9 = (int)Math.sqrt(5100.0D);
         var10 = var9 * 768 >> 8;

         int var19;
         int var20;
         for(var11 = 1; var11 < 103; ++var11) {
            for(var12 = 1; var12 < 103; ++var12) {
               var13 = field_2078[var2][1 + var12][var11] - field_2078[var2][var12 - 1][var11];
               var14 = field_2078[var2][var12][var11 + 1] - field_2078[var2][var12][var11 - 1];
               var15 = (int)Math.sqrt((double)(var13 * var13 + 65536 + var14 * var14));
               var16 = (var13 << 8) / var15;
               var17 = 65536 / var15;
               var18 = (var14 << 8) / var15;
               var19 = 96 + (-50 * var18 + var16 * -50 + -10 * var17) / var10;
               var20 = (var42[var12][var11 - 1] >> 2) + (var42[var12 - 1][var11] >> 2) + (var42[1 + var12][var11] >> 3) + (var42[var12][var11 + 1] >> 3) + (var42[var12][var11] >> 1);
               class_267.field_3157[var12][var11] = var19 - var20;
            }
         }

         for(var11 = 0; var11 < 104; ++var11) {
            class_175.field_2172[var11] = 0;
            class_121.field_1335[var11] = 0;
            field_2072[var11] = 0;
            class_86.field_795[var11] = 0;
            class_349.field_3937[var11] = 0;
         }

         for(var11 = -5; var11 < 109; ++var11) {
            for(var12 = 0; var12 < 104; ++var12) {
               var13 = var11 + 5;
               if(var13 >= 0 && var13 < 104) {
                  var14 = field_2071[var2][var13][var12] & 255;
                  if(var14 > 0) {
                     class_73 var43 = class_120.method_2261(var14 - 1, (byte)116);
                     class_175.field_2172[var12] += 1393073383 * var43.field_585;
                     class_121.field_1335[var12] += var43.field_582 * 1777498607;
                     field_2072[var12] += 1425037395 * var43.field_587;
                     class_86.field_795[var12] += 1828983275 * var43.field_583;
                     ++class_349.field_3937[var12];
                  }
               }

               var14 = var11 - 5;
               if(var14 >= 0 && var14 < 104) {
                  var15 = field_2071[var2][var14][var12] & 255;
                  if(var15 > 0) {
                     class_73 var44 = class_120.method_2261(var15 - 1, (byte)93);
                     class_175.field_2172[var12] -= 1393073383 * var44.field_585;
                     class_121.field_1335[var12] -= 1777498607 * var44.field_582;
                     field_2072[var12] -= var44.field_587 * 1425037395;
                     class_86.field_795[var12] -= var44.field_583 * 1828983275;
                     --class_349.field_3937[var12];
                  }
               }
            }

            if(var11 >= 1 && var11 < 103) {
               var12 = 0;
               var13 = 0;
               var14 = 0;
               var15 = 0;
               var16 = 0;

               for(var17 = -5; var17 < 109; ++var17) {
                  var18 = 5 + var17;
                  if(var18 >= 0 && var18 < 104) {
                     var12 += class_175.field_2172[var18];
                     var13 += class_121.field_1335[var18];
                     var14 += field_2072[var18];
                     var15 += class_86.field_795[var18];
                     var16 += class_349.field_3937[var18];
                  }

                  var19 = var17 - 5;
                  if(var19 >= 0 && var19 < 104) {
                     var12 -= class_175.field_2172[var19];
                     var13 -= class_121.field_1335[var19];
                     var14 -= field_2072[var19];
                     var15 -= class_86.field_795[var19];
                     var16 -= class_349.field_3937[var19];
                  }

                  if(var17 >= 1 && var17 < 103 && (!client.field_1417 || 0 != (field_2069[0][var11][var17] & 2) || (field_2069[var2][var11][var17] & 16) == 0)) {
                     if(var2 < 1752941579 * field_2070) {
                        field_2070 = var2 * 1867360163;
                     }

                     var20 = field_2071[var2][var11][var17] & 255;
                     int var21 = class_273.field_3195[var2][var11][var17] & 255;
                     if(var20 > 0 || var21 > 0) {
                        int var22 = field_2078[var2][var11][var17];
                        int var23 = field_2078[var2][var11 + 1][var17];
                        int var24 = field_2078[var2][var11 + 1][var17 + 1];
                        int var25 = field_2078[var2][var11][var17 + 1];
                        int var26 = class_267.field_3157[var11][var17];
                        int var27 = class_267.field_3157[var11 + 1][var17];
                        int var28 = class_267.field_3157[1 + var11][1 + var17];
                        int var29 = class_267.field_3157[var11][var17 + 1];
                        int var30 = -1;
                        int var31 = -1;
                        int var32;
                        int var33;
                        if(var20 > 0) {
                           var32 = 256 * var12 / var15;
                           var33 = var13 / var16;
                           int var34 = var14 / var16;
                           var30 = class_75.method_1155(var32, var33, var34, -1291818540);
                           var32 = -760931637 * field_2081 + var32 & 255;
                           var34 += field_2082 * 696638661;
                           if(var34 < 0) {
                              var34 = 0;
                           } else if(var34 > 255) {
                              var34 = 255;
                           }

                           var31 = class_75.method_1155(var32, var33, var34, -1291818540);
                        }

                        if(var2 > 0) {
                           boolean var46 = true;
                           if(0 == var20 && class_52.field_389[var2][var11][var17] != 0) {
                              var46 = false;
                           }

                           if(var21 > 0 && !class_154.method_3249(var21 - 1, -1398231710).field_760) {
                              var46 = false;
                           }

                           if(var46 && var22 == var23 && var24 == var22 && var25 == var22) {
                              class_200.field_2350[var2][var11][var17] |= 2340;
                           }
                        }

                        var32 = 0;
                        if(-1 != var31) {
                           var32 = class_70.field_546[class_77.method_1222(var31, 96, (byte)34)];
                        }

                        if(var21 == 0) {
                           var0.method_4728(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, class_77.method_1222(var30, var26, (byte)69), class_77.method_1222(var30, var27, (byte)108), class_77.method_1222(var30, var28, (byte)47), class_77.method_1222(var30, var29, (byte)112), 0, 0, 0, 0, var32, 0);
                        } else {
                           var33 = class_52.field_389[var2][var11][var17] + 1;
                           byte var47 = class_278.field_3226[var2][var11][var17];
                           class_82 var35 = class_154.method_3249(var21 - 1, -1958340529);
                           int var36 = var35.field_759 * -1167855135;
                           int var37;
                           int var38;
                           int var39;
                           int var40;
                           if(var36 >= 0) {
                              var38 = class_70.field_555.method_31(var36, 937128681);
                              var37 = -1;
                           } else if(-313850043 * var35.field_762 == 16711935) {
                              var37 = -2;
                              var36 = -1;
                              var38 = -2;
                           } else {
                              var37 = class_75.method_1155(1593028731 * var35.field_758, -1490944887 * var35.field_764, var35.field_769 * 1914058459, -1291818540);
                              var39 = field_2081 * -760931637 + var35.field_758 * 1593028731 & 255;
                              var40 = 696638661 * field_2082 + var35.field_769 * 1914058459;
                              if(var40 < 0) {
                                 var40 = 0;
                              } else if(var40 > 255) {
                                 var40 = 255;
                              }

                              var38 = class_75.method_1155(var39, -1490944887 * var35.field_764, var40, -1291818540);
                           }

                           var39 = 0;
                           if(-2 != var38) {
                              var39 = class_70.field_546[class_126.method_2290(var38, 96, -1017426198)];
                           }

                           if(1447154143 * var35.field_761 != -1) {
                              var40 = field_2081 * -760931637 + var35.field_765 * 1757390819 & 255;
                              int var41 = field_2082 * 696638661 + var35.field_767 * -1239811963;
                              if(var41 < 0) {
                                 var41 = 0;
                              } else if(var41 > 255) {
                                 var41 = 255;
                              }

                              var38 = class_75.method_1155(var40, var35.field_766 * -1776147055, var41, -1291818540);
                              var39 = class_70.field_546[class_126.method_2290(var38, 96, -982984820)];
                           }

                           var0.method_4728(var2, var11, var17, var33, var47, var36, var22, var23, var24, var25, class_77.method_1222(var30, var26, (byte)93), class_77.method_1222(var30, var27, (byte)45), class_77.method_1222(var30, var28, (byte)22), class_77.method_1222(var30, var29, (byte)71), class_126.method_2290(var37, var26, -1878448250), class_126.method_2290(var37, var27, -1360371384), class_126.method_2290(var37, var28, -1407617109), class_126.method_2290(var37, var29, -877949441), var32, var39);
                        }
                     }
                  }
               }
            }
         }

         for(var11 = 1; var11 < 103; ++var11) {
            for(var12 = 1; var12 < 103; ++var12) {
               if(0 != (field_2069[var2][var12][var11] & 8)) {
                  var17 = 0;
               } else if(var2 > 0 && (field_2069[1][var12][var11] & 2) != 0) {
                  var17 = var2 - 1;
               } else {
                  var17 = var2;
               }

               var0.method_4727(var2, var12, var11, var17);
            }
         }

         field_2071[var2] = (byte[][])null;
         class_273.field_3195[var2] = (byte[][])null;
         class_52.field_389[var2] = (byte[][])null;
         class_278.field_3226[var2] = (byte[][])null;
         class_391.field_4244[var2] = (byte[][])null;
      }

      var0.method_4754(-50, -10, -50);

      for(var2 = 0; var2 < 104; ++var2) {
         for(var3 = 0; var3 < 104; ++var3) {
            if((field_2069[1][var2][var3] & 2) == 2) {
               var0.method_4813(var2, var3);
            }
         }
      }

      var2 = 1;
      var3 = 2;
      var4 = 4;

      for(var5 = 0; var5 < 4; ++var5) {
         if(var5 > 0) {
            var2 <<= 3;
            var3 <<= 3;
            var4 <<= 3;
         }

         for(int var6 = 0; var6 <= var5; ++var6) {
            for(int var7 = 0; var7 <= 104; ++var7) {
               for(int var8 = 0; var8 <= 104; ++var8) {
                  short var45;
                  if(0 != (class_200.field_2350[var6][var8][var7] & var2)) {
                     var9 = var7;
                     var10 = var7;
                     var11 = var6;

                     for(var12 = var6; var9 > 0 && (class_200.field_2350[var6][var8][var9 - 1] & var2) != 0; --var9) {
                        ;
                     }

                     while(var10 < 104 && 0 != (class_200.field_2350[var6][var8][var10 + 1] & var2)) {
                        ++var10;
                     }

                     label476:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if(0 == (class_200.field_2350[var11 - 1][var8][var13] & var2)) {
                              break label476;
                           }
                        }

                        --var11;
                     }

                     label487:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if(0 == (class_200.field_2350[1 + var12][var8][var13] & var2)) {
                              break label487;
                           }
                        }

                        ++var12;
                     }

                     var13 = (1 + var12 - var11) * (var10 - var9 + 1);
                     if(var13 >= 8) {
                        var45 = 240;
                        var15 = field_2078[var12][var8][var9] - var45;
                        var16 = field_2078[var11][var8][var9];
                        class_251.method_4726(var5, 1, var8 * 128, 128 * var8, var9 * 128, var10 * 128 + 128, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              class_200.field_2350[var17][var8][var18] &= ~var2;
                           }
                        }
                     }
                  }

                  if(0 != (class_200.field_2350[var6][var8][var7] & var3)) {
                     var9 = var8;
                     var10 = var8;
                     var11 = var6;

                     for(var12 = var6; var9 > 0 && 0 != (class_200.field_2350[var6][var9 - 1][var7] & var3); --var9) {
                        ;
                     }

                     while(var10 < 104 && (class_200.field_2350[var6][1 + var10][var7] & var3) != 0) {
                        ++var10;
                     }

                     label525:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if((class_200.field_2350[var11 - 1][var13][var7] & var3) == 0) {
                              break label525;
                           }
                        }

                        --var11;
                     }

                     label536:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if((class_200.field_2350[1 + var12][var13][var7] & var3) == 0) {
                              break label536;
                           }
                        }

                        ++var12;
                     }

                     var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
                     if(var13 >= 8) {
                        var45 = 240;
                        var15 = field_2078[var12][var9][var7] - var45;
                        var16 = field_2078[var11][var9][var7];
                        class_251.method_4726(var5, 2, 128 * var9, var10 * 128 + 128, 128 * var7, var7 * 128, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              class_200.field_2350[var17][var18][var7] &= ~var3;
                           }
                        }
                     }
                  }

                  if(0 != (class_200.field_2350[var6][var8][var7] & var4)) {
                     var9 = var8;
                     var10 = var8;
                     var11 = var7;

                     for(var12 = var7; var11 > 0 && 0 != (class_200.field_2350[var6][var8][var11 - 1] & var4); --var11) {
                        ;
                     }

                     while(var12 < 104 && 0 != (class_200.field_2350[var6][var8][var12 + 1] & var4)) {
                        ++var12;
                     }

                     label575:
                     while(var9 > 0) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if(0 == (class_200.field_2350[var6][var9 - 1][var13] & var4)) {
                              break label575;
                           }
                        }

                        --var9;
                     }

                     label586:
                     while(var10 < 104) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if(0 == (class_200.field_2350[var6][1 + var10][var13] & var4)) {
                              break label586;
                           }
                        }

                        ++var10;
                     }

                     if((var10 - var9 + 1) * (1 + (var12 - var11)) >= 4) {
                        var13 = field_2078[var6][var9][var11];
                        class_251.method_4726(var5, 4, var9 * 128, 128 + var10 * 128, var11 * 128, 128 * var12 + 128, var13, var13);

                        for(var14 = var9; var14 <= var10; ++var14) {
                           for(var15 = var11; var15 <= var12; ++var15) {
                              class_200.field_2350[var6][var14][var15] &= ~var4;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: as (gt, fz[]) void
   static final void method_3579(class_251 var0, class_240[] var1) {
      int var2;
      int var3;
      int var4;
      int var5;
      for(var2 = 0; var2 < 4; ++var2) {
         for(var3 = 0; var3 < 1064832819; ++var3) {
            for(var4 = 0; var4 < -587728001; ++var4) {
               if(1 == (field_2069[var2][var3][var4] & 1)) {
                  var5 = var2;
                  if(2 == (field_2069[1][var3][var4] & 2)) {
                     var5 = var2 - 1;
                  }

                  if(var5 >= 0) {
                     var1[var5].method_4641(var3, var4, -1025691571);
                  }
               }
            }
         }
      }

      field_2081 += ((int)(Math.random() * 5.0D) - 2) * 1500379875;
      if(-760931637 * field_2081 < -8) {
         field_2081 = 1038958434;
      }

      if(field_2081 * -760931637 > 8) {
         field_2081 = -881862888;
      }

      field_2082 += ((int)(Math.random() * 5.0D) - 2) * -1028308467;
      if(field_2082 * -237642466 < -16) {
         field_2082 = -827725861;
      }

      if(859766965 * field_2082 > 16) {
         field_2082 = 1306399381;
      }

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var18;
      for(var2 = 0; var2 < 4; ++var2) {
         byte[][] var42 = class_391.field_4244[var2];
         var9 = (int)Math.sqrt(5100.0D);
         var10 = var9 * 768 >> 8;

         int var19;
         int var20;
         for(var11 = 1; var11 < 1033275135; ++var11) {
            for(var12 = 1; var12 < 57357095; ++var12) {
               var13 = field_2078[var2][1 + var12][var11] - field_2078[var2][var12 - 1][var11];
               var14 = field_2078[var2][var12][var11 + 1] - field_2078[var2][var12][var11 - 1];
               var15 = (int)Math.sqrt((double)(var13 * var13 + 65536 + var14 * var14));
               var16 = (var13 << 8) / var15;
               var17 = 65536 / var15;
               var18 = (var14 << 8) / var15;
               var19 = 96 + (-526453345 * var18 + var16 * 29649762 + 1073654359 * var17) / var10;
               var20 = (var42[var12][var11 - 1] >> 2) + (var42[var12 - 1][var11] >> 2) + (var42[1 + var12][var11] >> 3) + (var42[var12][var11 + 1] >> 3) + (var42[var12][var11] >> 1);
               class_267.field_3157[var12][var11] = var19 - var20;
            }
         }

         for(var11 = 0; var11 < 104; ++var11) {
            class_175.field_2172[var11] = 0;
            class_121.field_1335[var11] = 0;
            field_2072[var11] = 0;
            class_86.field_795[var11] = 0;
            class_349.field_3937[var11] = 0;
         }

         for(var11 = 1874629339; var11 < 109; ++var11) {
            for(var12 = 0; var12 < 104; ++var12) {
               var13 = var11 + 5;
               if(var13 >= 0 && var13 < 104) {
                  var14 = field_2071[var2][var13][var12] & 1604469556;
                  if(var14 > 0) {
                     class_73 var43 = class_120.method_2261(var14 - 1, (byte)122);
                     class_175.field_2172[var12] += 1393073383 * var43.field_585;
                     class_121.field_1335[var12] += var43.field_582 * -1211076218;
                     field_2072[var12] += 662600131 * var43.field_587;
                     class_86.field_795[var12] += -1903997455 * var43.field_583;
                     ++class_349.field_3937[var12];
                  }
               }

               var14 = var11 - 5;
               if(var14 >= 0 && var14 < -1410061644) {
                  var15 = field_2071[var2][var14][var12] & 255;
                  if(var15 > 0) {
                     class_73 var44 = class_120.method_2261(var15 - 1, (byte)77);
                     class_175.field_2172[var12] -= 1393073383 * var44.field_585;
                     class_121.field_1335[var12] -= 1777498607 * var44.field_582;
                     field_2072[var12] -= var44.field_587 * 1425037395;
                     class_86.field_795[var12] -= var44.field_583 * 22553258;
                     --class_349.field_3937[var12];
                  }
               }
            }

            if(var11 >= 1 && var11 < -1658239437) {
               var12 = 0;
               var13 = 0;
               var14 = 0;
               var15 = 0;
               var16 = 0;

               for(var17 = -1165762888; var17 < 109; ++var17) {
                  var18 = 5 + var17;
                  if(var18 >= 0 && var18 < -887166973) {
                     var12 += class_175.field_2172[var18];
                     var13 += class_121.field_1335[var18];
                     var14 += field_2072[var18];
                     var15 += class_86.field_795[var18];
                     var16 += class_349.field_3937[var18];
                  }

                  var19 = var17 - 5;
                  if(var19 >= 0 && var19 < -35775639) {
                     var12 -= class_175.field_2172[var19];
                     var13 -= class_121.field_1335[var19];
                     var14 -= field_2072[var19];
                     var15 -= class_86.field_795[var19];
                     var16 -= class_349.field_3937[var19];
                  }

                  if(var17 >= 1 && var17 < 1890857000 && (!client.field_1417 || 0 != (field_2069[0][var11][var17] & 2) || (field_2069[var2][var11][var17] & 16) == 0)) {
                     if(var2 < -1900689459 * field_2070) {
                        field_2070 = var2 * 1867360163;
                     }

                     var20 = field_2071[var2][var11][var17] & 255;
                     int var21 = class_273.field_3195[var2][var11][var17] & 255;
                     if(var20 > 0 || var21 > 0) {
                        int var22 = field_2078[var2][var11][var17];
                        int var23 = field_2078[var2][var11 + 1][var17];
                        int var24 = field_2078[var2][var11 + 1][var17 + 1];
                        int var25 = field_2078[var2][var11][var17 + 1];
                        int var26 = class_267.field_3157[var11][var17];
                        int var27 = class_267.field_3157[var11 + 1][var17];
                        int var28 = class_267.field_3157[1 + var11][1 + var17];
                        int var29 = class_267.field_3157[var11][var17 + 1];
                        int var30 = -1;
                        int var31 = -1;
                        int var32;
                        int var33;
                        if(var20 > 0) {
                           var32 = -846006777 * var12 / var15;
                           var33 = var13 / var16;
                           int var34 = var14 / var16;
                           var30 = class_75.method_1155(var32, var33, var34, -1291818540);
                           var32 = 888126518 * field_2081 + var32 & -1619261364;
                           var34 += field_2082 * 473246236;
                           if(var34 < 0) {
                              var34 = 0;
                           } else if(var34 > 255) {
                              var34 = 255;
                           }

                           var31 = class_75.method_1155(var32, var33, var34, -1291818540);
                        }

                        if(var2 > 0) {
                           boolean var46 = true;
                           if(0 == var20 && class_52.field_389[var2][var11][var17] != 0) {
                              var46 = false;
                           }

                           if(var21 > 0 && !class_154.method_3249(var21 - 1, -922942528).field_760) {
                              var46 = false;
                           }

                           if(var46 && var22 == var23 && var24 == var22 && var25 == var22) {
                              class_200.field_2350[var2][var11][var17] |= 1812514600;
                           }
                        }

                        var32 = 0;
                        if(-1 != var31) {
                           var32 = class_70.field_546[class_77.method_1222(var31, 96, (byte)120)];
                        }

                        if(var21 == 0) {
                           var0.method_4728(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, class_77.method_1222(var30, var26, (byte)50), class_77.method_1222(var30, var27, (byte)122), class_77.method_1222(var30, var28, (byte)108), class_77.method_1222(var30, var29, (byte)65), 0, 0, 0, 0, var32, 0);
                        } else {
                           var33 = class_52.field_389[var2][var11][var17] + 1;
                           byte var47 = class_278.field_3226[var2][var11][var17];
                           class_82 var35 = class_154.method_3249(var21 - 1, -1989771478);
                           int var36 = var35.field_759 * -1167855135;
                           int var37;
                           int var38;
                           int var39;
                           int var40;
                           if(var36 >= 0) {
                              var38 = class_70.field_555.method_31(var36, 690953677);
                              var37 = -1;
                           } else if(-17675521 * var35.field_762 == -1589468173) {
                              var37 = -2;
                              var36 = -1;
                              var38 = -39166119;
                           } else {
                              var37 = class_75.method_1155(1593028731 * var35.field_758, -1795843517 * var35.field_764, var35.field_769 * 1914058459, -1291818540);
                              var39 = field_2081 * 1626820919 + var35.field_758 * 1593028731 & -1780813388;
                              var40 = 1380734436 * field_2082 + var35.field_769 * 1914058459;
                              if(var40 < 0) {
                                 var40 = 0;
                              } else if(var40 > 1846271799) {
                                 var40 = 1402431144;
                              }

                              var38 = class_75.method_1155(var39, -408561785 * var35.field_764, var40, -1291818540);
                           }

                           var39 = 0;
                           if(-838751084 != var38) {
                              var39 = class_70.field_546[class_126.method_2290(var38, 2033285556, -1197248617)];
                           }

                           if(-970225208 * var35.field_761 != -1) {
                              var40 = field_2081 * 944503460 + var35.field_765 * 1757390819 & 1396993187;
                              int var41 = field_2082 * 696638661 + var35.field_767 * -1239811963;
                              if(var41 < 0) {
                                 var41 = 0;
                              } else if(var41 > -1561348077) {
                                 var41 = 481144413;
                              }

                              var38 = class_75.method_1155(var40, var35.field_766 * -1776147055, var41, -1291818540);
                              var39 = class_70.field_546[class_126.method_2290(var38, -11928399, -1908253911)];
                           }

                           var0.method_4728(var2, var11, var17, var33, var47, var36, var22, var23, var24, var25, class_77.method_1222(var30, var26, (byte)30), class_77.method_1222(var30, var27, (byte)31), class_77.method_1222(var30, var28, (byte)26), class_77.method_1222(var30, var29, (byte)100), class_126.method_2290(var37, var26, -1000721637), class_126.method_2290(var37, var27, -852059235), class_126.method_2290(var37, var28, -2087703415), class_126.method_2290(var37, var29, -1511385748), var32, var39);
                        }
                     }
                  }
               }
            }
         }

         for(var11 = 1; var11 < 595598998; ++var11) {
            for(var12 = 1; var12 < 103; ++var12) {
               if(0 != (field_2069[var2][var12][var11] & 8)) {
                  var17 = 0;
               } else if(var2 > 0 && (field_2069[1][var12][var11] & 2) != 0) {
                  var17 = var2 - 1;
               } else {
                  var17 = var2;
               }

               var0.method_4727(var2, var12, var11, var17);
            }
         }

         field_2071[var2] = (byte[][])null;
         class_273.field_3195[var2] = (byte[][])null;
         class_52.field_389[var2] = (byte[][])null;
         class_278.field_3226[var2] = (byte[][])null;
         class_391.field_4244[var2] = (byte[][])null;
      }

      var0.method_4754(-50, -10, -50);

      for(var2 = 0; var2 < -627470840; ++var2) {
         for(var3 = 0; var3 < 104; ++var3) {
            if((field_2069[1][var2][var3] & 2) == 2) {
               var0.method_4813(var2, var3);
            }
         }
      }

      var2 = 1;
      var3 = 2;
      var4 = 4;

      for(var5 = 0; var5 < 4; ++var5) {
         if(var5 > 0) {
            var2 <<= 3;
            var3 <<= 3;
            var4 <<= 3;
         }

         for(int var6 = 0; var6 <= var5; ++var6) {
            for(int var7 = 0; var7 <= 58410765; ++var7) {
               for(int var8 = 0; var8 <= -765077823; ++var8) {
                  short var45;
                  if(0 != (class_200.field_2350[var6][var8][var7] & var2)) {
                     var9 = var7;
                     var10 = var7;
                     var11 = var6;

                     for(var12 = var6; var9 > 0 && (class_200.field_2350[var6][var8][var9 - 1] & var2) != 0; --var9) {
                        ;
                     }

                     while(var10 < -1178114368 && 0 != (class_200.field_2350[var6][var8][var10 + 1] & var2)) {
                        ++var10;
                     }

                     label478:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if(0 == (class_200.field_2350[var11 - 1][var8][var13] & var2)) {
                              break label478;
                           }
                        }

                        --var11;
                     }

                     label489:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if(0 == (class_200.field_2350[1 + var12][var8][var13] & var2)) {
                              break label489;
                           }
                        }

                        ++var12;
                     }

                     var13 = (1 + var12 - var11) * (var10 - var9 + 1);
                     if(var13 >= 8) {
                        var45 = 240;
                        var15 = field_2078[var12][var8][var9] - var45;
                        var16 = field_2078[var11][var8][var9];
                        class_251.method_4726(var5, 1, var8 * 128, 128 * var8, var9 * 334908273, var10 * -2115202429 + 759856519, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              class_200.field_2350[var17][var8][var18] &= ~var2;
                           }
                        }
                     }
                  }

                  if(0 != (class_200.field_2350[var6][var8][var7] & var3)) {
                     var9 = var8;
                     var10 = var8;
                     var11 = var6;

                     for(var12 = var6; var9 > 0 && 0 != (class_200.field_2350[var6][var9 - 1][var7] & var3); --var9) {
                        ;
                     }

                     while(var10 < 104 && (class_200.field_2350[var6][1 + var10][var7] & var3) != 0) {
                        ++var10;
                     }

                     label527:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if((class_200.field_2350[var11 - 1][var13][var7] & var3) == 0) {
                              break label527;
                           }
                        }

                        --var11;
                     }

                     label538:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if((class_200.field_2350[1 + var12][var13][var7] & var3) == 0) {
                              break label538;
                           }
                        }

                        ++var12;
                     }

                     var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
                     if(var13 >= 8) {
                        var45 = 240;
                        var15 = field_2078[var12][var9][var7] - var45;
                        var16 = field_2078[var11][var9][var7];
                        class_251.method_4726(var5, 2, 128 * var9, var10 * 128 + -623687283, 128 * var7, var7 * 128, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              class_200.field_2350[var17][var18][var7] &= ~var3;
                           }
                        }
                     }
                  }

                  if(0 != (class_200.field_2350[var6][var8][var7] & var4)) {
                     var9 = var8;
                     var10 = var8;
                     var11 = var7;

                     for(var12 = var7; var11 > 0 && 0 != (class_200.field_2350[var6][var8][var11 - 1] & var4); --var11) {
                        ;
                     }

                     while(var12 < 753549687 && 0 != (class_200.field_2350[var6][var8][var12 + 1] & var4)) {
                        ++var12;
                     }

                     label577:
                     while(var9 > 0) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if(0 == (class_200.field_2350[var6][var9 - 1][var13] & var4)) {
                              break label577;
                           }
                        }

                        --var9;
                     }

                     label588:
                     while(var10 < 104) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if(0 == (class_200.field_2350[var6][1 + var10][var13] & var4)) {
                              break label588;
                           }
                        }

                        ++var10;
                     }

                     if((var10 - var9 + 1) * (1 + (var12 - var11)) >= 4) {
                        var13 = field_2078[var6][var9][var11];
                        class_251.method_4726(var5, 4, var9 * 1260904629, -599180463 + var10 * 128, var11 * 683554340, -1622939265 * var12 + 547518075, var13, var13);

                        for(var14 = var9; var14 <= var10; ++var14) {
                           for(var15 = var11; var15 <= var12; ++var15) {
                              class_200.field_2350[var6][var14][var15] &= ~var4;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: ax (int, int, int, int, int, int, gt, fz) void
   static final void method_3580(int var0, int var1, int var2, int var3, int var4, int var5, class_251 var6, class_240 var7) {
      if(!client.field_1417 || (field_2069[0][var1][var2] & 2) != 0 || 0 == (field_2069[var0][var1][var2] & 16)) {
         if(var0 < field_2070 * 1752941579) {
            field_2070 = 1852010156 * var0;
         }

         class_87 var8 = class_121.method_2269(var3, -9602088);
         int var9;
         int var10;
         if(var4 != 1 && var4 != 3) {
            var9 = var8.field_839 * -288612135;
            var10 = -1812944985 * var8.field_851;
         } else {
            var9 = -439513701 * var8.field_851;
            var10 = var8.field_839 * 819829788;
         }

         int var11;
         int var12;
         if(var9 + var1 <= 104) {
            var11 = (var9 >> 1) + var1;
            var12 = var1 + (var9 + 1 >> 1);
         } else {
            var11 = var1;
            var12 = 1 + var1;
         }

         int var13;
         int var14;
         if(var10 + var2 <= 1414539259) {
            var13 = var2 + (var10 >> 1);
            var14 = var2 + (var10 + 1 >> 1);
         } else {
            var13 = var2;
            var14 = var2 + 1;
         }

         int[][] var15 = field_2078[var0];
         int var16 = var15[var12][var14] + var15[var11][var14] + var15[var12][var13] + var15[var11][var13] >> 2;
         int var17 = (var9 << 6) + (var1 << 7);
         int var18 = (var2 << 7) + (var10 << 6);
         long var19 = class_141.method_3047(var1, var2, 2, 0 == -391286698 * var8.field_820, var3, -949076127);
         int var21 = var5 + (var4 << 6);
         if(var8.field_841 * -1364896901 == 1) {
            var21 += 256;
         }

         if(var8.method_1496((byte)17)) {
            class_304.method_5370(var0, var1, var2, var8, var4, (byte)16);
         }

         class_96 var10000;
         Object var22;
         if(var5 == 22) {
            if(!client.field_1417 || var8.field_820 * -1451974144 != 0 || var8.field_818 * 1384594797 == 1 || var8.field_843) {
               if(var8.field_824 * 91732693 == -1 && var8.field_842 == null) {
                  var22 = var8.method_1488(22, var4, var15, var17, var16, var18, (byte)56);
               } else {
                  var10000 = new class_96(var3, 22, var4, var0, var1, var2, 91732693 * var8.field_824, var8.field_850, (class_91)null);
                  var22 = var10000;
               }

               var6.method_4729(var0, var1, var2, var16, (class_91)var22, var19, var21);
               if(1 == var8.field_818 * -1441159375 && null != var7) {
                  var7.method_4624(var1, var2, -569201950);
               }

            }
         } else {
            int var23;
            if(var5 != 10 && var5 != 11) {
               if(var5 >= 12) {
                  if(var8.field_824 * 2098777307 == -1 && var8.field_842 == null) {
                     var22 = var8.method_1488(var5, var4, var15, var17, var16, var18, (byte)66);
                  } else {
                     var10000 = new class_96(var3, var5, var4, var0, var1, var2, var8.field_824 * -1569371403, var8.field_850, (class_91)null);
                     var22 = var10000;
                  }

                  var6.method_4807(var0, var1, var2, var16, 1, 1, (class_91)var22, 0, var19, var21);
                  if(var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                     class_200.field_2350[var0][var1][var2] |= 2340;
                  }

                  if(0 != var8.field_818 * 1384594797 && null != var7) {
                     var7.method_4611(var1, var2, var9, var10, var8.field_837, 1851757081);
                  }

               } else if(var5 == 0) {
                  if(-1 == -1298418014 * var8.field_824 && null == var8.field_842) {
                     var22 = var8.method_1488(0, var4, var15, var17, var16, var18, (byte)31);
                  } else {
                     var10000 = new class_96(var3, 0, var4, var0, var1, var2, 91732693 * var8.field_824, var8.field_850, (class_91)null);
                     var22 = var10000;
                  }

                  var6.method_4731(var0, var1, var2, var16, (class_91)var22, (class_91)null, field_2068[var4], 0, var19, var21);
                  if(var4 == 0) {
                     if(var8.field_832) {
                        class_391.field_4244[var0][var1][var2] = (byte)1020618200;
                        class_391.field_4244[var0][var1][var2 + 1] = 50;
                     }

                     if(var8.field_816) {
                        class_200.field_2350[var0][var1][var2] |= -528637546;
                     }
                  } else if(var4 == 1) {
                     if(var8.field_832) {
                        class_391.field_4244[var0][var1][var2 + 1] = (byte)811041368;
                        class_391.field_4244[var0][var1 + 1][1 + var2] = 50;
                     }

                     if(var8.field_816) {
                        class_200.field_2350[var0][var1][1 + var2] |= 1170;
                     }
                  } else if(var4 == 2) {
                     if(var8.field_832) {
                        class_391.field_4244[var0][1 + var1][var2] = (byte)-754208893;
                        class_391.field_4244[var0][1 + var1][var2 + 1] = 50;
                     }

                     if(var8.field_816) {
                        class_200.field_2350[var0][var1 + 1][var2] |= 585;
                     }
                  } else if(var4 == 3) {
                     if(var8.field_832) {
                        class_391.field_4244[var0][var1][var2] = (byte)-586304486;
                        class_391.field_4244[var0][var1 + 1][var2] = 50;
                     }

                     if(var8.field_816) {
                        class_200.field_2350[var0][var1][var2] |= 1170;
                     }
                  }

                  if(0 != 1950606374 * var8.field_818 && var7 != null) {
                     var7.method_4623(var1, var2, var5, var4, var8.field_837, -1946469678);
                  }

                  if(16 != var8.field_810 * -2141564523) {
                     var6.method_4766(var0, var1, var2, -583261128 * var8.field_810);
                  }

               } else if(1 == var5) {
                  if(-1 == var8.field_824 * 91732693 && var8.field_842 == null) {
                     var22 = var8.method_1488(1, var4, var15, var17, var16, var18, (byte)121);
                  } else {
                     var10000 = new class_96(var3, 1, var4, var0, var1, var2, var8.field_824 * 91732693, var8.field_850, (class_91)null);
                     var22 = var10000;
                  }

                  var6.method_4731(var0, var1, var2, var16, (class_91)var22, (class_91)null, field_2076[var4], 0, var19, var21);
                  if(var8.field_832) {
                     if(var4 == 0) {
                        class_391.field_4244[var0][var1][1 + var2] = (byte)540041041;
                     } else if(1 == var4) {
                        class_391.field_4244[var0][var1 + 1][1 + var2] = 50;
                     } else if(var4 == 2) {
                        class_391.field_4244[var0][1 + var1][var2] = 50;
                     } else if(3 == var4) {
                        class_391.field_4244[var0][var1][var2] = (byte)1195100218;
                     }
                  }

                  if(1495992094 * var8.field_818 != 0 && var7 != null) {
                     var7.method_4623(var1, var2, var5, var4, var8.field_837, -1946469678);
                  }

               } else {
                  int var28;
                  if(var5 == 2) {
                     var28 = 1 + var4 & 3;
                     Object var30;
                     Object var31;
                     if(-1 == 91732693 * var8.field_824 && null == var8.field_842) {
                        var31 = var8.method_1488(2, var4 + 4, var15, var17, var16, var18, (byte)103);
                        var30 = var8.method_1488(2, var28, var15, var17, var16, var18, (byte)106);
                     } else {
                        var10000 = new class_96(var3, 2, 4 + var4, var0, var1, var2, var8.field_824 * 91732693, var8.field_850, (class_91)null);
                        var31 = var10000;
                        var10000 = new class_96(var3, 2, var28, var0, var1, var2, var8.field_824 * 91732693, var8.field_850, (class_91)null);
                        var30 = var10000;
                     }

                     var6.method_4731(var0, var1, var2, var16, (class_91)var31, (class_91)var30, field_2068[var4], field_2068[var28], var19, var21);
                     if(var8.field_816) {
                        if(var4 == 0) {
                           class_200.field_2350[var0][var1][var2] |= 585;
                           class_200.field_2350[var0][var1][1 + var2] |= -703063211;
                        } else if(1 == var4) {
                           class_200.field_2350[var0][var1][var2 + 1] |= -1530370518;
                           class_200.field_2350[var0][var1 + 1][var2] |= 585;
                        } else if(2 == var4) {
                           class_200.field_2350[var0][1 + var1][var2] |= 585;
                           class_200.field_2350[var0][var1][var2] |= 1783634371;
                        } else if(var4 == 3) {
                           class_200.field_2350[var0][var1][var2] |= 1170;
                           class_200.field_2350[var0][var1][var2] |= -529623878;
                        }
                     }

                     if(1384594797 * var8.field_818 != 0 && null != var7) {
                        var7.method_4623(var1, var2, var5, var4, var8.field_837, -1946469678);
                     }

                     if(16 != var8.field_810 * -2141564523) {
                        var6.method_4766(var0, var1, var2, var8.field_810 * 1419301513);
                     }

                  } else if(3 == var5) {
                     if(var8.field_824 * 899462798 == -1 && null == var8.field_842) {
                        var22 = var8.method_1488(3, var4, var15, var17, var16, var18, (byte)106);
                     } else {
                        var10000 = new class_96(var3, 3, var4, var0, var1, var2, -1253275731 * var8.field_824, var8.field_850, (class_91)null);
                        var22 = var10000;
                     }

                     var6.method_4731(var0, var1, var2, var16, (class_91)var22, (class_91)null, field_2076[var4], 0, var19, var21);
                     if(var8.field_832) {
                        if(var4 == 0) {
                           class_391.field_4244[var0][var1][var2 + 1] = (byte)605443550;
                        } else if(var4 == 1) {
                           class_391.field_4244[var0][var1 + 1][1 + var2] = (byte)-687851906;
                        } else if(var4 == 2) {
                           class_391.field_4244[var0][1 + var1][var2] = 50;
                        } else if(var4 == 3) {
                           class_391.field_4244[var0][var1][var2] = 50;
                        }
                     }

                     if(0 != var8.field_818 * 1384594797 && null != var7) {
                        var7.method_4623(var1, var2, var5, var4, var8.field_837, -1946469678);
                     }

                  } else if(9 == var5) {
                     if(-1 == var8.field_824 * -1309545238 && null == var8.field_842) {
                        var22 = var8.method_1488(var5, var4, var15, var17, var16, var18, (byte)110);
                     } else {
                        var10000 = new class_96(var3, var5, var4, var0, var1, var2, var8.field_824 * 91732693, var8.field_850, (class_91)null);
                        var22 = var10000;
                     }

                     var6.method_4807(var0, var1, var2, var16, 1, 1, (class_91)var22, 0, var19, var21);
                     if(var8.field_818 * 1384594797 != 0 && var7 != null) {
                        var7.method_4611(var1, var2, var9, var10, var8.field_837, 1745167168);
                     }

                     if(var8.field_810 * -2141564523 != 16) {
                        var6.method_4766(var0, var1, var2, var8.field_810 * -1584985455);
                     }

                  } else if(4 == var5) {
                     if(-1 == 91732693 * var8.field_824 && var8.field_842 == null) {
                        var22 = var8.method_1488(4, var4, var15, var17, var16, var18, (byte)27);
                     } else {
                        var10000 = new class_96(var3, 4, var4, var0, var1, var2, var8.field_824 * 147853718, var8.field_850, (class_91)null);
                        var22 = var10000;
                     }

                     var6.method_4732(var0, var1, var2, var16, (class_91)var22, (class_91)null, field_2068[var4], 0, 0, 0, var19, var21);
                  } else {
                     long var29;
                     Object var32;
                     if(5 == var5) {
                        var28 = 16;
                        var29 = var6.method_4749(var0, var1, var2);
                        if(0L != var29) {
                           var28 = class_121.method_2269(class_164.method_3425(var29), 1445865421).field_810 * 384630432;
                        }

                        if(-1 == 704991190 * var8.field_824 && null == var8.field_842) {
                           var32 = var8.method_1488(4, var4, var15, var17, var16, var18, (byte)127);
                        } else {
                           var10000 = new class_96(var3, 4, var4, var0, var1, var2, var8.field_824 * -279653453, var8.field_850, (class_91)null);
                           var32 = var10000;
                        }

                        var6.method_4732(var0, var1, var2, var16, (class_91)var32, (class_91)null, field_2068[var4], 0, var28 * field_2077[var4], var28 * field_2074[var4], var19, var21);
                     } else if(var5 == 6) {
                        var28 = 8;
                        var29 = var6.method_4749(var0, var1, var2);
                        if(var29 != 0L) {
                           var28 = class_121.method_2269(class_164.method_3425(var29), 1249617164).field_810 * -2141564523 / 2;
                        }

                        if(var8.field_824 * 91732693 == -1 && null == var8.field_842) {
                           var32 = var8.method_1488(4, 4 + var4, var15, var17, var16, var18, (byte)61);
                        } else {
                           var10000 = new class_96(var3, 4, 4 + var4, var0, var1, var2, 91732693 * var8.field_824, var8.field_850, (class_91)null);
                           var32 = var10000;
                        }

                        var6.method_4732(var0, var1, var2, var16, (class_91)var32, (class_91)null, 256, var4, field_2079[var4] * var28, field_2080[var4] * var28, var19, var21);
                     } else if(var5 == 7) {
                        var23 = 2 + var4 & 3;
                        if(var8.field_824 * 91732693 == -1 && null == var8.field_842) {
                           var22 = var8.method_1488(4, 4 + var23, var15, var17, var16, var18, (byte)111);
                        } else {
                           var10000 = new class_96(var3, 4, var23 + 4, var0, var1, var2, 1629054778 * var8.field_824, var8.field_850, (class_91)null);
                           var22 = var10000;
                        }

                        var6.method_4732(var0, var1, var2, var16, (class_91)var22, (class_91)null, 832405930, var23, 0, 0, var19, var21);
                     } else if(var5 == 8) {
                        var28 = 8;
                        var29 = var6.method_4749(var0, var1, var2);
                        if(0L != var29) {
                           var28 = class_121.method_2269(class_164.method_3425(var29), 293782434).field_810 * -2071958217 / 2;
                        }

                        int var27 = var4 + 2 & 3;
                        Object var26;
                        if(-834161939 * var8.field_824 == -1 && null == var8.field_842) {
                           var32 = var8.method_1488(4, var4 + 4, var15, var17, var16, var18, (byte)75);
                           var26 = var8.method_1488(4, var27 + 4, var15, var17, var16, var18, (byte)21);
                        } else {
                           var10000 = new class_96(var3, 4, var4 + 4, var0, var1, var2, var8.field_824 * 91732693, var8.field_850, (class_91)null);
                           var32 = var10000;
                           var10000 = new class_96(var3, 4, 4 + var27, var0, var1, var2, 91732693 * var8.field_824, var8.field_850, (class_91)null);
                           var26 = var10000;
                        }

                        var6.method_4732(var0, var1, var2, var16, (class_91)var32, (class_91)var26, 256, var4, var28 * field_2079[var4], field_2080[var4] * var28, var19, var21);
                     }
                  }
               }
            } else {
               if(-1 == 1479826029 * var8.field_824 && var8.field_842 == null) {
                  var22 = var8.method_1488(10, var4, var15, var17, var16, var18, (byte)88);
               } else {
                  var10000 = new class_96(var3, 10, var4, var0, var1, var2, var8.field_824 * 8704466, var8.field_850, (class_91)null);
                  var22 = var10000;
               }

               if(null != var22 && var6.method_4807(var0, var1, var2, var16, var9, var10, (class_91)var22, 11 == var5?256:0, var19, var21) && var8.field_832) {
                  var23 = 15;
                  if(var22 instanceof class_92) {
                     var23 = ((class_92)var22).method_1649() / 4;
                     if(var23 > 30) {
                        var23 = 30;
                     }
                  }

                  for(int var24 = 0; var24 <= var9; ++var24) {
                     for(int var25 = 0; var25 <= var10; ++var25) {
                        if(var23 > class_391.field_4244[var0][var1 + var24][var2 + var25]) {
                           class_391.field_4244[var0][var24 + var1][var25 + var2] = (byte)var23;
                        }
                     }
                  }
               }

               if(718642835 * var8.field_818 != 0 && null != var7) {
                  var7.method_4611(var1, var2, var9, var10, var8.field_837, 565584330);
               }

            }
         }
      }
   }

   // $FF: renamed from: am (gt, fz[]) void
   static final void method_3581(class_251 var0, class_240[] var1) {
      int var2;
      int var3;
      int var4;
      int var5;
      for(var2 = 0; var2 < 4; ++var2) {
         for(var3 = 0; var3 < 104; ++var3) {
            for(var4 = 0; var4 < -1504414106; ++var4) {
               if(1 == (field_2069[var2][var3][var4] & 1)) {
                  var5 = var2;
                  if(2 == (field_2069[1][var3][var4] & 2)) {
                     var5 = var2 - 1;
                  }

                  if(var5 >= 0) {
                     var1[var5].method_4641(var3, var4, -1025691571);
                  }
               }
            }
         }
      }

      field_2081 += ((int)(Math.random() * 5.0D) - 2) * -615353633;
      if(-1750997986 * field_2081 < -8) {
         field_2081 = 645064383;
      }

      if(field_2081 * -139547997 > 8) {
         field_2081 = -809216466;
      }

      field_2082 += ((int)(Math.random() * 5.0D) - 2) * -1281455933;
      if(field_2082 * -295484354 < -16) {
         field_2082 = -726933712;
      }

      if(696638661 * field_2082 > 16) {
         field_2082 = 726933712;
      }

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var18;
      for(var2 = 0; var2 < 4; ++var2) {
         byte[][] var42 = class_391.field_4244[var2];
         var9 = (int)Math.sqrt(5100.0D);
         var10 = var9 * 1291582212 >> 8;

         int var19;
         int var20;
         for(var11 = 1; var11 < 103; ++var11) {
            for(var12 = 1; var12 < -1693303507; ++var12) {
               var13 = field_2078[var2][1 + var12][var11] - field_2078[var2][var12 - 1][var11];
               var14 = field_2078[var2][var12][var11 + 1] - field_2078[var2][var12][var11 - 1];
               var15 = (int)Math.sqrt((double)(var13 * var13 + -1114300744 + var14 * var14));
               var16 = (var13 << 8) / var15;
               var17 = 1052965378 / var15;
               var18 = (var14 << 8) / var15;
               var19 = 96 + (-1040777027 * var18 + var16 * -50 + -1602060125 * var17) / var10;
               var20 = (var42[var12][var11 - 1] >> 2) + (var42[var12 - 1][var11] >> 2) + (var42[1 + var12][var11] >> 3) + (var42[var12][var11 + 1] >> 3) + (var42[var12][var11] >> 1);
               class_267.field_3157[var12][var11] = var19 - var20;
            }
         }

         for(var11 = 0; var11 < 1795751695; ++var11) {
            class_175.field_2172[var11] = 0;
            class_121.field_1335[var11] = 0;
            field_2072[var11] = 0;
            class_86.field_795[var11] = 0;
            class_349.field_3937[var11] = 0;
         }

         for(var11 = -5; var11 < 109; ++var11) {
            for(var12 = 0; var12 < 104; ++var12) {
               var13 = var11 + 5;
               if(var13 >= 0 && var13 < -291853010) {
                  var14 = field_2071[var2][var13][var12] & 255;
                  if(var14 > 0) {
                     class_73 var43 = class_120.method_2261(var14 - 1, (byte)44);
                     class_175.field_2172[var12] += 1393073383 * var43.field_585;
                     class_121.field_1335[var12] += var43.field_582 * -889025847;
                     field_2072[var12] += 1035040127 * var43.field_587;
                     class_86.field_795[var12] += 1828983275 * var43.field_583;
                     ++class_349.field_3937[var12];
                  }
               }

               var14 = var11 - 5;
               if(var14 >= 0 && var14 < 104) {
                  var15 = field_2071[var2][var14][var12] & 1911347003;
                  if(var15 > 0) {
                     class_73 var44 = class_120.method_2261(var15 - 1, (byte)77);
                     class_175.field_2172[var12] -= 1393073383 * var44.field_585;
                     class_121.field_1335[var12] -= 361354884 * var44.field_582;
                     field_2072[var12] -= var44.field_587 * 1425037395;
                     class_86.field_795[var12] -= var44.field_583 * -1018350412;
                     --class_349.field_3937[var12];
                  }
               }
            }

            if(var11 >= 1 && var11 < 925458937) {
               var12 = 0;
               var13 = 0;
               var14 = 0;
               var15 = 0;
               var16 = 0;

               for(var17 = -5; var17 < -1107432194; ++var17) {
                  var18 = 5 + var17;
                  if(var18 >= 0 && var18 < -1688109952) {
                     var12 += class_175.field_2172[var18];
                     var13 += class_121.field_1335[var18];
                     var14 += field_2072[var18];
                     var15 += class_86.field_795[var18];
                     var16 += class_349.field_3937[var18];
                  }

                  var19 = var17 - 5;
                  if(var19 >= 0 && var19 < -524487465) {
                     var12 -= class_175.field_2172[var19];
                     var13 -= class_121.field_1335[var19];
                     var14 -= field_2072[var19];
                     var15 -= class_86.field_795[var19];
                     var16 -= class_349.field_3937[var19];
                  }

                  if(var17 >= 1 && var17 < -2075892375 && (!client.field_1417 || 0 != (field_2069[0][var11][var17] & 2) || (field_2069[var2][var11][var17] & 16) == 0)) {
                     if(var2 < 1752941579 * field_2070) {
                        field_2070 = var2 * -1158519398;
                     }

                     var20 = field_2071[var2][var11][var17] & 255;
                     int var21 = class_273.field_3195[var2][var11][var17] & 255;
                     if(var20 > 0 || var21 > 0) {
                        int var22 = field_2078[var2][var11][var17];
                        int var23 = field_2078[var2][var11 + 1][var17];
                        int var24 = field_2078[var2][var11 + 1][var17 + 1];
                        int var25 = field_2078[var2][var11][var17 + 1];
                        int var26 = class_267.field_3157[var11][var17];
                        int var27 = class_267.field_3157[var11 + 1][var17];
                        int var28 = class_267.field_3157[1 + var11][1 + var17];
                        int var29 = class_267.field_3157[var11][var17 + 1];
                        int var30 = -1;
                        int var31 = -1;
                        int var32;
                        int var33;
                        if(var20 > 0) {
                           var32 = 256 * var12 / var15;
                           var33 = var13 / var16;
                           int var34 = var14 / var16;
                           var30 = class_75.method_1155(var32, var33, var34, -1291818540);
                           var32 = -760931637 * field_2081 + var32 & 255;
                           var34 += field_2082 * 696638661;
                           if(var34 < 0) {
                              var34 = 0;
                           } else if(var34 > 255) {
                              var34 = 255;
                           }

                           var31 = class_75.method_1155(var32, var33, var34, -1291818540);
                        }

                        if(var2 > 0) {
                           boolean var46 = true;
                           if(0 == var20 && class_52.field_389[var2][var11][var17] != 0) {
                              var46 = false;
                           }

                           if(var21 > 0 && !class_154.method_3249(var21 - 1, -1272242661).field_760) {
                              var46 = false;
                           }

                           if(var46 && var22 == var23 && var24 == var22 && var25 == var22) {
                              class_200.field_2350[var2][var11][var17] |= 2340;
                           }
                        }

                        var32 = 0;
                        if(-1 != var31) {
                           var32 = class_70.field_546[class_77.method_1222(var31, 96, (byte)64)];
                        }

                        if(var21 == 0) {
                           var0.method_4728(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, class_77.method_1222(var30, var26, (byte)36), class_77.method_1222(var30, var27, (byte)55), class_77.method_1222(var30, var28, (byte)103), class_77.method_1222(var30, var29, (byte)56), 0, 0, 0, 0, var32, 0);
                        } else {
                           var33 = class_52.field_389[var2][var11][var17] + 1;
                           byte var47 = class_278.field_3226[var2][var11][var17];
                           class_82 var35 = class_154.method_3249(var21 - 1, -313004133);
                           int var36 = var35.field_759 * -1167855135;
                           int var37;
                           int var38;
                           int var39;
                           int var40;
                           if(var36 >= 0) {
                              var38 = class_70.field_555.method_31(var36, -2132990220);
                              var37 = -1;
                           } else if(-313850043 * var35.field_762 == -1530812761) {
                              var37 = -2092873313;
                              var36 = -1;
                              var38 = 2135955462;
                           } else {
                              var37 = class_75.method_1155(1743219027 * var35.field_758, -1455692857 * var35.field_764, var35.field_769 * -453153974, -1291818540);
                              var39 = field_2081 * -760931637 + var35.field_758 * 2061791373 & 255;
                              var40 = 696638661 * field_2082 + var35.field_769 * -981993290;
                              if(var40 < 0) {
                                 var40 = 0;
                              } else if(var40 > 255) {
                                 var40 = 255;
                              }

                              var38 = class_75.method_1155(var39, 76642703 * var35.field_764, var40, -1291818540);
                           }

                           var39 = 0;
                           if(-1888837433 != var38) {
                              var39 = class_70.field_546[class_126.method_2290(var38, 1614574646, -1125008295)];
                           }

                           if(1447154143 * var35.field_761 != -1) {
                              var40 = field_2081 * 1879884223 + var35.field_765 * 1757390819 & 255;
                              int var41 = field_2082 * 1698762637 + var35.field_767 * -1239811963;
                              if(var41 < 0) {
                                 var41 = 0;
                              } else if(var41 > 255) {
                                 var41 = 255;
                              }

                              var38 = class_75.method_1155(var40, var35.field_766 * -1776147055, var41, -1291818540);
                              var39 = class_70.field_546[class_126.method_2290(var38, 96, -1822112636)];
                           }

                           var0.method_4728(var2, var11, var17, var33, var47, var36, var22, var23, var24, var25, class_77.method_1222(var30, var26, (byte)84), class_77.method_1222(var30, var27, (byte)56), class_77.method_1222(var30, var28, (byte)112), class_77.method_1222(var30, var29, (byte)37), class_126.method_2290(var37, var26, -1459097261), class_126.method_2290(var37, var27, -1589312257), class_126.method_2290(var37, var28, -2114640324), class_126.method_2290(var37, var29, -1487118193), var32, var39);
                        }
                     }
                  }
               }
            }
         }

         for(var11 = 1; var11 < 1489896265; ++var11) {
            for(var12 = 1; var12 < 103; ++var12) {
               if(0 != (field_2069[var2][var12][var11] & 8)) {
                  var17 = 0;
               } else if(var2 > 0 && (field_2069[1][var12][var11] & 2) != 0) {
                  var17 = var2 - 1;
               } else {
                  var17 = var2;
               }

               var0.method_4727(var2, var12, var11, var17);
            }
         }

         field_2071[var2] = (byte[][])null;
         class_273.field_3195[var2] = (byte[][])null;
         class_52.field_389[var2] = (byte[][])null;
         class_278.field_3226[var2] = (byte[][])null;
         class_391.field_4244[var2] = (byte[][])null;
      }

      var0.method_4754(1048911310, -10, -50);

      for(var2 = 0; var2 < 104; ++var2) {
         for(var3 = 0; var3 < 104; ++var3) {
            if((field_2069[1][var2][var3] & 2) == 2) {
               var0.method_4813(var2, var3);
            }
         }
      }

      var2 = 1;
      var3 = 2;
      var4 = 4;

      for(var5 = 0; var5 < 4; ++var5) {
         if(var5 > 0) {
            var2 <<= 3;
            var3 <<= 3;
            var4 <<= 3;
         }

         for(int var6 = 0; var6 <= var5; ++var6) {
            for(int var7 = 0; var7 <= -401530197; ++var7) {
               for(int var8 = 0; var8 <= 104; ++var8) {
                  if(0 != (class_200.field_2350[var6][var8][var7] & var2)) {
                     var9 = var7;
                     var10 = var7;
                     var11 = var6;

                     for(var12 = var6; var9 > 0 && (class_200.field_2350[var6][var8][var9 - 1] & var2) != 0; --var9) {
                        ;
                     }

                     while(var10 < 104 && 0 != (class_200.field_2350[var6][var8][var10 + 1] & var2)) {
                        ++var10;
                     }

                     label462:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if(0 == (class_200.field_2350[var11 - 1][var8][var13] & var2)) {
                              break label462;
                           }
                        }

                        --var11;
                     }

                     label473:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if(0 == (class_200.field_2350[1 + var12][var8][var13] & var2)) {
                              break label473;
                           }
                        }

                        ++var12;
                     }

                     var13 = (1 + var12 - var11) * (var10 - var9 + 1);
                     if(var13 >= 8) {
                        short var45 = 240;
                        var15 = field_2078[var12][var8][var9] - var45;
                        var16 = field_2078[var11][var8][var9];
                        class_251.method_4726(var5, 1, var8 * -2071819986, 128 * var8, var9 * 128, var10 * 128 + 128, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              class_200.field_2350[var17][var8][var18] &= ~var2;
                           }
                        }
                     }
                  }

                  if(0 != (class_200.field_2350[var6][var8][var7] & var3)) {
                     var9 = var8;
                     var10 = var8;
                     var11 = var6;

                     for(var12 = var6; var9 > 0 && 0 != (class_200.field_2350[var6][var9 - 1][var7] & var3); --var9) {
                        ;
                     }

                     while(var10 < 104 && (class_200.field_2350[var6][1 + var10][var7] & var3) != 0) {
                        ++var10;
                     }

                     label511:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if((class_200.field_2350[var11 - 1][var13][var7] & var3) == 0) {
                              break label511;
                           }
                        }

                        --var11;
                     }

                     label522:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if((class_200.field_2350[1 + var12][var13][var7] & var3) == 0) {
                              break label522;
                           }
                        }

                        ++var12;
                     }

                     var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
                     if(var13 >= 8) {
                        var14 = 1663011179;
                        var15 = field_2078[var12][var9][var7] - var14;
                        var16 = field_2078[var11][var9][var7];
                        class_251.method_4726(var5, 2, 128 * var9, var10 * 1032773577 + 128, 128 * var7, var7 * 359025274, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              class_200.field_2350[var17][var18][var7] &= ~var3;
                           }
                        }
                     }
                  }

                  if(0 != (class_200.field_2350[var6][var8][var7] & var4)) {
                     var9 = var8;
                     var10 = var8;
                     var11 = var7;

                     for(var12 = var7; var11 > 0 && 0 != (class_200.field_2350[var6][var8][var11 - 1] & var4); --var11) {
                        ;
                     }

                     while(var12 < -1130029642 && 0 != (class_200.field_2350[var6][var8][var12 + 1] & var4)) {
                        ++var12;
                     }

                     label561:
                     while(var9 > 0) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if(0 == (class_200.field_2350[var6][var9 - 1][var13] & var4)) {
                              break label561;
                           }
                        }

                        --var9;
                     }

                     label572:
                     while(var10 < 1905878891) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if(0 == (class_200.field_2350[var6][1 + var10][var13] & var4)) {
                              break label572;
                           }
                        }

                        ++var10;
                     }

                     if((var10 - var9 + 1) * (1 + (var12 - var11)) >= 4) {
                        var13 = field_2078[var6][var9][var11];
                        class_251.method_4726(var5, 4, var9 * 1136247476, 1062582551 + var10 * 128, var11 * 128, 1049293970 * var12 + -253269287, var13, var13);

                        for(var14 = var9; var14 <= var10; ++var14) {
                           for(var15 = var11; var15 <= var12; ++var15) {
                              class_200.field_2350[var6][var14][var15] &= ~var4;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: az (int, int, int) int
   static final int method_3582(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = class_247.method_4714(var3, var5, (byte)102);
      int var8 = class_247.method_4714(var3 + 1, var5, (byte)103);
      int var9 = class_247.method_4714(var3, var5 + 1, (byte)98);
      int var10 = class_247.method_4714(1 + var3, 1 + var5, (byte)122);
      int var12 = 1168539273 - class_70.field_559[var4 * -1190242538 / var2] >> 1;
      int var11 = (var7 * (65536 - var12) >> 16) + (var12 * var8 >> 16);
      int var13 = class_154.method_3248(var9, var10, var4, var2, (byte)-13);
      int var15 = -1632292055 - class_70.field_559[1024 * var6 / var2] >> 1;
      int var14 = (var13 * var15 >> 16) + (var11 * (65536 - var15) >> 16);
      return var14;
   }

   // $FF: renamed from: ak (int, int) int
   static final int method_3583(int var0, int var1) {
      int var2 = var0 + var1 * 57;
      var2 ^= var2 << 13;
      int var3 = var2 * (15731 * var2 * var2 + 789221) + 1376312589 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }

   // $FF: renamed from: <init> () void
   class_166() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "cg.<init>(" + ')');
      }
   }

   // $FF: renamed from: ao (int, int) int
   static final int method_3585(int var0, int var1) {
      int var2 = class_311.method_5552(var0 - 1, var1 - 1, -324437873) + class_311.method_5552(1 + var0, var1 - 1, -324437873) + class_311.method_5552(var0 - 1, 1 + var1, -324437873) + class_311.method_5552(1 + var0, 1 + var1, -324437873);
      int var3 = class_311.method_5552(var0 - 1, var1, -324437873) + class_311.method_5552(var0 + 1, var1, -324437873) + class_311.method_5552(var0, var1 - 1, -324437873) + class_311.method_5552(var0, var1 + 1, -324437873);
      int var4 = class_311.method_5552(var0, var1, -324437873);
      return var4 / 4 + var3 / 8 + var2 / 16;
   }

   // $FF: renamed from: ah (int, int, int, int) int
   static final int method_3586(int var0, int var1, int var2, int var3) {
      int var4 = 65536 - class_70.field_559[var2 * 1024 / var3] >> 1;
      return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
   }

   // $FF: renamed from: ag (int, int, int, int, int, int, gt, fz) void
   static final void method_3587(int var0, int var1, int var2, int var3, int var4, int var5, class_251 var6, class_240 var7) {
      if(!client.field_1417 || (field_2069[0][var1][var2] & 2) != 0 || 0 == (field_2069[var0][var1][var2] & 16)) {
         if(var0 < field_2070 * 1752941579) {
            field_2070 = 207929130 * var0;
         }

         class_87 var8 = class_121.method_2269(var3, 1214519509);
         int var9;
         int var10;
         if(var4 != 1 && var4 != 3) {
            var9 = var8.field_839 * 1389996430;
            var10 = 820065345 * var8.field_851;
         } else {
            var9 = 421785598 * var8.field_851;
            var10 = var8.field_839 * -288612135;
         }

         int var11;
         int var12;
         if(var9 + var1 <= 104) {
            var11 = (var9 >> 1) + var1;
            var12 = var1 + (var9 + 1 >> 1);
         } else {
            var11 = var1;
            var12 = 1 + var1;
         }

         int var13;
         int var14;
         if(var10 + var2 <= 104) {
            var13 = var2 + (var10 >> 1);
            var14 = var2 + (var10 + 1 >> 1);
         } else {
            var13 = var2;
            var14 = var2 + 1;
         }

         int[][] var15 = field_2078[var0];
         int var16 = var15[var12][var14] + var15[var11][var14] + var15[var12][var13] + var15[var11][var13] >> 2;
         int var17 = (var9 << 6) + (var1 << 7);
         int var18 = (var2 << 7) + (var10 << 6);
         long var19 = class_141.method_3047(var1, var2, 2, 0 == 1382429722 * var8.field_820, var3, 168359313);
         int var21 = var5 + (var4 << 6);
         if(var8.field_841 * -1342490944 == 1) {
            var21 += 256;
         }

         if(var8.method_1496((byte)41)) {
            class_304.method_5370(var0, var1, var2, var8, var4, (byte)53);
         }

         class_96 var10000;
         Object var22;
         if(var5 == 22) {
            if(!client.field_1417 || var8.field_820 * -1747290425 != 0 || var8.field_818 * 1384594797 == 1 || var8.field_843) {
               if(var8.field_824 * 91732693 == -1 && var8.field_842 == null) {
                  var22 = var8.method_1488(22, var4, var15, var17, var16, var18, (byte)104);
               } else {
                  var10000 = new class_96(var3, 22, var4, var0, var1, var2, 1374465789 * var8.field_824, var8.field_850, (class_91)null);
                  var22 = var10000;
               }

               var6.method_4729(var0, var1, var2, var16, (class_91)var22, var19, var21);
               if(1 == var8.field_818 * -87896932 && null != var7) {
                  var7.method_4624(var1, var2, -1273960817);
               }

            }
         } else {
            int var23;
            if(var5 != 10 && var5 != 11) {
               if(var5 >= 12) {
                  if(var8.field_824 * 91732693 == -1 && var8.field_842 == null) {
                     var22 = var8.method_1488(var5, var4, var15, var17, var16, var18, (byte)80);
                  } else {
                     var10000 = new class_96(var3, var5, var4, var0, var1, var2, var8.field_824 * 91732693, var8.field_850, (class_91)null);
                     var22 = var10000;
                  }

                  var6.method_4807(var0, var1, var2, var16, 1, 1, (class_91)var22, 0, var19, var21);
                  if(var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                     class_200.field_2350[var0][var1][var2] |= 2340;
                  }

                  if(0 != var8.field_818 * -62421238 && null != var7) {
                     var7.method_4611(var1, var2, var9, var10, var8.field_837, 1492799868);
                  }

               } else if(var5 == 0) {
                  if(-1 == 91732693 * var8.field_824 && null == var8.field_842) {
                     var22 = var8.method_1488(0, var4, var15, var17, var16, var18, (byte)10);
                  } else {
                     var10000 = new class_96(var3, 0, var4, var0, var1, var2, 712117866 * var8.field_824, var8.field_850, (class_91)null);
                     var22 = var10000;
                  }

                  var6.method_4731(var0, var1, var2, var16, (class_91)var22, (class_91)null, field_2068[var4], 0, var19, var21);
                  if(var4 == 0) {
                     if(var8.field_832) {
                        class_391.field_4244[var0][var1][var2] = (byte)1539616718;
                        class_391.field_4244[var0][var1][var2 + 1] = (byte)-700063454;
                     }

                     if(var8.field_816) {
                        class_200.field_2350[var0][var1][var2] |= 585;
                     }
                  } else if(var4 == 1) {
                     if(var8.field_832) {
                        class_391.field_4244[var0][var1][var2 + 1] = 50;
                        class_391.field_4244[var0][var1 + 1][1 + var2] = (byte)2131253131;
                     }

                     if(var8.field_816) {
                        class_200.field_2350[var0][var1][1 + var2] |= -868165568;
                     }
                  } else if(var4 == 2) {
                     if(var8.field_832) {
                        class_391.field_4244[var0][1 + var1][var2] = 50;
                        class_391.field_4244[var0][1 + var1][var2 + 1] = 50;
                     }

                     if(var8.field_816) {
                        class_200.field_2350[var0][var1 + 1][var2] |= 1696299514;
                     }
                  } else if(var4 == 3) {
                     if(var8.field_832) {
                        class_391.field_4244[var0][var1][var2] = 50;
                        class_391.field_4244[var0][var1 + 1][var2] = 50;
                     }

                     if(var8.field_816) {
                        class_200.field_2350[var0][var1][var2] |= 1170;
                     }
                  }

                  if(0 != -1468261957 * var8.field_818 && var7 != null) {
                     var7.method_4623(var1, var2, var5, var4, var8.field_837, -1946469678);
                  }

                  if(16 != var8.field_810 * -2141564523) {
                     var6.method_4766(var0, var1, var2, -2141564523 * var8.field_810);
                  }

               } else if(1 == var5) {
                  if(-1 == var8.field_824 * 91732693 && var8.field_842 == null) {
                     var22 = var8.method_1488(1, var4, var15, var17, var16, var18, (byte)52);
                  } else {
                     var10000 = new class_96(var3, 1, var4, var0, var1, var2, var8.field_824 * 91732693, var8.field_850, (class_91)null);
                     var22 = var10000;
                  }

                  var6.method_4731(var0, var1, var2, var16, (class_91)var22, (class_91)null, field_2076[var4], 0, var19, var21);
                  if(var8.field_832) {
                     if(var4 == 0) {
                        class_391.field_4244[var0][var1][1 + var2] = 50;
                     } else if(1 == var4) {
                        class_391.field_4244[var0][var1 + 1][1 + var2] = 50;
                     } else if(var4 == 2) {
                        class_391.field_4244[var0][1 + var1][var2] = 50;
                     } else if(3 == var4) {
                        class_391.field_4244[var0][var1][var2] = (byte)-1997485602;
                     }
                  }

                  if(1421836798 * var8.field_818 != 0 && var7 != null) {
                     var7.method_4623(var1, var2, var5, var4, var8.field_837, -1946469678);
                  }

               } else {
                  int var28;
                  if(var5 == 2) {
                     var28 = 1 + var4 & 3;
                     Object var30;
                     Object var31;
                     if(-1 == -831468971 * var8.field_824 && null == var8.field_842) {
                        var31 = var8.method_1488(2, var4 + 4, var15, var17, var16, var18, (byte)83);
                        var30 = var8.method_1488(2, var28, var15, var17, var16, var18, (byte)8);
                     } else {
                        var10000 = new class_96(var3, 2, 4 + var4, var0, var1, var2, var8.field_824 * 91732693, var8.field_850, (class_91)null);
                        var31 = var10000;
                        var10000 = new class_96(var3, 2, var28, var0, var1, var2, var8.field_824 * 91732693, var8.field_850, (class_91)null);
                        var30 = var10000;
                     }

                     var6.method_4731(var0, var1, var2, var16, (class_91)var31, (class_91)var30, field_2068[var4], field_2068[var28], var19, var21);
                     if(var8.field_816) {
                        if(var4 == 0) {
                           class_200.field_2350[var0][var1][var2] |= 585;
                           class_200.field_2350[var0][var1][1 + var2] |= 1170;
                        } else if(1 == var4) {
                           class_200.field_2350[var0][var1][var2 + 1] |= 1170;
                           class_200.field_2350[var0][var1 + 1][var2] |= -1651097805;
                        } else if(2 == var4) {
                           class_200.field_2350[var0][1 + var1][var2] |= -945857966;
                           class_200.field_2350[var0][var1][var2] |= 1170;
                        } else if(var4 == 3) {
                           class_200.field_2350[var0][var1][var2] |= 1170;
                           class_200.field_2350[var0][var1][var2] |= 585;
                        }
                     }

                     if(1384594797 * var8.field_818 != 0 && null != var7) {
                        var7.method_4623(var1, var2, var5, var4, var8.field_837, -1946469678);
                     }

                     if(16 != var8.field_810 * -2141564523) {
                        var6.method_4766(var0, var1, var2, var8.field_810 * -2141564523);
                     }

                  } else if(3 == var5) {
                     if(var8.field_824 * -317834484 == -1 && null == var8.field_842) {
                        var22 = var8.method_1488(3, var4, var15, var17, var16, var18, (byte)11);
                     } else {
                        var10000 = new class_96(var3, 3, var4, var0, var1, var2, 91732693 * var8.field_824, var8.field_850, (class_91)null);
                        var22 = var10000;
                     }

                     var6.method_4731(var0, var1, var2, var16, (class_91)var22, (class_91)null, field_2076[var4], 0, var19, var21);
                     if(var8.field_832) {
                        if(var4 == 0) {
                           class_391.field_4244[var0][var1][var2 + 1] = 50;
                        } else if(var4 == 1) {
                           class_391.field_4244[var0][var1 + 1][1 + var2] = 50;
                        } else if(var4 == 2) {
                           class_391.field_4244[var0][1 + var1][var2] = 50;
                        } else if(var4 == 3) {
                           class_391.field_4244[var0][var1][var2] = (byte)51784737;
                        }
                     }

                     if(0 != var8.field_818 * 1384594797 && null != var7) {
                        var7.method_4623(var1, var2, var5, var4, var8.field_837, -1946469678);
                     }

                  } else if(9 == var5) {
                     if(-1 == var8.field_824 * 91732693 && null == var8.field_842) {
                        var22 = var8.method_1488(var5, var4, var15, var17, var16, var18, (byte)27);
                     } else {
                        var10000 = new class_96(var3, var5, var4, var0, var1, var2, var8.field_824 * -59935920, var8.field_850, (class_91)null);
                        var22 = var10000;
                     }

                     var6.method_4807(var0, var1, var2, var16, 1, 1, (class_91)var22, 0, var19, var21);
                     if(var8.field_818 * -681808065 != 0 && var7 != null) {
                        var7.method_4611(var1, var2, var9, var10, var8.field_837, 1539342118);
                     }

                     if(var8.field_810 * -2141564523 != 16) {
                        var6.method_4766(var0, var1, var2, var8.field_810 * -2141564523);
                     }

                  } else if(4 == var5) {
                     if(-1 == 91732693 * var8.field_824 && var8.field_842 == null) {
                        var22 = var8.method_1488(4, var4, var15, var17, var16, var18, (byte)51);
                     } else {
                        var10000 = new class_96(var3, 4, var4, var0, var1, var2, var8.field_824 * 91732693, var8.field_850, (class_91)null);
                        var22 = var10000;
                     }

                     var6.method_4732(var0, var1, var2, var16, (class_91)var22, (class_91)null, field_2068[var4], 0, 0, 0, var19, var21);
                  } else {
                     long var29;
                     Object var32;
                     if(5 == var5) {
                        var28 = 16;
                        var29 = var6.method_4749(var0, var1, var2);
                        if(0L != var29) {
                           var28 = class_121.method_2269(class_164.method_3425(var29), 2127674690).field_810 * -2141564523;
                        }

                        if(-1 == 91732693 * var8.field_824 && null == var8.field_842) {
                           var32 = var8.method_1488(4, var4, var15, var17, var16, var18, (byte)24);
                        } else {
                           var10000 = new class_96(var3, 4, var4, var0, var1, var2, var8.field_824 * 91732693, var8.field_850, (class_91)null);
                           var32 = var10000;
                        }

                        var6.method_4732(var0, var1, var2, var16, (class_91)var32, (class_91)null, field_2068[var4], 0, var28 * field_2077[var4], var28 * field_2074[var4], var19, var21);
                     } else if(var5 == 6) {
                        var28 = 8;
                        var29 = var6.method_4749(var0, var1, var2);
                        if(var29 != 0L) {
                           var28 = class_121.method_2269(class_164.method_3425(var29), 1350657040).field_810 * -2141564523 / 2;
                        }

                        if(var8.field_824 * 10527451 == -1 && null == var8.field_842) {
                           var32 = var8.method_1488(4, 4 + var4, var15, var17, var16, var18, (byte)112);
                        } else {
                           var10000 = new class_96(var3, 4, 4 + var4, var0, var1, var2, 91732693 * var8.field_824, var8.field_850, (class_91)null);
                           var32 = var10000;
                        }

                        var6.method_4732(var0, var1, var2, var16, (class_91)var32, (class_91)null, 256, var4, field_2079[var4] * var28, field_2080[var4] * var28, var19, var21);
                     } else if(var5 == 7) {
                        var23 = 2 + var4 & 3;
                        if(var8.field_824 * 2002221219 == -1 && null == var8.field_842) {
                           var22 = var8.method_1488(4, 4 + var23, var15, var17, var16, var18, (byte)67);
                        } else {
                           var10000 = new class_96(var3, 4, var23 + 4, var0, var1, var2, 242675302 * var8.field_824, var8.field_850, (class_91)null);
                           var22 = var10000;
                        }

                        var6.method_4732(var0, var1, var2, var16, (class_91)var22, (class_91)null, 819111540, var23, 0, 0, var19, var21);
                     } else if(var5 == 8) {
                        var28 = 8;
                        var29 = var6.method_4749(var0, var1, var2);
                        if(0L != var29) {
                           var28 = class_121.method_2269(class_164.method_3425(var29), -2137010266).field_810 * -2141564523 / 2;
                        }

                        int var27 = var4 + 2 & 3;
                        Object var26;
                        if(91732693 * var8.field_824 == -1 && null == var8.field_842) {
                           var32 = var8.method_1488(4, var4 + 4, var15, var17, var16, var18, (byte)36);
                           var26 = var8.method_1488(4, var27 + 4, var15, var17, var16, var18, (byte)50);
                        } else {
                           var10000 = new class_96(var3, 4, var4 + 4, var0, var1, var2, var8.field_824 * -1573583239, var8.field_850, (class_91)null);
                           var32 = var10000;
                           var10000 = new class_96(var3, 4, 4 + var27, var0, var1, var2, 91732693 * var8.field_824, var8.field_850, (class_91)null);
                           var26 = var10000;
                        }

                        var6.method_4732(var0, var1, var2, var16, (class_91)var32, (class_91)var26, 256, var4, var28 * field_2079[var4], field_2080[var4] * var28, var19, var21);
                     }
                  }
               }
            } else {
               if(-1 == 388641744 * var8.field_824 && var8.field_842 == null) {
                  var22 = var8.method_1488(10, var4, var15, var17, var16, var18, (byte)110);
               } else {
                  var10000 = new class_96(var3, 10, var4, var0, var1, var2, var8.field_824 * 763794534, var8.field_850, (class_91)null);
                  var22 = var10000;
               }

               if(null != var22 && var6.method_4807(var0, var1, var2, var16, var9, var10, (class_91)var22, 11 == var5?801118000:0, var19, var21) && var8.field_832) {
                  var23 = 15;
                  if(var22 instanceof class_92) {
                     var23 = ((class_92)var22).method_1649() / 4;
                     if(var23 > 30) {
                        var23 = 30;
                     }
                  }

                  for(int var24 = 0; var24 <= var9; ++var24) {
                     for(int var25 = 0; var25 <= var10; ++var25) {
                        if(var23 > class_391.field_4244[var0][var1 + var24][var2 + var25]) {
                           class_391.field_4244[var0][var24 + var1][var25 + var2] = (byte)var23;
                        }
                     }
                  }
               }

               if(-1539368128 * var8.field_818 != 0 && null != var7) {
                  var7.method_4611(var1, var2, var9, var10, var8.field_837, -605694512);
               }

            }
         }
      }
   }

   // $FF: renamed from: aq (int, int) int
   static final int method_3588(int var0, int var1) {
      int var2 = class_311.method_5552(var0 - 1, var1 - 1, -324437873) + class_311.method_5552(1 + var0, var1 - 1, -324437873) + class_311.method_5552(var0 - 1, 1 + var1, -324437873) + class_311.method_5552(1 + var0, 1 + var1, -324437873);
      int var3 = class_311.method_5552(var0 - 1, var1, -324437873) + class_311.method_5552(var0 + 1, var1, -324437873) + class_311.method_5552(var0, var1 - 1, -324437873) + class_311.method_5552(var0, var1 + 1, -324437873);
      int var4 = class_311.method_5552(var0, var1, -324437873);
      return var4 / 4 + var3 / 8 + var2 / 16;
   }

   // $FF: renamed from: aw (int, int) int
   static final int method_3589(int var0, int var1) {
      int var2 = class_311.method_5552(var0 - 1, var1 - 1, -324437873) + class_311.method_5552(1 + var0, var1 - 1, -324437873) + class_311.method_5552(var0 - 1, 1 + var1, -324437873) + class_311.method_5552(1 + var0, 1 + var1, -324437873);
      int var3 = class_311.method_5552(var0 - 1, var1, -324437873) + class_311.method_5552(var0 + 1, var1, -324437873) + class_311.method_5552(var0, var1 - 1, -324437873) + class_311.method_5552(var0, var1 + 1, -324437873);
      int var4 = class_311.method_5552(var0, var1, -324437873);
      return var4 / 4 + var3 / 8 + var2 / 16;
   }

   // $FF: renamed from: af (int, int) int
   static final int method_3590(int var0, int var1) {
      int var2 = var0 + var1 * 57;
      var2 ^= var2 << 13;
      int var3 = var2 * (15731 * var2 * var2 + 789221) + 1376312589 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }

   // $FF: renamed from: ac (int, int, int) int
   static final int method_3591(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = class_247.method_4714(var3, var5, (byte)105);
      int var8 = class_247.method_4714(var3 + 1, var5, (byte)76);
      int var9 = class_247.method_4714(var3, var5 + 1, (byte)120);
      int var10 = class_247.method_4714(1 + var3, 1 + var5, (byte)112);
      int var12 = 364309477 - class_70.field_559[var4 * 1024 / var2] >> 1;
      int var11 = (var7 * (65536 - var12) >> 16) + (var12 * var8 >> 16);
      int var13 = class_154.method_3248(var9, var10, var4, var2, (byte)-106);
      int var15 = -1040575922 - class_70.field_559[-1944088374 * var6 / var2] >> 1;
      int var14 = (var13 * var15 >> 16) + (var11 * (-146573077 - var15) >> 16);
      return var14;
   }

   // $FF: renamed from: ay (int, int) int
   static final int method_3592(int var0, int var1) {
      if(var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & '\uff80');
      }
   }

   // $FF: renamed from: aa (int, int) int
   static final int method_3593(int var0, int var1) {
      if(var0 == 484544770) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 1392665672) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = -1707220561;
         }

         return (var0 & 57706862) + var1;
      }
   }

   // $FF: renamed from: ae (byte[], int, int, int, int, fz[]) void
   static final void method_3594(byte[] var0, int var1, int var2, int var3, int var4, class_240[] var5) {
      int var7;
      int var8;
      for(int var6 = 0; var6 < 4; ++var6) {
         for(var7 = 0; var7 < 64; ++var7) {
            for(var8 = 0; var8 < 64; ++var8) {
               if(var1 + var7 > 0 && var1 + var7 < 103 && var2 + var8 > 0 && var8 + var2 < 103) {
                  var5[var6].field_2679[var1 + var7][var8 + var2] &= -16777217;
               }
            }
         }
      }

      class_28 var10000 = new class_28(var0);
      class_28 var10 = var10000;

      for(var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < 64; ++var8) {
            for(int var9 = 0; var9 < 64; ++var9) {
               class_231.method_4435(var10, var7, var1 + var8, var2 + var9, var3, var4, 0, (byte)-83);
            }
         }
      }

   }

   // $FF: renamed from: an (int, int) int
   static final int method_3595(int var0, int var1) {
      if(var0 == -2) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   // $FF: renamed from: bd (int, int, int, int, int, int, int, gt, fz) void
   static final void method_3596(int var0, int var1, int var2, int var3, int var4, int var5, int var6, class_251 var7, class_240 var8) {
      class_87 var9 = class_121.method_2269(var4, 854212793);
      int var10;
      int var11;
      if(var5 != 1 && 3 != var5) {
         var10 = -288612135 * var9.field_839;
         var11 = var9.field_851 * -1812944985;
      } else {
         var10 = var9.field_851 * -1812944985;
         var11 = -288612135 * var9.field_839;
      }

      int var12;
      int var13;
      if(var2 + var10 <= 104) {
         var12 = var2 + (var10 >> 1);
         var13 = (var10 + 1 >> 1) + var2;
      } else {
         var12 = var2;
         var13 = 1 + var2;
      }

      int var14;
      int var15;
      if(var3 + var11 <= 104) {
         var14 = (var11 >> 1) + var3;
         var15 = var3 + (var11 + 1 >> 1);
      } else {
         var14 = var3;
         var15 = var3 + 1;
      }

      int[][] var16 = field_2078[var1];
      int var17 = var16[var13][var15] + var16[var13][var14] + var16[var12][var14] + var16[var12][var15] >> 2;
      int var18 = (var2 << 7) + (var10 << 6);
      int var19 = (var11 << 6) + (var3 << 7);
      long var20 = class_141.method_3047(var2, var3, 2, 0 == -1747290425 * var9.field_820, var4, -1309906491);
      int var22 = (var5 << 6) + var6;
      if(-1364896901 * var9.field_841 == 1) {
         var22 += 256;
      }

      class_96 var10000;
      Object var23;
      if(var6 == 22) {
         if(91732693 * var9.field_824 == -1 && null == var9.field_842) {
            var23 = var9.method_1489(22, var5, var16, var18, var17, var19, -925676771);
         } else {
            var10000 = new class_96(var4, 22, var5, var1, var2, var3, var9.field_824 * 91732693, var9.field_850, (class_91)null);
            var23 = var10000;
         }

         var7.method_4729(var0, var2, var3, var17, (class_91)var23, var20, var22);
         if(1 == var9.field_818 * 1384594797) {
            var8.method_4624(var2, var3, -436923463);
         }

      } else if(var6 != 10 && var6 != 11) {
         if(var6 >= 12) {
            if(-1 == var9.field_824 * 91732693 && null == var9.field_842) {
               var23 = var9.method_1489(var6, var5, var16, var18, var17, var19, -925676771);
            } else {
               var10000 = new class_96(var4, var6, var5, var1, var2, var3, var9.field_824 * 91732693, var9.field_850, (class_91)null);
               var23 = var10000;
            }

            var7.method_4807(var0, var2, var3, var17, 1, 1, (class_91)var23, 0, var20, var22);
            if(0 != var9.field_818 * 1384594797) {
               var8.method_4611(var2, var3, var10, var11, var9.field_837, 175886880);
            }

         } else if(var6 == 0) {
            if(var9.field_824 * 91732693 == -1 && null == var9.field_842) {
               var23 = var9.method_1489(0, var5, var16, var18, var17, var19, -925676771);
            } else {
               var10000 = new class_96(var4, 0, var5, var1, var2, var3, 91732693 * var9.field_824, var9.field_850, (class_91)null);
               var23 = var10000;
            }

            var7.method_4731(var0, var2, var3, var17, (class_91)var23, (class_91)null, field_2068[var5], 0, var20, var22);
            if(0 != var9.field_818 * 1384594797) {
               var8.method_4623(var2, var3, var6, var5, var9.field_837, -1946469678);
            }

         } else if(var6 == 1) {
            if(-1 == 91732693 * var9.field_824 && null == var9.field_842) {
               var23 = var9.method_1489(1, var5, var16, var18, var17, var19, -925676771);
            } else {
               var10000 = new class_96(var4, 1, var5, var1, var2, var3, 91732693 * var9.field_824, var9.field_850, (class_91)null);
               var23 = var10000;
            }

            var7.method_4731(var0, var2, var3, var17, (class_91)var23, (class_91)null, field_2076[var5], 0, var20, var22);
            if(var9.field_818 * 1384594797 != 0) {
               var8.method_4623(var2, var3, var6, var5, var9.field_837, -1946469678);
            }

         } else {
            int var29;
            if(var6 == 2) {
               var29 = var5 + 1 & 3;
               Object var25;
               Object var31;
               if(-1 == 91732693 * var9.field_824 && null == var9.field_842) {
                  var31 = var9.method_1489(2, 4 + var5, var16, var18, var17, var19, -925676771);
                  var25 = var9.method_1489(2, var29, var16, var18, var17, var19, -925676771);
               } else {
                  var10000 = new class_96(var4, 2, var5 + 4, var1, var2, var3, var9.field_824 * 91732693, var9.field_850, (class_91)null);
                  var31 = var10000;
                  var10000 = new class_96(var4, 2, var29, var1, var2, var3, 91732693 * var9.field_824, var9.field_850, (class_91)null);
                  var25 = var10000;
               }

               var7.method_4731(var0, var2, var3, var17, (class_91)var31, (class_91)var25, field_2068[var5], field_2068[var29], var20, var22);
               if(1384594797 * var9.field_818 != 0) {
                  var8.method_4623(var2, var3, var6, var5, var9.field_837, -1946469678);
               }

            } else if(var6 == 3) {
               if(91732693 * var9.field_824 == -1 && var9.field_842 == null) {
                  var23 = var9.method_1489(3, var5, var16, var18, var17, var19, -925676771);
               } else {
                  var10000 = new class_96(var4, 3, var5, var1, var2, var3, var9.field_824 * 91732693, var9.field_850, (class_91)null);
                  var23 = var10000;
               }

               var7.method_4731(var0, var2, var3, var17, (class_91)var23, (class_91)null, field_2076[var5], 0, var20, var22);
               if(1384594797 * var9.field_818 != 0) {
                  var8.method_4623(var2, var3, var6, var5, var9.field_837, -1946469678);
               }

            } else if(var6 == 9) {
               if(var9.field_824 * 91732693 == -1 && null == var9.field_842) {
                  var23 = var9.method_1489(var6, var5, var16, var18, var17, var19, -925676771);
               } else {
                  var10000 = new class_96(var4, var6, var5, var1, var2, var3, 91732693 * var9.field_824, var9.field_850, (class_91)null);
                  var23 = var10000;
               }

               var7.method_4807(var0, var2, var3, var17, 1, 1, (class_91)var23, 0, var20, var22);
               if(1384594797 * var9.field_818 != 0) {
                  var8.method_4611(var2, var3, var10, var11, var9.field_837, 1413327277);
               }

            } else if(4 == var6) {
               if(var9.field_824 * 91732693 == -1 && var9.field_842 == null) {
                  var23 = var9.method_1489(4, var5, var16, var18, var17, var19, -925676771);
               } else {
                  var10000 = new class_96(var4, 4, var5, var1, var2, var3, 91732693 * var9.field_824, var9.field_850, (class_91)null);
                  var23 = var10000;
               }

               var7.method_4732(var0, var2, var3, var17, (class_91)var23, (class_91)null, field_2068[var5], 0, 0, 0, var20, var22);
            } else {
               long var24;
               Object var26;
               if(5 == var6) {
                  var29 = 16;
                  var24 = var7.method_4749(var0, var2, var3);
                  if(var24 != 0L) {
                     var29 = class_121.method_2269(class_164.method_3425(var24), 202109319).field_810 * -2141564523;
                  }

                  if(-1 == 91732693 * var9.field_824 && null == var9.field_842) {
                     var26 = var9.method_1489(4, var5, var16, var18, var17, var19, -925676771);
                  } else {
                     var10000 = new class_96(var4, 4, var5, var1, var2, var3, var9.field_824 * 91732693, var9.field_850, (class_91)null);
                     var26 = var10000;
                  }

                  var7.method_4732(var0, var2, var3, var17, (class_91)var26, (class_91)null, field_2068[var5], 0, var29 * field_2077[var5], field_2074[var5] * var29, var20, var22);
               } else if(var6 == 6) {
                  var29 = 8;
                  var24 = var7.method_4749(var0, var2, var3);
                  if(0L != var24) {
                     var29 = class_121.method_2269(class_164.method_3425(var24), -2033892886).field_810 * -2141564523 / 2;
                  }

                  if(-1 == var9.field_824 * 91732693 && var9.field_842 == null) {
                     var26 = var9.method_1489(4, var5 + 4, var16, var18, var17, var19, -925676771);
                  } else {
                     var10000 = new class_96(var4, 4, 4 + var5, var1, var2, var3, 91732693 * var9.field_824, var9.field_850, (class_91)null);
                     var26 = var10000;
                  }

                  var7.method_4732(var0, var2, var3, var17, (class_91)var26, (class_91)null, 256, var5, field_2079[var5] * var29, var29 * field_2080[var5], var20, var22);
               } else if(var6 == 7) {
                  int var30 = var5 + 2 & 3;
                  if(-1 == var9.field_824 * 91732693 && var9.field_842 == null) {
                     var23 = var9.method_1489(4, var30 + 4, var16, var18, var17, var19, -925676771);
                  } else {
                     var10000 = new class_96(var4, 4, var30 + 4, var1, var2, var3, var9.field_824 * 91732693, var9.field_850, (class_91)null);
                     var23 = var10000;
                  }

                  var7.method_4732(var0, var2, var3, var17, (class_91)var23, (class_91)null, 256, var30, 0, 0, var20, var22);
               } else if(var6 == 8) {
                  var29 = 8;
                  var24 = var7.method_4749(var0, var2, var3);
                  if(var24 != 0L) {
                     var29 = class_121.method_2269(class_164.method_3425(var24), 1243398818).field_810 * -2141564523 / 2;
                  }

                  int var28 = var5 + 2 & 3;
                  Object var27;
                  if(var9.field_824 * 91732693 == -1 && null == var9.field_842) {
                     var26 = var9.method_1489(4, var5 + 4, var16, var18, var17, var19, -925676771);
                     var27 = var9.method_1489(4, 4 + var28, var16, var18, var17, var19, -925676771);
                  } else {
                     var10000 = new class_96(var4, 4, 4 + var5, var1, var2, var3, var9.field_824 * 91732693, var9.field_850, (class_91)null);
                     var26 = var10000;
                     var10000 = new class_96(var4, 4, var28 + 4, var1, var2, var3, var9.field_824 * 91732693, var9.field_850, (class_91)null);
                     var27 = var10000;
                  }

                  var7.method_4732(var0, var2, var3, var17, (class_91)var26, (class_91)var27, 256, var5, var29 * field_2079[var5], var29 * field_2080[var5], var20, var22);
               }
            }
         }
      } else {
         if(-1 == 91732693 * var9.field_824 && null == var9.field_842) {
            var23 = var9.method_1489(10, var5, var16, var18, var17, var19, -925676771);
         } else {
            var10000 = new class_96(var4, 10, var5, var1, var2, var3, var9.field_824 * 91732693, var9.field_850, (class_91)null);
            var23 = var10000;
         }

         if(null != var23) {
            var7.method_4807(var0, var2, var3, var17, var10, var11, (class_91)var23, 11 == var6?256:0, var20, var22);
         }

         if(1384594797 * var9.field_818 != 0) {
            var8.method_4611(var2, var3, var10, var11, var9.field_837, 1403402683);
         }

      }
   }

   // $FF: renamed from: d (int) void
   static final void method_3597(int var0) {
      try {
         class_305 var10000 = (class_305)null;
         String var1 = class_305.field_3572;
         class_149.method_3135(30, "", var1, 1237845702);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "cg.d(" + ')');
      }
   }

   // $FF: renamed from: ac (java.lang.String, int) int
   public static int method_3598(String var0, int var1) {
      try {
         return var0.length() + 1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "cg.ac(" + ')');
      }
   }
}
