
// $FF: renamed from: ie
public class class_39 extends class_27 {

   // $FF: renamed from: n byte[]
   byte[] field_259;
   // $FF: renamed from: v md
   class_364 field_260;


   // $FF: renamed from: l () void
   void method_456() {
      this.field_260 = null;
   }

   // $FF: renamed from: n () void
   void method_457() {
      if(this.field_260 == null) {
         class_364 var10001 = new class_364;
         var10001.method_6538(16);
         this.field_260 = var10001;
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var2[9] = 128;
         var1[9] = 128;
         class_285 var10000 = new class_285;
         var10000.method_5192(this.field_259);
         class_285 var4 = var10000;
         int var5 = var4.method_5196();

         int var6;
         for(var6 = 0; var6 < var5; ++var6) {
            var4.method_5197(var6);
            var4.method_5212(var6);
            var4.method_5224(var6);
         }

         while(true) {
            var6 = var4.method_5205();
            int var7 = var4.field_3263[var6];

            while(var4.field_3263[var6] == var7) {
               var4.method_5197(var6);
               int var8 = var4.method_5201(var6);
               if(var8 == 1) {
                  var4.method_5229();
                  var4.method_5224(var6);
                  if(var4.method_5220()) {
                     return;
                  }
                  break;
               }

               int var9 = var8 & 240;
               int var10;
               int var11;
               int var12;
               if(var9 == 176) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 127;
                  var12 = var8 >> 16 & 127;
                  if(var11 == 0) {
                     var1[var10] = (var1[var10] & -2080769) + (var12 << 14);
                  }

                  if(var11 == 32) {
                     var1[var10] = (var1[var10] & -16257) + (var12 << 7);
                  }
               }

               if(var9 == 192) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 127;
                  var2[var10] = var1[var10] + var11;
               }

               if(var9 == 144) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 127;
                  var12 = var8 >> 16 & 127;
                  if(var12 > 0) {
                     int var13 = var2[var10];
                     class_33 var14 = (class_33)this.field_260.method_6523((long)var13);
                     if(var14 == null) {
                        class_33 var15 = new class_33;
                        var15.method_392(new byte[128]);
                        var14 = var15;
                        this.field_260.method_6525(var14, (long)var13);
                     }

                     var14.field_59[var11] = 1;
                  }
               }

               var4.method_5212(var6);
               var4.method_5224(var6);
            }
         }
      }
   }

   // $FF: renamed from: <init> (nd) void
   void method_458(class_28 var1) {
      super.method_105();
      var1.field_15 = (var1.field_12.length - 3) * -1025691571;
      int var2 = var1.method_130(1013714359);
      int var3 = var1.method_132((byte)-16);
      int var4 = 14 + var2 * 10;
      var1.field_15 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;

      int var14;
      int var15;
      while(var13 < var2) {
         var14 = -1;

         while(true) {
            var15 = var1.method_130(-1321948397);
            if(var15 != var14) {
               ++var4;
            }

            var14 = var15 & 15;
            if(var15 == 7) {
               ++var13;
               break;
            }

            if(var15 == 23) {
               ++var5;
            } else if(var14 == 0) {
               ++var7;
            } else if(var14 == 1) {
               ++var8;
            } else if(var14 == 2) {
               ++var6;
            } else if(var14 == 3) {
               ++var9;
            } else if(var14 == 4) {
               ++var10;
            } else if(var14 == 5) {
               ++var11;
            } else {
               if(var14 != 6) {
                  throw new RuntimeException();
               }

               ++var12;
            }
         }
      }

      var4 += 5 * var5;
      var4 += 2 * (var7 + var8 + var6 + var9 + var11);
      var4 += var10 + var12;
      var13 = var1.field_15 * -442398587;
      var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

      for(var15 = 0; var15 < var14; ++var15) {
         var1.method_127(-1373196190);
      }

      var4 += var1.field_15 * -442398587 - var13;
      var15 = var1.field_15 * -442398587;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      int var22 = 0;
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28 = 0;

      int var29;
      for(var29 = 0; var29 < var6; ++var29) {
         var28 = var28 + var1.method_130(-1467557808) & 127;
         if(var28 != 0 && var28 != 32) {
            if(var28 == 1) {
               ++var16;
            } else if(var28 == 33) {
               ++var17;
            } else if(var28 == 7) {
               ++var18;
            } else if(var28 == 39) {
               ++var19;
            } else if(var28 == 10) {
               ++var20;
            } else if(var28 == 42) {
               ++var21;
            } else if(var28 == 99) {
               ++var22;
            } else if(var28 == 98) {
               ++var23;
            } else if(var28 == 101) {
               ++var24;
            } else if(var28 == 100) {
               ++var25;
            } else if(var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
               ++var27;
            } else {
               ++var26;
            }
         } else {
            ++var12;
         }
      }

      var29 = 0;
      int var30 = var1.field_15 * -442398587;
      var1.field_15 += var26 * -1025691571;
      int var31 = var1.field_15 * -442398587;
      var1.field_15 += var11 * -1025691571;
      int var32 = var1.field_15 * -442398587;
      var1.field_15 += var10 * -1025691571;
      int var33 = var1.field_15 * -442398587;
      var1.field_15 += var9 * -1025691571;
      int var34 = var1.field_15 * -442398587;
      var1.field_15 += var16 * -1025691571;
      int var35 = var1.field_15 * -442398587;
      var1.field_15 += var18 * -1025691571;
      int var36 = var1.field_15 * -442398587;
      var1.field_15 += var20 * -1025691571;
      int var37 = var1.field_15 * -442398587;
      var1.field_15 += (var7 + var8 + var11) * -1025691571;
      int var38 = var1.field_15 * -442398587;
      var1.field_15 += var7 * -1025691571;
      int var39 = var1.field_15 * -442398587;
      var1.field_15 += var27 * -1025691571;
      int var40 = var1.field_15 * -442398587;
      var1.field_15 += var8 * -1025691571;
      int var41 = var1.field_15 * -442398587;
      var1.field_15 += var17 * -1025691571;
      int var42 = var1.field_15 * -442398587;
      var1.field_15 += var19 * -1025691571;
      int var43 = var1.field_15 * -442398587;
      var1.field_15 += var21 * -1025691571;
      int var44 = var1.field_15 * -442398587;
      var1.field_15 += var12 * -1025691571;
      int var45 = var1.field_15 * -442398587;
      var1.field_15 += var9 * -1025691571;
      int var46 = var1.field_15 * -442398587;
      var1.field_15 += var22 * -1025691571;
      int var47 = var1.field_15 * -442398587;
      var1.field_15 += var23 * -1025691571;
      int var48 = var1.field_15 * -442398587;
      var1.field_15 += var24 * -1025691571;
      int var49 = var1.field_15 * -442398587;
      var1.field_15 += var25 * -1025691571;
      int var50 = var1.field_15 * -442398587;
      var1.field_15 += var5 * 1217892583;
      this.field_259 = new byte[var4];
      class_28 var10000 = new class_28;
      var10000.method_178(this.field_259);
      class_28 var51 = var10000;
      var51.method_116(1297377380, -1535038974);
      var51.method_116(6, 1579120212);
      var51.method_333(var2 > 1?1:0, 2034793367);
      var51.method_333(var2, 179991251);
      var51.method_333(var3, -101215510);
      var1.field_15 = var13 * -1025691571;
      int var52 = 0;
      int var53 = 0;
      int var54 = 0;
      int var55 = 0;
      int var56 = 0;
      int var57 = 0;
      int var58 = 0;
      int[] var59 = new int[128];
      var28 = 0;
      int var60 = 0;

      while(var60 < var2) {
         var51.method_116(1297379947, 2055368197);
         var51.field_15 += 192201012;
         int var61 = var51.field_15 * -442398587;
         int var62 = -1;

         while(true) {
            int var63 = var1.method_127(-381161360);
            var51.method_129(var63, 2054772644);
            int var64 = var1.field_12[var29++] & 255;
            boolean var65 = var64 != var62;
            var62 = var64 & 15;
            if(var64 == 7) {
               if(var65) {
                  var51.method_210(255, 303066737);
               }

               var51.method_210(47, 303066737);
               var51.method_210(0, 303066737);
               var51.method_125(var51.field_15 * -442398587 - var61, -665940595);
               ++var60;
               break;
            }

            if(var64 == 23) {
               if(var65) {
                  var51.method_210(255, 303066737);
               }

               var51.method_210(81, 303066737);
               var51.method_210(3, 303066737);
               var51.method_210(var1.field_12[var50++], 303066737);
               var51.method_210(var1.field_12[var50++], 303066737);
               var51.method_210(var1.field_12[var50++], 303066737);
            } else {
               var52 ^= var64 >> 4;
               if(var62 == 0) {
                  if(var65) {
                     var51.method_210(144 + var52, 303066737);
                  }

                  var53 += var1.field_12[var37++];
                  var54 += var1.field_12[var38++];
                  var51.method_210(var53 & 127, 303066737);
                  var51.method_210(var54 & 127, 303066737);
               } else if(var62 == 1) {
                  if(var65) {
                     var51.method_210(128 + var52, 303066737);
                  }

                  var53 += var1.field_12[var37++];
                  var55 += var1.field_12[var40++];
                  var51.method_210(var53 & 127, 303066737);
                  var51.method_210(var55 & 127, 303066737);
               } else if(var62 == 2) {
                  if(var65) {
                     var51.method_210(176 + var52, 303066737);
                  }

                  var28 = var28 + var1.field_12[var15++] & 127;
                  var51.method_210(var28, 303066737);
                  byte var66;
                  if(var28 != 0 && var28 != 32) {
                     if(var28 == 1) {
                        var66 = var1.field_12[var34++];
                     } else if(var28 == 33) {
                        var66 = var1.field_12[var41++];
                     } else if(var28 == 7) {
                        var66 = var1.field_12[var35++];
                     } else if(var28 == 39) {
                        var66 = var1.field_12[var42++];
                     } else if(var28 == 10) {
                        var66 = var1.field_12[var36++];
                     } else if(var28 == 42) {
                        var66 = var1.field_12[var43++];
                     } else if(var28 == 99) {
                        var66 = var1.field_12[var46++];
                     } else if(var28 == 98) {
                        var66 = var1.field_12[var47++];
                     } else if(var28 == 101) {
                        var66 = var1.field_12[var48++];
                     } else if(var28 == 100) {
                        var66 = var1.field_12[var49++];
                     } else if(var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
                        var66 = var1.field_12[var39++];
                     } else {
                        var66 = var1.field_12[var30++];
                     }
                  } else {
                     var66 = var1.field_12[var44++];
                  }

                  int var67 = var66 + var59[var28];
                  var59[var28] = var67;
                  var51.method_210(var67 & 127, 303066737);
               } else if(var62 == 3) {
                  if(var65) {
                     var51.method_210(224 + var52, 303066737);
                  }

                  var56 += var1.field_12[var45++];
                  var56 += var1.field_12[var33++] << 7;
                  var51.method_210(var56 & 127, 303066737);
                  var51.method_210(var56 >> 7 & 127, 303066737);
               } else if(var62 == 4) {
                  if(var65) {
                     var51.method_210(208 + var52, 303066737);
                  }

                  var57 += var1.field_12[var32++];
                  var51.method_210(var57 & 127, 303066737);
               } else if(var62 == 5) {
                  if(var65) {
                     var51.method_210(160 + var52, 303066737);
                  }

                  var53 += var1.field_12[var37++];
                  var58 += var1.field_12[var31++];
                  var51.method_210(var53 & 127, 303066737);
                  var51.method_210(var58 & 127, 303066737);
               } else {
                  if(var62 != 6) {
                     throw new RuntimeException();
                  }

                  if(var65) {
                     var51.method_210(192 + var52, 303066737);
                  }

                  var51.method_210(var1.field_12[var44++], 303066737);
               }
            }
         }
      }

   }

   // $FF: renamed from: f () void
   void method_459() {
      this.field_260 = null;
   }

   // $FF: renamed from: p (jv, int, int) ie
   public static class_39 method_460(class_306 var0, int var1, int var2) {
      byte[] var3 = var0.method_5381(var1, var2, -26460885);
      if(var3 == null) {
         return null;
      } else {
         class_39 var10000 = new class_39;
         class_28 var10002 = new class_28;
         var10002.method_178(var3);
         var10000.method_458(var10002);
         return var10000;
      }
   }

   // $FF: renamed from: y (jv, int, int) ie
   public static class_39 method_461(class_306 var0, int var1, int var2) {
      byte[] var3 = var0.method_5381(var1, var2, -26460885);
      if(var3 == null) {
         return null;
      } else {
         class_39 var10000 = new class_39;
         class_28 var10002 = new class_28;
         var10002.method_178(var3);
         var10000.method_458(var10002);
         return var10000;
      }
   }

   // $FF: renamed from: j (jv, int, int) ie
   public static class_39 method_462(class_306 var0, int var1, int var2) {
      byte[] var3 = var0.method_5381(var1, var2, -26460885);
      if(var3 == null) {
         return null;
      } else {
         class_39 var10000 = new class_39;
         class_28 var10002 = new class_28;
         var10002.method_178(var3);
         var10000.method_458(var10002);
         return var10000;
      }
   }

   // $FF: renamed from: r (jv, int, int) ie
   public static class_39 method_463(class_306 var0, int var1, int var2) {
      byte[] var3 = var0.method_5381(var1, var2, -26460885);
      if(var3 == null) {
         return null;
      } else {
         class_39 var10000 = new class_39;
         class_28 var10002 = new class_28;
         var10002.method_178(var3);
         var10000.method_458(var10002);
         return var10000;
      }
   }

   // $FF: renamed from: b () void
   void method_464() {
      if(this.field_260 == null) {
         class_364 var10001 = new class_364;
         var10001.method_6538(16);
         this.field_260 = var10001;
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var2[9] = 128;
         var1[9] = 128;
         class_285 var10000 = new class_285;
         var10000.method_5192(this.field_259);
         class_285 var4 = var10000;
         int var5 = var4.method_5196();

         int var6;
         for(var6 = 0; var6 < var5; ++var6) {
            var4.method_5197(var6);
            var4.method_5212(var6);
            var4.method_5224(var6);
         }

         while(true) {
            var6 = var4.method_5205();
            int var7 = var4.field_3263[var6];

            while(var4.field_3263[var6] == var7) {
               var4.method_5197(var6);
               int var8 = var4.method_5201(var6);
               if(var8 == 1) {
                  var4.method_5229();
                  var4.method_5224(var6);
                  if(var4.method_5220()) {
                     return;
                  }
                  break;
               }

               int var9 = var8 & 240;
               int var10;
               int var11;
               int var12;
               if(var9 == 176) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 127;
                  var12 = var8 >> 16 & 127;
                  if(var11 == 0) {
                     var1[var10] = (var1[var10] & -2080769) + (var12 << 14);
                  }

                  if(var11 == 32) {
                     var1[var10] = (var1[var10] & -16257) + (var12 << 7);
                  }
               }

               if(var9 == 192) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 127;
                  var2[var10] = var1[var10] + var11;
               }

               if(var9 == 144) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 127;
                  var12 = var8 >> 16 & 127;
                  if(var12 > 0) {
                     int var13 = var2[var10];
                     class_33 var14 = (class_33)this.field_260.method_6523((long)var13);
                     if(var14 == null) {
                        class_33 var15 = new class_33;
                        var15.method_392(new byte[128]);
                        var14 = var15;
                        this.field_260.method_6525(var14, (long)var13);
                     }

                     var14.field_59[var11] = 1;
                  }
               }

               var4.method_5212(var6);
               var4.method_5224(var6);
            }
         }
      }
   }

   // $FF: renamed from: d () void
   void method_465() {
      if(this.field_260 == null) {
         class_364 var10001 = new class_364;
         var10001.method_6538(16);
         this.field_260 = var10001;
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var2[9] = 128;
         var1[9] = 128;
         class_285 var10000 = new class_285;
         var10000.method_5192(this.field_259);
         class_285 var4 = var10000;
         int var5 = var4.method_5196();

         int var6;
         for(var6 = 0; var6 < var5; ++var6) {
            var4.method_5197(var6);
            var4.method_5212(var6);
            var4.method_5224(var6);
         }

         while(true) {
            var6 = var4.method_5205();
            int var7 = var4.field_3263[var6];

            while(var4.field_3263[var6] == var7) {
               var4.method_5197(var6);
               int var8 = var4.method_5201(var6);
               if(var8 == 1) {
                  var4.method_5229();
                  var4.method_5224(var6);
                  if(var4.method_5220()) {
                     return;
                  }
                  break;
               }

               int var9 = var8 & 240;
               int var10;
               int var11;
               int var12;
               if(var9 == 176) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 127;
                  var12 = var8 >> 16 & 127;
                  if(var11 == 0) {
                     var1[var10] = (var1[var10] & -2080769) + (var12 << 14);
                  }

                  if(var11 == 32) {
                     var1[var10] = (var1[var10] & -16257) + (var12 << 7);
                  }
               }

               if(var9 == 192) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 127;
                  var2[var10] = var1[var10] + var11;
               }

               if(var9 == 144) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 127;
                  var12 = var8 >> 16 & 127;
                  if(var12 > 0) {
                     int var13 = var2[var10];
                     class_33 var14 = (class_33)this.field_260.method_6523((long)var13);
                     if(var14 == null) {
                        class_33 var15 = new class_33;
                        var15.method_392(new byte[128]);
                        var14 = var15;
                        this.field_260.method_6525(var14, (long)var13);
                     }

                     var14.field_59[var11] = 1;
                  }
               }

               var4.method_5212(var6);
               var4.method_5224(var6);
            }
         }
      }
   }

   // $FF: renamed from: s () void
   void method_466() {
      if(this.field_260 == null) {
         class_364 var10001 = new class_364;
         var10001.method_6538(16);
         this.field_260 = var10001;
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var2[9] = 128;
         var1[9] = 145425403;
         class_285 var10000 = new class_285;
         var10000.method_5192(this.field_259);
         class_285 var4 = var10000;
         int var5 = var4.method_5196();

         int var6;
         for(var6 = 0; var6 < var5; ++var6) {
            var4.method_5197(var6);
            var4.method_5212(var6);
            var4.method_5224(var6);
         }

         while(true) {
            var6 = var4.method_5205();
            int var7 = var4.field_3263[var6];

            while(var4.field_3263[var6] == var7) {
               var4.method_5197(var6);
               int var8 = var4.method_5201(var6);
               if(var8 == 1) {
                  var4.method_5229();
                  var4.method_5224(var6);
                  if(var4.method_5220()) {
                     return;
                  }
                  break;
               }

               int var9 = var8 & -769690304;
               int var10;
               int var11;
               int var12;
               if(var9 == -328456648) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 2083423664;
                  var12 = var8 >> 16 & 127;
                  if(var11 == 0) {
                     var1[var10] = (var1[var10] & -2080769) + (var12 << 14);
                  }

                  if(var11 == -1372941466) {
                     var1[var10] = (var1[var10] & 1059045807) + (var12 << 7);
                  }
               }

               if(var9 == -634064380) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 942553774;
                  var2[var10] = var1[var10] + var11;
               }

               if(var9 == 144) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & -1827672112;
                  var12 = var8 >> 16 & 127;
                  if(var12 > 0) {
                     int var13 = var2[var10];
                     class_33 var14 = (class_33)this.field_260.method_6523((long)var13);
                     if(var14 == null) {
                        class_33 var15 = new class_33;
                        var15.method_392(new byte[128]);
                        var14 = var15;
                        this.field_260.method_6525(var14, (long)var13);
                     }

                     var14.field_59[var11] = 1;
                  }
               }

               var4.method_5212(var6);
               var4.method_5224(var6);
            }
         }
      }
   }

   // $FF: renamed from: u () void
   void method_467() {
      if(this.field_260 == null) {
         class_364 var10001 = new class_364;
         var10001.method_6538(16);
         this.field_260 = var10001;
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var2[9] = 128;
         var1[9] = 128;
         class_285 var10000 = new class_285;
         var10000.method_5192(this.field_259);
         class_285 var4 = var10000;
         int var5 = var4.method_5196();

         int var6;
         for(var6 = 0; var6 < var5; ++var6) {
            var4.method_5197(var6);
            var4.method_5212(var6);
            var4.method_5224(var6);
         }

         while(true) {
            var6 = var4.method_5205();
            int var7 = var4.field_3263[var6];

            while(var4.field_3263[var6] == var7) {
               var4.method_5197(var6);
               int var8 = var4.method_5201(var6);
               if(var8 == 1) {
                  var4.method_5229();
                  var4.method_5224(var6);
                  if(var4.method_5220()) {
                     return;
                  }
                  break;
               }

               int var9 = var8 & 240;
               int var10;
               int var11;
               int var12;
               if(var9 == 176) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 127;
                  var12 = var8 >> 16 & 127;
                  if(var11 == 0) {
                     var1[var10] = (var1[var10] & -2080769) + (var12 << 14);
                  }

                  if(var11 == 32) {
                     var1[var10] = (var1[var10] & -16257) + (var12 << 7);
                  }
               }

               if(var9 == 192) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 127;
                  var2[var10] = var1[var10] + var11;
               }

               if(var9 == 144) {
                  var10 = var8 & 15;
                  var11 = var8 >> 8 & 127;
                  var12 = var8 >> 16 & 127;
                  if(var12 > 0) {
                     int var13 = var2[var10];
                     class_33 var14 = (class_33)this.field_260.method_6523((long)var13);
                     if(var14 == null) {
                        class_33 var15 = new class_33;
                        var15.method_392(new byte[128]);
                        var14 = var15;
                        this.field_260.method_6525(var14, (long)var13);
                     }

                     var14.field_59[var11] = 1;
                  }
               }

               var4.method_5212(var6);
               var4.method_5224(var6);
            }
         }
      }
   }

   // $FF: renamed from: v (jv, int, int) ie
   public static class_39 method_468(class_306 var0, int var1, int var2) {
      byte[] var3 = var0.method_5381(var1, var2, -26460885);
      if(var3 == null) {
         return null;
      } else {
         class_39 var10000 = new class_39;
         class_28 var10002 = new class_28;
         var10002.method_178(var3);
         var10000.method_458(var10002);
         return var10000;
      }
   }

   // $FF: renamed from: o () void
   void method_469() {
      this.field_260 = null;
   }
}
