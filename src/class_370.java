
// $FF: renamed from: ms
public class class_370 implements class_20 {

   // $FF: renamed from: v mg
   public final class_17 field_4102;
   // $FF: renamed from: u int
   static final int field_4103 = 5;
   // $FF: renamed from: r int
   public static final int field_4104 = 64;


   // $FF: renamed from: ho (boolean, nb, int) void
   static final void method_6601(boolean var0, class_29 var1, int var2) {
      try {
         client.field_1476 = var0;
         int var3;
         int var4;
         int var6;
         int var7;
         int var8;
         int var9;
         if(!client.field_1476) {
            var3 = var1.method_170(-54440517);
            var4 = var1.method_168(-525203995);
            int var5 = var1.method_132((byte)-106);
            class_231.field_2591 = new int[var5][4];

            for(var6 = 0; var6 < var5; ++var6) {
               if(var2 >= -226794743) {
                  return;
               }

               for(var7 = 0; var7 < 4; ++var7) {
                  if(var2 >= -226794743) {
                     throw new IllegalStateException();
                  }

                  class_231.field_2591[var6][var7] = var1.method_135((byte)-36);
               }
            }

            boolean var18;
            label305: {
               class_275.field_3216 = new int[var5];
               class_51.field_376 = new int[var5];
               class_176.field_2178 = new int[var5];
               class_119.field_1316 = new byte[var5][];
               class_168.field_2103 = new byte[var5][];
               var18 = false;
               if(48 != var4 / 8) {
                  if(var2 >= -226794743) {
                     throw new IllegalStateException();
                  }

                  if(49 != var4 / 8) {
                     break label305;
                  }

                  if(var2 >= -226794743) {
                     throw new IllegalStateException();
                  }
               }

               if(48 == var3 / 8) {
                  var18 = true;
               }
            }

            if(var4 / 8 == 48) {
               if(var2 >= -226794743) {
                  throw new IllegalStateException();
               }

               if(var3 / 8 == 148) {
                  if(var2 >= -226794743) {
                     throw new IllegalStateException();
                  }

                  var18 = true;
               }
            }

            var5 = 0;

            for(var7 = (var4 - 6) / 8; var7 <= (var4 + 6) / 8; ++var7) {
               if(var2 >= -226794743) {
                  throw new IllegalStateException();
               }

               for(var8 = (var3 - 6) / 8; var8 <= (6 + var3) / 8; ++var8) {
                  if(var2 >= -226794743) {
                     throw new IllegalStateException();
                  }

                  var9 = (var7 << 8) + var8;
                  if(var18) {
                     if(var2 >= -226794743) {
                        throw new IllegalStateException();
                     }

                     if(var8 == 49) {
                        continue;
                     }

                     if(var2 >= -226794743) {
                        throw new IllegalStateException();
                     }

                     if(149 == var8) {
                        continue;
                     }

                     if(var2 >= -226794743) {
                        throw new IllegalStateException();
                     }

                     if(var8 == 147) {
                        continue;
                     }

                     if(var2 >= -226794743) {
                        return;
                     }

                     if(50 == var7) {
                        continue;
                     }

                     if(49 == var7) {
                        if(var2 >= -226794743) {
                           throw new IllegalStateException();
                        }

                        if(var8 == 47) {
                           if(var2 >= -226794743) {
                              throw new IllegalStateException();
                           }
                           continue;
                        }
                     }
                  }

                  class_275.field_3216[var5] = var9;
                  class_51.field_376[var5] = class_286.field_3275.method_5399("m" + var7 + "_" + var8, -766129018);
                  class_176.field_2178[var5] = class_286.field_3275.method_5399("l" + var7 + "_" + var8, -111201730);
                  ++var5;
               }
            }

            class_26.method_96(var4, var3, true, -786826616);
         } else {
            var3 = var1.method_132((byte)-10);
            var4 = var1.method_168(2138477450);
            boolean var17 = var1.method_113(1983988560) == 1;
            var6 = var1.method_132((byte)-88);
            var1.method_358(-1303462902);

            int var10;
            for(var7 = 0; var7 < 4; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  if(var2 >= -226794743) {
                     throw new IllegalStateException();
                  }

                  for(var9 = 0; var9 < 13; ++var9) {
                     if(var2 >= -226794743) {
                        return;
                     }

                     var10 = var1.method_361(1, (byte)-36);
                     if(var10 == 1) {
                        if(var2 >= -226794743) {
                           return;
                        }

                        client.field_1477[var7][var8][var9] = var1.method_361(26, (byte)3);
                     } else {
                        client.field_1477[var7][var8][var9] = -1;
                     }
                  }
               }
            }

            var1.method_362((byte)-54);
            class_231.field_2591 = new int[var6][4];

            for(var7 = 0; var7 < var6; ++var7) {
               for(var8 = 0; var8 < 4; ++var8) {
                  if(var2 >= -226794743) {
                     throw new IllegalStateException();
                  }

                  class_231.field_2591[var7][var8] = var1.method_135((byte)-22);
               }
            }

            class_275.field_3216 = new int[var6];
            class_51.field_376 = new int[var6];
            class_176.field_2178 = new int[var6];
            class_119.field_1316 = new byte[var6][];
            class_168.field_2103 = new byte[var6][];
            var6 = 0;

            for(var7 = 0; var7 < 4; ++var7) {
               if(var2 >= -226794743) {
                  throw new IllegalStateException();
               }

               for(var8 = 0; var8 < 13; ++var8) {
                  for(var9 = 0; var9 < 13; ++var9) {
                     if(var2 >= -226794743) {
                        throw new IllegalStateException();
                     }

                     var10 = client.field_1477[var7][var8][var9];
                     if(var10 != -1) {
                        if(var2 >= -226794743) {
                           throw new IllegalStateException();
                        }

                        int var11 = var10 >> 14 & 1023;
                        int var12 = var10 >> 3 & 2047;
                        int var13 = (var11 / 8 << 8) + var12 / 8;

                        int var14;
                        for(var14 = 0; var14 < var6; ++var14) {
                           if(var2 >= -226794743) {
                              return;
                           }

                           if(var13 == class_275.field_3216[var14]) {
                              if(var2 >= -226794743) {
                                 throw new IllegalStateException();
                              }

                              var13 = -1;
                              break;
                           }
                        }

                        if(-1 != var13) {
                           if(var2 >= -226794743) {
                              throw new IllegalStateException();
                           }

                           class_275.field_3216[var6] = var13;
                           var14 = var13 >> 8 & 255;
                           int var15 = var13 & 255;
                           class_51.field_376[var6] = class_286.field_3275.method_5399("m" + var14 + "_" + var15, -240486954);
                           class_176.field_2178[var6] = class_286.field_3275.method_5399("l" + var14 + "_" + var15, -1711670004);
                           ++var6;
                        }
                     }
                  }
               }
            }

            boolean var10002;
            if(!var17) {
               if(var2 >= -226794743) {
                  throw new IllegalStateException();
               }

               var10002 = true;
            } else {
               var10002 = false;
            }

            class_26.method_96(var4, var3, var10002, -1939009157);
         }

      } catch (RuntimeException var16) {
         throw class_223.method_4281(var16, "ms.ho(" + ')');
      }
   }

   // $FF: renamed from: <init> (me) void
   public void method_6602(class_258 var1) {
      try {
         class_371 var10001 = new class_371;
         var10001.method_6609(var1);
         this.method_6603(var10001);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ms.<init>(" + ')');
      }
   }

   // $FF: renamed from: <init> (mt) void
   void method_6603(class_371 var1) {
      try {
         super();
         this.field_4102 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ms.<init>(" + ')');
      }
   }

   // $FF: renamed from: n (int) int
   public int method_6604(int var1) {
      return this.field_4102.method_53(var1, -869219041);
   }

   // $FF: renamed from: v (int, int) int
   public int method_6605(int var1, int var2) {
      try {
         return this.field_4102.method_53(var1, -350566290);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "ms.v(" + ')');
      }
   }

   // $FF: renamed from: l (jv, int, int, byte) boolean
   static boolean method_6606(class_306 var0, int var1, int var2, byte var3) {
      try {
         byte[] var4 = var0.method_5381(var1, var2, -26460885);
         if(var4 == null) {
            if(var3 <= 0) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            class_253.method_4899(var4, (byte)1);
            return true;
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "ms.l(" + ')');
      }
   }

   // $FF: renamed from: f (int) int
   public int method_6607(int var1) {
      return this.field_4102.method_53(var1, -1411954801);
   }
}
