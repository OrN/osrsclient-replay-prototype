
// $FF: renamed from: av
public class class_141 implements class_3 {


    // $FF: renamed from: s (int, int, int, boolean, int, int) long
   public static long method_3047(int var0, int var1, int var2, boolean var3, int var4, int var5) {
      try {
         long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
         if(var3) {
            if(var5 == -169166925) {
               throw new IllegalStateException();
            }

            var6 |= 65536L;
         }

         return var6;
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }

   // $FF: renamed from: v (int) bd
   public class_139 method_5() {
      try {
         class_140 var10000 = new class_140();
         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: n () bd
   public class_139 method_6() {
      class_140 var10000 = new class_140();
      return var10000;
   }

   // $FF: renamed from: f () bd
   public class_139 method_7() {
      class_140 var10000 = new class_140();
      return var10000;
   }

   // $FF: renamed from: hc (int, int, int, int, int, int, int, int, int, byte) void
   static final void method_3048(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9) {
      try {
         class_50 var10 = null;

         for(class_50 var11 = (class_50)client.field_1574.method_5944(); null != var11; var11 = (class_50)client.field_1574.method_5972()) {
            if(var9 == 7) {
               throw new IllegalStateException();
            }

            if(var0 == -28991277 * var11.field_369) {
               if(var9 == 7) {
                  throw new IllegalStateException();
               }

               if(var1 == 1813016497 * var11.field_364 && var11.field_367 * -396145343 == var2) {
                  if(var9 == 7) {
                     return;
                  }

                  if(-1769235093 * var11.field_365 == var3) {
                     if(var9 == 7) {
                        throw new IllegalStateException();
                     }

                     var10 = var11;
                     break;
                  }
               }
            }
         }

         if(var10 == null) {
            if(var9 == 7) {
               throw new IllegalStateException();
            }

            class_50 var10000 = new class_50();
            var10 = var10000;
            var10.field_369 = -1242319013 * var0;
            var10.field_365 = -2054183101 * var3;
            var10.field_364 = var1 * 480409937;
            var10.field_367 = var2 * 221790913;
            class_189.method_3896(var10, 14093457);
            client.field_1574.method_5939(var10);
         }

         var10.field_371 = 1765285741 * var4;
         var10.field_373 = var5 * -506547911;
         var10.field_372 = -867328831 * var6;
         var10.field_374 = var7 * 1452904947;
         var10.field_375 = var8 * 1875645291;
      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12);
      }
   }

   // $FF: renamed from: r (char, int) boolean
   static boolean method_3049(char var0, int var1) {
      try {
         boolean var10000;
         if(class_177.field_2198.indexOf(var0) != -1) {
            if(var1 >= 364171132) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: a (int, int, int, int, int, int, int, gt, fz, byte) void
   static final void method_3050(int var0, int var1, int var2, int var3, int var4, int var5, int var6, class_251 var7, class_240 var8, byte var9) {
      try {
         class_87 var10;
         int var11;
         int var12;
         label488: {
            var10 = class_121.method_2269(var4, 546994760);
            if(var5 != 1) {
               if(var9 == 0) {
                  throw new IllegalStateException();
               }

               if(3 != var5) {
                  var11 = -288612135 * var10.field_839;
                  var12 = var10.field_851 * -1812944985;
                  break label488;
               }
            }

            var11 = var10.field_851 * -1812944985;
            var12 = -288612135 * var10.field_839;
         }

         int var13;
         int var14;
         if(var2 + var11 <= 104) {
            if(var9 == 0) {
               throw new IllegalStateException();
            }

            var13 = var2 + (var11 >> 1);
            var14 = (var11 + 1 >> 1) + var2;
         } else {
            var13 = var2;
            var14 = 1 + var2;
         }

         int var15;
         int var16;
         if(var3 + var12 <= 104) {
            if(var9 == 0) {
               throw new IllegalStateException();
            }

            var15 = (var12 >> 1) + var3;
            var16 = var3 + (var12 + 1 >> 1);
         } else {
            var15 = var3;
            var16 = var3 + 1;
         }

         int[][] var17 = class_166.field_2078[var1];
         int var18 = var17[var14][var16] + var17[var14][var15] + var17[var13][var15] + var17[var13][var16] >> 2;
         int var19 = (var2 << 7) + (var11 << 6);
         int var20 = (var12 << 6) + (var3 << 7);
         boolean var10003;
         if(0 == -1747290425 * var10.field_820) {
            if(var9 == 0) {
               throw new IllegalStateException();
            }

            var10003 = true;
         } else {
            var10003 = false;
         }

         long var21 = method_3047(var2, var3, 2, var10003, var4, 615679420);
         int var23 = (var5 << 6) + var6;
         if(-1364896901 * var10.field_841 == 1) {
            var23 += 256;
         }

         class_96 var10000;
         Object var24;
         if(var6 == 22) {
            if(var9 == 0) {
               throw new IllegalStateException();
            } else {
               label365: {
                  if(91732693 * var10.field_824 == -1) {
                     if(var9 == 0) {
                        throw new IllegalStateException();
                     }

                     if(null == var10.field_842) {
                        if(var9 == 0) {
                           throw new IllegalStateException();
                        }

                        var24 = var10.method_1489(22, var5, var17, var19, var18, var20, -925676771);
                        break label365;
                     }
                  }

                  var10000 = new class_96(var4, 22, var5, var1, var2, var3, var10.field_824 * 91732693, var10.field_850, (class_91)null);
                  var24 = var10000;
               }

               var7.method_4729(var0, var2, var3, var18, (class_91)var24, var21, var23);
               if(1 == var10.field_818 * 1384594797) {
                  if(var9 == 0) {
                     throw new IllegalStateException();
                  }

                  var8.method_4624(var2, var3);
               }

            }
         } else {
            if(var6 != 10) {
               if(var6 != 11) {
                  if(var6 >= 12) {
                     label374: {
                        if(-1 == var10.field_824 * 91732693) {
                           if(var9 == 0) {
                              throw new IllegalStateException();
                           }

                           if(null == var10.field_842) {
                              var24 = var10.method_1489(var6, var5, var17, var19, var18, var20, -925676771);
                              break label374;
                           }
                        }

                        var10000 = new class_96(var4, var6, var5, var1, var2, var3, var10.field_824 * 91732693, var10.field_850, (class_91)null);
                        var24 = var10000;
                     }

                     var7.method_4807(var0, var2, var3, var18, 1, 1, (class_91)var24, 0, var21, var23);
                     if(0 != var10.field_818 * 1384594797) {
                        if(var9 == 0) {
                           throw new IllegalStateException();
                        }

                        var8.method_4611(var2, var3, var11, var12, var10.field_837, 65294735);
                     }

                     return;
                  }

                  if(var6 == 0) {
                     if(var9 == 0) {
                        throw new IllegalStateException();
                     }

                     label381: {
                        if(var10.field_824 * 91732693 == -1) {
                           if(var9 == 0) {
                              throw new IllegalStateException();
                           }

                           if(null == var10.field_842) {
                              if(var9 == 0) {
                                 throw new IllegalStateException();
                              }

                              var24 = var10.method_1489(0, var5, var17, var19, var18, var20, -925676771);
                              break label381;
                           }
                        }

                        var10000 = new class_96(var4, 0, var5, var1, var2, var3, 91732693 * var10.field_824, var10.field_850, (class_91)null);
                        var24 = var10000;
                     }

                     var7.method_4731(var0, var2, var3, var18, (class_91)var24, (class_91)null, class_166.field_2068[var5], 0, var21, var23);
                     if(0 != var10.field_818 * 1384594797) {
                        if(var9 == 0) {
                           throw new IllegalStateException();
                        }

                        var8.method_4623(var2, var3, var6, var5, var10.field_837, -1946469678);
                     }

                     return;
                  }

                  if(var6 == 1) {
                     if(var9 == 0) {
                        throw new IllegalStateException();
                     }

                     label390: {
                        if(-1 == 91732693 * var10.field_824) {
                           if(var9 == 0) {
                              return;
                           }

                           if(null == var10.field_842) {
                              if(var9 == 0) {
                                 throw new IllegalStateException();
                              }

                              var24 = var10.method_1489(1, var5, var17, var19, var18, var20, -925676771);
                              break label390;
                           }
                        }

                        var10000 = new class_96(var4, 1, var5, var1, var2, var3, 91732693 * var10.field_824, var10.field_850, (class_91)null);
                        var24 = var10000;
                     }

                     var7.method_4731(var0, var2, var3, var18, (class_91)var24, (class_91)null, class_166.field_2076[var5], 0, var21, var23);
                     if(var10.field_818 * 1384594797 != 0) {
                        if(var9 == 0) {
                           throw new IllegalStateException();
                        }

                        var8.method_4623(var2, var3, var6, var5, var10.field_837, -1946469678);
                     }

                     return;
                  }

                  int var31;
                  if(var6 == 2) {
                     if(var9 == 0) {
                        throw new IllegalStateException();
                     }

                     Object var26;
                     Object var33;
                     label399: {
                        var31 = var5 + 1 & 3;
                        if(-1 == 91732693 * var10.field_824) {
                           if(var9 == 0) {
                              throw new IllegalStateException();
                           }

                           if(null == var10.field_842) {
                              if(var9 == 0) {
                                 throw new IllegalStateException();
                              }

                              var33 = var10.method_1489(2, 4 + var5, var17, var19, var18, var20, -925676771);
                              var26 = var10.method_1489(2, var31, var17, var19, var18, var20, -925676771);
                              break label399;
                           }
                        }

                        var10000 = new class_96(var4, 2, var5 + 4, var1, var2, var3, var10.field_824 * 91732693, var10.field_850, (class_91)null);
                        var33 = var10000;
                        var10000 = new class_96(var4, 2, var31, var1, var2, var3, 91732693 * var10.field_824, var10.field_850, (class_91)null);
                        var26 = var10000;
                     }

                     var7.method_4731(var0, var2, var3, var18, (class_91)var33, (class_91)var26, class_166.field_2068[var5], class_166.field_2068[var31], var21, var23);
                     if(1384594797 * var10.field_818 != 0) {
                        if(var9 == 0) {
                           return;
                        }

                        var8.method_4623(var2, var3, var6, var5, var10.field_837, -1946469678);
                     }

                     return;
                  }

                  if(var6 == 3) {
                     if(var9 == 0) {
                        return;
                     }

                     label408: {
                        if(91732693 * var10.field_824 == -1) {
                           if(var9 == 0) {
                              throw new IllegalStateException();
                           }

                           if(var10.field_842 == null) {
                              var24 = var10.method_1489(3, var5, var17, var19, var18, var20, -925676771);
                              break label408;
                           }
                        }

                        var10000 = new class_96(var4, 3, var5, var1, var2, var3, var10.field_824 * 91732693, var10.field_850, (class_91)null);
                        var24 = var10000;
                     }

                     var7.method_4731(var0, var2, var3, var18, (class_91)var24, (class_91)null, class_166.field_2076[var5], 0, var21, var23);
                     if(1384594797 * var10.field_818 != 0) {
                        if(var9 == 0) {
                           throw new IllegalStateException();
                        }

                        var8.method_4623(var2, var3, var6, var5, var10.field_837, -1946469678);
                     }

                     return;
                  }

                  if(var6 == 9) {
                     if(var9 == 0) {
                        throw new IllegalStateException();
                     }

                     label417: {
                        if(var10.field_824 * 91732693 == -1) {
                           if(var9 == 0) {
                              return;
                           }

                           if(null == var10.field_842) {
                              if(var9 == 0) {
                                 return;
                              }

                              var24 = var10.method_1489(var6, var5, var17, var19, var18, var20, -925676771);
                              break label417;
                           }
                        }

                        var10000 = new class_96(var4, var6, var5, var1, var2, var3, 91732693 * var10.field_824, var10.field_850, (class_91)null);
                        var24 = var10000;
                     }

                     var7.method_4807(var0, var2, var3, var18, 1, 1, (class_91)var24, 0, var21, var23);
                     if(1384594797 * var10.field_818 != 0) {
                        if(var9 == 0) {
                           return;
                        }

                        var8.method_4611(var2, var3, var11, var12, var10.field_837, -530800467);
                     }

                     return;
                  }

                  if(4 == var6) {
                     if(var9 == 0) {
                        throw new IllegalStateException();
                     }

                     label426: {
                        if(var10.field_824 * 91732693 == -1) {
                           if(var9 == 0) {
                              throw new IllegalStateException();
                           }

                           if(var10.field_842 == null) {
                              if(var9 == 0) {
                                 throw new IllegalStateException();
                              }

                              var24 = var10.method_1489(4, var5, var17, var19, var18, var20, -925676771);
                              break label426;
                           }
                        }

                        var10000 = new class_96(var4, 4, var5, var1, var2, var3, 91732693 * var10.field_824, var10.field_850, (class_91)null);
                        var24 = var10000;
                     }

                     var7.method_4732(var0, var2, var3, var18, (class_91)var24, (class_91)null, class_166.field_2068[var5], 0, 0, 0, var21, var23);
                     return;
                  }

                  long var25;
                  Object var27;
                  if(5 == var6) {
                     if(var9 == 0) {
                        throw new IllegalStateException();
                     }

                     var31 = 16;
                     var25 = var7.method_4749(var0, var2, var3);
                     if(var25 != 0L) {
                        if(var9 == 0) {
                           throw new IllegalStateException();
                        }

                        var31 = class_121.method_2269(class_164.method_3425(var25), 1297719217).field_810 * -2141564523;
                     }

                     label435: {
                        if(-1 == 91732693 * var10.field_824) {
                           if(var9 == 0) {
                              return;
                           }

                           if(null == var10.field_842) {
                              if(var9 == 0) {
                                 throw new IllegalStateException();
                              }

                              var27 = var10.method_1489(4, var5, var17, var19, var18, var20, -925676771);
                              break label435;
                           }
                        }

                        var10000 = new class_96(var4, 4, var5, var1, var2, var3, var10.field_824 * 91732693, var10.field_850, (class_91)null);
                        var27 = var10000;
                     }

                     var7.method_4732(var0, var2, var3, var18, (class_91)var27, (class_91)null, class_166.field_2068[var5], 0, var31 * class_166.field_2077[var5], class_166.field_2074[var5] * var31, var21, var23);
                     return;
                  }

                  if(var6 == 6) {
                     if(var9 == 0) {
                        throw new IllegalStateException();
                     }

                     var31 = 8;
                     var25 = var7.method_4749(var0, var2, var3);
                     if(0L != var25) {
                        if(var9 == 0) {
                           throw new IllegalStateException();
                        }

                        var31 = class_121.method_2269(class_164.method_3425(var25), -205194871).field_810 * -2141564523 / 2;
                     }

                     label446: {
                        if(-1 == var10.field_824 * 91732693) {
                           if(var9 == 0) {
                              return;
                           }

                           if(var10.field_842 == null) {
                              var27 = var10.method_1489(4, var5 + 4, var17, var19, var18, var20, -925676771);
                              break label446;
                           }
                        }

                        var10000 = new class_96(var4, 4, 4 + var5, var1, var2, var3, 91732693 * var10.field_824, var10.field_850, (class_91)null);
                        var27 = var10000;
                     }

                     var7.method_4732(var0, var2, var3, var18, (class_91)var27, (class_91)null, 256, var5, class_166.field_2079[var5] * var31, var31 * class_166.field_2080[var5], var21, var23);
                     return;
                  }

                  if(var6 == 7) {
                     if(var9 == 0) {
                        return;
                     }

                     int var32;
                     label457: {
                        var32 = var5 + 2 & 3;
                        if(-1 == var10.field_824 * 91732693) {
                           if(var9 == 0) {
                              throw new IllegalStateException();
                           }

                           if(var10.field_842 == null) {
                              var24 = var10.method_1489(4, var32 + 4, var17, var19, var18, var20, -925676771);
                              break label457;
                           }
                        }

                        var10000 = new class_96(var4, 4, var32 + 4, var1, var2, var3, var10.field_824 * 91732693, var10.field_850, (class_91)null);
                        var24 = var10000;
                     }

                     var7.method_4732(var0, var2, var3, var18, (class_91)var24, (class_91)null, 256, var32, 0, 0, var21, var23);
                     return;
                  }

                  if(var6 != 8) {
                     return;
                  }

                  if(var9 == 0) {
                     return;
                  }

                  var31 = 8;
                  var25 = var7.method_4749(var0, var2, var3);
                  if(var25 != 0L) {
                     if(var9 == 0) {
                        return;
                     }

                     var31 = class_121.method_2269(class_164.method_3425(var25), 1260104055).field_810 * -2141564523 / 2;
                  }

                  Object var28;
                  label464: {
                     int var29 = var5 + 2 & 3;
                     if(var10.field_824 * 91732693 == -1) {
                        if(var9 == 0) {
                           throw new IllegalStateException();
                        }

                        if(null == var10.field_842) {
                           if(var9 == 0) {
                              throw new IllegalStateException();
                           }

                           var27 = var10.method_1489(4, var5 + 4, var17, var19, var18, var20, -925676771);
                           var28 = var10.method_1489(4, 4 + var29, var17, var19, var18, var20, -925676771);
                           break label464;
                        }
                     }

                     var10000 = new class_96(var4, 4, 4 + var5, var1, var2, var3, var10.field_824 * 91732693, var10.field_850, (class_91)null);
                     var27 = var10000;
                     var10000 = new class_96(var4, 4, var29 + 4, var1, var2, var3, var10.field_824 * 91732693, var10.field_850, (class_91)null);
                     var28 = var10000;
                  }

                  var7.method_4732(var0, var2, var3, var18, (class_91)var27, (class_91)var28, 256, var5, var31 * class_166.field_2079[var5], var31 * class_166.field_2080[var5], var21, var23);
                  return;
               }

               if(var9 == 0) {
                  throw new IllegalStateException();
               }
            }

            label481: {
               if(-1 == 91732693 * var10.field_824) {
                  if(var9 == 0) {
                     return;
                  }

                  if(null == var10.field_842) {
                     if(var9 == 0) {
                        throw new IllegalStateException();
                     }

                     var24 = var10.method_1489(10, var5, var17, var19, var18, var20, -925676771);
                     break label481;
                  }
               }

               var10000 = new class_96(var4, 10, var5, var1, var2, var3, var10.field_824 * 91732693, var10.field_850, (class_91)null);
               var24 = var10000;
            }

            if(null != var24) {
               if(var9 == 0) {
                  return;
               }

               short var10008;
               if(11 == var6) {
                  if(var9 == 0) {
                     throw new IllegalStateException();
                  }

                  var10008 = 256;
               } else {
                  var10008 = 0;
               }

               var7.method_4807(var0, var2, var3, var18, var11, var12, (class_91)var24, var10008, var21, var23);
            }

            if(1384594797 * var10.field_818 != 0) {
               var8.method_4611(var2, var3, var11, var12, var10.field_837, -216710517);
            }

         }
      } catch (RuntimeException var30) {
         throw class_223.method_4281(var30);
      }
   }

   // $FF: renamed from: <init> () void
   class_141() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }
}
