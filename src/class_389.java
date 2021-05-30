
// $FF: renamed from: nt
public final class class_389 {

   // $FF: renamed from: p int
   static final int field_4233 = 1;
   // $FF: renamed from: f int
   static final int field_4234 = 23;
   // $FF: renamed from: v int
   static final int field_4235 = 4096;
   // $FF: renamed from: y int
   static final int field_4236 = 0;
   // $FF: renamed from: b nh
   static class_378 field_4237;
   // $FF: renamed from: n int
   static final int field_4238 = 16;
   // $FF: renamed from: r int
   static final int field_4239 = 50;
   // $FF: renamed from: j int
   static final int field_4240 = 6;


   // $FF: renamed from: t (int, nh) int
   static int method_6740(int var0, class_378 var1) {
      while(var1.field_4176 * -1723069525 < var0) {
         var1.field_4175 = (var1.field_4175 * -492240629 << 8 | var1.field_4172[var1.field_4167 * 1851391215] & 255) * -955333981;
         var1.field_4176 += 225753112;
         var1.field_4167 += 1860481551;
         var1.field_4168 += -375883429;
         if(var1.field_4168 * -1612509485 == 0) {
            ;
         }
      }

      int var2 = var1.field_4175 * -492240629 >> var1.field_4176 * -1723069525 - var0 & (1 << var0) - 1;
      var1.field_4176 -= var0 * 1101960963;
      return var2;
   }

   // $FF: renamed from: n (nh) void
   static void method_6741(class_378 var0) {
      byte var2 = var0.field_4173;
      int var3 = var0.field_4184 * -1772899085;
      int var4 = var0.field_4182 * -985271003;
      int var5 = var0.field_4180 * -2146251751;
      int[] var6 = class_386.field_4225;
      int var7 = var0.field_4195 * -1768365777;
      byte[] var8 = var0.field_4169;
      int var9 = var0.field_4170 * -1856584985;
      int var10 = var0.field_4179 * -795709793;
      int var12 = var0.field_4174 * 375128139 + 1;

      label105:
      while(true) {
         if(var3 > 0) {
            while(true) {
               if(var10 == 0) {
                  break label105;
               }

               if(var3 == 1) {
                  if(var10 == 0) {
                     var3 = 1;
                     break label105;
                  }

                  var8[var9] = var2;
                  ++var9;
                  --var10;
                  break;
               }

               var8[var9] = var2;
               --var3;
               ++var9;
               --var10;
            }
         }

         while(var4 != var12) {
            var2 = (byte)var5;
            var7 = var6[var7];
            byte var1 = (byte)var7;
            var7 >>= 8;
            ++var4;
            if(var1 != var5) {
               var5 = var1;
               if(var10 == 0) {
                  var3 = 1;
                  break label105;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            } else {
               if(var4 != var12) {
                  var3 = 2;
                  var7 = var6[var7];
                  var1 = (byte)var7;
                  var7 >>= 8;
                  ++var4;
                  if(var4 != var12) {
                     if(var1 != var5) {
                        var5 = var1;
                     } else {
                        var3 = 3;
                        var7 = var6[var7];
                        var1 = (byte)var7;
                        var7 >>= 8;
                        ++var4;
                        if(var4 != var12) {
                           if(var1 != var5) {
                              var5 = var1;
                           } else {
                              var7 = var6[var7];
                              var1 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                              var3 = (var1 & 255) + 4;
                              var7 = var6[var7];
                              var5 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                           }
                        }
                     }
                  }
                  continue label105;
               }

               if(var10 == 0) {
                  var3 = 1;
                  break label105;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.field_4177 * -743824809;
      var0.field_4177 += (var10 - var10) * 741206375;
      if(var0.field_4177 * -743824809 < var13) {
         ;
      }

      var0.field_4173 = var2;
      var0.field_4184 = var3 * 49841211;
      var0.field_4182 = var4 * 1515396781;
      var0.field_4180 = var5 * 630313001;
      class_386.field_4225 = var6;
      var0.field_4195 = var7 * 180618703;
      var0.field_4169 = var8;
      var0.field_4170 = var9 * 1808871639;
      var0.field_4179 = var10 * 1667837279;
   }

   // $FF: renamed from: l (nh) void
   static void method_6742(class_378 var0) {
      byte var2 = var0.field_4173;
      int var3 = var0.field_4184 * -1035302762;
      int var4 = var0.field_4182 * 136798131;
      int var5 = var0.field_4180 * -1727711553;
      int[] var6 = class_386.field_4225;
      int var7 = var0.field_4195 * -1768365777;
      byte[] var8 = var0.field_4169;
      int var9 = var0.field_4170 * -214353055;
      int var10 = var0.field_4179 * 508052909;
      int var12 = var0.field_4174 * 2089045403 + 1;

      label105:
      while(true) {
         if(var3 > 0) {
            while(true) {
               if(var10 == 0) {
                  break label105;
               }

               if(var3 == 1) {
                  if(var10 == 0) {
                     var3 = 1;
                     break label105;
                  }

                  var8[var9] = var2;
                  ++var9;
                  --var10;
                  break;
               }

               var8[var9] = var2;
               --var3;
               ++var9;
               --var10;
            }
         }

         while(var4 != var12) {
            var2 = (byte)var5;
            var7 = var6[var7];
            byte var1 = (byte)var7;
            var7 >>= 8;
            ++var4;
            if(var1 != var5) {
               var5 = var1;
               if(var10 == 0) {
                  var3 = 1;
                  break label105;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            } else {
               if(var4 != var12) {
                  var3 = 2;
                  var7 = var6[var7];
                  var1 = (byte)var7;
                  var7 >>= 8;
                  ++var4;
                  if(var4 != var12) {
                     if(var1 != var5) {
                        var5 = var1;
                     } else {
                        var3 = 3;
                        var7 = var6[var7];
                        var1 = (byte)var7;
                        var7 >>= 8;
                        ++var4;
                        if(var4 != var12) {
                           if(var1 != var5) {
                              var5 = var1;
                           } else {
                              var7 = var6[var7];
                              var1 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                              var3 = (var1 & 255) + 4;
                              var7 = var6[var7];
                              var5 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                           }
                        }
                     }
                  }
                  continue label105;
               }

               if(var10 == 0) {
                  var3 = 1;
                  break label105;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.field_4177 * -448272017;
      var0.field_4177 += (var10 - var10) * 1113281585;
      if(var0.field_4177 * -743824809 < var13) {
         ;
      }

      var0.field_4173 = var2;
      var0.field_4184 = var3 * 49841211;
      var0.field_4182 = var4 * 1566682959;
      var0.field_4180 = var5 * 884977441;
      class_386.field_4225 = var6;
      var0.field_4195 = var7 * 180618703;
      var0.field_4169 = var8;
      var0.field_4170 = var9 * 1808871639;
      var0.field_4179 = var10 * 71310676;
   }

   // $FF: renamed from: f (nh) void
   static void method_6743(class_378 var0) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.field_4190 = -1565112471;
      if(class_386.field_4225 == null) {
         class_386.field_4225 = new int[var0.field_4190 * -162652768];
      }

      boolean var26 = true;

      while(var26) {
         byte var1 = method_6765(var0);
         if(var1 == 23) {
            return;
         }

         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6745(var0);
         if(var1 != 0) {
            ;
         }

         var0.field_4178 = 0;
         var1 = method_6765(var0);
         var0.field_4178 = (var0.field_4178 * -1146975777 << 8 | var1 & 255) * -275484129;
         var1 = method_6765(var0);
         var0.field_4178 = (var0.field_4178 * -1146975777 << 8 | var1 & 255) * -275484129;
         var1 = method_6765(var0);
         var0.field_4178 = (var0.field_4178 * -1146975777 << 8 | var1 & 255) * -275484129;

         int var35;
         for(var35 = 0; var35 < 16; ++var35) {
            var1 = method_6745(var0);
            if(var1 == 1) {
               var0.field_4189[var35] = true;
            } else {
               var0.field_4189[var35] = false;
            }
         }

         for(var35 = 0; var35 < 256; ++var35) {
            var0.field_4185[var35] = false;
         }

         int var36;
         for(var35 = 0; var35 < 16; ++var35) {
            if(var0.field_4189[var35]) {
               for(var36 = 0; var36 < 16; ++var36) {
                  var1 = method_6745(var0);
                  if(var1 == 1) {
                     var0.field_4185[var35 * 16 + var36] = true;
                  }
               }
            }
         }

         method_6747(var0);
         int var38 = var0.field_4193 * -846985049 + 2;
         int var39 = method_6751(3, var0);
         int var40 = method_6751(15, var0);
         var35 = 0;

         while(var35 < var40) {
            var36 = 0;

            while(true) {
               var1 = method_6745(var0);
               if(var1 == 0) {
                  var0.field_4191[var35] = (byte)var36;
                  ++var35;
                  break;
               }

               ++var36;
            }
         }

         byte[] var27 = new byte[6];

         byte var29;
         for(var29 = 0; var29 < var39; var27[var29] = var29++) {
            ;
         }

         for(var35 = 0; var35 < var40; ++var35) {
            var29 = var0.field_4191[var35];

            byte var28;
            for(var28 = var27[var29]; var29 > 0; --var29) {
               var27[var29] = var27[var29 - 1];
            }

            var27[0] = var28;
            var0.field_4163[var35] = var28;
         }

         int var37;
         for(var37 = 0; var37 < var39; ++var37) {
            int var49 = method_6751(5, var0);
            var35 = 0;

            while(var35 < var38) {
               while(true) {
                  var1 = method_6745(var0);
                  if(var1 == 0) {
                     var0.field_4192[var37][var35] = (byte)var49;
                     ++var35;
                     break;
                  }

                  var1 = method_6745(var0);
                  if(var1 == 0) {
                     ++var49;
                  } else {
                     --var49;
                  }
               }
            }
         }

         for(var37 = 0; var37 < var39; ++var37) {
            byte var2 = 32;
            byte var3 = 0;

            for(var35 = 0; var35 < var38; ++var35) {
               if(var0.field_4192[var37][var35] > var3) {
                  var3 = var0.field_4192[var37][var35];
               }

               if(var0.field_4192[var37][var35] < var2) {
                  var2 = var0.field_4192[var37][var35];
               }
            }

            method_6756(var0.field_4166[var37], var0.field_4194[var37], var0.field_4160[var37], var0.field_4192[var37], var2, var3, var38);
            var0.field_4196[var37] = var2;
         }

         int var41 = var0.field_4193 * -846985049 + 1;
         int var42 = -1;
         byte var43 = 0;

         for(var35 = 0; var35 <= 255; ++var35) {
            var0.field_4181[var35] = 0;
         }

         int var56 = 4095;

         int var54;
         int var55;
         for(var54 = 15; var54 >= 0; --var54) {
            for(var55 = 15; var55 >= 0; --var55) {
               var0.field_4188[var56] = (byte)(var54 * 16 + var55);
               --var56;
            }

            var0.field_4197[var54] = var56 + 1;
         }

         int var46 = 0;
         byte var53;
         if(var43 == 0) {
            ++var42;
            var43 = 50;
            var53 = var0.field_4163[var42];
            var22 = var0.field_4196[var53];
            var23 = var0.field_4166[var53];
            var25 = var0.field_4160[var53];
            var24 = var0.field_4194[var53];
         }

         int var44 = var43 - 1;
         int var50 = var22;

         int var51;
         byte var52;
         for(var51 = method_6751(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
            ++var50;
            var52 = method_6745(var0);
         }

         int var45 = var25[var51 - var24[var50]];

         while(var45 != var41) {
            if(var45 != 0 && var45 != 1) {
               int var33 = var45 - 1;
               int var30;
               if(var33 < 16) {
                  var30 = var0.field_4197[0];

                  for(var1 = var0.field_4188[var30 + var33]; var33 > 3; var33 -= 4) {
                     int var34 = var30 + var33;
                     var0.field_4188[var34] = var0.field_4188[var34 - 1];
                     var0.field_4188[var34 - 1] = var0.field_4188[var34 - 2];
                     var0.field_4188[var34 - 2] = var0.field_4188[var34 - 3];
                     var0.field_4188[var34 - 3] = var0.field_4188[var34 - 4];
                  }

                  while(var33 > 0) {
                     var0.field_4188[var30 + var33] = var0.field_4188[var30 + var33 - 1];
                     --var33;
                  }

                  var0.field_4188[var30] = var1;
               } else {
                  int var31 = var33 / 16;
                  int var32 = var33 % 16;
                  var30 = var0.field_4197[var31] + var32;

                  for(var1 = var0.field_4188[var30]; var30 > var0.field_4197[var31]; --var30) {
                     var0.field_4188[var30] = var0.field_4188[var30 - 1];
                  }

                  ++var0.field_4197[var31];

                  while(var31 > 0) {
                     --var0.field_4197[var31];
                     var0.field_4188[var0.field_4197[var31]] = var0.field_4188[var0.field_4197[var31 - 1] + 16 - 1];
                     --var31;
                  }

                  --var0.field_4197[0];
                  var0.field_4188[var0.field_4197[0]] = var1;
                  if(var0.field_4197[0] == 0) {
                     var56 = 4095;

                     for(var54 = 15; var54 >= 0; --var54) {
                        for(var55 = 15; var55 >= 0; --var55) {
                           var0.field_4188[var56] = var0.field_4188[var0.field_4197[var54] + var55];
                           --var56;
                        }

                        var0.field_4197[var54] = var56 + 1;
                     }
                  }
               }

               ++var0.field_4181[var0.field_4187[var1 & 255] & 255];
               class_386.field_4225[var46] = var0.field_4187[var1 & 255] & 255;
               ++var46;
               if(var44 == 0) {
                  ++var42;
                  var44 = 50;
                  var53 = var0.field_4163[var42];
                  var22 = var0.field_4196[var53];
                  var23 = var0.field_4166[var53];
                  var25 = var0.field_4160[var53];
                  var24 = var0.field_4194[var53];
               }

               --var44;
               var50 = var22;

               for(var51 = method_6751(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                  ++var50;
                  var52 = method_6745(var0);
               }

               var45 = var25[var51 - var24[var50]];
            } else {
               int var47 = -1;
               int var48 = 1;

               do {
                  if(var45 == 0) {
                     var47 += 1 * var48;
                  } else if(var45 == 1) {
                     var47 += 2 * var48;
                  }

                  var48 *= 2;
                  if(var44 == 0) {
                     ++var42;
                     var44 = 50;
                     var53 = var0.field_4163[var42];
                     var22 = var0.field_4196[var53];
                     var23 = var0.field_4166[var53];
                     var25 = var0.field_4160[var53];
                     var24 = var0.field_4194[var53];
                  }

                  --var44;
                  var50 = var22;

                  for(var51 = method_6751(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                     ++var50;
                     var52 = method_6745(var0);
                  }

                  var45 = var25[var51 - var24[var50]];
               } while(var45 == 0 || var45 == 1);

               ++var47;
               var1 = var0.field_4187[var0.field_4188[var0.field_4197[0]] & 255];

               for(var0.field_4181[var1 & 255] += var47; var47 > 0; --var47) {
                  class_386.field_4225[var46] = var1 & 255;
                  ++var46;
               }
            }
         }

         var0.field_4184 = 0;
         var0.field_4173 = 0;
         var0.field_4183[0] = 0;

         for(var35 = 1; var35 <= 256; ++var35) {
            var0.field_4183[var35] = var0.field_4181[var35 - 1];
         }

         for(var35 = 1; var35 <= 256; ++var35) {
            var0.field_4183[var35] += var0.field_4183[var35 - 1];
         }

         for(var35 = 0; var35 < var46; ++var35) {
            var1 = (byte)(class_386.field_4225[var35] & 255);
            class_386.field_4225[var0.field_4183[var1 & 255]] |= var35 << 8;
            ++var0.field_4183[var1 & 255];
         }

         var0.field_4195 = (class_386.field_4225[var0.field_4178 * -1146975777] >> 8) * 180618703;
         var0.field_4182 = 0;
         var0.field_4195 = class_386.field_4225[var0.field_4195 * -1768365777] * 180618703;
         var0.field_4180 = (byte)(var0.field_4195 * -1768365777 & 255) * 630313001;
         var0.field_4195 = (var0.field_4195 * -1768365777 >> 8) * 180618703;
         var0.field_4182 += 1515396781;
         var0.field_4174 = var46 * 636733795;
         method_6741(var0);
         if(var0.field_4182 * -985271003 == var0.field_4174 * 375128139 + 1 && var0.field_4184 * -1772899085 == 0) {
            var26 = true;
         } else {
            var26 = false;
         }
      }

   }

   // $FF: renamed from: h (nh) void
   static void method_6744(class_378 var0) {
      var0.field_4193 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if(var0.field_4185[var1]) {
            var0.field_4187[var0.field_4193 * -846985049] = (byte)var1;
            var0.field_4193 += 1594957591;
         }
      }

   }

   // $FF: renamed from: p (nh) byte
   static byte method_6745(class_378 var0) {
      return (byte)method_6751(1, var0);
   }

   // $FF: renamed from: a (nh) byte
   static byte method_6746(class_378 var0) {
      return (byte)method_6751(8, var0);
   }

   // $FF: renamed from: r (nh) void
   static void method_6747(class_378 var0) {
      var0.field_4193 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if(var0.field_4185[var1]) {
            var0.field_4187[var0.field_4193 * -846985049] = (byte)var1;
            var0.field_4193 += 1594957591;
         }
      }

   }

   // $FF: renamed from: s (byte[], int, byte[], int, int) int
   public static int method_6748(byte[] var0, int var1, byte[] var2, int var4) {
      class_378 var5 = field_4237;
      synchronized(field_4237) {
         field_4237.field_4172 = var2;
         field_4237.field_4167 = var4 * 1860481551;
         field_4237.field_4169 = var0;
         field_4237.field_4170 = 0;
         field_4237.field_4179 = var1 * 1667837279;
         field_4237.field_4176 = 0;
         field_4237.field_4175 = 0;
         field_4237.field_4168 = 0;
         field_4237.field_4177 = 0;
         method_6743(field_4237);
         var1 -= field_4237.field_4179 * -795709793;
         field_4237.field_4172 = null;
         field_4237.field_4169 = null;
         return var1;
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_378 var10000 = new class_378();
      field_4237 = var10000;
   }

   // $FF: renamed from: d (byte[], int, byte[], int, int) int
   public static int method_6750(byte[] var0, int var1, byte[] var2, int var4) {
      class_378 var5 = field_4237;
      synchronized(field_4237) {
         field_4237.field_4172 = var2;
         field_4237.field_4167 = var4 * 1860481551;
         field_4237.field_4169 = var0;
         field_4237.field_4170 = 0;
         field_4237.field_4179 = var1 * 1667837279;
         field_4237.field_4176 = 0;
         field_4237.field_4175 = 0;
         field_4237.field_4168 = 0;
         field_4237.field_4177 = 0;
         method_6743(field_4237);
         var1 -= field_4237.field_4179 * -795709793;
         field_4237.field_4172 = null;
         field_4237.field_4169 = null;
         return var1;
      }
   }

   // $FF: renamed from: j (int, nh) int
   static int method_6751(int var0, class_378 var1) {
      while(var1.field_4176 * -1723069525 < var0) {
         var1.field_4175 = (var1.field_4175 * -492240629 << 8 | var1.field_4172[var1.field_4167 * 1851391215] & 255) * -955333981;
         var1.field_4176 += 225753112;
         var1.field_4167 += 1860481551;
         var1.field_4168 += -375883429;
         if(var1.field_4168 * -1612509485 == 0) {
            ;
         }
      }

      int var2 = var1.field_4175 * -492240629 >> var1.field_4176 * -1723069525 - var0 & (1 << var0) - 1;
      var1.field_4176 -= var0 * 1101960963;
      return var2;
   }

   // $FF: renamed from: u (nh) void
   static void method_6752(class_378 var0) {
      byte var2 = var0.field_4173;
      int var3 = var0.field_4184 * -1772899085;
      int var4 = var0.field_4182 * -985271003;
      int var5 = var0.field_4180 * -2146251751;
      int[] var6 = class_386.field_4225;
      int var7 = var0.field_4195 * -1768365777;
      byte[] var8 = var0.field_4169;
      int var9 = var0.field_4170 * -1856584985;
      int var10 = var0.field_4179 * -795709793;
      int var12 = var0.field_4174 * 375128139 + 1;

      label117:
      while(true) {
         if(var3 > 0) {
            while(true) {
               if(var10 == 0) {
                  break label117;
               }

               if(var3 == 1) {
                  if(var10 == 0) {
                     var3 = 1;
                     break label117;
                  }

                  var8[var9] = var2;
                  ++var9;
                  --var10;
                  break;
               }

               var8[var9] = var2;
               --var3;
               ++var9;
               --var10;
            }
         }

         while(var4 != var12) {
            var2 = (byte)var5;
            var7 = var6[var7];
            byte var1 = (byte)var7;
            var7 >>= 8;
            ++var4;
            if(var1 != var5) {
               var5 = var1;
               if(var10 == 0) {
                  var3 = 1;
                  break label117;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            } else {
               if(var4 != var12) {
                  var3 = 2;
                  var7 = var6[var7];
                  var1 = (byte)var7;
                  var7 >>= 8;
                  ++var4;
                  if(var4 != var12) {
                     if(var1 != var5) {
                        var5 = var1;
                     } else {
                        var3 = 3;
                        var7 = var6[var7];
                        var1 = (byte)var7;
                        var7 >>= 8;
                        ++var4;
                        if(var4 != var12) {
                           if(var1 != var5) {
                              var5 = var1;
                           } else {
                              var7 = var6[var7];
                              var1 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                              var3 = (var1 & 255) + 4;
                              var7 = var6[var7];
                              var5 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                           }
                        }
                     }
                  }
                  continue label117;
               }

               if(var10 == 0) {
                  var3 = 1;
                  break label117;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.field_4177 * -743824809;
      var0.field_4177 += (var10 - var10) * 741206375;
      if(var0.field_4177 * -743824809 < var13) {
         ;
      }

      var0.field_4173 = var2;
      var0.field_4184 = var3 * 49841211;
      var0.field_4182 = var4 * 1515396781;
      var0.field_4180 = var5 * 630313001;
      class_386.field_4225 = var6;
      var0.field_4195 = var7 * 180618703;
      var0.field_4169 = var8;
      var0.field_4170 = var9 * 1808871639;
      var0.field_4179 = var10 * 1667837279;
   }

   // $FF: renamed from: e (nh) void
   static void method_6753(class_378 var0) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.field_4190 = -1565112471;
      if(class_386.field_4225 == null) {
         class_386.field_4225 = new int[var0.field_4190 * -162652768];
      }

      boolean var26 = true;

      while(var26) {
         byte var1 = method_6765(var0);
         if(var1 == 23) {
            return;
         }

         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6745(var0);
         if(var1 != 0) {
            ;
         }

         var0.field_4178 = 0;
         var1 = method_6765(var0);
         var0.field_4178 = (var0.field_4178 * -1146975777 << 8 | var1 & 255) * -275484129;
         var1 = method_6765(var0);
         var0.field_4178 = (var0.field_4178 * -1146975777 << 8 | var1 & 255) * -275484129;
         var1 = method_6765(var0);
         var0.field_4178 = (var0.field_4178 * -1146975777 << 8 | var1 & 255) * -275484129;

         int var35;
         for(var35 = 0; var35 < 16; ++var35) {
            var1 = method_6745(var0);
            if(var1 == 1) {
               var0.field_4189[var35] = true;
            } else {
               var0.field_4189[var35] = false;
            }
         }

         for(var35 = 0; var35 < 256; ++var35) {
            var0.field_4185[var35] = false;
         }

         int var36;
         for(var35 = 0; var35 < 16; ++var35) {
            if(var0.field_4189[var35]) {
               for(var36 = 0; var36 < 16; ++var36) {
                  var1 = method_6745(var0);
                  if(var1 == 1) {
                     var0.field_4185[var35 * 16 + var36] = true;
                  }
               }
            }
         }

         method_6747(var0);
         int var38 = var0.field_4193 * -846985049 + 2;
         int var39 = method_6751(3, var0);
         int var40 = method_6751(15, var0);
         var35 = 0;

         while(var35 < var40) {
            var36 = 0;

            while(true) {
               var1 = method_6745(var0);
               if(var1 == 0) {
                  var0.field_4191[var35] = (byte)var36;
                  ++var35;
                  break;
               }

               ++var36;
            }
         }

         byte[] var27 = new byte[6];

         byte var29;
         for(var29 = 0; var29 < var39; var27[var29] = var29++) {
            ;
         }

         for(var35 = 0; var35 < var40; ++var35) {
            var29 = var0.field_4191[var35];

            byte var28;
            for(var28 = var27[var29]; var29 > 0; --var29) {
               var27[var29] = var27[var29 - 1];
            }

            var27[0] = var28;
            var0.field_4163[var35] = var28;
         }

         int var37;
         for(var37 = 0; var37 < var39; ++var37) {
            int var49 = method_6751(5, var0);
            var35 = 0;

            while(var35 < var38) {
               while(true) {
                  var1 = method_6745(var0);
                  if(var1 == 0) {
                     var0.field_4192[var37][var35] = (byte)var49;
                     ++var35;
                     break;
                  }

                  var1 = method_6745(var0);
                  if(var1 == 0) {
                     ++var49;
                  } else {
                     --var49;
                  }
               }
            }
         }

         for(var37 = 0; var37 < var39; ++var37) {
            byte var2 = 32;
            byte var3 = 0;

            for(var35 = 0; var35 < var38; ++var35) {
               if(var0.field_4192[var37][var35] > var3) {
                  var3 = var0.field_4192[var37][var35];
               }

               if(var0.field_4192[var37][var35] < var2) {
                  var2 = var0.field_4192[var37][var35];
               }
            }

            method_6756(var0.field_4166[var37], var0.field_4194[var37], var0.field_4160[var37], var0.field_4192[var37], var2, var3, var38);
            var0.field_4196[var37] = var2;
         }

         int var41 = var0.field_4193 * -846985049 + 1;
         int var42 = -1;
         byte var43 = 0;

         for(var35 = 0; var35 <= 255; ++var35) {
            var0.field_4181[var35] = 0;
         }

         int var56 = 4095;

         int var54;
         int var55;
         for(var54 = 15; var54 >= 0; --var54) {
            for(var55 = 15; var55 >= 0; --var55) {
               var0.field_4188[var56] = (byte)(var54 * 16 + var55);
               --var56;
            }

            var0.field_4197[var54] = var56 + 1;
         }

         int var46 = 0;
         byte var53;
         if(var43 == 0) {
            ++var42;
            var43 = 50;
            var53 = var0.field_4163[var42];
            var22 = var0.field_4196[var53];
            var23 = var0.field_4166[var53];
            var25 = var0.field_4160[var53];
            var24 = var0.field_4194[var53];
         }

         int var44 = var43 - 1;
         int var50 = var22;

         int var51;
         byte var52;
         for(var51 = method_6751(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
            ++var50;
            var52 = method_6745(var0);
         }

         int var45 = var25[var51 - var24[var50]];

         while(var45 != var41) {
            if(var45 != 0 && var45 != 1) {
               int var33 = var45 - 1;
               int var30;
               if(var33 < 16) {
                  var30 = var0.field_4197[0];

                  for(var1 = var0.field_4188[var30 + var33]; var33 > 3; var33 -= 4) {
                     int var34 = var30 + var33;
                     var0.field_4188[var34] = var0.field_4188[var34 - 1];
                     var0.field_4188[var34 - 1] = var0.field_4188[var34 - 2];
                     var0.field_4188[var34 - 2] = var0.field_4188[var34 - 3];
                     var0.field_4188[var34 - 3] = var0.field_4188[var34 - 4];
                  }

                  while(var33 > 0) {
                     var0.field_4188[var30 + var33] = var0.field_4188[var30 + var33 - 1];
                     --var33;
                  }

                  var0.field_4188[var30] = var1;
               } else {
                  int var31 = var33 / 16;
                  int var32 = var33 % 16;
                  var30 = var0.field_4197[var31] + var32;

                  for(var1 = var0.field_4188[var30]; var30 > var0.field_4197[var31]; --var30) {
                     var0.field_4188[var30] = var0.field_4188[var30 - 1];
                  }

                  ++var0.field_4197[var31];

                  while(var31 > 0) {
                     --var0.field_4197[var31];
                     var0.field_4188[var0.field_4197[var31]] = var0.field_4188[var0.field_4197[var31 - 1] + 16 - 1];
                     --var31;
                  }

                  --var0.field_4197[0];
                  var0.field_4188[var0.field_4197[0]] = var1;
                  if(var0.field_4197[0] == 0) {
                     var56 = 4095;

                     for(var54 = 15; var54 >= 0; --var54) {
                        for(var55 = 15; var55 >= 0; --var55) {
                           var0.field_4188[var56] = var0.field_4188[var0.field_4197[var54] + var55];
                           --var56;
                        }

                        var0.field_4197[var54] = var56 + 1;
                     }
                  }
               }

               ++var0.field_4181[var0.field_4187[var1 & 255] & 255];
               class_386.field_4225[var46] = var0.field_4187[var1 & 255] & 255;
               ++var46;
               if(var44 == 0) {
                  ++var42;
                  var44 = 50;
                  var53 = var0.field_4163[var42];
                  var22 = var0.field_4196[var53];
                  var23 = var0.field_4166[var53];
                  var25 = var0.field_4160[var53];
                  var24 = var0.field_4194[var53];
               }

               --var44;
               var50 = var22;

               for(var51 = method_6751(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                  ++var50;
                  var52 = method_6745(var0);
               }

               var45 = var25[var51 - var24[var50]];
            } else {
               int var47 = -1;
               int var48 = 1;

               do {
                  if(var45 == 0) {
                     var47 += 1 * var48;
                  } else if(var45 == 1) {
                     var47 += 2 * var48;
                  }

                  var48 *= 2;
                  if(var44 == 0) {
                     ++var42;
                     var44 = 50;
                     var53 = var0.field_4163[var42];
                     var22 = var0.field_4196[var53];
                     var23 = var0.field_4166[var53];
                     var25 = var0.field_4160[var53];
                     var24 = var0.field_4194[var53];
                  }

                  --var44;
                  var50 = var22;

                  for(var51 = method_6751(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                     ++var50;
                     var52 = method_6745(var0);
                  }

                  var45 = var25[var51 - var24[var50]];
               } while(var45 == 0 || var45 == 1);

               ++var47;
               var1 = var0.field_4187[var0.field_4188[var0.field_4197[0]] & 255];

               for(var0.field_4181[var1 & 255] += var47; var47 > 0; --var47) {
                  class_386.field_4225[var46] = var1 & 255;
                  ++var46;
               }
            }
         }

         var0.field_4184 = 0;
         var0.field_4173 = 0;
         var0.field_4183[0] = 0;

         for(var35 = 1; var35 <= 256; ++var35) {
            var0.field_4183[var35] = var0.field_4181[var35 - 1];
         }

         for(var35 = 1; var35 <= 256; ++var35) {
            var0.field_4183[var35] += var0.field_4183[var35 - 1];
         }

         for(var35 = 0; var35 < var46; ++var35) {
            var1 = (byte)(class_386.field_4225[var35] & 255);
            class_386.field_4225[var0.field_4183[var1 & 255]] |= var35 << 8;
            ++var0.field_4183[var1 & 255];
         }

         var0.field_4195 = (class_386.field_4225[var0.field_4178 * -1146975777] >> 8) * 180618703;
         var0.field_4182 = 0;
         var0.field_4195 = class_386.field_4225[var0.field_4195 * -1768365777] * 180618703;
         var0.field_4180 = (byte)(var0.field_4195 * -1768365777 & 255) * 630313001;
         var0.field_4195 = (var0.field_4195 * -1768365777 >> 8) * 180618703;
         var0.field_4182 += 1515396781;
         var0.field_4174 = var46 * 636733795;
         method_6741(var0);
         if(var0.field_4182 * -985271003 == var0.field_4174 * 375128139 + 1 && var0.field_4184 * -1772899085 == 0) {
            var26 = true;
         } else {
            var26 = false;
         }
      }

   }

   // $FF: renamed from: o (nh) void
   static void method_6754(class_378 var0) {
      byte var2 = var0.field_4173;
      int var3 = var0.field_4184 * -1772899085;
      int var4 = var0.field_4182 * -985271003;
      int var5 = var0.field_4180 * -2146251751;
      int[] var6 = class_386.field_4225;
      int var7 = var0.field_4195 * -1768365777;
      byte[] var8 = var0.field_4169;
      int var9 = var0.field_4170 * -1856584985;
      int var10 = var0.field_4179 * -795709793;
      int var12 = var0.field_4174 * 375128139 + 1;

      label110:
      while(true) {
         if(var3 > 0) {
            while(true) {
               if(var10 == 0) {
                  break label110;
               }

               if(var3 == 1) {
                  if(var10 == 0) {
                     var3 = 1;
                     break label110;
                  }

                  var8[var9] = var2;
                  ++var9;
                  --var10;
                  break;
               }

               var8[var9] = var2;
               --var3;
               ++var9;
               --var10;
            }
         }

         while(var4 != var12) {
            var2 = (byte)var5;
            var7 = var6[var7];
            byte var1 = (byte)var7;
            var7 >>= 8;
            ++var4;
            if(var1 != var5) {
               var5 = var1;
               if(var10 == 0) {
                  var3 = 1;
                  break label110;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            } else {
               if(var4 != var12) {
                  var3 = 2;
                  var7 = var6[var7];
                  var1 = (byte)var7;
                  var7 >>= 8;
                  ++var4;
                  if(var4 != var12) {
                     if(var1 != var5) {
                        var5 = var1;
                     } else {
                        var3 = 3;
                        var7 = var6[var7];
                        var1 = (byte)var7;
                        var7 >>= 8;
                        ++var4;
                        if(var4 != var12) {
                           if(var1 != var5) {
                              var5 = var1;
                           } else {
                              var7 = var6[var7];
                              var1 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                              var3 = (var1 & 255) + 4;
                              var7 = var6[var7];
                              var5 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                           }
                        }
                     }
                  }
                  continue label110;
               }

               if(var10 == 0) {
                  var3 = 1;
                  break label110;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.field_4177 * -743824809;
      var0.field_4177 += (var10 - var10) * 741206375;
      if(var0.field_4177 * -743824809 < var13) {
         ;
      }

      var0.field_4173 = var2;
      var0.field_4184 = var3 * 49841211;
      var0.field_4182 = var4 * 1515396781;
      var0.field_4180 = var5 * 630313001;
      class_386.field_4225 = var6;
      var0.field_4195 = var7 * 180618703;
      var0.field_4169 = var8;
      var0.field_4170 = var9 * 1808871639;
      var0.field_4179 = var10 * 1667837279;
   }

   // $FF: renamed from: c (nh) void
   static void method_6755(class_378 var0) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.field_4190 = -1565112471;
      if(class_386.field_4225 == null) {
         class_386.field_4225 = new int[var0.field_4190 * -162652768];
      }

      boolean var26 = true;

      while(var26) {
         byte var1 = method_6765(var0);
         if(var1 == 23) {
            return;
         }

         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6765(var0);
         var1 = method_6745(var0);
         if(var1 != 0) {
            ;
         }

         var0.field_4178 = 0;
         var1 = method_6765(var0);
         var0.field_4178 = (var0.field_4178 * -1146975777 << 8 | var1 & 255) * -275484129;
         var1 = method_6765(var0);
         var0.field_4178 = (var0.field_4178 * -1146975777 << 8 | var1 & 255) * -275484129;
         var1 = method_6765(var0);
         var0.field_4178 = (var0.field_4178 * -1146975777 << 8 | var1 & 255) * -275484129;

         int var35;
         for(var35 = 0; var35 < 16; ++var35) {
            var1 = method_6745(var0);
            if(var1 == 1) {
               var0.field_4189[var35] = true;
            } else {
               var0.field_4189[var35] = false;
            }
         }

         for(var35 = 0; var35 < 256; ++var35) {
            var0.field_4185[var35] = false;
         }

         int var36;
         for(var35 = 0; var35 < 16; ++var35) {
            if(var0.field_4189[var35]) {
               for(var36 = 0; var36 < 16; ++var36) {
                  var1 = method_6745(var0);
                  if(var1 == 1) {
                     var0.field_4185[var35 * 16 + var36] = true;
                  }
               }
            }
         }

         method_6747(var0);
         int var38 = var0.field_4193 * -846985049 + 2;
         int var39 = method_6751(3, var0);
         int var40 = method_6751(15, var0);
         var35 = 0;

         while(var35 < var40) {
            var36 = 0;

            while(true) {
               var1 = method_6745(var0);
               if(var1 == 0) {
                  var0.field_4191[var35] = (byte)var36;
                  ++var35;
                  break;
               }

               ++var36;
            }
         }

         byte[] var27 = new byte[6];

         byte var29;
         for(var29 = 0; var29 < var39; var27[var29] = var29++) {
            ;
         }

         for(var35 = 0; var35 < var40; ++var35) {
            var29 = var0.field_4191[var35];

            byte var28;
            for(var28 = var27[var29]; var29 > 0; --var29) {
               var27[var29] = var27[var29 - 1];
            }

            var27[0] = var28;
            var0.field_4163[var35] = var28;
         }

         int var37;
         for(var37 = 0; var37 < var39; ++var37) {
            int var49 = method_6751(5, var0);
            var35 = 0;

            while(var35 < var38) {
               while(true) {
                  var1 = method_6745(var0);
                  if(var1 == 0) {
                     var0.field_4192[var37][var35] = (byte)var49;
                     ++var35;
                     break;
                  }

                  var1 = method_6745(var0);
                  if(var1 == 0) {
                     ++var49;
                  } else {
                     --var49;
                  }
               }
            }
         }

         for(var37 = 0; var37 < var39; ++var37) {
            byte var2 = 32;
            byte var3 = 0;

            for(var35 = 0; var35 < var38; ++var35) {
               if(var0.field_4192[var37][var35] > var3) {
                  var3 = var0.field_4192[var37][var35];
               }

               if(var0.field_4192[var37][var35] < var2) {
                  var2 = var0.field_4192[var37][var35];
               }
            }

            method_6756(var0.field_4166[var37], var0.field_4194[var37], var0.field_4160[var37], var0.field_4192[var37], var2, var3, var38);
            var0.field_4196[var37] = var2;
         }

         int var41 = var0.field_4193 * -846985049 + 1;
         int var42 = -1;
         byte var43 = 0;

         for(var35 = 0; var35 <= 255; ++var35) {
            var0.field_4181[var35] = 0;
         }

         int var56 = 4095;

         int var54;
         int var55;
         for(var54 = 15; var54 >= 0; --var54) {
            for(var55 = 15; var55 >= 0; --var55) {
               var0.field_4188[var56] = (byte)(var54 * 16 + var55);
               --var56;
            }

            var0.field_4197[var54] = var56 + 1;
         }

         int var46 = 0;
         byte var53;
         if(var43 == 0) {
            ++var42;
            var43 = 50;
            var53 = var0.field_4163[var42];
            var22 = var0.field_4196[var53];
            var23 = var0.field_4166[var53];
            var25 = var0.field_4160[var53];
            var24 = var0.field_4194[var53];
         }

         int var44 = var43 - 1;
         int var50 = var22;

         int var51;
         byte var52;
         for(var51 = method_6751(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
            ++var50;
            var52 = method_6745(var0);
         }

         int var45 = var25[var51 - var24[var50]];

         while(var45 != var41) {
            if(var45 != 0 && var45 != 1) {
               int var33 = var45 - 1;
               int var30;
               if(var33 < 16) {
                  var30 = var0.field_4197[0];

                  for(var1 = var0.field_4188[var30 + var33]; var33 > 3; var33 -= 4) {
                     int var34 = var30 + var33;
                     var0.field_4188[var34] = var0.field_4188[var34 - 1];
                     var0.field_4188[var34 - 1] = var0.field_4188[var34 - 2];
                     var0.field_4188[var34 - 2] = var0.field_4188[var34 - 3];
                     var0.field_4188[var34 - 3] = var0.field_4188[var34 - 4];
                  }

                  while(var33 > 0) {
                     var0.field_4188[var30 + var33] = var0.field_4188[var30 + var33 - 1];
                     --var33;
                  }

                  var0.field_4188[var30] = var1;
               } else {
                  int var31 = var33 / 16;
                  int var32 = var33 % 16;
                  var30 = var0.field_4197[var31] + var32;

                  for(var1 = var0.field_4188[var30]; var30 > var0.field_4197[var31]; --var30) {
                     var0.field_4188[var30] = var0.field_4188[var30 - 1];
                  }

                  ++var0.field_4197[var31];

                  while(var31 > 0) {
                     --var0.field_4197[var31];
                     var0.field_4188[var0.field_4197[var31]] = var0.field_4188[var0.field_4197[var31 - 1] + 16 - 1];
                     --var31;
                  }

                  --var0.field_4197[0];
                  var0.field_4188[var0.field_4197[0]] = var1;
                  if(var0.field_4197[0] == 0) {
                     var56 = 4095;

                     for(var54 = 15; var54 >= 0; --var54) {
                        for(var55 = 15; var55 >= 0; --var55) {
                           var0.field_4188[var56] = var0.field_4188[var0.field_4197[var54] + var55];
                           --var56;
                        }

                        var0.field_4197[var54] = var56 + 1;
                     }
                  }
               }

               ++var0.field_4181[var0.field_4187[var1 & 255] & 255];
               class_386.field_4225[var46] = var0.field_4187[var1 & 255] & 255;
               ++var46;
               if(var44 == 0) {
                  ++var42;
                  var44 = 50;
                  var53 = var0.field_4163[var42];
                  var22 = var0.field_4196[var53];
                  var23 = var0.field_4166[var53];
                  var25 = var0.field_4160[var53];
                  var24 = var0.field_4194[var53];
               }

               --var44;
               var50 = var22;

               for(var51 = method_6751(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                  ++var50;
                  var52 = method_6745(var0);
               }

               var45 = var25[var51 - var24[var50]];
            } else {
               int var47 = -1;
               int var48 = 1;

               do {
                  if(var45 == 0) {
                     var47 += 1 * var48;
                  } else if(var45 == 1) {
                     var47 += 2 * var48;
                  }

                  var48 *= 2;
                  if(var44 == 0) {
                     ++var42;
                     var44 = 50;
                     var53 = var0.field_4163[var42];
                     var22 = var0.field_4196[var53];
                     var23 = var0.field_4166[var53];
                     var25 = var0.field_4160[var53];
                     var24 = var0.field_4194[var53];
                  }

                  --var44;
                  var50 = var22;

                  for(var51 = method_6751(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                     ++var50;
                     var52 = method_6745(var0);
                  }

                  var45 = var25[var51 - var24[var50]];
               } while(var45 == 0 || var45 == 1);

               ++var47;
               var1 = var0.field_4187[var0.field_4188[var0.field_4197[0]] & 255];

               for(var0.field_4181[var1 & 255] += var47; var47 > 0; --var47) {
                  class_386.field_4225[var46] = var1 & 255;
                  ++var46;
               }
            }
         }

         var0.field_4184 = 0;
         var0.field_4173 = 0;
         var0.field_4183[0] = 0;

         for(var35 = 1; var35 <= 256; ++var35) {
            var0.field_4183[var35] = var0.field_4181[var35 - 1];
         }

         for(var35 = 1; var35 <= 256; ++var35) {
            var0.field_4183[var35] += var0.field_4183[var35 - 1];
         }

         for(var35 = 0; var35 < var46; ++var35) {
            var1 = (byte)(class_386.field_4225[var35] & 255);
            class_386.field_4225[var0.field_4183[var1 & 255]] |= var35 << 8;
            ++var0.field_4183[var1 & 255];
         }

         var0.field_4195 = (class_386.field_4225[var0.field_4178 * -1146975777] >> 8) * 180618703;
         var0.field_4182 = 0;
         var0.field_4195 = class_386.field_4225[var0.field_4195 * -1768365777] * 180618703;
         var0.field_4180 = (byte)(var0.field_4195 * -1768365777 & 255) * 630313001;
         var0.field_4195 = (var0.field_4195 * -1768365777 >> 8) * 180618703;
         var0.field_4182 += 1515396781;
         var0.field_4174 = var46 * 636733795;
         method_6741(var0);
         if(var0.field_4182 * -985271003 == var0.field_4174 * 375128139 + 1 && var0.field_4184 * -1772899085 == 0) {
            var26 = true;
         } else {
            var26 = false;
         }
      }

   }

   // $FF: renamed from: b (int[], int[], int[], byte[], int, int, int) void
   static void method_6756(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(int var9 = 0; var9 < var6; ++var9) {
            if(var3[var9] == var8) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      int var10 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var10 += var1[var8 + 1] - var1[var8];
         var0[var8] = var10 - 1;
         var10 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }

   // $FF: renamed from: g (nh) byte
   static byte method_6757(class_378 var0) {
      return (byte)method_6751(8, var0);
   }

   // $FF: renamed from: <init> () void
   class_389() throws Throwable {
      super();
      throw new Error();
   }

   // $FF: renamed from: k (nh) byte
   static byte method_6759(class_378 var0) {
      return (byte)method_6751(8, var0);
   }

   // $FF: renamed from: m (nh) byte
   static byte method_6760(class_378 var0) {
      return (byte)method_6751(1, var0);
   }

   // $FF: renamed from: x (int, nh) int
   static int method_6761(int var0, class_378 var1) {
      while(var1.field_4176 * -1723069525 < var0) {
         var1.field_4175 = (var1.field_4175 * -492240629 << 8 | var1.field_4172[var1.field_4167 * 1851391215] & 255) * -955333981;
         var1.field_4176 += 225753112;
         var1.field_4167 += 1860481551;
         var1.field_4168 += -375883429;
         if(var1.field_4168 * -1612509485 == 0) {
            ;
         }
      }

      int var2 = var1.field_4175 * -492240629 >> var1.field_4176 * -1723069525 - var0 & (1 << var0) - 1;
      var1.field_4176 -= var0 * 1101960963;
      return var2;
   }

   // $FF: renamed from: z (int, nh) int
   static int method_6762(int var0, class_378 var1) {
      while(var1.field_4176 * 1959351911 < var0) {
         var1.field_4175 = (var1.field_4175 * -492240629 << 8 | var1.field_4172[var1.field_4167 * 1127634513] & 1043471728) * -955333981;
         var1.field_4176 += -1773436518;
         var1.field_4167 += 212363937;
         var1.field_4168 += -375883429;
         if(var1.field_4168 * -1594853976 == 0) {
            ;
         }
      }

      int var2 = var1.field_4175 * 905667764 >> var1.field_4176 * 1101184286 - var0 & (1 << var0) - 1;
      var1.field_4176 -= var0 * 1101960963;
      return var2;
   }

   // $FF: renamed from: w (int, nh) int
   static int method_6763(int var0, class_378 var1) {
      while(var1.field_4176 * -1723069525 < var0) {
         var1.field_4175 = (var1.field_4175 * -492240629 << 8 | var1.field_4172[var1.field_4167 * 1851391215] & 255) * -955333981;
         var1.field_4176 += 225753112;
         var1.field_4167 += 1860481551;
         var1.field_4168 += -375883429;
         if(var1.field_4168 * -1612509485 == 0) {
            ;
         }
      }

      int var2 = var1.field_4175 * -492240629 >> var1.field_4176 * -1723069525 - var0 & (1 << var0) - 1;
      var1.field_4176 -= var0 * 1101960963;
      return var2;
   }

   // $FF: renamed from: i (int[], int[], int[], byte[], int, int, int) void
   static void method_6764(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(int var9 = 0; var9 < var6; ++var9) {
            if(var3[var9] == var8) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      int var10 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var10 += var1[var8 + 1] - var1[var8];
         var0[var8] = var10 - 1;
         var10 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }

   // $FF: renamed from: y (nh) byte
   static byte method_6765(class_378 var0) {
      return (byte)method_6751(8, var0);
   }

   // $FF: renamed from: q (int[], int[], int[], byte[], int, int, int) void
   static void method_6766(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(int var9 = 0; var9 < var6; ++var9) {
            if(var3[var9] == var8) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      int var10 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var10 += var1[var8 + 1] - var1[var8];
         var0[var8] = var10 - 1;
         var10 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }

   // $FF: renamed from: v (byte[], int, byte[], int, int) int
   public static int method_6767(byte[] var0, int var1, byte[] var2, int var4) {
      class_378 var5 = field_4237;
      synchronized(field_4237) {
         field_4237.field_4172 = var2;
         field_4237.field_4167 = var4 * 1860481551;
         field_4237.field_4169 = var0;
         field_4237.field_4170 = 0;
         field_4237.field_4179 = var1 * 1667837279;
         field_4237.field_4176 = 0;
         field_4237.field_4175 = 0;
         field_4237.field_4168 = 0;
         field_4237.field_4177 = 0;
         method_6743(field_4237);
         var1 -= field_4237.field_4179 * -795709793;
         field_4237.field_4172 = null;
         field_4237.field_4169 = null;
         return var1;
      }
   }
}
