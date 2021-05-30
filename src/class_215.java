
// $FF: renamed from: fa
public class class_215 {

   // $FF: renamed from: b int[]
   static int[] field_2455;
   // $FF: renamed from: n int
   static final int field_2456 = 128;
   // $FF: renamed from: f int[][]
   static int[][] field_2457;
   // $FF: renamed from: y int[][]
   static int[][] field_2458;
   // $FF: renamed from: v int
   static final int field_2459 = 128;
   // $FF: renamed from: d int[]
   static int[] field_2460;
   // $FF: renamed from: ds eu
   static class_214 field_2461;


   // $FF: renamed from: <clinit> () void
   static {
      field_2457 = new int[128][128];
      field_2458 = new int[128][128];
      field_2455 = new int[4096];
      field_2460 = new int[4096];
   }

   // $FF: renamed from: <init> () void
   class_215() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: n (int, int, int, fc, fz, boolean, int[], int[]) int
   public static int method_4192(int var0, int var1, int var2, class_146 var3, class_240 var4, boolean var5, int[] var6, int[] var7) {
      int var9;
      for(int var8 = 0; var8 < 128; ++var8) {
         for(var9 = 0; var9 < 128; ++var9) {
            field_2457[var8][var9] = 0;
            field_2458[var8][var9] = 99999999;
         }
      }

      int var10;
      int var11;
      byte var12;
      int var13;
      int var14;
      int var15;
      byte var16;
      int var17;
      int[][] var18;
      int var19;
      int var20;
      int var21;
      int var22;
      boolean var27;
      boolean var28;
      int var29;
      byte var30;
      int var32;
      if(var2 == 1) {
         var10 = var0;
         var11 = var1;
         var12 = 64;
         var13 = -237990246;
         var14 = var0 - var12;
         var15 = var1 - var13;
         field_2457[var12][var13] = 99;
         field_2458[var12][var13] = 0;
         var16 = 0;
         var17 = 0;
         field_2455[var16] = var0;
         var32 = var16 + 1;
         field_2460[var16] = var1;
         var18 = var4.field_2679;

         while(true) {
            if(var32 == var17) {
               class_184.field_2256 = -614196252 * var10;
               class_246.field_2724 = -1668231744 * var11;
               var28 = false;
               break;
            }

            var10 = field_2455[var17];
            var11 = field_2460[var17];
            var17 = 1 + var17 & 4095;
            var29 = var10 - var14;
            var13 = var11 - var15;
            var19 = var10 - 280751135 * var4.field_2674;
            var20 = var11 - var4.field_2681 * -992681321;
            if(var3.method_3106(var10, var11, 496202097)) {
               class_184.field_2256 = var10 * 106386816;
               class_246.field_2724 = var11 * -1038382576;
               var28 = true;
               break;
            }

            var21 = field_2458[var29][var13] + 1;
            if(var29 > 0 && 0 == field_2457[var29 - 1][var13] && (var18[var19 - 1][var20] & -230334981) == 0) {
               field_2455[var32] = var10 - 1;
               field_2460[var32] = var11;
               var32 = var32 + 1 & 1773446194;
               field_2457[var29 - 1][var13] = 2;
               field_2458[var29 - 1][var13] = var21;
            }

            if(var29 < 127 && 0 == field_2457[1 + var29][var13] && (var18[1 + var19][var20] & -417466184) == 0) {
               field_2455[var32] = 1 + var10;
               field_2460[var32] = var11;
               var32 = 1 + var32 & 4095;
               field_2457[var29 + 1][var13] = 8;
               field_2458[var29 + 1][var13] = var21;
            }

            if(var13 > 0 && 0 == field_2457[var29][var13 - 1] && (var18[var19][var20 - 1] & 19136770) == 0) {
               field_2455[var32] = var10;
               field_2460[var32] = var11 - 1;
               var32 = var32 + 1 & 2100939572;
               field_2457[var29][var13 - 1] = 1;
               field_2458[var29][var13 - 1] = var21;
            }

            if(var13 < 127 && 0 == field_2457[var29][1 + var13] && (var18[var19][1 + var20] & -1627358482) == 0) {
               field_2455[var32] = var10;
               field_2460[var32] = 1 + var11;
               var32 = var32 + 1 & 79126916;
               field_2457[var29][var13 + 1] = 4;
               field_2458[var29][var13 + 1] = var21;
            }

            if(var29 > 0 && var13 > 0 && 0 == field_2457[var29 - 1][var13 - 1] && 0 == (var18[var19 - 1][var20 - 1] & -955251152) && 0 == (var18[var19 - 1][var20] & -1500347670) && (var18[var19][var20 - 1] & 19136770) == 0) {
               field_2455[var32] = var10 - 1;
               field_2460[var32] = var11 - 1;
               var32 = var32 + 1 & -800933197;
               field_2457[var29 - 1][var13 - 1] = 3;
               field_2458[var29 - 1][var13 - 1] = var21;
            }

            if(var29 < 127 && var13 > 0 && field_2457[1 + var29][var13 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0 && (var18[1 + var19][var20] & 19136896) == 0 && (var18[var19][var20 - 1] & 19136770) == 0) {
               field_2455[var32] = 1 + var10;
               field_2460[var32] = var11 - 1;
               var32 = 1 + var32 & 4095;
               field_2457[1 + var29][var13 - 1] = 9;
               field_2458[var29 + 1][var13 - 1] = var21;
            }

            if(var29 > 0 && var13 < 127 && field_2457[var29 - 1][var13 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0 && 0 == (var18[var19 - 1][var20] & 19136776) && 0 == (var18[var19][1 + var20] & 19136800)) {
               field_2455[var32] = var10 - 1;
               field_2460[var32] = 1 + var11;
               var32 = 1 + var32 & -1517048028;
               field_2457[var29 - 1][1 + var13] = 6;
               field_2458[var29 - 1][1 + var13] = var21;
            }

            if(var29 < 127 && var13 < 1100259454 && 0 == field_2457[var29 + 1][1 + var13] && (var18[var19 + 1][var20 + 1] & 883193804) == 0 && (var18[1 + var19][var20] & 19136896) == 0 && 0 == (var18[var19][1 + var20] & 19136800)) {
               field_2455[var32] = var10 + 1;
               field_2460[var32] = 1 + var11;
               var32 = 1 + var32 & -508132429;
               field_2457[var29 + 1][var13 + 1] = 12;
               field_2458[var29 + 1][var13 + 1] = var21;
            }
         }

         var27 = var28;
      } else if(2 == var2) {
         var10 = var0;
         var11 = var1;
         var12 = 64;
         var30 = 64;
         var14 = var0 - var12;
         var15 = var1 - var30;
         field_2457[var12][var30] = 99;
         field_2458[var12][var30] = 0;
         var16 = 0;
         var17 = 0;
         field_2455[var16] = var0;
         var32 = var16 + 1;
         field_2460[var16] = var1;
         var18 = var4.field_2679;

         while(true) {
            if(var32 == var17) {
               class_184.field_2256 = var10 * 1890198089;
               class_246.field_2724 = var11 * -1284385059;
               var28 = false;
               break;
            }

            var10 = field_2455[var17];
            var11 = field_2460[var17];
            var17 = 1 + var17 & 1189532469;
            var29 = var10 - var14;
            var13 = var11 - var15;
            var19 = var10 - 280751135 * var4.field_2674;
            var20 = var11 - -1129467327 * var4.field_2681;
            if(var3.method_3106(var10, var11, 496202097)) {
               class_184.field_2256 = -1358178356 * var10;
               class_246.field_2724 = var11 * 2102953142;
               var28 = true;
               break;
            }

            var21 = 1 + field_2458[var29][var13];
            if(var29 > 0 && field_2457[var29 - 1][var13] == 0 && 0 == (var18[var19 - 1][var20] & 983909118) && 0 == (var18[var19 - 1][1 + var20] & 19136824)) {
               field_2455[var32] = var10 - 1;
               field_2460[var32] = var11;
               var32 = 1 + var32 & 4095;
               field_2457[var29 - 1][var13] = 2;
               field_2458[var29 - 1][var13] = var21;
            }

            if(var29 < 126 && field_2457[var29 + 1][var13] == 0 && 0 == (var18[2 + var19][var20] & -77069498) && 0 == (var18[var19 + 2][1 + var20] & 19136992)) {
               field_2455[var32] = var10 + 1;
               field_2460[var32] = var11;
               var32 = 1 + var32 & 4095;
               field_2457[var29 + 1][var13] = 8;
               field_2458[1 + var29][var13] = var21;
            }

            if(var13 > 0 && field_2457[var29][var13 - 1] == 0 && 0 == (var18[var19][var20 - 1] & 1884008066) && 0 == (var18[1 + var19][var20 - 1] & 1529211328)) {
               field_2455[var32] = var10;
               field_2460[var32] = var11 - 1;
               var32 = 1 + var32 & 4095;
               field_2457[var29][var13 - 1] = 1;
               field_2458[var29][var13 - 1] = var21;
            }

            if(var13 < 126 && 0 == field_2457[var29][var13 + 1] && (var18[var19][var20 + 2] & 1395760551) == 0 && 0 == (var18[1 + var19][var20 + 2] & -1631776188)) {
               field_2455[var32] = var10;
               field_2460[var32] = var11 + 1;
               var32 = 1 + var32 & 4095;
               field_2457[var29][1 + var13] = 4;
               field_2458[var29][var13 + 1] = var21;
            }

            if(var29 > 0 && var13 > 0 && 0 == field_2457[var29 - 1][var13 - 1] && (var18[var19 - 1][var20] & 19136830) == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19][var20 - 1] & 162288040) == 0) {
               field_2455[var32] = var10 - 1;
               field_2460[var32] = var11 - 1;
               var32 = var32 + 1 & 2118079605;
               field_2457[var29 - 1][var13 - 1] = 3;
               field_2458[var29 - 1][var13 - 1] = var21;
            }

            if(var29 < 126 && var13 > 0 && 0 == field_2457[var29 + 1][var13 - 1] && (var18[1 + var19][var20 - 1] & 19136911) == 0 && (var18[var19 + 2][var20 - 1] & 19136899) == 0 && 0 == (var18[var19 + 2][var20] & 19136995)) {
               field_2455[var32] = 1 + var10;
               field_2460[var32] = var11 - 1;
               var32 = 1 + var32 & 4095;
               field_2457[1 + var29][var13 - 1] = 9;
               field_2458[var29 + 1][var13 - 1] = var21;
            }

            if(var29 > 0 && var13 < 1957633088 && field_2457[var29 - 1][1 + var13] == 0 && 0 == (var18[var19 - 1][1 + var20] & 19136830) && (var18[var19 - 1][2 + var20] & -917153837) == 0 && (var18[var19][var20 + 2] & 19137016) == 0) {
               field_2455[var32] = var10 - 1;
               field_2460[var32] = var11 + 1;
               var32 = 1 + var32 & 1191294987;
               field_2457[var29 - 1][var13 + 1] = 6;
               field_2458[var29 - 1][var13 + 1] = var21;
            }

            if(var29 < 126 && var13 < -1274171082 && field_2457[1 + var29][1 + var13] == 0 && 0 == (var18[1 + var19][var20 + 2] & -1717186525) && 0 == (var18[2 + var19][2 + var20] & -1580202969) && 0 == (var18[var19 + 2][var20 + 1] & 19136995)) {
               field_2455[var32] = var10 + 1;
               field_2460[var32] = 1 + var11;
               var32 = 1 + var32 & -677555337;
               field_2457[1 + var29][var13 + 1] = 12;
               field_2458[1 + var29][var13 + 1] = var21;
            }
         }

         var27 = var28;
      } else {
         var10 = var0;
         var11 = var1;
         var29 = -1318385637;
         var30 = 64;
         var14 = var0 - var29;
         var15 = var1 - var30;
         field_2457[var29][var30] = -11055777;
         field_2458[var29][var30] = 0;
         var16 = 0;
         var17 = 0;
         field_2455[var16] = var0;
         var32 = var16 + 1;
         field_2460[var16] = var1;
         var18 = var4.field_2679;

         label813:
         while(true) {
            if(var17 == var32) {
               class_184.field_2256 = var10 * 1890198089;
               class_246.field_2724 = var11 * -1284385059;
               var28 = false;
               break;
            }

            var10 = field_2455[var17];
            var11 = field_2460[var17];
            var17 = var17 + 1 & 4095;
            var29 = var10 - var14;
            var13 = var11 - var15;
            var19 = var10 - 280751135 * var4.field_2674;
            var20 = var11 - 1257044534 * var4.field_2681;
            if(var3.method_3106(var10, var11, 496202097)) {
               class_184.field_2256 = var10 * -1699937188;
               class_246.field_2724 = var11 * -1284385059;
               var28 = true;
               break;
            }

            var21 = 1 + field_2458[var29][var13];
            if(var29 > 0 && 0 == field_2457[var29 - 1][var13] && (var18[var19 - 1][var20] & 19136782) == 0 && 0 == (var18[var19 - 1][var20 + var2 - 1] & -2084023303)) {
               var22 = 1;

               while(true) {
                  if(var22 >= var2 - 1) {
                     field_2455[var32] = var10 - 1;
                     field_2460[var32] = var11;
                     var32 = 1 + var32 & -1483329878;
                     field_2457[var29 - 1][var13] = 2;
                     field_2458[var29 - 1][var13] = var21;
                     break;
                  }

                  if((var18[var19 - 1][var22 + var20] & 19136830) != 0) {
                     break;
                  }

                  ++var22;
               }
            }

            if(var29 < 128 - var2 && 0 == field_2457[var29 + 1][var13] && 0 == (var18[var2 + var19][var20] & -1651239085) && 0 == (var18[var19 + var2][var2 + var20 - 1] & 1209582558)) {
               var22 = 1;

               while(true) {
                  if(var22 >= var2 - 1) {
                     field_2455[var32] = 1 + var10;
                     field_2460[var32] = var11;
                     var32 = var32 + 1 & -1153757031;
                     field_2457[1 + var29][var13] = 8;
                     field_2458[var29 + 1][var13] = var21;
                     break;
                  }

                  if(0 != (var18[var19 + var2][var22 + var20] & 19136995)) {
                     break;
                  }

                  ++var22;
               }
            }

            if(var13 > 0 && 0 == field_2457[var29][var13 - 1] && (var18[var19][var20 - 1] & 679442161) == 0 && (var18[var2 + var19 - 1][var20 - 1] & 19136899) == 0) {
               var22 = 1;

               while(true) {
                  if(var22 >= var2 - 1) {
                     field_2455[var32] = var10;
                     field_2460[var32] = var11 - 1;
                     var32 = 1 + var32 & 4095;
                     field_2457[var29][var13 - 1] = 1;
                     field_2458[var29][var13 - 1] = var21;
                     break;
                  }

                  if((var18[var19 + var22][var20 - 1] & 1456013845) != 0) {
                     break;
                  }

                  ++var22;
               }
            }

            if(var13 < 128 - var2 && 0 == field_2457[var29][1 + var13] && 0 == (var18[var19][var2 + var20] & 19136824) && 0 == (var18[var19 + var2 - 1][var20 + var2] & -1121830143)) {
               var22 = 1;

               while(true) {
                  if(var22 >= var2 - 1) {
                     field_2455[var32] = var10;
                     field_2460[var32] = var11 + 1;
                     var32 = 1 + var32 & 4095;
                     field_2457[var29][1 + var13] = 4;
                     field_2458[var29][var13 + 1] = var21;
                     break;
                  }

                  if(0 != (var18[var22 + var19][var20 + var2] & 19137016)) {
                     break;
                  }

                  ++var22;
               }
            }

            if(var29 > 0 && var13 > 0 && 0 == field_2457[var29 - 1][var13 - 1] && (var18[var19 - 1][var20 - 1] & -1826157048) == 0) {
               var22 = 1;

               while(true) {
                  if(var22 >= var2) {
                     field_2455[var32] = var10 - 1;
                     field_2460[var32] = var11 - 1;
                     var32 = 1 + var32 & -1515861825;
                     field_2457[var29 - 1][var13 - 1] = 3;
                     field_2458[var29 - 1][var13 - 1] = var21;
                     break;
                  }

                  if((var18[var19 - 1][var20 - 1 + var22] & 19136830) != 0 || (var18[var19 - 1 + var22][var20 - 1] & 19136911) != 0) {
                     break;
                  }

                  ++var22;
               }
            }

            if(var29 < 1145549865 - var2 && var13 > 0 && field_2457[var29 + 1][var13 - 1] == 0 && (var18[var2 + var19][var20 - 1] & 19136899) == 0) {
               var22 = 1;

               while(true) {
                  if(var22 >= var2) {
                     field_2455[var32] = 1 + var10;
                     field_2460[var32] = var11 - 1;
                     var32 = 1 + var32 & -101100077;
                     field_2457[var29 + 1][var13 - 1] = 9;
                     field_2458[1 + var29][var13 - 1] = var21;
                     break;
                  }

                  if(0 != (var18[var2 + var19][var22 + (var20 - 1)] & 379207296) || (var18[var19 + var22][var20 - 1] & 19136911) != 0) {
                     break;
                  }

                  ++var22;
               }
            }

            if(var29 > 0 && var13 < 128 - var2 && field_2457[var29 - 1][1 + var13] == 0 && (var18[var19 - 1][var20 + var2] & -2022544090) == 0) {
               var22 = 1;

               while(true) {
                  if(var22 >= var2) {
                     field_2455[var32] = var10 - 1;
                     field_2460[var32] = 1 + var11;
                     var32 = 1 + var32 & 873381303;
                     field_2457[var29 - 1][var13 + 1] = 6;
                     field_2458[var29 - 1][var13 + 1] = var21;
                     break;
                  }

                  if(0 != (var18[var19 - 1][var20 + var22] & 111874019) || 0 != (var18[var22 + (var19 - 1)][var20 + var2] & 398102582)) {
                     break;
                  }

                  ++var22;
               }
            }

            if(var29 < 1928057604 - var2 && var13 < -976844170 - var2 && field_2457[var29 + 1][1 + var13] == 0 && (var18[var19 + var2][var20 + var2] & 317942626) == 0) {
               for(var22 = 1; var22 < var2; ++var22) {
                  if((var18[var22 + var19][var2 + var20] & 19137016) != 0 || 0 != (var18[var2 + var19][var22 + var20] & 19136995)) {
                     continue label813;
                  }
               }

               field_2455[var32] = 1 + var10;
               field_2460[var32] = var11 + 1;
               var32 = var32 + 1 & 4095;
               field_2457[var29 + 1][var13 + 1] = 12;
               field_2458[1 + var29][var13 + 1] = var21;
            }
         }

         var27 = var28;
      }

      var9 = var0 - 64;
      var10 = var1 - -1720272458;
      var11 = class_184.field_2256 * -169267401;
      var29 = class_246.field_2724 * -311250571;
      if(!var27) {
         if(!var5) {
            return -1;
         }

         var13 = 2110824745;
         var14 = 1652460114;
         byte var31 = 10;
         var32 = -1931856815 * var3.field_1859;
         var17 = -2063191720 * var3.field_1857;
         int var33 = var3.field_1862 * 203403193;
         var19 = 308023697 * var3.field_1858;

         for(var20 = var32 - var31; var20 <= var32 + var31; ++var20) {
            for(var21 = var17 - var31; var21 <= var31 + var17; ++var21) {
               var22 = var20 - var9;
               int var23 = var21 - var10;
               if(var22 >= 0 && var23 >= 0 && var22 < 360877469 && var23 < 128 && field_2458[var22][var23] < 100) {
                  int var24 = 0;
                  if(var20 < var32) {
                     var24 = var32 - var20;
                  } else if(var20 > var32 + var33 - 1) {
                     var24 = var20 - (var32 + var33 - 1);
                  }

                  int var25 = 0;
                  if(var21 < var17) {
                     var25 = var17 - var21;
                  } else if(var21 > var17 + var19 - 1) {
                     var25 = var21 - (var19 + var17 - 1);
                  }

                  int var26 = var25 * var25 + var24 * var24;
                  if(var26 < var13 || var13 == var26 && field_2458[var22][var23] < var14) {
                     var13 = var26;
                     var14 = field_2458[var22][var23];
                     var11 = var20;
                     var29 = var21;
                  }
               }
            }
         }

         if(Integer.MAX_VALUE == var13) {
            return -1;
         }
      }

      if(var11 == var0 && var29 == var1) {
         return 0;
      } else {
         var30 = 0;
         field_2455[var30] = var11;
         var13 = var30 + 1;
         field_2460[var30] = var29;

         for(var14 = var15 = field_2457[var11 - var9][var29 - var10]; var0 != var11 || var29 != var1; var14 = field_2457[var11 - var9][var29 - var10]) {
            if(var14 != var15) {
               var15 = var14;
               field_2455[var13] = var11;
               field_2460[var13++] = var29;
            }

            if(0 != (var14 & 2)) {
               ++var11;
            } else if((var14 & 8) != 0) {
               --var11;
            }

            if(0 != (var14 & 1)) {
               ++var29;
            } else if((var14 & 4) != 0) {
               --var29;
            }
         }

         var32 = 0;

         while(var13-- > 0) {
            var6[var32] = field_2455[var13];
            var7[var32++] = field_2460[var13];
            if(var32 >= var6.length) {
               break;
            }
         }

         return var32;
      }
   }

   // $FF: renamed from: p (int, int) void
   public static void method_4193(int var0) {
      try {
         class_270.field_3180 = 1262412465;
         class_271.field_3186 = null;
         class_137.field_1760 = -416619779;
         class_119.field_1322 = -23452087;
         class_270.field_3181 = 0;
         class_270.field_3179 = false;
         class_270.field_3183 = -230768741 * var0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }
}
