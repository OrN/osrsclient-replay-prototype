
// $FF: renamed from: ek
public class class_192 extends class_191 {

   // $FF: renamed from: j int
   int field_2292;
   // $FF: renamed from: n int
   int field_2293;
   // $FF: renamed from: y long
   long field_2294;
   // $FF: renamed from: f int
   int field_2295;
   // $FF: renamed from: p int
   int field_2296;
   // $FF: renamed from: v long[]
   long[] field_2297;
   // $FF: renamed from: s df
   static class_194 field_2298;
   // $FF: renamed from: ap int
   static final int field_2299 = 29;
   // $FF: renamed from: b int[]
   public static int[] field_2300;


   // $FF: renamed from: j () void
   public void method_3955() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field_2297[var1] = 0L;
      }

   }

   // $FF: renamed from: n (int, int, int) int
   public int method_3951(int var1, int var2, int var3) {
      try {
         int var4 = this.field_2293 * 1403302325;
         int var5 = this.field_2295 * 892183401;
         this.field_2293 = 446998524;
         this.field_2295 = 2043223257;
         this.field_2294 = class_87.method_1516((byte)1) * 243217800344649603L;
         if(0L == this.field_2297[this.field_2292 * 652562423]) {
            this.field_2293 = var4 * -986352483;
            this.field_2295 = var5 * 2043223257;
         } else if(this.field_2294 * -3130930086544390357L > this.field_2297[this.field_2292 * 652562423]) {
            if(var3 >= -1708422900) {
               throw new IllegalStateException();
            }

            this.field_2293 = -986352483 * (int)((long)(var1 * 2560) / (this.field_2294 * -3130930086544390357L - this.field_2297[this.field_2292 * 652562423]));
         }

         if(this.field_2293 * 1403302325 < 25) {
            if(var3 >= -1708422900) {
               throw new IllegalStateException();
            }

            this.field_2293 = 1110991701;
         }

         if(1403302325 * this.field_2293 > 256) {
            if(var3 >= -1708422900) {
               throw new IllegalStateException();
            }

            this.field_2293 = 896834816;
            this.field_2295 = (int)((long)var1 - (-3130930086544390357L * this.field_2294 - this.field_2297[652562423 * this.field_2292]) / 10L) * 2043223257;
         }

         if(892183401 * this.field_2295 > var1) {
            if(var3 >= -1708422900) {
               throw new IllegalStateException();
            }

            this.field_2295 = var1 * 2043223257;
         }

         this.field_2297[this.field_2292 * 652562423] = -3130930086544390357L * this.field_2294;
         this.field_2292 = (1 + this.field_2292 * 652562423) % 10 * 856695239;
         if(892183401 * this.field_2295 > 1) {
            if(var3 >= -1708422900) {
               throw new IllegalStateException();
            }

            for(int var6 = 0; var6 < 10; ++var6) {
               if(0L != this.field_2297[var6]) {
                  if(var3 >= -1708422900) {
                     throw new IllegalStateException();
                  }

                  this.field_2297[var6] += (long)(892183401 * this.field_2295);
               }
            }
         }

         if(this.field_2295 * 892183401 < var2) {
            if(var3 >= -1708422900) {
               throw new IllegalStateException();
            }

            this.field_2295 = 2043223257 * var2;
         }

         long var15 = (long)(892183401 * this.field_2295);
         if(var15 <= 0L) {
            if(var3 >= -1708422900) {
               throw new IllegalStateException();
            }
         } else if(0L == var15 % 10L) {
            if(var3 >= -1708422900) {
               throw new IllegalStateException();
            }

            long var8 = var15 - 1L;

            try {
               Thread.sleep(var8);
            } catch (InterruptedException var13) {
               ;
            }

            try {
               Thread.sleep(1L);
            } catch (InterruptedException var12) {
               ;
            }
         } else {
            try {
               Thread.sleep(var15);
            } catch (InterruptedException var11) {
               ;
            }
         }

         int var16;
         for(var16 = 0; 543039723 * this.field_2296 < 256; this.field_2296 += this.field_2293 * 219729887) {
            ++var16;
         }

         this.field_2296 = (this.field_2296 * 543039723 & 255) * -359430205;
         return var16;
      } catch (RuntimeException var14) {
         throw class_223.method_4281(var14);
      }
   }

   // $FF: renamed from: <init> () void
   public class_192() {
      super();
      try {
         this.field_2297 = new long[10];
         this.field_2293 = 896834816;
         this.field_2295 = 2043223257;
         this.field_2296 = 0;
         this.field_2294 = class_87.method_1516((byte)1) * 243217800344649603L;

         for(int var1 = 0; var1 < 10; ++var1) {
            this.field_2297[var1] = this.field_2294 * -3130930086544390357L;
         }

      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: f (int, int) int
   public int method_3953(int var1, int var2) {
      int var3 = this.field_2293 * 1403302325;
      int var4 = this.field_2295 * 892183401;
      this.field_2293 = -1476297009;
      this.field_2295 = 2043223257;
      this.field_2294 = class_87.method_1516((byte)1) * 243217800344649603L;
      if(0L == this.field_2297[this.field_2292 * 652562423]) {
         this.field_2293 = var3 * -1210543309;
         this.field_2295 = var4 * -323029309;
      } else if(this.field_2294 * -3130930086544390357L > this.field_2297[this.field_2292 * 652562423]) {
         this.field_2293 = 330998549 * (int)((long)(var1 * 2560) / (this.field_2294 * -3130930086544390357L - this.field_2297[this.field_2292 * 1806488818]));
      }

      if(this.field_2293 * 1548683146 < 25) {
         this.field_2293 = 1110991701;
      }

      if(-1958290951 * this.field_2293 > -721288735) {
         this.field_2293 = 1046230259;
         this.field_2295 = (int)((long)var1 - (-3130930086544390357L * this.field_2294 - this.field_2297[-1832143483 * this.field_2292]) / 10L) * 704794753;
      }

      if(1384854293 * this.field_2295 > var1) {
         this.field_2295 = var1 * 2043223257;
      }

      this.field_2297[this.field_2292 * 652562423] = -3130930086544390357L * this.field_2294;
      this.field_2292 = (1 + this.field_2292 * -123422896) % 10 * -1068081606;
      if(143710162 * this.field_2295 > 1) {
         for(int var5 = 0; var5 < 10; ++var5) {
            if(0L != this.field_2297[var5]) {
               this.field_2297[var5] += (long)(1602477939 * this.field_2295);
            }
         }
      }

      if(this.field_2295 * 892183401 < var2) {
         this.field_2295 = 1206892030 * var2;
      }

      long var13 = (long)(-48212889 * this.field_2295);
      if(var13 > 0L) {
         if(0L == var13 % 10L) {
            long var7 = var13 - 1L;

            try {
               Thread.sleep(var7);
            } catch (InterruptedException var12) {
               ;
            }

            try {
               Thread.sleep(1L);
            } catch (InterruptedException var11) {
               ;
            }
         } else {
            try {
               Thread.sleep(var13);
            } catch (InterruptedException var10) {
               ;
            }
         }
      }

      int var14;
      for(var14 = 0; 543039723 * this.field_2296 < 256; this.field_2296 += this.field_2293 * 219729887) {
         ++var14;
      }

      this.field_2296 = (this.field_2296 * 841111237 & 471536455) * -1333456898;
      return var14;
   }

   // $FF: renamed from: y () void
   public void method_3952() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field_2297[var1] = 0L;
      }

   }

   // $FF: renamed from: v (int) void
   public void method_3950(int var1) {
      try {
         for(int var2 = 0; var2 < 10; ++var2) {
            if(var1 != -1887937791) {
               return;
            }

            this.field_2297[var2] = 0L;
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: e (int) void
   public static void method_3958() {
      try {
         class_223.field_2529 = null;
         class_284.field_3260 = null;
         class_403.field_4278 = null;
         class_318.field_3787 = null;
         field_2300 = null;
         class_403.field_4279 = (byte[][])null;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: is (int) int
   static final int method_3959() {
      try {
         return client.field_1554 * 673512273 - 1;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: fs (byte) void
   static void method_3960(byte var0) {
      try {
         int var25;
         if(0 == -1127540073 * client.field_1444) {
            if(var0 == 0) {
               throw new IllegalStateException();
            } else {
               class_251 var48 = new class_251(4, 104, 104, class_166.field_2078);
               class_206.field_2401 = var48;

               for(var25 = 0; var25 < 4; ++var25) {
                  class_240[] var49 = client.field_1475;
                  class_240 var10002 = new class_240(104, 104);
                  var49[var25] = var10002;
               }

               class_67 var50 = new class_67(512, 512);
               GameApplet.field_1410 = var50;
               class_177.loadProgressText = class_305.strStartEngine;
               class_177.field_2190 = 289621837;
               client.field_1444 = -931633396;
            }
         } else if(-1127540073 * client.field_1444 == 20) {
            if(var0 != 0) {
               class_177.loadProgressText = class_305.strLoadVisibilityMap;
               class_177.field_2190 = 579243674;
               client.field_1444 = -1397450094;
            }
         } else if(client.field_1444 * -1127540073 == 30) {
            if(var0 != 0) {
               class_314.field_3783 = class_373.method_6613(0, false, true, true, (byte)28);
               class_125.field_1360 = class_373.method_6613(1, false, true, true, (byte)-73);
               class_123.field_1348 = class_373.method_6613(2, true, false, true, (byte)-25);
               class_44.field_326 = class_373.method_6613(3, false, true, true, (byte)82);
               class_137.field_1762 = class_373.method_6613(4, false, true, true, (byte)-36);
               class_286.field_3275 = class_373.method_6613(5, true, true, true, (byte)94);
               class_194.field_2307 = class_373.method_6613(6, true, true, true, (byte)-13);
               class_148.field_1871 = class_373.method_6613(7, false, true, true, (byte)-69);
               class_311.field_3749 = class_373.method_6613(8, false, true, true, (byte)26);
               class_240.field_2680 = class_373.method_6613(9, false, true, true, (byte)21);
               class_157.field_1956 = class_373.method_6613(10, false, true, true, (byte)-3);
               class_221.field_2516 = class_373.method_6613(11, false, true, true, (byte)51);
               class_189.field_2275 = class_373.method_6613(12, false, true, true, (byte)-81);
               class_148.field_1869 = class_373.method_6613(13, true, false, true, (byte)-75);
               class_202.field_2368 = class_373.method_6613(14, false, true, true, (byte)-62);
               class_341.field_3894 = class_373.method_6613(15, false, true, true, (byte)64);
               class_123.field_1345 = class_373.method_6613(17, true, true, true, (byte)-64);
               class_373.field_4123 = class_373.method_6613(18, false, true, true, (byte)43);
               class_229.field_2573 = class_373.method_6613(19, false, true, true, (byte)53);
               class_54.field_406 = class_373.method_6613(20, false, true, true, (byte)38);
               class_177.loadProgressText = class_305.strConnectingUpdate;
               class_177.field_2190 = 1158487348;
               client.field_1444 = -1863266792;
            }
         } else if(40 == client.field_1444 * -1127540073) {
            if(var0 != 0) {
               byte var10001;
               label584: {
                  byte var35 = 0;
                  var25 = var35 + class_314.field_3783.method_5488((byte)53) * 4 / 100;
                  var25 += class_125.field_1360.method_5488((byte)110) * 4 / 100;
                  var25 += class_123.field_1348.method_5488((byte)92) * 2 / 100;
                  var25 += class_44.field_326.method_5488((byte)97) * 2 / 100;
                  var25 += class_137.field_1762.method_5488((byte)40) * 6 / 100;
                  var25 += class_286.field_3275.method_5488((byte)68) * 4 / 100;
                  var25 += class_194.field_2307.method_5488((byte)102) * 2 / 100;
                  var25 += class_148.field_1871.method_5488((byte)63) * 56 / 100;
                  var25 += class_311.field_3749.method_5488((byte)70) * 2 / 100;
                  var25 += class_240.field_2680.method_5488((byte)107) * 2 / 100;
                  var25 += class_157.field_1956.method_5488((byte)65) * 2 / 100;
                  var25 += class_221.field_2516.method_5488((byte)81) * 2 / 100;
                  var25 += class_189.field_2275.method_5488((byte)103) * 2 / 100;
                  var25 += class_148.field_1869.method_5488((byte)40) * 2 / 100;
                  var25 += class_202.field_2368.method_5488((byte)24) * 2 / 100;
                  var25 += class_341.field_3894.method_5488((byte)121) * 2 / 100;
                  var25 += class_229.field_2573.method_5488((byte)27) * 1 / 100;
                  var25 += class_373.field_4123.method_5488((byte)87) * 1 / 100;
                  var25 += class_54.field_406.method_5488((byte)85) * 1 / 100;
                  if(class_123.field_1345.method_5487()) {
                     if(var0 == 0) {
                        throw new IllegalStateException();
                     }

                     if(class_123.field_1345.method_5423(2118992751)) {
                        if(var0 == 0) {
                           throw new IllegalStateException();
                        }

                        var10001 = 1;
                        break label584;
                     }
                  }

                  var10001 = 0;
               }

               var25 += var10001;
               if(var25 != 100) {
                  if(var0 != 0) {
                     if(var25 != 0) {
                        class_177.loadProgressText = class_305.strCheckingUpdates + var25 + "%";
                     }

                     class_177.field_2190 = 1737731022;
                  }
               } else {
                  class_124.method_2278(class_314.field_3783);
                  class_124.method_2278(class_125.field_1360);
                  class_124.method_2278(class_137.field_1762);
                  class_124.method_2278(class_286.field_3275);
                  class_124.method_2278(class_194.field_2307);
                  class_124.method_2278(class_148.field_1871);
                  class_124.method_2278(class_311.field_3749);
                  class_124.method_2278(class_221.field_2516);
                  class_124.method_2278(class_202.field_2368);
                  class_124.method_2278(class_341.field_3894);
                  class_124.method_2278(class_229.field_2573);
                  class_124.method_2278(class_373.field_4123);
                  class_124.method_2278(class_54.field_406);
                  class_360 var47 = new class_360();
                  class_201.field_2360 = var47;
                  class_201.field_2360.method_6293(class_123.field_1345);
                  class_177.loadProgressText = class_305.strLoadedUpdateList;
                  class_177.field_2190 = 1737731022;
                  client.field_1444 = 51308507;
               }
            }
         } else if(-1127540073 * client.field_1444 == 45) {
            boolean var42;
            if(!client.field_1417) {
               if(var0 == 0) {
                  throw new IllegalStateException();
               }

               var42 = true;
            } else {
               var42 = false;
            }

            boolean var34 = var42;
            class_139.field_1793 = 810441610;
            class_139.field_1781 = var34;
            class_139.field_1783 = -1615649818;
            class_106 var43 = new class_106();
            class_106 var27 = var43;
            var27.method_2038(9, 128);
            class_362.field_4017 = class_213.method_4188(0, 22050, (byte)1);
            class_362.field_4017.method_2989(var27);
            class_234.method_4590(class_341.field_3894, class_202.field_2368, class_137.field_1762, var27);
            class_163.field_2034 = class_213.method_4188(1, 2048, (byte)1);
            class_108 var44 = new class_108();
            class_320.field_3804 = var44;
            class_163.field_2034.method_2989(class_320.field_3804);
            class_148 var45 = new class_148(22050, class_139.field_1793 * 1631160541);
            class_94.field_1025 = var45;
            class_177.loadProgressText = class_305.strPreparedSoundEngine;
            class_177.field_2190 = 2027352859;
            client.field_1444 = 1965883806;
            class_372 var46 = new class_372(class_311.field_3749, class_148.field_1869);
            class_149.field_1879 = var46;
         } else {
            int var2;
            if(client.field_1444 * -1127540073 == 50) {
               if(var0 == 0) {
                  throw new IllegalStateException();
               } else {
                  class_373[] var33 = new class_373[]{class_373.field_4124, class_373.field_4116, class_373.field_4119, class_373.field_4115, class_373.field_4118, class_373.field_4117};
                  var2 = var33.length;
                  class_372 var29 = class_149.field_1879;
                  class_373[] var36 = new class_373[]{class_373.field_4124, class_373.field_4116, class_373.field_4119, class_373.field_4115, class_373.field_4118, class_373.field_4117};
                  client.field_1532 = var29.method_6611(var36, -1349307579);
                  if(client.field_1532.size() < var2) {
                     class_177.loadProgressText = class_305.strLoadingFonts + client.field_1532.size() * 100 / var2 + "%";
                     class_177.field_2190 = -1977992600;
                  } else {
                     class_98.field_1136 = (class_69)client.field_1532.get(class_373.field_4116);
                     class_183.field_2251 = (class_69)client.field_1532.get(class_373.field_4124);
                     class_37.field_241 = (class_69)client.field_1532.get(class_373.field_4117);
                     class_114.field_1285 = client.field_1686.method_59((byte)-10);
                     class_177.loadProgressText = class_305.field_3423;
                     class_177.field_2190 = -1977992600;
                     client.field_1444 = 1500067108;
                  }
               }
            } else {
               int var4;
               int var5;
               class_307 var26;
               class_307 var28;
               if(60 == client.field_1444 * -1127540073) {
                  if(var0 == 0) {
                     throw new IllegalStateException();
                  } else {
                     var26 = class_157.field_1956;
                     var28 = class_311.field_3749;
                     var4 = 0;
                     if(var26.method_5403("title.jpg", "")) {
                        ++var4;
                     }

                     if(var28.method_5403("logo", "")) {
                        if(var0 == 0) {
                           return;
                        }

                        ++var4;
                     }

                     if(var28.method_5403("logo_deadman_mode", "")) {
                        if(var0 == 0) {
                           return;
                        }

                        ++var4;
                     }

                     if(var28.method_5403("logo_seasonal_mode", "")) {
                        if(var0 == 0) {
                           throw new IllegalStateException();
                        }

                        ++var4;
                     }

                     if(var28.method_5403("titlebox", "")) {
                        ++var4;
                     }

                     if(var28.method_5403("titlebutton", "")) {
                        if(var0 == 0) {
                           throw new IllegalStateException();
                        }

                        ++var4;
                     }

                     if(var28.method_5403("runes", "")) {
                        ++var4;
                     }

                     if(var28.method_5403("title_mute", "")) {
                        if(var0 == 0) {
                           throw new IllegalStateException();
                        }

                        ++var4;
                     }

                     if(var28.method_5403("options_radio_buttons,0", "")) {
                        if(var0 == 0) {
                           return;
                        }

                        ++var4;
                     }

                     if(var28.method_5403("options_radio_buttons,2", "")) {
                        if(var0 == 0) {
                           throw new IllegalStateException();
                        }

                        ++var4;
                     }

                     if(var28.method_5403("options_radio_buttons,4", "")) {
                        if(var0 == 0) {
                           return;
                        }

                        ++var4;
                     }

                     if(var28.method_5403("options_radio_buttons,6", "")) {
                        if(var0 == 0) {
                           throw new IllegalStateException();
                        }

                        ++var4;
                     }

                     var28.method_5403("sl_back", "");
                     var28.method_5403("sl_flags", "");
                     var28.method_5403("sl_arrows", "");
                     var28.method_5403("sl_stars", "");
                     var28.method_5403("sl_button", "");
                     var5 = class_206.method_4141();
                     if(var4 < var5) {
                        if(var0 != 0) {
                           class_177.loadProgressText = class_305.field_3501 + var4 * 100 / var5 + "%";
                           class_177.field_2190 = -1398748926;
                        }
                     } else {
                        class_177.loadProgressText = class_305.field_3425;
                        class_177.field_2190 = -1398748926;
                        class_53.method_579(5, (byte)0);
                        client.field_1444 = 1034250410;
                     }
                  }
               } else if(70 == -1127540073 * client.field_1444) {
                  if(var0 == 0) {
                     throw new IllegalStateException();
                  } else if(!class_123.field_1348.method_5423(2083167949)) {
                     if(var0 == 0) {
                        throw new IllegalStateException();
                     } else {
                        class_177.loadProgressText = class_305.field_3426 + class_123.field_1348.method_5494(-1371864603) + "%";
                        class_177.field_2190 = -819505252;
                     }
                  } else {
                     class_307 var32 = class_123.field_1348;
                     class_209.field_2421 = var32;
                     class_125.method_2284(class_123.field_1348);
                     class_175.method_3739(class_123.field_1348, class_148.field_1871);
                     var26 = class_123.field_1348;
                     var28 = class_148.field_1871;
                     boolean var30 = client.field_1417;
                     class_87.field_802 = var26;
                     class_327.field_3846 = var28;
                     class_87.field_806 = var30;
                     class_307 var31 = class_123.field_1348;
                     class_307 var6 = class_148.field_1871;
                     class_88.field_890 = var31;
                     class_88.field_878 = var6;
                     class_124.method_2281(class_123.field_1348);
                     class_307 var7 = class_123.field_1348;
                     class_307 var8 = class_148.field_1871;
                     boolean var9 = client.field_1416;
                     class_69 var10 = class_98.field_1136;
                     class_368.field_4096 = var7;
                     class_331.field_3859 = var8;
                     class_49.field_363 = var9;
                     class_80.field_701 = class_368.field_4096.method_5393(10) * 1504295717;
                     class_322.field_3809 = var10;
                     class_307 var11 = class_123.field_1348;
                     class_307 var12 = class_314.field_3783;
                     class_307 var13 = class_125.field_1360;
                     class_72.field_563 = var11;
                     class_72.field_579 = var12;
                     class_72.field_564 = var13;
                     class_118.method_2257(class_123.field_1348, class_148.field_1871);
                     class_184.method_3850(class_123.field_1348);
                     class_293.method_5303(class_123.field_1348);
                     class_307 var14 = class_44.field_326;
                     class_307 var15 = class_148.field_1871;
                     class_307 var16 = class_311.field_3749;
                     class_307 var17 = class_148.field_1869;
                     class_46.field_343 = var14;
                     class_61.field_480 = var15;
                     class_279.field_3227 = var16;
                     class_243.field_2697 = var17;
                     class_37.field_93 = new class_37[class_46.field_343.method_5457()][];
                     class_37.field_94 = new boolean[class_46.field_343.method_5457()];
                     class_162.method_3390(class_123.field_1348);
                     class_315.method_5603(class_123.field_1348);
                     class_203.method_4078(class_123.field_1348);
                     class_307 var18 = class_123.field_1348;
                     class_86.field_796 = var18;
                     class_259 var40 = new class_259(54, class_123.field_1348);
                     class_151.field_1912 = var40;
                     var40 = new class_259(47, class_123.field_1348);
                     class_255.field_2887 = var40;
                     class_190 var41 = new class_190();
                     class_151.field_1913 = var41;
                     class_307 var19 = class_123.field_1348;
                     class_307 var20 = class_311.field_3749;
                     class_307 var21 = class_148.field_1869;
                     class_76.field_625 = var19;
                     class_76.field_634 = var20;
                     class_76.field_633 = var21;
                     class_307 var22 = class_123.field_1348;
                     class_307 var23 = class_311.field_3749;
                     class_77.field_654 = var22;
                     class_77.field_661 = var23;
                     class_189.method_3898(class_123.field_1348, class_311.field_3749, -1243272557);
                     class_177.loadProgressText = class_305.field_3427;
                     class_177.field_2190 = -819505252;
                     client.field_1444 = 568433712;
                  }
               } else if(80 == -1127540073 * client.field_1444) {
                  var25 = 0;
                  if(null == class_88.field_891) {
                     if(var0 == 0) {
                        throw new IllegalStateException();
                     }

                     class_88.field_891 = class_266.method_5032(class_311.field_3749, class_201.field_2360.field_3997 * -1949566455, 0, (byte)14);
                  } else {
                     ++var25;
                  }

                  if(null == class_165.field_2067) {
                     if(var0 == 0) {
                        return;
                     }

                     class_165.field_2067 = class_266.method_5032(class_311.field_3749, class_201.field_2360.field_3995 * -1513831133, 0, (byte)68);
                  } else {
                     ++var25;
                  }

                  if(class_114.field_1284 == null) {
                     if(var0 == 0) {
                        throw new IllegalStateException();
                     }

                     class_114.field_1284 = class_212.method_4182(class_311.field_3749, class_201.field_2360.field_3994 * 791427789, 0);
                  } else {
                     ++var25;
                  }

                  if(null == class_138.field_1773) {
                     if(var0 == 0) {
                        return;
                     }

                     class_138.field_1773 = class_80.method_1338(class_311.field_3749, class_201.field_2360.field_4000 * -14842639, 0);
                  } else {
                     ++var25;
                  }

                  if(class_245.field_2718 == null) {
                     if(var0 == 0) {
                        throw new IllegalStateException();
                     }

                     class_245.field_2718 = class_80.method_1338(class_311.field_3749, class_201.field_2360.field_3998 * 765584361, 0);
                  } else {
                     ++var25;
                  }

                  if(null == class_40.field_270) {
                     if(var0 == 0) {
                        throw new IllegalStateException();
                     }

                     class_40.field_270 = class_80.method_1338(class_311.field_3749, class_201.field_2360.field_3999 * -1577822991, 0);
                  } else {
                     ++var25;
                  }

                  if(null == class_230.field_2576) {
                     if(var0 == 0) {
                        throw new IllegalStateException();
                     }

                     class_230.field_2576 = class_80.method_1338(class_311.field_3749, class_201.field_2360.field_4003 * -1223274063, 0);
                  } else {
                     ++var25;
                  }

                  if(class_169.field_2114 == null) {
                     if(var0 == 0) {
                        throw new IllegalStateException();
                     }

                     class_169.field_2114 = class_80.method_1338(class_311.field_3749, -1228774673 * class_201.field_2360.field_4001, 0);
                  } else {
                     ++var25;
                  }

                  if(class_222.field_2518 == null) {
                     if(var0 == 0) {
                        throw new IllegalStateException();
                     }

                     class_222.field_2518 = class_80.method_1338(class_311.field_3749, class_201.field_2360.field_4002 * -353348843, 0);
                  } else {
                     ++var25;
                  }

                  if(null == class_100.field_1151) {
                     if(var0 == 0) {
                        throw new IllegalStateException();
                     }

                     class_100.field_1151 = class_212.method_4182(class_311.field_3749, 1865970227 * class_201.field_2360.field_3996, 0);
                  } else {
                     ++var25;
                  }

                  if(class_223.field_2528 == null) {
                     class_223.field_2528 = class_212.method_4182(class_311.field_3749, class_201.field_2360.field_4004 * 1606283035, 0);
                  } else {
                     ++var25;
                  }

                  if(var25 < 11) {
                     if(var0 == 0) {
                        throw new IllegalStateException();
                     } else {
                        class_177.loadProgressText = class_305.field_3498 + var25 * 100 / 12 + "%";
                        class_177.field_2190 = -240261578;
                     }
                  } else {
                     class_68.field_527 = class_223.field_2528;
                     class_165.field_2067.method_759();
                     var2 = (int)(Math.random() * 21.0D) - 10;
                     int var3 = (int)(Math.random() * 21.0D) - 10;
                     var4 = (int)(Math.random() * 21.0D) - 10;
                     var5 = (int)(Math.random() * 41.0D) - 20;
                     class_114.field_1284[0].method_734(var2 + var5, var3 + var5, var5 + var4);
                     class_177.loadProgressText = class_305.strLoadingSprites;
                     class_177.field_2190 = -240261578;
                     client.field_1444 = 102617014;
                  }
               } else if(-1127540073 * client.field_1444 == 90) {
                  if(var0 == 0) {
                     throw new IllegalStateException();
                  } else if(!class_240.field_2680.method_5423(2078907090)) {
                     if(var0 == 0) {
                        throw new IllegalStateException();
                     } else {
                        class_177.loadProgressText = class_305.strLoadingTextures + "0%";
                        class_177.field_2190 = 918225770;
                     }
                  } else {
                     short var10006;
                     if(client.field_1417) {
                        if(var0 == 0) {
                           return;
                        }

                        var10006 = 64;
                     } else {
                        var10006 = 128;
                     }
                     class_245 var39 = new class_245(class_240.field_2680, class_311.field_3749, 20, class_87.field_852.field_2128, var10006);
                     class_149.field_1892 = var39;
                     class_70.method_1028(class_149.field_1892);
                     class_70.method_973(class_87.field_852.field_2128);
                     client.field_1444 = -363199684;
                  }
               } else if(-1127540073 * client.field_1444 == 100) {
                  if(var0 == 0) {
                     throw new IllegalStateException();
                  } else {
                     var25 = class_149.field_1892.method_4691(1596585605);
                     if(var25 < 100) {
                        class_177.loadProgressText = class_305.strLoadingTextures + var25 + "%";
                        class_177.field_2190 = 918225770;
                     } else {
                        class_177.loadProgressText = class_305.strLoadedTextures;
                        class_177.field_2190 = 918225770;
                        client.field_1444 = -829016382;
                     }
                  }
               } else if(-1127540073 * client.field_1444 == 110) {
                  class_163 var38 = new class_163();
                  class_289.field_3284 = var38;
                  client.field_1392.method_4058(class_289.field_3284, 10);
                  class_177.loadProgressText = class_305.field_3457;
                  class_177.field_2190 = 1893067964;
                  client.field_1444 = -1294833080;
               } else if(client.field_1444 * -1127540073 == 120) {
                  if(!class_157.field_1956.method_5403("huffman", "")) {
                     if(var0 == 0) {
                        throw new IllegalStateException();
                     } else {
                        class_177.loadProgressText = class_305.field_3525 + 0 + "%";
                        class_177.field_2190 = -1427057138;
                     }
                  } else {
                     class_276 var37 = new class_276(class_157.field_1956.method_5384("huffman", ""));
                     class_276 var1 = var37;
                     class_178.method_3801(var1);
                     class_177.loadProgressText = class_305.field_3429;
                     class_177.field_2190 = -1427057138;
                     client.field_1444 = -1760649778;
                  }
               } else if(client.field_1444 * -1127540073 == 130) {
                  if(var0 != 0) {
                     if(!class_44.field_326.method_5423(2083077757)) {
                        class_177.loadProgressText = class_305.field_3699 + class_44.field_326.method_5494(-1371864603) * 4 / 5 + "%";
                        class_177.field_2190 = -452214944;
                     } else if(!class_189.field_2275.method_5423(2142216639)) {
                        if(var0 == 0) {
                           throw new IllegalStateException();
                        } else {
                           class_177.loadProgressText = class_305.field_3699 + (80 + class_189.field_2275.method_5494(-1371864603) / 6) + "%";
                           class_177.field_2190 = -452214944;
                        }
                     } else if(!class_148.field_1869.method_5423(2052891340)) {
                        if(var0 == 0) {
                           throw new IllegalStateException();
                        } else {
                           class_177.loadProgressText = class_305.field_3699 + (96 + class_148.field_1869.method_5494(-1371864603) / 50) + "%";
                           class_177.field_2190 = -452214944;
                        }
                     } else {
                        class_177.loadProgressText = class_305.field_3421;
                        class_177.field_2190 = 522627250;
                        client.field_1444 = 2068500820;
                     }
                  }
               } else if(140 == client.field_1444 * -1127540073) {
                  if(var0 == 0) {
                     throw new IllegalStateException();
                  } else {
                     class_177.field_2190 = 1497469444;
                     if(!class_229.field_2573.method_5404(class_254.field_2874.field_2873)) {
                        class_177.loadProgressText = class_305.strLoadMap + class_229.field_2573.method_5410(class_254.field_2874.field_2873) / 10 + "%";
                     } else {
                        if(null == class_287.field_3278) {
                           if(var0 == 0) {
                              throw new IllegalStateException();
                           }

                           class_363 var10000 = new class_363();
                           class_287.field_3278 = var10000;
                           class_287.field_3278.method_6391(class_229.field_2573, class_373.field_4123, class_54.field_406, class_37.field_241, client.field_1532, class_114.field_1284, 1276633974);
                        }

                        class_177.loadProgressText = class_305.strLoadedMap;
                        client.field_1444 = 1602684122;
                     }
                  }
               } else if(client.field_1444 * -1127540073 == 150) {
                  if(var0 == 0) {
                     throw new IllegalStateException();
                  } else {
                     class_53.method_579(10, (byte)0);
                  }
               }
            }
         }
      } catch (RuntimeException var24) {
         throw class_223.method_4281(var24);
      }
   }

   // $FF: renamed from: p () void
   public void method_3954() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field_2297[var1] = 0L;
      }

   }
}
