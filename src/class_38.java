
// $FF: renamed from: in
public class class_38 extends class_27 {

   // $FF: renamed from: j hk[]
   class_262[] field_250;
   // $FF: renamed from: n au[]
   class_110[] field_251;
   // $FF: renamed from: f short[]
   short[] field_252;
   // $FF: renamed from: y byte[]
   byte[] field_253;
   // $FF: renamed from: p byte[]
   byte[] field_254;
   // $FF: renamed from: v int
   int field_255;
   // $FF: renamed from: r byte[]
   byte[] field_256;
   // $FF: renamed from: b int[]
   int[] field_257;
   // $FF: renamed from: qo boolean
   static boolean field_258;


   // $FF: renamed from: p (jv, int) in
   static class_38 method_444(class_306 var0, int var1) {
      byte[] var2 = var0.method_5388(var1, (byte)-61);
      if(var2 == null) {
         return null;
      } else {
         class_38 var10000 = new class_38;
         var10000.method_451(var2);
         return var10000;
      }
   }

   // $FF: renamed from: n (bu, byte[], int[], int) boolean
   boolean method_445(class_157 var1, byte[] var2, int[] var3, int var4) {
      try {
         boolean var5 = true;
         int var6 = 0;
         class_110 var7 = null;

         for(int var8 = 0; var8 < 128; ++var8) {
            if(var4 != 122660467) {
               throw new IllegalStateException();
            }

            if(null != var2) {
               if(var4 != 122660467) {
                  throw new IllegalStateException();
               }

               if(0 == var2[var8]) {
                  continue;
               }

               if(var4 != 122660467) {
                  throw new IllegalStateException();
               }
            }

            int var9 = this.field_257[var8];
            if(0 == var9) {
               if(var4 != 122660467) {
                  throw new IllegalStateException();
               }
            } else {
               if(var6 != var9) {
                  if(var4 != 122660467) {
                     throw new IllegalStateException();
                  }

                  var6 = var9--;
                  if((var9 & 1) == 0) {
                     if(var4 != 122660467) {
                        throw new IllegalStateException();
                     }

                     var7 = var1.method_3281(var9 >> 2, var3, (byte)36);
                  } else {
                     var7 = var1.method_3284(var9 >> 2, var3, 2094009970);
                  }

                  if(null == var7) {
                     if(var4 != 122660467) {
                        throw new IllegalStateException();
                     }

                     var5 = false;
                  }
               }

               if(var7 != null) {
                  if(var4 != 122660467) {
                     throw new IllegalStateException();
                  }

                  this.field_251[var8] = var7;
                  this.field_257[var8] = 0;
               }
            }
         }

         return var5;
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10, "in.n(" + ')');
      }
   }

   // $FF: renamed from: f (int) void
   void method_446(int var1) {
      try {
         this.field_257 = null;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "in.f(" + ')');
      }
   }

   // $FF: renamed from: y (jv, int) in
   static class_38 method_447(class_306 var0, int var1) {
      byte[] var2 = var0.method_5388(var1, (byte)-32);
      if(var2 == null) {
         return null;
      } else {
         class_38 var10000 = new class_38;
         var10000.method_451(var2);
         return var10000;
      }
   }

   // $FF: renamed from: b () void
   void method_448() {
      this.field_257 = null;
   }

   // $FF: renamed from: f (nd, int) java.lang.String
   public static String method_449(class_28 var0, int var1) {
      try {
         return class_271.method_5058(var0, 32767, (byte)25);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "in.f(" + ')');
      }
   }

   // $FF: renamed from: r (bu, byte[], int[]) boolean
   boolean method_450(class_157 var1, byte[] var2, int[] var3) {
      boolean var4 = true;
      int var5 = 0;
      class_110 var6 = null;

      for(int var7 = 0; var7 < 128; ++var7) {
         if(null == var2 || 0 != var2[var7]) {
            int var8 = this.field_257[var7];
            if(0 != var8) {
               if(var5 != var8) {
                  var5 = var8--;
                  if((var8 & 1) == 0) {
                     var6 = var1.method_3281(var8 >> 2, var3, (byte)67);
                  } else {
                     var6 = var1.method_3284(var8 >> 2, var3, 1975868592);
                  }

                  if(null == var6) {
                     var4 = false;
                  }
               }

               if(var6 != null) {
                  this.field_251[var7] = var6;
                  this.field_257[var7] = 0;
               }
            }
         }
      }

      return var4;
   }

   // $FF: renamed from: <init> (byte[]) void
   void method_451(byte[] var1) {
      try {
         super.method_105();
         this.field_251 = new class_110[128];
         this.field_252 = new short[128];
         this.field_253 = new byte[128];
         this.field_254 = new byte[128];
         this.field_250 = new class_262[128];
         this.field_256 = new byte[128];
         this.field_257 = new int[128];
         class_28 var10000 = new class_28;
         var10000.method_178(var1);
         class_28 var2 = var10000;

         int var3;
         for(var3 = 0; var2.field_12[var2.field_15 * -442398587 + var3] != 0; ++var3) {
            ;
         }

         byte[] var4 = new byte[var3];

         int var5;
         for(var5 = 0; var5 < var3; ++var5) {
            var4[var5] = var2.method_131((byte)-11);
         }

         var2.field_15 += -1025691571;
         ++var3;
         var5 = var2.field_15 * -442398587;
         var2.field_15 += -1025691571 * var3;

         int var6;
         for(var6 = 0; var2.field_12[-442398587 * var2.field_15 + var6] != 0; ++var6) {
            ;
         }

         byte[] var7 = new byte[var6];

         int var8;
         for(var8 = 0; var8 < var6; ++var8) {
            var7[var8] = var2.method_131((byte)-97);
         }

         var2.field_15 += -1025691571;
         ++var6;
         var8 = var2.field_15 * -442398587;
         var2.field_15 += -1025691571 * var6;

         int var9;
         for(var9 = 0; 0 != var2.field_12[var9 + var2.field_15 * -442398587]; ++var9) {
            ;
         }

         byte[] var10 = new byte[var9];

         for(int var11 = 0; var11 < var9; ++var11) {
            var10[var11] = var2.method_131((byte)-1);
         }

         var2.field_15 += -1025691571;
         ++var9;
         byte[] var39 = new byte[var9];
         int var12;
         int var14;
         if(var9 > 1) {
            var39[1] = 1;
            int var13 = 1;
            var12 = 2;

            for(var14 = 2; var14 < var9; ++var14) {
               int var15 = var2.method_130(755914209);
               if(var15 == 0) {
                  var13 = var12++;
               } else {
                  if(var15 <= var13) {
                     --var15;
                  }

                  var13 = var15;
               }

               var39[var14] = (byte)var13;
            }
         } else {
            var12 = var9;
         }

         class_262[] var40 = new class_262[var12];

         class_262 var41;
         for(var14 = 0; var14 < var40.length; ++var14) {
            class_262 var10002 = new class_262;
            var10002.method_4993();
            var41 = var40[var14] = var10002;
            int var16 = var2.method_130(811306751);
            if(var16 > 0) {
               var41.field_2930 = new byte[var16 * 2];
            }

            var16 = var2.method_130(-1695637968);
            if(var16 > 0) {
               var41.field_2921 = new byte[2 * var16 + 2];
               var41.field_2921[1] = 64;
            }
         }

         var14 = var2.method_130(-1409599266);
         byte[] var42 = var14 > 0?new byte[var14 * 2]:null;
         var14 = var2.method_130(-1254513385);
         byte[] var43 = var14 > 0?new byte[var14 * 2]:null;

         int var17;
         for(var17 = 0; var2.field_12[var17 + -442398587 * var2.field_15] != 0; ++var17) {
            ;
         }

         byte[] var18 = new byte[var17];

         int var19;
         for(var19 = 0; var19 < var17; ++var19) {
            var18[var19] = var2.method_131((byte)-22);
         }

         var2.field_15 += -1025691571;
         ++var17;
         var19 = 0;

         int var20;
         for(var20 = 0; var20 < 128; ++var20) {
            var19 += var2.method_130(974512696);
            this.field_252[var20] = (short)var19;
         }

         var19 = 0;

         for(var20 = 0; var20 < 128; ++var20) {
            var19 += var2.method_130(474879151);
            this.field_252[var20] = (short)(this.field_252[var20] + (var19 << 8));
         }

         var20 = 0;
         int var21 = 0;
         int var22 = 0;

         int var23;
         for(var23 = 0; var23 < 128; ++var23) {
            if(var20 == 0) {
               if(var21 < var18.length) {
                  var20 = var18[var21++];
               } else {
                  var20 = -1;
               }

               var22 = var2.method_127(-314490322);
            }

            this.field_252[var23] = (short)(this.field_252[var23] + ((var22 - 1 & 2) << 14));
            this.field_257[var23] = var22;
            --var20;
         }

         var20 = 0;
         var21 = 0;
         var23 = 0;

         int var24;
         for(var24 = 0; var24 < 128; ++var24) {
            if(this.field_257[var24] != 0) {
               if(0 == var20) {
                  if(var21 < var4.length) {
                     var20 = var4[var21++];
                  } else {
                     var20 = -1;
                  }

                  var23 = var2.field_12[var5++] - 1;
               }

               this.field_256[var24] = (byte)var23;
               --var20;
            }
         }

         var20 = 0;
         var21 = 0;
         var24 = 0;

         for(int var25 = 0; var25 < 128; ++var25) {
            if(0 != this.field_257[var25]) {
               if(0 == var20) {
                  if(var21 < var7.length) {
                     var20 = var7[var21++];
                  } else {
                     var20 = -1;
                  }

                  var24 = var2.field_12[var8++] + 16 << 2;
               }

               this.field_254[var25] = (byte)var24;
               --var20;
            }
         }

         var20 = 0;
         var21 = 0;
         class_262 var45 = null;

         int var26;
         for(var26 = 0; var26 < 128; ++var26) {
            if(0 != this.field_257[var26]) {
               if(var20 == 0) {
                  var45 = var40[var39[var21]];
                  if(var21 < var10.length) {
                     var20 = var10[var21++];
                  } else {
                     var20 = -1;
                  }
               }

               this.field_250[var26] = var45;
               --var20;
            }
         }

         var20 = 0;
         var21 = 0;
         var26 = 0;

         int var27;
         for(var27 = 0; var27 < 128; ++var27) {
            if(var20 == 0) {
               if(var21 < var18.length) {
                  var20 = var18[var21++];
               } else {
                  var20 = -1;
               }

               if(this.field_257[var27] > 0) {
                  var26 = var2.method_130(-615367441) + 1;
               }
            }

            this.field_253[var27] = (byte)var26;
            --var20;
         }

         this.field_255 = (var2.method_130(-715403590) + 1) * -952738171;

         class_262 var28;
         int var29;
         for(var27 = 0; var27 < var12; ++var27) {
            var28 = var40[var27];
            if(var28.field_2930 != null) {
               for(var29 = 1; var29 < var28.field_2930.length; var29 += 2) {
                  var28.field_2930[var29] = var2.method_131((byte)-68);
               }
            }

            if(var28.field_2921 != null) {
               for(var29 = 3; var29 < var28.field_2921.length - 2; var29 += 2) {
                  var28.field_2921[var29] = var2.method_131((byte)-96);
               }
            }
         }

         if(var42 != null) {
            for(var27 = 1; var27 < var42.length; var27 += 2) {
               var42[var27] = var2.method_131((byte)-36);
            }
         }

         if(null != var43) {
            for(var27 = 1; var27 < var43.length; var27 += 2) {
               var43[var27] = var2.method_131((byte)-77);
            }
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var28 = var40[var27];
            if(var28.field_2921 != null) {
               var19 = 0;

               for(var29 = 2; var29 < var28.field_2921.length; var29 += 2) {
                  var19 = 1 + var19 + var2.method_130(-1691118883);
                  var28.field_2921[var29] = (byte)var19;
               }
            }
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var28 = var40[var27];
            if(var28.field_2930 != null) {
               var19 = 0;

               for(var29 = 2; var29 < var28.field_2930.length; var29 += 2) {
                  var19 = 1 + var19 + var2.method_130(937204349);
                  var28.field_2930[var29] = (byte)var19;
               }
            }
         }

         byte var30;
         int var32;
         int var33;
         int var34;
         int var35;
         int var36;
         int var48;
         byte var50;
         if(var42 != null) {
            var19 = var2.method_130(459485217);
            var42[0] = (byte)var19;

            for(var27 = 2; var27 < var42.length; var27 += 2) {
               var19 = 1 + var19 + var2.method_130(181919621);
               var42[var27] = (byte)var19;
            }

            var50 = var42[0];
            byte var46 = var42[1];

            for(var29 = 0; var29 < var50; ++var29) {
               this.field_253[var29] = (byte)(this.field_253[var29] * var46 + 32 >> 6);
            }

            for(var29 = 2; var29 < var42.length; var29 += 2) {
               var30 = var42[var29];
               byte var31 = var42[var29 + 1];
               var32 = (var30 - var50) / 2 + var46 * (var30 - var50);

               for(var33 = var50; var33 < var30; ++var33) {
                  var35 = var30 - var50;
                  var36 = var32 >>> 31;
                  var34 = (var32 + var36) / var35 - var36;
                  this.field_253[var33] = (byte)(32 + this.field_253[var33] * var34 >> 6);
                  var32 += var31 - var46;
               }

               var50 = var30;
               var46 = var31;
            }

            for(var48 = var50; var48 < 128; ++var48) {
               this.field_253[var48] = (byte)(var46 * this.field_253[var48] + 32 >> 6);
            }

            var41 = null;
         }

         if(var43 != null) {
            var19 = var2.method_130(-2017189266);
            var43[0] = (byte)var19;

            for(var27 = 2; var27 < var43.length; var27 += 2) {
               var19 = 1 + var19 + var2.method_130(1685405055);
               var43[var27] = (byte)var19;
            }

            var50 = var43[0];
            int var47 = var43[1] << 1;

            for(var29 = 0; var29 < var50; ++var29) {
               var48 = (this.field_254[var29] & 255) + var47;
               if(var48 < 0) {
                  var48 = 0;
               }

               if(var48 > 128) {
                  var48 = 128;
               }

               this.field_254[var29] = (byte)var48;
            }

            int var49;
            for(var29 = 2; var29 < var43.length; var29 += 2) {
               var30 = var43[var29];
               var49 = var43[1 + var29] << 1;
               var32 = var47 * (var30 - var50) + (var30 - var50) / 2;

               for(var33 = var50; var33 < var30; ++var33) {
                  var35 = var30 - var50;
                  var36 = var32 >>> 31;
                  var34 = (var32 + var36) / var35 - var36;
                  int var37 = (this.field_254[var33] & 255) + var34;
                  if(var37 < 0) {
                     var37 = 0;
                  }

                  if(var37 > 128) {
                     var37 = 128;
                  }

                  this.field_254[var33] = (byte)var37;
                  var32 += var49 - var47;
               }

               var50 = var30;
               var47 = var49;
            }

            for(var48 = var50; var48 < 128; ++var48) {
               var49 = var47 + (this.field_254[var48] & 255);
               if(var49 < 0) {
                  var49 = 0;
               }

               if(var49 > 128) {
                  var49 = 128;
               }

               this.field_254[var48] = (byte)var49;
            }

            Object var44 = null;
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var40[var27].field_2920 = var2.method_130(830578011) * 128145333;
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var28 = var40[var27];
            if(null != var28.field_2930) {
               var28.field_2926 = var2.method_130(-1328623357) * -303334999;
            }

            if(var28.field_2921 != null) {
               var28.field_2924 = var2.method_130(-1610787912) * -1926238117;
            }

            if(var28.field_2920 * -1176756579 > 0) {
               var28.field_2925 = var2.method_130(-1322191512) * -766722877;
            }
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var40[var27].field_2922 = var2.method_130(-1383590443) * -106685089;
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var28 = var40[var27];
            if(-75268449 * var28.field_2922 > 0) {
               var28.field_2927 = var2.method_130(402805646) * -1647703353;
            }
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var28 = var40[var27];
            if(1263113975 * var28.field_2927 > 0) {
               var28.field_2928 = var2.method_130(1478755546) * -681495535;
            }
         }

      } catch (RuntimeException var38) {
         throw class_223.method_4281(var38, "in.<init>(" + ')');
      }
   }

   // $FF: renamed from: d () void
   void method_452() {
      this.field_257 = null;
   }

   // $FF: renamed from: s () void
   void method_453() {
      this.field_257 = null;
   }

   // $FF: renamed from: u () void
   void method_454() {
      this.field_257 = null;
   }

   // $FF: renamed from: j (bu, byte[], int[]) boolean
   boolean method_455(class_157 var1, byte[] var2, int[] var3) {
      boolean var4 = true;
      int var5 = 0;
      class_110 var6 = null;

      for(int var7 = 0; var7 < 914919783; ++var7) {
         if(null == var2 || 0 != var2[var7]) {
            int var8 = this.field_257[var7];
            if(0 != var8) {
               if(var5 != var8) {
                  var5 = var8--;
                  if((var8 & 1) == 0) {
                     var6 = var1.method_3281(var8 >> 2, var3, (byte)34);
                  } else {
                     var6 = var1.method_3284(var8 >> 2, var3, 2013077754);
                  }

                  if(null == var6) {
                     var4 = false;
                  }
               }

               if(var6 != null) {
                  this.field_251[var7] = var6;
                  this.field_257[var7] = 0;
               }
            }
         }
      }

      return var4;
   }
}
