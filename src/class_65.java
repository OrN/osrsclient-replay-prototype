
// $FF: renamed from: oi
public class class_65 extends class_59 {

   // $FF: renamed from: ab int
   public static int field_484;
   // $FF: renamed from: ai int
   public static int field_485;
   // $FF: renamed from: al int
   public static int field_486;
   // $FF: renamed from: ad int
   public static int field_487;
   // $FF: renamed from: ag int
   public static int field_488;
   // $FF: renamed from: ar int
   public static int field_489;
   // $FF: renamed from: ap int[]
   public static int[] field_490;


   // $FF: renamed from: dv (int[]) void
   public static void method_655(int[] var0) {
      var0[0] = field_489;
      var0[1] = field_487;
      var0[2] = field_488;
      var0[3] = field_485;
   }

   // $FF: renamed from: dk (int[], int, int) void
   public static void method_656(int[] var0, int var1, int var2) {
      field_490 = var0;
      field_484 = var1;
      field_486 = var2;
      method_694(0, 0, var1, var2);
   }

   // $FF: renamed from: ds () void
   public static void method_657() {
      field_489 = 0;
      field_487 = 0;
      field_488 = field_484;
      field_485 = field_486;
   }

   // $FF: renamed from: gm (int, int, int, int, int) void
   static void method_658(int var0, int var1, int var2, int var3, int var4) {
      if(var0 >= field_489 && var0 < field_488) {
         if(var1 < field_487) {
            var2 -= field_487 - var1;
            var1 = field_487;
         }

         if(var1 + var2 > field_485) {
            var2 = field_485 - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * field_484;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (field_490[var12] >> 16 & 255) * var5;
            int var10 = (field_490[var12] >> 8 & 255) * var5;
            int var11 = (field_490[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            field_490[var12] = var14;
            var12 += field_484;
         }

      }
   }

   // $FF: renamed from: gj (int, int, int, int[], int[]) void
   public static void method_659(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * field_484;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            field_490[var6++] = var2;
         }

         var5 += field_484;
      }

   }

   // $FF: renamed from: ei (int, int, int, int) void
   static void method_660(int var0, int var1, int var2, int var3) {
      if(var2 == 0) {
         method_723(var0, var1, var3);
      } else {
         if(var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if(var4 < field_487) {
            var4 = field_487;
         }

         int var5 = var1 + var2 + 1;
         if(var5 > field_485) {
            var5 = field_485;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if(var1 > var5) {
            var1 = var5;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         while(var6 < var1) {
            while(var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            var12 = var0 - var8 + 1;
            if(var12 < field_489) {
               var12 = field_489;
            }

            var13 = var0 + var8;
            if(var13 > field_488) {
               var13 = field_488;
            }

            var14 = var12 + var6 * field_484;

            for(var15 = var12; var15 < var13; ++var15) {
               field_490[var14++] = var3;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if(var12 < field_489) {
               var12 = field_489;
            }

            var13 = var0 + var8;
            if(var13 > field_488 - 1) {
               var13 = field_488 - 1;
            }

            var14 = var12 + var6 * field_484;

            for(var15 = var12; var15 <= var13; ++var15) {
               field_490[var14++] = var3;
            }

            ++var6;
            var11 += var9 + var9;
         }

      }
   }

   // $FF: renamed from: fx (int, int, int, int, int, int, int, int) void
   public static void method_661(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         if(var0 < field_489) {
            var2 -= field_489 - var0;
            var0 = field_489;
         }

         if(var1 < field_487) {
            var8 += (field_487 - var1) * var9;
            var3 -= field_487 - var1;
            var1 = field_487;
         }

         if(var0 + var2 > field_488) {
            var2 = field_488 - var0;
         }

         if(var1 + var3 > field_485) {
            var3 = field_485 - var1;
         }

         int var10 = field_484 - var2;
         int var11 = var0 + var1 * field_484;

         for(int var12 = -var3; var12 < 0; ++var12) {
            int var13 = -1962168383 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var6 * var13 + var7 * var14 & -360781855) >>> 8;
            if(var15 == 0) {
               var11 += field_484;
               var8 += var9;
            } else {
               int var16 = ((var4 & -1976743311) * var13 + (var5 & -628195885) * var14 & -16711936) + ((var4 & '\uff00') * var13 + (var5 & '\uff00') * var14 & 16711680) >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & -1522095915) * var15 >> 8 & 16711935) + ((var16 & -688012609) * var15 >> 8 & -1439723094);

               for(int var19 = -var2; var19 < 0; ++var19) {
                  int var20 = field_490[var11];
                  if(var20 == 0) {
                     field_490[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & -1757562455) + ((var20 & 2111963282) * var17 >> 8 & 1242811916);
                     field_490[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }

      }
   }

   // $FF: renamed from: dd () void
   public static void method_662() {
      int var0 = 0;

      int var1;
      for(var1 = field_484 * field_486 - 7; var0 < var1; field_490[var0++] = 0) {
         field_490[var0++] = 0;
         field_490[var0++] = 0;
         field_490[var0++] = 0;
         field_490[var0++] = 0;
         field_490[var0++] = 0;
         field_490[var0++] = 0;
         field_490[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; field_490[var0++] = 0) {
         ;
      }

   }

   // $FF: renamed from: et (int[]) void
   public static void method_663(int[] var0) {
      var0[0] = field_489;
      var0[1] = field_487;
      var0[2] = field_488;
      var0[3] = field_485;
   }

   // $FF: renamed from: ec (int, int, int, int, int) void
   public static void method_664(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if(var3 == 0) {
         if(var2 >= 0) {
            method_726(var0, var1, var2 + 1, var4);
         } else {
            method_726(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if(var2 == 0) {
         if(var3 >= 0) {
            method_674(var0, var1, var3 + 1, var4);
         } else {
            method_674(var0, var1 + var3, -var3 + 1, var4);
         }

      } else {
         if(var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if(var2 > var3) {
            var1 <<= 16;
            var1 += '\u8000';
            var3 <<= 16;
            var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
            var2 += var0;
            if(var0 < field_489) {
               var1 += var5 * (field_489 - var0);
               var0 = field_489;
            }

            if(var2 >= field_488) {
               var2 = field_488 - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if(var6 >= field_487 && var6 < field_485) {
                  field_490[var0 + var6 * field_484] = var4;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += '\u8000';
            var2 <<= 16;
            var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
            var3 += var1;
            if(var1 < field_487) {
               var0 += var5 * (field_487 - var1);
               var1 = field_487;
            }

            if(var3 >= field_485) {
               var3 = field_485 - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if(var6 >= field_489 && var6 < field_488) {
                  field_490[var6 + var1 * field_484] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   // $FF: renamed from: dg (int, int, int, int, int, int) void
   public static void method_665(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var0 < field_489) {
         var2 -= field_489 - var0;
         var0 = field_489;
      }

      if(var1 < field_487) {
         var3 -= field_487 - var1;
         var1 = field_487;
      }

      if(var0 + var2 > field_488) {
         var2 = field_488 - var0;
      }

      if(var1 + var3 > field_485) {
         var3 = field_485 - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
      int var6 = 256 - var5;
      int var7 = field_484 - var2;
      int var8 = var0 + var1 * field_484;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = field_490[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & '\uff00') * var6 >> 8 & '\uff00');
            field_490[var8++] = var4 + var11;
         }

         var8 += var7;
      }

   }

   // $FF: renamed from: eu () void
   public static void method_666() {
      field_489 = 0;
      field_487 = 0;
      field_488 = field_484;
      field_485 = field_486;
   }

   // $FF: renamed from: ez () void
   public static void method_667() {
      field_489 = 0;
      field_487 = 0;
      field_488 = field_484;
      field_485 = field_486;
   }

   // $FF: renamed from: dn (int, int, int, int, int, int, int, int) void
   public static void method_668(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         if(var0 < field_489) {
            var2 -= field_489 - var0;
            var0 = field_489;
         }

         if(var1 < field_487) {
            var8 += (field_487 - var1) * var9;
            var3 -= field_487 - var1;
            var1 = field_487;
         }

         if(var0 + var2 > field_488) {
            var2 = field_488 - var0;
         }

         if(var1 + var3 > field_485) {
            var3 = field_485 - var1;
         }

         int var10 = field_484 - var2;
         int var11 = var0 + var1 * field_484;

         for(int var12 = -var3; var12 < 0; ++var12) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var6 * var13 + var7 * var14 & '\uff00') >>> 8;
            if(var15 == 0) {
               var11 += field_484;
               var8 += var9;
            } else {
               int var16 = ((var4 & 16711935) * var13 + (var5 & 16711935) * var14 & -16711936) + ((var4 & '\uff00') * var13 + (var5 & '\uff00') * var14 & 16711680) >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + ((var16 & '\uff00') * var15 >> 8 & '\uff00');

               for(int var19 = -var2; var19 < 0; ++var19) {
                  int var20 = field_490[var11];
                  if(var20 == 0) {
                     field_490[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + ((var20 & '\uff00') * var17 >> 8 & '\uff00');
                     field_490[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }

      }
   }

   // $FF: renamed from: dh (int, int, int, int, int, int, byte[], int, boolean) void
   public static void method_669(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if(var0 + var2 >= 0 && var1 + var3 >= 0) {
         if(var0 < field_484 && var1 < field_486) {
            int var9 = 0;
            int var10 = 0;
            if(var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if(var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if(var0 + var2 > field_484) {
               var2 = field_484 - var0;
            }

            if(var1 + var3 > field_486) {
               var3 = field_486 - var1;
            }

            int var11 = var6.length / var7;
            int var12 = field_484 - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if(var8 && (var13 != 255 || var14 != 255)) {
               var15 = (var1 + var10) * field_484 + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if(var6[var18 * var7 + var19] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = field_490[var15];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + ((var20 & '\uff00') * var21 + (var23 & '\uff00') * var22 & 16711680) >> 8;
                     field_490[var15++] = var24;
                  }

                  var15 += var12;
               }
            } else {
               var15 = (var1 + var10) * field_484 + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if(var6[var18 * var7 + var19] != 0) {
                        field_490[var15++] = var5;
                     } else {
                        field_490[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   // $FF: renamed from: dl (int, int, int, int, int) void
   public static void method_670(int var0, int var1, int var2, int var3, int var4) {
      method_726(var0, var1, var2, var4);
      method_726(var0, var1 + var3 - 1, var2, var4);
      method_674(var0, var1, var3, var4);
      method_674(var0 + var2 - 1, var1, var3, var4);
   }

   // $FF: renamed from: dq (int, int, int, int, int, int) void
   public static void method_671(int var0, int var1, int var2, int var3, int var4, int var5) {
      method_673(var0, var1, var2, var4, var5);
      method_673(var0, var1 + var3 - 1, var2, var4, var5);
      if(var3 >= 3) {
         method_675(var0, var1 + 1, var3 - 2, var4, var5);
         method_675(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   // $FF: renamed from: fy (int, int, int, int, int, int) void
   public static void method_672(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if(var0 < field_489) {
            var2 -= field_489 - var0;
            var0 = field_489;
         }

         if(var1 < field_487) {
            var6 += (field_487 - var1) * var7;
            var3 -= field_487 - var1;
            var1 = field_487;
         }

         if(var0 + var2 > field_488) {
            var2 = field_488 - var0;
         }

         if(var1 + var3 > field_485) {
            var3 = field_485 - var1;
         }

         int var8 = field_484 - var2;
         int var9 = var0 + var1 * field_484;

         for(int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & -1724838495) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & -668381178) >>> 8;

            for(int var14 = -var2; var14 < 0; ++var14) {
               field_490[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }

      }
   }

   // $FF: renamed from: dp (int, int, int, int, int) void
   static void method_673(int var0, int var1, int var2, int var3, int var4) {
      if(var1 >= field_487 && var1 < field_485) {
         if(var0 < field_489) {
            var2 -= field_489 - var0;
            var0 = field_489;
         }

         if(var0 + var2 > field_488) {
            var2 = field_488 - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * field_484;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (field_490[var12] >> 16 & 255) * var5;
            int var10 = (field_490[var12] >> 8 & 255) * var5;
            int var11 = (field_490[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            field_490[var12++] = var14;
         }

      }
   }

   // $FF: renamed from: dm (int, int, int, int) void
   public static void method_674(int var0, int var1, int var2, int var3) {
      if(var0 >= field_489 && var0 < field_488) {
         if(var1 < field_487) {
            var2 -= field_487 - var1;
            var1 = field_487;
         }

         if(var1 + var2 > field_485) {
            var2 = field_485 - var1;
         }

         int var4 = var0 + var1 * field_484;

         for(int var5 = 0; var5 < var2; ++var5) {
            field_490[var4 + var5 * field_484] = var3;
         }

      }
   }

   // $FF: renamed from: dw (int, int, int, int, int) void
   static void method_675(int var0, int var1, int var2, int var3, int var4) {
      if(var0 >= field_489 && var0 < field_488) {
         if(var1 < field_487) {
            var2 -= field_487 - var1;
            var1 = field_487;
         }

         if(var1 + var2 > field_485) {
            var2 = field_485 - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * field_484;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (field_490[var12] >> 16 & 255) * var5;
            int var10 = (field_490[var12] >> 8 & 255) * var5;
            int var11 = (field_490[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            field_490[var12] = var14;
            var12 += field_484;
         }

      }
   }

   // $FF: renamed from: ej (int, int, int, int) void
   public static void method_676(int var0, int var1, int var2, int var3) {
      if(var0 < 0) {
         var0 = 0;
      }

      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 > field_484) {
         var2 = field_484;
      }

      if(var3 > field_486) {
         var3 = field_486;
      }

      field_489 = var0;
      field_487 = var1;
      field_488 = var2;
      field_485 = var3;
   }

   // $FF: renamed from: dx (int, int, int, int, int) void
   public static void method_677(int var0, int var1, int var2, int var3, int var4) {
      if(var4 != 0) {
         if(var4 == 256) {
            method_680(var0, var1, var2, var3);
         } else {
            if(var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = (var3 & 255) * var4;
            int var12 = var1 - var2;
            if(var12 < field_487) {
               var12 = field_487;
            }

            int var13 = var1 + var2 + 1;
            if(var13 > field_485) {
               var13 = field_485;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if(var1 > var13) {
               var1 = var13;
            }

            int var9;
            int var10;
            int var11;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            while(var14 < var1) {
               while(var19 <= var15 || var18 <= var15) {
                  var18 += var16 + var16;
                  var19 += var16++ + var16;
               }

               var20 = var0 - var16 + 1;
               if(var20 < field_489) {
                  var20 = field_489;
               }

               var21 = var0 + var16;
               if(var21 > field_488) {
                  var21 = field_488;
               }

               var22 = var20 + var14 * field_484;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = (field_490[var22] >> 16 & 255) * var5;
                  var10 = (field_490[var22] >> 8 & 255) * var5;
                  var11 = (field_490[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  field_490[var22++] = var24;
               }

               ++var14;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var2;

            for(var19 -= var17; var14 < var13; var18 += var17++ + var17) {
               while(var19 > var15 && var18 > var15) {
                  var19 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               var20 = var0 - var16;
               if(var20 < field_489) {
                  var20 = field_489;
               }

               var21 = var0 + var16;
               if(var21 > field_488 - 1) {
                  var21 = field_488 - 1;
               }

               var22 = var20 + var14 * field_484;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = (field_490[var22] >> 16 & 255) * var5;
                  var10 = (field_490[var22] >> 8 & 255) * var5;
                  var11 = (field_490[var22] & 255) * var5;
                  var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  field_490[var22++] = var24;
               }

               ++var14;
               var19 += var17 + var17;
            }

         }
      }
   }

   // $FF: renamed from: gv (int, int, int, int) void
   public static void method_678(int var0, int var1, int var2, int var3) {
      if(var0 >= field_489 && var0 < field_488) {
         if(var1 < field_487) {
            var2 -= field_487 - var1;
            var1 = field_487;
         }

         if(var1 + var2 > field_485) {
            var2 = field_485 - var1;
         }

         int var4 = var0 + var1 * field_484;

         for(int var5 = 0; var5 < var2; ++var5) {
            field_490[var4 + var5 * field_484] = var3;
         }

      }
   }

   // $FF: renamed from: df (int, int, int, int) void
   public static void method_679(int var0, int var1, int var2, int var3) {
      if(field_489 < var0) {
         field_489 = var0;
      }

      if(field_487 < var1) {
         field_487 = var1;
      }

      if(field_488 > var2) {
         field_488 = var2;
      }

      if(field_485 > var3) {
         field_485 = var3;
      }

   }

   // $FF: renamed from: da (int, int, int, int) void
   static void method_680(int var0, int var1, int var2, int var3) {
      if(var2 == 0) {
         method_723(var0, var1, var3);
      } else {
         if(var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if(var4 < field_487) {
            var4 = field_487;
         }

         int var5 = var1 + var2 + 1;
         if(var5 > field_485) {
            var5 = field_485;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if(var1 > var5) {
            var1 = var5;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         while(var6 < var1) {
            while(var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            var12 = var0 - var8 + 1;
            if(var12 < field_489) {
               var12 = field_489;
            }

            var13 = var0 + var8;
            if(var13 > field_488) {
               var13 = field_488;
            }

            var14 = var12 + var6 * field_484;

            for(var15 = var12; var15 < var13; ++var15) {
               field_490[var14++] = var3;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if(var12 < field_489) {
               var12 = field_489;
            }

            var13 = var0 + var8;
            if(var13 > field_488 - 1) {
               var13 = field_488 - 1;
            }

            var14 = var12 + var6 * field_484;

            for(var15 = var12; var15 <= var13; ++var15) {
               field_490[var14++] = var3;
            }

            ++var6;
            var11 += var9 + var9;
         }

      }
   }

   // $FF: renamed from: du (int, int, int, int, int) void
   public static void method_681(int var0, int var1, int var2, int var3, int var4) {
      if(var0 < field_489) {
         var2 -= field_489 - var0;
         var0 = field_489;
      }

      if(var1 < field_487) {
         var3 -= field_487 - var1;
         var1 = field_487;
      }

      if(var0 + var2 > field_488) {
         var2 = field_488 - var0;
      }

      if(var1 + var3 > field_485) {
         var3 = field_485 - var1;
      }

      int var5 = field_484 - var2;
      int var6 = var0 + var1 * field_484;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            field_490[var6++] = var4;
         }

         var6 += var5;
      }

   }

   // $FF: renamed from: ed () void
   public static void method_682() {
      field_489 = 0;
      field_487 = 0;
      field_488 = field_484;
      field_485 = field_486;
   }

   // $FF: renamed from: <clinit> () void
   static void method_683() {
      field_487 = 0;
      field_485 = 0;
      field_489 = 0;
      field_488 = 0;
   }

   // $FF: renamed from: ex () void
   public static void method_684() {
      field_489 = 0;
      field_487 = 0;
      field_488 = field_484;
      field_485 = field_486;
   }

   // $FF: renamed from: ew (int, int, int, int) void
   public static void method_685(int var0, int var1, int var2, int var3) {
      if(var0 < 0) {
         var0 = 0;
      }

      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 > field_484) {
         var2 = field_484;
      }

      if(var3 > field_486) {
         var3 = field_486;
      }

      field_489 = var0;
      field_487 = var1;
      field_488 = var2;
      field_485 = var3;
   }

   // $FF: renamed from: er (int[]) void
   public static void method_686(int[] var0) {
      field_489 = var0[0];
      field_487 = var0[1];
      field_488 = var0[2];
      field_485 = var0[3];
   }

   // $FF: renamed from: el (int, int, int, int) void
   public static void method_687(int var0, int var1, int var2, int var3) {
      if(field_489 < var0) {
         field_489 = var0;
      }

      if(field_487 < var1) {
         field_487 = var1;
      }

      if(field_488 > var2) {
         field_488 = var2;
      }

      if(field_485 > var3) {
         field_485 = var3;
      }

   }

   // $FF: renamed from: ge (int, int, int, int[], int[]) void
   public static void method_688(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * field_484;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            field_490[var6++] = var2;
         }

         var5 += field_484;
      }

   }

   // $FF: renamed from: eb (int[]) void
   public static void method_689(int[] var0) {
      var0[0] = field_489;
      var0[1] = field_487;
      var0[2] = field_488;
      var0[3] = field_485;
   }

   // $FF: renamed from: dy (int[]) void
   public static void method_690(int[] var0) {
      field_489 = var0[0];
      field_487 = var0[1];
      field_488 = var0[2];
      field_485 = var0[3];
   }

   // $FF: renamed from: en (int[]) void
   public static void method_691(int[] var0) {
      field_489 = var0[0];
      field_487 = var0[1];
      field_488 = var0[2];
      field_485 = var0[3];
   }

   // $FF: renamed from: ef (int[]) void
   public static void method_692(int[] var0) {
      field_489 = var0[0];
      field_487 = var0[1];
      field_488 = var0[2];
      field_485 = var0[3];
   }

   // $FF: renamed from: em () void
   public static void method_693() {
      int var0 = 0;

      int var1;
      for(var1 = field_484 * field_486 - 7; var0 < var1; field_490[var0++] = 0) {
         field_490[var0++] = 0;
         field_490[var0++] = 0;
         field_490[var0++] = 0;
         field_490[var0++] = 0;
         field_490[var0++] = 0;
         field_490[var0++] = 0;
         field_490[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; field_490[var0++] = 0) {
         ;
      }

   }

   // $FF: renamed from: do (int, int, int, int) void
   public static void method_694(int var0, int var1, int var2, int var3) {
      if(var0 < 0) {
         var0 = 0;
      }

      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 > field_484) {
         var2 = field_484;
      }

      if(var3 > field_486) {
         var3 = field_486;
      }

      field_489 = var0;
      field_487 = var1;
      field_488 = var2;
      field_485 = var3;
   }

   // $FF: renamed from: ey (int, int, int, int) void
   static void method_695(int var0, int var1, int var2, int var3) {
      if(var2 == 0) {
         method_723(var0, var1, var3);
      } else {
         if(var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if(var4 < field_487) {
            var4 = field_487;
         }

         int var5 = var1 + var2 + 1;
         if(var5 > field_485) {
            var5 = field_485;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if(var1 > var5) {
            var1 = var5;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         while(var6 < var1) {
            while(var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            var12 = var0 - var8 + 1;
            if(var12 < field_489) {
               var12 = field_489;
            }

            var13 = var0 + var8;
            if(var13 > field_488) {
               var13 = field_488;
            }

            var14 = var12 + var6 * field_484;

            for(var15 = var12; var15 < var13; ++var15) {
               field_490[var14++] = var3;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if(var12 < field_489) {
               var12 = field_489;
            }

            var13 = var0 + var8;
            if(var13 > field_488 - 1) {
               var13 = field_488 - 1;
            }

            var14 = var12 + var6 * field_484;

            for(var15 = var12; var15 <= var13; ++var15) {
               field_490[var14++] = var3;
            }

            ++var6;
            var11 += var9 + var9;
         }

      }
   }

   // $FF: renamed from: ee (int, int, int, int) void
   static void method_696(int var0, int var1, int var2, int var3) {
      if(var2 == 0) {
         method_723(var0, var1, var3);
      } else {
         if(var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if(var4 < field_487) {
            var4 = field_487;
         }

         int var5 = var1 + var2 + 1;
         if(var5 > field_485) {
            var5 = field_485;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if(var1 > var5) {
            var1 = var5;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         while(var6 < var1) {
            while(var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            var12 = var0 - var8 + 1;
            if(var12 < field_489) {
               var12 = field_489;
            }

            var13 = var0 + var8;
            if(var13 > field_488) {
               var13 = field_488;
            }

            var14 = var12 + var6 * field_484;

            for(var15 = var12; var15 < var13; ++var15) {
               field_490[var14++] = var3;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if(var12 < field_489) {
               var12 = field_489;
            }

            var13 = var0 + var8;
            if(var13 > field_488 - 1) {
               var13 = field_488 - 1;
            }

            var14 = var12 + var6 * field_484;

            for(var15 = var12; var15 <= var13; ++var15) {
               field_490[var14++] = var3;
            }

            ++var6;
            var11 += var9 + var9;
         }

      }
   }

   // $FF: renamed from: eh (int, int, int, int) void
   static void method_697(int var0, int var1, int var2, int var3) {
      if(var2 == 0) {
         method_723(var0, var1, var3);
      } else {
         if(var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if(var4 < field_487) {
            var4 = field_487;
         }

         int var5 = var1 + var2 + 1;
         if(var5 > field_485) {
            var5 = field_485;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if(var1 > var5) {
            var1 = var5;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         while(var6 < var1) {
            while(var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            var12 = var0 - var8 + 1;
            if(var12 < field_489) {
               var12 = field_489;
            }

            var13 = var0 + var8;
            if(var13 > field_488) {
               var13 = field_488;
            }

            var14 = var12 + var6 * field_484;

            for(var15 = var12; var15 < var13; ++var15) {
               field_490[var14++] = var3;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if(var12 < field_489) {
               var12 = field_489;
            }

            var13 = var0 + var8;
            if(var13 > field_488 - 1) {
               var13 = field_488 - 1;
            }

            var14 = var12 + var6 * field_484;

            for(var15 = var12; var15 <= var13; ++var15) {
               field_490[var14++] = var3;
            }

            ++var6;
            var11 += var9 + var9;
         }

      }
   }

   // $FF: renamed from: ep () void
   public static void method_698() {
      field_489 = 0;
      field_487 = 0;
      field_488 = field_484;
      field_485 = field_486;
   }

   // $FF: renamed from: ev (int, int, int, int, int, int) void
   public static void method_699(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var0 < field_489) {
         var2 -= field_489 - var0;
         var0 = field_489;
      }

      if(var1 < field_487) {
         var3 -= field_487 - var1;
         var1 = field_487;
      }

      if(var0 + var2 > field_488) {
         var2 = field_488 - var0;
      }

      if(var1 + var3 > field_485) {
         var3 = field_485 - var1;
      }

      var4 = ((var4 & 584930603) * var5 >> 8 & 403828986) + ((var4 & '\uff00') * var5 >> 8 & -2024070884);
      int var6 = 256 - var5;
      int var7 = field_484 - var2;
      int var8 = var0 + var1 * field_484;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = field_490[var8];
            var11 = ((var11 & 884566867) * var6 >> 8 & -2010433119) + ((var11 & 1369134707) * var6 >> 8 & '\uff00');
            field_490[var8++] = var4 + var11;
         }

         var8 += var7;
      }

   }

   // $FF: renamed from: fb (int, int, int, int, int, int) void
   public static void method_700(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var0 < field_489) {
         var2 -= field_489 - var0;
         var0 = field_489;
      }

      if(var1 < field_487) {
         var3 -= field_487 - var1;
         var1 = field_487;
      }

      if(var0 + var2 > field_488) {
         var2 = field_488 - var0;
      }

      if(var1 + var3 > field_485) {
         var3 = field_485 - var1;
      }

      var4 = ((var4 & 1251186036) * var5 >> 8 & 16711935) + ((var4 & 1178162594) * var5 >> 8 & 697925383);
      int var6 = 2143782522 - var5;
      int var7 = field_484 - var2;
      int var8 = var0 + var1 * field_484;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = field_490[var8];
            var11 = ((var11 & -1142116789) * var6 >> 8 & 16711935) + ((var11 & 1928661648) * var6 >> 8 & -379342395);
            field_490[var8++] = var4 + var11;
         }

         var8 += var7;
      }

   }

   // $FF: renamed from: fo (int, int, int, int, int, int) void
   public static void method_701(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var0 < field_489) {
         var2 -= field_489 - var0;
         var0 = field_489;
      }

      if(var1 < field_487) {
         var3 -= field_487 - var1;
         var1 = field_487;
      }

      if(var0 + var2 > field_488) {
         var2 = field_488 - var0;
      }

      if(var1 + var3 > field_485) {
         var3 = field_485 - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
      int var6 = 256 - var5;
      int var7 = field_484 - var2;
      int var8 = var0 + var1 * field_484;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = field_490[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & '\uff00') * var6 >> 8 & '\uff00');
            field_490[var8++] = var4 + var11;
         }

         var8 += var7;
      }

   }

   // $FF: renamed from: fq (int, int, int, int, int) void
   public static void method_702(int var0, int var1, int var2, int var3, int var4) {
      if(var0 < field_489) {
         var2 -= field_489 - var0;
         var0 = field_489;
      }

      if(var1 < field_487) {
         var3 -= field_487 - var1;
         var1 = field_487;
      }

      if(var0 + var2 > field_488) {
         var2 = field_488 - var0;
      }

      if(var1 + var3 > field_485) {
         var3 = field_485 - var1;
      }

      int var5 = field_484 - var2;
      int var6 = var0 + var1 * field_484;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            field_490[var6++] = var4;
         }

         var6 += var5;
      }

   }

   // $FF: renamed from: ff (int, int, int, int, int) void
   public static void method_703(int var0, int var1, int var2, int var3, int var4) {
      if(var0 < field_489) {
         var2 -= field_489 - var0;
         var0 = field_489;
      }

      if(var1 < field_487) {
         var3 -= field_487 - var1;
         var1 = field_487;
      }

      if(var0 + var2 > field_488) {
         var2 = field_488 - var0;
      }

      if(var1 + var3 > field_485) {
         var3 = field_485 - var1;
      }

      int var5 = field_484 - var2;
      int var6 = var0 + var1 * field_484;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            field_490[var6++] = var4;
         }

         var6 += var5;
      }

   }

   // $FF: renamed from: fw (int, int, int, int, int) void
   public static void method_704(int var0, int var1, int var2, int var3, int var4) {
      if(var0 < field_489) {
         var2 -= field_489 - var0;
         var0 = field_489;
      }

      if(var1 < field_487) {
         var3 -= field_487 - var1;
         var1 = field_487;
      }

      if(var0 + var2 > field_488) {
         var2 = field_488 - var0;
      }

      if(var1 + var3 > field_485) {
         var3 = field_485 - var1;
      }

      int var5 = field_484 - var2;
      int var6 = var0 + var1 * field_484;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            field_490[var6++] = var4;
         }

         var6 += var5;
      }

   }

   // $FF: renamed from: fj (int, int, int, int, int) void
   public static void method_705(int var0, int var1, int var2, int var3, int var4) {
      if(var0 < field_489) {
         var2 -= field_489 - var0;
         var0 = field_489;
      }

      if(var1 < field_487) {
         var3 -= field_487 - var1;
         var1 = field_487;
      }

      if(var0 + var2 > field_488) {
         var2 = field_488 - var0;
      }

      if(var1 + var3 > field_485) {
         var3 = field_485 - var1;
      }

      int var5 = field_484 - var2;
      int var6 = var0 + var1 * field_484;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            field_490[var6++] = var4;
         }

         var6 += var5;
      }

   }

   // $FF: renamed from: fg (int, int, int, int, int, int) void
   public static void method_706(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if(var0 < field_489) {
            var2 -= field_489 - var0;
            var0 = field_489;
         }

         if(var1 < field_487) {
            var6 += (field_487 - var1) * var7;
            var3 -= field_487 - var1;
            var1 = field_487;
         }

         if(var0 + var2 > field_488) {
            var2 = field_488 - var0;
         }

         if(var1 + var3 > field_485) {
            var3 = field_485 - var1;
         }

         int var8 = field_484 - var2;
         int var9 = var0 + var1 * field_484;

         for(int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

            for(int var14 = -var2; var14 < 0; ++var14) {
               field_490[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }

      }
   }

   // $FF: renamed from: fi (int, int, int, int, int, int) void
   public static void method_707(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if(var0 < field_489) {
            var2 -= field_489 - var0;
            var0 = field_489;
         }

         if(var1 < field_487) {
            var6 += (field_487 - var1) * var7;
            var3 -= field_487 - var1;
            var1 = field_487;
         }

         if(var0 + var2 > field_488) {
            var2 = field_488 - var0;
         }

         if(var1 + var3 > field_485) {
            var3 = field_485 - var1;
         }

         int var8 = field_484 - var2;
         int var9 = var0 + var1 * field_484;

         for(int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

            for(int var14 = -var2; var14 < 0; ++var14) {
               field_490[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }

      }
   }

   // $FF: renamed from: ek (int, int, int, int[], int[]) void
   public static void method_708(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * field_484;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            field_490[var6++] = var2;
         }

         var5 += field_484;
      }

   }

   // $FF: renamed from: gz (int, int, int, int) void
   public static void method_709(int var0, int var1, int var2, int var3) {
      if(var0 >= field_489 && var0 < field_488) {
         if(var1 < field_487) {
            var2 -= field_487 - var1;
            var1 = field_487;
         }

         if(var1 + var2 > field_485) {
            var2 = field_485 - var1;
         }

         int var4 = var0 + var1 * field_484;

         for(int var5 = 0; var5 < var2; ++var5) {
            field_490[var4 + var5 * field_484] = var3;
         }

      }
   }

   // $FF: renamed from: dt (int, int, int, int, int, int) void
   public static void method_710(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if(var0 < field_489) {
            var2 -= field_489 - var0;
            var0 = field_489;
         }

         if(var1 < field_487) {
            var6 += (field_487 - var1) * var7;
            var3 -= field_487 - var1;
            var1 = field_487;
         }

         if(var0 + var2 > field_488) {
            var2 = field_488 - var0;
         }

         if(var1 + var3 > field_485) {
            var3 = field_485 - var1;
         }

         int var8 = field_484 - var2;
         int var9 = var0 + var1 * field_484;

         for(int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

            for(int var14 = -var2; var14 < 0; ++var14) {
               field_490[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }

      }
   }

   // $FF: renamed from: fu (int, int, int, int, int, int, byte[], int, boolean) void
   public static void method_711(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if(var0 + var2 >= 0 && var1 + var3 >= 0) {
         if(var0 < field_484 && var1 < field_486) {
            int var9 = 0;
            int var10 = 0;
            if(var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if(var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if(var0 + var2 > field_484) {
               var2 = field_484 - var0;
            }

            if(var1 + var3 > field_486) {
               var3 = field_486 - var1;
            }

            int var11 = var6.length / var7;
            int var12 = field_484 - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if(var8 && (var13 != 255 || var14 != 255)) {
               var15 = (var1 + var10) * field_484 + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if(var6[var18 * var7 + var19] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = field_490[var15];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + ((var20 & '\uff00') * var21 + (var23 & '\uff00') * var22 & 16711680) >> 8;
                     field_490[var15++] = var24;
                  }

                  var15 += var12;
               }
            } else {
               var15 = (var1 + var10) * field_484 + var0 + var9;

               for(var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if(var6[var18 * var7 + var19] != 0) {
                        field_490[var15++] = var5;
                     } else {
                        field_490[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   // $FF: renamed from: fh (int, int, int, int, int) void
   public static void method_712(int var0, int var1, int var2, int var3, int var4) {
      method_726(var0, var1, var2, var4);
      method_726(var0, var1 + var3 - 1, var2, var4);
      method_674(var0, var1, var3, var4);
      method_674(var0 + var2 - 1, var1, var3, var4);
   }

   // $FF: renamed from: fd (int, int, int, int, int, int) void
   public static void method_713(int var0, int var1, int var2, int var3, int var4, int var5) {
      method_673(var0, var1, var2, var4, var5);
      method_673(var0, var1 + var3 - 1, var2, var4, var5);
      if(var3 >= 3) {
         method_675(var0, var1 + 1, var3 - 2, var4, var5);
         method_675(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   // $FF: renamed from: fv (int, int, int, int, int, int) void
   public static void method_714(int var0, int var1, int var2, int var3, int var4, int var5) {
      method_673(var0, var1, var2, var4, var5);
      method_673(var0, var1 + var3 - 1, var2, var4, var5);
      if(var3 >= 3) {
         method_675(var0, var1 + 1, var3 - 2, var4, var5);
         method_675(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   // $FF: renamed from: fn (int, int, int, int, int, int) void
   public static void method_715(int var0, int var1, int var2, int var3, int var4, int var5) {
      method_673(var0, var1, var2, var4, var5);
      method_673(var0, var1 + var3 - 1, var2, var4, var5);
      if(var3 >= 3) {
         method_675(var0, var1 + 1, var3 - 2, var4, var5);
         method_675(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   // $FF: renamed from: fr (int, int, int, int) void
   public static void method_716(int var0, int var1, int var2, int var3) {
      if(var1 >= field_487 && var1 < field_485) {
         if(var0 < field_489) {
            var2 -= field_489 - var0;
            var0 = field_489;
         }

         if(var0 + var2 > field_488) {
            var2 = field_488 - var0;
         }

         int var4 = var0 + var1 * field_484;

         for(int var5 = 0; var5 < var2; ++var5) {
            field_490[var4 + var5] = var3;
         }

      }
   }

   // $FF: renamed from: fk (int, int, int, int) void
   public static void method_717(int var0, int var1, int var2, int var3) {
      if(var1 >= field_487 && var1 < field_485) {
         if(var0 < field_489) {
            var2 -= field_489 - var0;
            var0 = field_489;
         }

         if(var0 + var2 > field_488) {
            var2 = field_488 - var0;
         }

         int var4 = var0 + var1 * field_484;

         for(int var5 = 0; var5 < var2; ++var5) {
            field_490[var4 + var5] = var3;
         }

      }
   }

   // $FF: renamed from: gg (int, int, int, int) void
   public static void method_718(int var0, int var1, int var2, int var3) {
      if(var1 >= field_487 && var1 < field_485) {
         if(var0 < field_489) {
            var2 -= field_489 - var0;
            var0 = field_489;
         }

         if(var0 + var2 > field_488) {
            var2 = field_488 - var0;
         }

         int var4 = var0 + var1 * field_484;

         for(int var5 = 0; var5 < var2; ++var5) {
            field_490[var4 + var5] = var3;
         }

      }
   }

   // $FF: renamed from: gq (int, int, int, int) void
   public static void method_719(int var0, int var1, int var2, int var3) {
      if(var1 >= field_487 && var1 < field_485) {
         if(var0 < field_489) {
            var2 -= field_489 - var0;
            var0 = field_489;
         }

         if(var0 + var2 > field_488) {
            var2 = field_488 - var0;
         }

         int var4 = var0 + var1 * field_484;

         for(int var5 = 0; var5 < var2; ++var5) {
            field_490[var4 + var5] = var3;
         }

      }
   }

   // $FF: renamed from: gb (int, int, int, int) void
   public static void method_720(int var0, int var1, int var2, int var3) {
      if(var0 >= field_489 && var0 < field_488) {
         if(var1 < field_487) {
            var2 -= field_487 - var1;
            var1 = field_487;
         }

         if(var1 + var2 > field_485) {
            var2 = field_485 - var1;
         }

         int var4 = var0 + var1 * field_484;

         for(int var5 = 0; var5 < var2; ++var5) {
            field_490[var4 + var5 * field_484] = var3;
         }

      }
   }

   // $FF: renamed from: gi (int, int, int, int, int) void
   static void method_721(int var0, int var1, int var2, int var3, int var4) {
      if(var1 >= field_487 && var1 < field_485) {
         if(var0 < field_489) {
            var2 -= field_489 - var0;
            var0 = field_489;
         }

         if(var0 + var2 > field_488) {
            var2 = field_488 - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * field_484;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (field_490[var12] >> 16 & 255) * var5;
            int var10 = (field_490[var12] >> 8 & 255) * var5;
            int var11 = (field_490[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            field_490[var12++] = var14;
         }

      }
   }

   // $FF: renamed from: gw (int, int, int, int, int) void
   static void method_722(int var0, int var1, int var2, int var3, int var4) {
      if(var1 >= field_487 && var1 < field_485) {
         if(var0 < field_489) {
            var2 -= field_489 - var0;
            var0 = field_489;
         }

         if(var0 + var2 > field_488) {
            var2 = field_488 - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * field_484;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (field_490[var12] >> 16 & 255) * var5;
            int var10 = (field_490[var12] >> 8 & 255) * var5;
            int var11 = (field_490[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            field_490[var12++] = var14;
         }

      }
   }

   // $FF: renamed from: ea (int, int, int) void
   static void method_723(int var0, int var1, int var2) {
      if(var0 >= field_489 && var1 >= field_487 && var0 < field_488 && var1 < field_485) {
         field_490[var0 + var1 * field_484] = var2;
      }
   }

   // $FF: renamed from: gs (int, int, int, int) void
   public static void method_724(int var0, int var1, int var2, int var3) {
      if(var0 >= field_489 && var0 < field_488) {
         if(var1 < field_487) {
            var2 -= field_487 - var1;
            var1 = field_487;
         }

         if(var1 + var2 > field_485) {
            var2 = field_485 - var1;
         }

         int var4 = var0 + var1 * field_484;

         for(int var5 = 0; var5 < var2; ++var5) {
            field_490[var4 + var5 * field_484] = var3;
         }

      }
   }

   // $FF: renamed from: es () void
   public static void method_725() {
      int var0 = 0;

      int var1;
      for(var1 = field_484 * field_486 - 7; var0 < var1; field_490[var0++] = 0) {
         field_490[var0++] = 0;
         field_490[var0++] = 0;
         field_490[var0++] = 0;
         field_490[var0++] = 0;
         field_490[var0++] = 0;
         field_490[var0++] = 0;
         field_490[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; field_490[var0++] = 0) {
         ;
      }

   }

   // $FF: renamed from: de (int, int, int, int) void
   public static void method_726(int var0, int var1, int var2, int var3) {
      if(var1 >= field_487 && var1 < field_485) {
         if(var0 < field_489) {
            var2 -= field_489 - var0;
            var0 = field_489;
         }

         if(var0 + var2 > field_488) {
            var2 = field_488 - var0;
         }

         int var4 = var0 + var1 * field_484;

         for(int var5 = 0; var5 < var2; ++var5) {
            field_490[var4 + var5] = var3;
         }

      }
   }

   // $FF: renamed from: go (int, int, int, int, int) void
   static void method_727(int var0, int var1, int var2, int var3, int var4) {
      if(var0 >= field_489 && var0 < field_488) {
         if(var1 < field_487) {
            var2 -= field_487 - var1;
            var1 = field_487;
         }

         if(var1 + var2 > field_485) {
            var2 = field_485 - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = (var3 & 255) * var4;
         int var12 = var0 + var1 * field_484;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = (field_490[var12] >> 16 & 255) * var5;
            int var10 = (field_490[var12] >> 8 & 255) * var5;
            int var11 = (field_490[var12] & 255) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            field_490[var12] = var14;
            var12 += field_484;
         }

      }
   }

   // $FF: renamed from: gf (int, int, int, int, int) void
   public static void method_728(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if(var3 == 0) {
         if(var2 >= 0) {
            method_726(var0, var1, var2 + 1, var4);
         } else {
            method_726(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if(var2 == 0) {
         if(var3 >= 0) {
            method_674(var0, var1, var3 + 1, var4);
         } else {
            method_674(var0, var1 + var3, -var3 + 1, var4);
         }

      } else {
         if(var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if(var2 > var3) {
            var1 <<= 16;
            var1 += '\u8000';
            var3 <<= 16;
            var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
            var2 += var0;
            if(var0 < field_489) {
               var1 += var5 * (field_489 - var0);
               var0 = field_489;
            }

            if(var2 >= field_488) {
               var2 = field_488 - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if(var6 >= field_487 && var6 < field_485) {
                  field_490[var0 + var6 * field_484] = var4;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += 1360641811;
            var2 <<= 16;
            var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
            var3 += var1;
            if(var1 < field_487) {
               var0 += var5 * (field_487 - var1);
               var1 = field_487;
            }

            if(var3 >= field_485) {
               var3 = field_485 - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if(var6 >= field_489 && var6 < field_488) {
                  field_490[var6 + var1 * field_484] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   // $FF: renamed from: gu (int, int, int) void
   static void method_729(int var0, int var1, int var2) {
      if(var0 >= field_489 && var1 >= field_487 && var0 < field_488 && var1 < field_485) {
         field_490[var0 + var1 * field_484] = var2;
      }
   }

   // $FF: renamed from: gx (int, int, int) void
   static void method_730(int var0, int var1, int var2) {
      if(var0 >= field_489 && var1 >= field_487 && var0 < field_488 && var1 < field_485) {
         field_490[var0 + var1 * field_484] = var2;
      }
   }

   // $FF: renamed from: <init> () void
   protected void method_105() {
      super.method_105();
   }

   // $FF: renamed from: fm (int, int, int, int, int, int, int, int) void
   public static void method_731(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 714202136 / var3;
         if(var0 < field_489) {
            var2 -= field_489 - var0;
            var0 = field_489;
         }

         if(var1 < field_487) {
            var8 += (field_487 - var1) * var9;
            var3 -= field_487 - var1;
            var1 = field_487;
         }

         if(var0 + var2 > field_488) {
            var2 = field_488 - var0;
         }

         if(var1 + var3 > field_485) {
            var3 = field_485 - var1;
         }

         int var10 = field_484 - var2;
         int var11 = var0 + var1 * field_484;

         for(int var12 = -var3; var12 < 0; ++var12) {
            int var13 = 995425551 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var6 * var13 + var7 * var14 & -1681291173) >>> 8;
            if(var15 == 0) {
               var11 += field_484;
               var8 += var9;
            } else {
               int var16 = ((var4 & -1567805691) * var13 + (var5 & -1446795194) * var14 & -16711936) + ((var4 & -923988165) * var13 + (var5 & '\uff00') * var14 & 1960559699) >>> 8;
               int var17 = -280558158 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + ((var16 & '\uff00') * var15 >> 8 & '\uff00');

               for(int var19 = -var2; var19 < 0; ++var19) {
                  int var20 = field_490[var11];
                  if(var20 == 0) {
                     field_490[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & -1214742563) + ((var20 & 134421590) * var17 >> 8 & '\uff00');
                     field_490[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }

      }
   }
}
