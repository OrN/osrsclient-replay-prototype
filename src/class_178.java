
// $FF: renamed from: s
public class class_178 {

    // $FF: renamed from: n int
   public int field_2217;
    // $FF: renamed from: mq int
   static int field_2220;
   // $FF: renamed from: v byte
   public byte field_2221;
   // $FF: renamed from: f java.lang.String
   public String field_2222;


   // $FF: renamed from: b (boolean, byte) void
   static void method_3797(boolean var0, byte var1) {
      try {
         class_177.field_2196 = class_305.field_3617;
         class_177.field_2197 = class_305.field_3618;
         class_177.field_2213 = class_305.field_3619;
         class_177.field_2194 = -137370906;
         if(var0) {
            class_177.field_2212 = "";
         }

         label58: {
            if(class_177.email != null) {
               if(var1 <= 49) {
                  throw new IllegalStateException();
               }

               if(class_177.email.length() > 0) {
                  if(var1 <= 49) {
                     throw new IllegalStateException();
                  }
                  break label58;
               }
            }

            if(null != class_87.preferences.rememberedEmail) {
               class_177.email = class_87.preferences.rememberedEmail;
               client.rememberEmail = true;
            } else {
               client.rememberEmail = false;
            }
         }

         if(client.rememberEmail) {
            if(var1 <= 49) {
               return;
            }

            if(null != class_177.email) {
               if(var1 <= 49) {
                  throw new IllegalStateException();
               }

               if(class_177.email.length() > 0) {
                  if(var1 <= 49) {
                     throw new IllegalStateException();
                  }

                  class_177.field_2204 = 129356965;
                  return;
               }
            }
         }

         class_177.field_2204 = 0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: kz (int) void
   static final void method_3798(int var0) {
      try {
         for(int var1 = 0; var1 < class_195.field_2313 * -1143549299; ++var1) {
            if(var0 == 1653898083) {
               throw new IllegalStateException();
            }

            class_100 var2 = client.field_1605[class_195.field_2318[var1]];
            var2.method_1828();
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: v (int, int, int, int) int
   public static int method_3799(int var0, int var1, int var2, int var3) {
      try {
         var2 &= 3;
         if(var2 == 0) {
            return var1;
         } else if(var2 == 1) {
            if(var3 != -1338731866) {
               throw new IllegalStateException();
            } else {
               return 7 - var0;
            }
         } else {
            return var2 == 2?7 - var1:var0;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: y (int) boolean
   public static final boolean method_3800(int var0) {
      try {
         class_145 var1 = class_145.field_1846;
         synchronized(class_145.field_1846) {
            if(class_145.field_1848 * 924382931 == class_145.field_1850 * 300307947) {
               if(var0 != -1385459044) {
                  throw new IllegalStateException();
               } else {
                  return false;
               }
            } else {
               class_80.field_752 = class_145.field_1844[924382931 * class_145.field_1848] * -1755971127;
               class_283.field_3253 = class_145.field_1841[924382931 * class_145.field_1848];
               class_145.field_1848 = 237687131 * (class_145.field_1848 * 924382931 + 1 & 127);
               return true;
            }
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: v (id, int) void
   public static void method_3801(class_276 var0) {
      try {
         class_283.field_3254 = var0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: <init> () void
   class_178() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: b (int, int, int, int, int, int, gt, fz, byte) void
   static final void method_3803(int var0, int var1, int var2, int var3, int var4, int var5, class_251 var6, class_240 var7, byte var8) {
      try {
         if(client.field_1417) {
            if(var8 == 6) {
               throw new IllegalStateException();
            }

            if((class_166.field_2069[0][var1][var2] & 2) == 0) {
               if(var8 == 6) {
                  throw new IllegalStateException();
               }

               if(0 != (class_166.field_2069[var0][var1][var2] & 16)) {
                  if(var8 == 6) {
                     throw new IllegalStateException();
                  }

                  return;
               }
            }
         }

         if(var0 < class_166.field_2070 * 1752941579) {
            if(var8 == 6) {
               throw new IllegalStateException();
            }

            class_166.field_2070 = 1867360163 * var0;
         }

         class_87 var9;
         int var10;
         int var11;
         label857: {
            var9 = class_121.method_2269(var3, 1222341702);
            if(var4 != 1) {
               if(var8 == 6) {
                  throw new IllegalStateException();
               }

               if(var4 != 3) {
                  var10 = var9.field_839 * -288612135;
                  var11 = -1812944985 * var9.field_851;
                  break label857;
               }

               if(var8 == 6) {
                  throw new IllegalStateException();
               }
            }

            var10 = -1812944985 * var9.field_851;
            var11 = var9.field_839 * -288612135;
         }

         int var12;
         int var13;
         if(var10 + var1 <= 104) {
            if(var8 == 6) {
               throw new IllegalStateException();
            }

            var12 = (var10 >> 1) + var1;
            var13 = var1 + (var10 + 1 >> 1);
         } else {
            var12 = var1;
            var13 = 1 + var1;
         }

         int var14;
         int var15;
         if(var11 + var2 <= 104) {
            if(var8 == 6) {
               throw new IllegalStateException();
            }

            var14 = var2 + (var11 >> 1);
            var15 = var2 + (var11 + 1 >> 1);
         } else {
            var14 = var2;
            var15 = var2 + 1;
         }

         int[][] var16 = class_166.field_2078[var0];
         int var17 = var16[var13][var15] + var16[var12][var15] + var16[var13][var14] + var16[var12][var14] >> 2;
         int var18 = (var10 << 6) + (var1 << 7);
         int var19 = (var2 << 7) + (var11 << 6);
         long var20 = class_141.method_3047(var1, var2, 2, 0 == -1747290425 * var9.field_820, var3, 1366033806);
         int var22 = var5 + (var4 << 6);
         if(var9.field_841 * -1364896901 == 1) {
            if(var8 == 6) {
               return;
            }

            var22 += 256;
         }

         if(var9.method_1496((byte)16)) {
            if(var8 == 6) {
               throw new IllegalStateException();
            }

            class_304.method_5370(var0, var1, var2, var9, var4, (byte)2);
         }

         class_96 var10000;
         Object var23;
         if(var5 == 22) {
            if(var8 == 6) {
               throw new IllegalStateException();
            } else {
               if(client.field_1417) {
                  if(var8 == 6) {
                     throw new IllegalStateException();
                  }

                  if(var9.field_820 * -1747290425 == 0) {
                     if(var8 == 6) {
                        throw new IllegalStateException();
                     }

                     if(var9.field_818 * 1384594797 != 1) {
                        if(var8 == 6) {
                           throw new IllegalStateException();
                        }

                        if(!var9.field_843) {
                           if(var8 == 6) {
                              return;
                           }

                           return;
                        }
                     }
                  }
               }

               label711: {
                  if(var9.field_824 * 91732693 == -1) {
                     if(var8 == 6) {
                        throw new IllegalStateException();
                     }

                     if(var9.field_842 == null) {
                        if(var8 == 6) {
                           throw new IllegalStateException();
                        }

                        var23 = var9.method_1488(22, var4, var16, var18, var17, var19, (byte)8);
                        break label711;
                     }
                  }

                  var10000 = new class_96(var3, 22, var4, var0, var1, var2, 91732693 * var9.field_824, var9.field_850, (class_91)null);
                  var23 = var10000;
               }

               var6.method_4729(var0, var1, var2, var17, (class_91)var23, var20, var22);
               if(1 == var9.field_818 * 1384594797) {
                  if(var8 == 6) {
                     return;
                  }

                  if(null != var7) {
                     if(var8 == 6) {
                        throw new IllegalStateException();
                     }

                     var7.method_4624(var1, var2);
                  }
               }

            }
         } else {
            int var24;
            if(var5 != 10) {
               if(var8 == 6) {
                  throw new IllegalStateException();
               }

               if(var5 != 11) {
                  if(var5 >= 12) {
                     if(var8 == 6) {
                        throw new IllegalStateException();
                     }

                     label722: {
                        if(var9.field_824 * 91732693 == -1) {
                           if(var8 == 6) {
                              return;
                           }

                           if(var9.field_842 == null) {
                              if(var8 == 6) {
                                 throw new IllegalStateException();
                              }

                              var23 = var9.method_1488(var5, var4, var16, var18, var17, var19, (byte)104);
                              break label722;
                           }
                        }

                        var10000 = new class_96(var3, var5, var4, var0, var1, var2, var9.field_824 * 91732693, var9.field_850, (class_91)null);
                        var23 = var10000;
                     }

                     var6.method_4807(var0, var1, var2, var17, 1, 1, (class_91)var23, 0, var20, var22);
                     if(var5 >= 12) {
                        if(var8 == 6) {
                           throw new IllegalStateException();
                        }

                        if(var5 <= 17) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           if(var5 != 13) {
                              if(var8 == 6) {
                                 throw new IllegalStateException();
                              }

                              if(var0 > 0) {
                                 if(var8 == 6) {
                                    throw new IllegalStateException();
                                 }

                                 class_200.field_2350[var0][var1][var2] |= 2340;
                              }
                           }
                        }
                     }

                     if(0 != var9.field_818 * 1384594797) {
                        if(var8 == 6) {
                           throw new IllegalStateException();
                        }

                        if(null != var7) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           var7.method_4611(var1, var2, var10, var11, var9.field_837, 870399692);
                        }
                     }

                     return;
                  }

                  if(var5 == 0) {
                     label730: {
                        if(-1 == 91732693 * var9.field_824) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           if(null == var9.field_842) {
                              if(var8 == 6) {
                                 throw new IllegalStateException();
                              }

                              var23 = var9.method_1488(0, var4, var16, var18, var17, var19, (byte)82);
                              break label730;
                           }
                        }

                        var10000 = new class_96(var3, 0, var4, var0, var1, var2, 91732693 * var9.field_824, var9.field_850, (class_91)null);
                        var23 = var10000;
                     }

                     var6.method_4731(var0, var1, var2, var17, (class_91)var23, (class_91)null, class_166.field_2068[var4], 0, var20, var22);
                     if(var4 == 0) {
                        if(var8 == 6) {
                           throw new IllegalStateException();
                        }

                        if(var9.field_832) {
                           if(var8 == 6) {
                              return;
                           }

                           class_391.field_4244[var0][var1][var2] = 50;
                           class_391.field_4244[var0][var1][var2 + 1] = 50;
                        }

                        if(var9.field_816) {
                           class_200.field_2350[var0][var1][var2] |= 585;
                        }
                     } else if(var4 == 1) {
                        if(var9.field_832) {
                           if(var8 == 6) {
                              return;
                           }

                           class_391.field_4244[var0][var1][var2 + 1] = 50;
                           class_391.field_4244[var0][var1 + 1][1 + var2] = 50;
                        }

                        if(var9.field_816) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           class_200.field_2350[var0][var1][1 + var2] |= 1170;
                        }
                     } else if(var4 == 2) {
                        if(var9.field_832) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           class_391.field_4244[var0][1 + var1][var2] = 50;
                           class_391.field_4244[var0][1 + var1][var2 + 1] = 50;
                        }

                        if(var9.field_816) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           class_200.field_2350[var0][var1 + 1][var2] |= 585;
                        }
                     } else if(var4 == 3) {
                        if(var9.field_832) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           class_391.field_4244[var0][var1][var2] = 50;
                           class_391.field_4244[var0][var1 + 1][var2] = 50;
                        }

                        if(var9.field_816) {
                           if(var8 == 6) {
                              return;
                           }

                           class_200.field_2350[var0][var1][var2] |= 1170;
                        }
                     }

                     if(0 != 1384594797 * var9.field_818) {
                        if(var8 == 6) {
                           return;
                        }

                        if(var7 != null) {
                           if(var8 == 6) {
                              return;
                           }

                           var7.method_4623(var1, var2, var5, var4, var9.field_837, -1946469678);
                        }
                     }

                     if(16 != var9.field_810 * -2141564523) {
                        if(var8 == 6) {
                           return;
                        }

                        var6.method_4766(var0, var1, var2, -2141564523 * var9.field_810);
                     }

                     return;
                  }

                  if(1 == var5) {
                     if(var8 == 6) {
                        throw new IllegalStateException();
                     }

                     label738: {
                        if(-1 == var9.field_824 * 91732693) {
                           if(var8 == 6) {
                              return;
                           }

                           if(var9.field_842 == null) {
                              if(var8 == 6) {
                                 throw new IllegalStateException();
                              }

                              var23 = var9.method_1488(1, var4, var16, var18, var17, var19, (byte)23);
                              break label738;
                           }
                        }

                        var10000 = new class_96(var3, 1, var4, var0, var1, var2, var9.field_824 * 91732693, var9.field_850, (class_91)null);
                        var23 = var10000;
                     }

                     var6.method_4731(var0, var1, var2, var17, (class_91)var23, (class_91)null, class_166.field_2076[var4], 0, var20, var22);
                     if(var9.field_832) {
                        if(var4 == 0) {
                           if(var8 == 6) {
                              return;
                           }

                           class_391.field_4244[var0][var1][1 + var2] = 50;
                        } else if(1 == var4) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           class_391.field_4244[var0][var1 + 1][1 + var2] = 50;
                        } else if(var4 == 2) {
                           if(var8 == 6) {
                              return;
                           }

                           class_391.field_4244[var0][1 + var1][var2] = 50;
                        } else if(3 == var4) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           class_391.field_4244[var0][var1][var2] = 50;
                        }
                     }

                     if(1384594797 * var9.field_818 != 0) {
                        if(var8 == 6) {
                           throw new IllegalStateException();
                        }

                        if(var7 != null) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           var7.method_4623(var1, var2, var5, var4, var9.field_837, -1946469678);
                        }
                     }

                     return;
                  }

                  int var30;
                  if(var5 == 2) {
                     if(var8 == 6) {
                        return;
                     }

                     var30 = 1 + var4 & 3;
                     Object var32;
                     Object var33;
                     if(-1 == 91732693 * var9.field_824 && null == var9.field_842) {
                        if(var8 == 6) {
                           throw new IllegalStateException();
                        }

                        var33 = var9.method_1488(2, var4 + 4, var16, var18, var17, var19, (byte)53);
                        var32 = var9.method_1488(2, var30, var16, var18, var17, var19, (byte)31);
                     } else {
                        var10000 = new class_96(var3, 2, 4 + var4, var0, var1, var2, var9.field_824 * 91732693, var9.field_850, (class_91)null);
                        var33 = var10000;
                        var10000 = new class_96(var3, 2, var30, var0, var1, var2, var9.field_824 * 91732693, var9.field_850, (class_91)null);
                        var32 = var10000;
                     }

                     var6.method_4731(var0, var1, var2, var17, (class_91)var33, (class_91)var32, class_166.field_2068[var4], class_166.field_2068[var30], var20, var22);
                     if(var9.field_816) {
                        if(var4 == 0) {
                           class_200.field_2350[var0][var1][var2] |= 585;
                           class_200.field_2350[var0][var1][1 + var2] |= 1170;
                        } else if(1 == var4) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           class_200.field_2350[var0][var1][var2 + 1] |= 1170;
                           class_200.field_2350[var0][var1 + 1][var2] |= 585;
                        } else if(2 == var4) {
                           if(var8 == 6) {
                              return;
                           }

                           class_200.field_2350[var0][1 + var1][var2] |= 585;
                           class_200.field_2350[var0][var1][var2] |= 1170;
                        } else if(var4 == 3) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           class_200.field_2350[var0][var1][var2] |= 1170;
                           class_200.field_2350[var0][var1][var2] |= 585;
                        }
                     }

                     if(1384594797 * var9.field_818 != 0 && null != var7) {
                        var7.method_4623(var1, var2, var5, var4, var9.field_837, -1946469678);
                     }

                     if(16 != var9.field_810 * -2141564523) {
                        if(var8 == 6) {
                           throw new IllegalStateException();
                        }

                        var6.method_4766(var0, var1, var2, var9.field_810 * -2141564523);
                     }

                     return;
                  }

                  if(3 == var5) {
                     label755: {
                        if(var9.field_824 * 91732693 == -1) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           if(null == var9.field_842) {
                              if(var8 == 6) {
                                 throw new IllegalStateException();
                              }

                              var23 = var9.method_1488(3, var4, var16, var18, var17, var19, (byte)42);
                              break label755;
                           }
                        }

                        var10000 = new class_96(var3, 3, var4, var0, var1, var2, 91732693 * var9.field_824, var9.field_850, (class_91)null);
                        var23 = var10000;
                     }

                     var6.method_4731(var0, var1, var2, var17, (class_91)var23, (class_91)null, class_166.field_2076[var4], 0, var20, var22);
                     if(var9.field_832) {
                        if(var8 == 6) {
                           throw new IllegalStateException();
                        }

                        if(var4 == 0) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           class_391.field_4244[var0][var1][var2 + 1] = 50;
                        } else if(var4 == 1) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           class_391.field_4244[var0][var1 + 1][1 + var2] = 50;
                        } else if(var4 == 2) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           class_391.field_4244[var0][1 + var1][var2] = 50;
                        } else if(var4 == 3) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           class_391.field_4244[var0][var1][var2] = 50;
                        }
                     }

                     if(0 != var9.field_818 * 1384594797) {
                        if(var8 == 6) {
                           throw new IllegalStateException();
                        }

                        if(null != var7) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           var7.method_4623(var1, var2, var5, var4, var9.field_837, -1946469678);
                        }
                     }

                     return;
                  }

                  if(9 == var5) {
                     if(var8 == 6) {
                        return;
                     }

                     label763: {
                        if(-1 == var9.field_824 * 91732693) {
                           if(var8 == 6) {
                              return;
                           }

                           if(null == var9.field_842) {
                              var23 = var9.method_1488(var5, var4, var16, var18, var17, var19, (byte)120);
                              break label763;
                           }
                        }

                        var10000 = new class_96(var3, var5, var4, var0, var1, var2, var9.field_824 * 91732693, var9.field_850, (class_91)null);
                        var23 = var10000;
                     }

                     var6.method_4807(var0, var1, var2, var17, 1, 1, (class_91)var23, 0, var20, var22);
                     if(var9.field_818 * 1384594797 != 0 && var7 != null) {
                        if(var8 == 6) {
                           throw new IllegalStateException();
                        }

                        var7.method_4611(var1, var2, var10, var11, var9.field_837, 207361478);
                     }

                     if(var9.field_810 * -2141564523 != 16) {
                        var6.method_4766(var0, var1, var2, var9.field_810 * -2141564523);
                     }

                     return;
                  }

                  if(4 == var5) {
                     if(var8 == 6) {
                        throw new IllegalStateException();
                     }

                     label772: {
                        if(-1 == 91732693 * var9.field_824) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           if(var9.field_842 == null) {
                              if(var8 == 6) {
                                 throw new IllegalStateException();
                              }

                              var23 = var9.method_1488(4, var4, var16, var18, var17, var19, (byte)34);
                              break label772;
                           }
                        }

                        var10000 = new class_96(var3, 4, var4, var0, var1, var2, var9.field_824 * 91732693, var9.field_850, (class_91)null);
                        var23 = var10000;
                     }

                     var6.method_4732(var0, var1, var2, var17, (class_91)var23, (class_91)null, class_166.field_2068[var4], 0, 0, 0, var20, var22);
                     return;
                  }

                  long var31;
                  Object var34;
                  if(5 == var5) {
                     if(var8 == 6) {
                        throw new IllegalStateException();
                     }

                     var30 = 16;
                     var31 = var6.method_4749(var0, var1, var2);
                     if(0L != var31) {
                        if(var8 == 6) {
                           throw new IllegalStateException();
                        }

                        var30 = class_121.method_2269(class_164.method_3425(var31), -601221383).field_810 * -2141564523;
                     }

                     label781: {
                        if(-1 == 91732693 * var9.field_824) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           if(null == var9.field_842) {
                              if(var8 == 6) {
                                 throw new IllegalStateException();
                              }

                              var34 = var9.method_1488(4, var4, var16, var18, var17, var19, (byte)11);
                              break label781;
                           }
                        }

                        var10000 = new class_96(var3, 4, var4, var0, var1, var2, var9.field_824 * 91732693, var9.field_850, (class_91)null);
                        var34 = var10000;
                     }

                     var6.method_4732(var0, var1, var2, var17, (class_91)var34, (class_91)null, class_166.field_2068[var4], 0, var30 * class_166.field_2077[var4], var30 * class_166.field_2074[var4], var20, var22);
                     return;
                  }

                  if(var5 == 6) {
                     if(var8 == 6) {
                        throw new IllegalStateException();
                     }

                     var30 = 8;
                     var31 = var6.method_4749(var0, var1, var2);
                     if(var31 != 0L) {
                        if(var8 == 6) {
                           throw new IllegalStateException();
                        }

                        var30 = class_121.method_2269(class_164.method_3425(var31), -1544658794).field_810 * -2141564523 / 2;
                     }

                     label792: {
                        if(var9.field_824 * 91732693 == -1) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           if(null == var9.field_842) {
                              var34 = var9.method_1488(4, 4 + var4, var16, var18, var17, var19, (byte)97);
                              break label792;
                           }
                        }

                        var10000 = new class_96(var3, 4, 4 + var4, var0, var1, var2, 91732693 * var9.field_824, var9.field_850, (class_91)null);
                        var34 = var10000;
                     }

                     var6.method_4732(var0, var1, var2, var17, (class_91)var34, (class_91)null, 256, var4, class_166.field_2079[var4] * var30, class_166.field_2080[var4] * var30, var20, var22);
                     return;
                  }

                  if(var5 == 7) {
                     if(var8 == 6) {
                        throw new IllegalStateException();
                     }

                     label803: {
                        var24 = 2 + var4 & 3;
                        if(var9.field_824 * 91732693 == -1) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           if(null == var9.field_842) {
                              if(var8 == 6) {
                                 throw new IllegalStateException();
                              }

                              var23 = var9.method_1488(4, 4 + var24, var16, var18, var17, var19, (byte)28);
                              break label803;
                           }
                        }

                        var10000 = new class_96(var3, 4, var24 + 4, var0, var1, var2, 91732693 * var9.field_824, var9.field_850, (class_91)null);
                        var23 = var10000;
                     }

                     var6.method_4732(var0, var1, var2, var17, (class_91)var23, (class_91)null, 256, var24, 0, 0, var20, var22);
                     return;
                  }

                  if(var5 == 8) {
                     var30 = 8;
                     var31 = var6.method_4749(var0, var1, var2);
                     if(0L != var31) {
                        if(var8 == 6) {
                           return;
                        }

                        var30 = class_121.method_2269(class_164.method_3425(var31), 1583331661).field_810 * -2141564523 / 2;
                     }

                     Object var27;
                     label812: {
                        int var28 = var4 + 2 & 3;
                        if(91732693 * var9.field_824 == -1) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           if(null == var9.field_842) {
                              if(var8 == 6) {
                                 throw new IllegalStateException();
                              }

                              var34 = var9.method_1488(4, var4 + 4, var16, var18, var17, var19, (byte)11);
                              var27 = var9.method_1488(4, var28 + 4, var16, var18, var17, var19, (byte)24);
                              break label812;
                           }
                        }

                        var10000 = new class_96(var3, 4, var4 + 4, var0, var1, var2, var9.field_824 * 91732693, var9.field_850, (class_91)null);
                        var34 = var10000;
                        var10000 = new class_96(var3, 4, 4 + var28, var0, var1, var2, 91732693 * var9.field_824, var9.field_850, (class_91)null);
                        var27 = var10000;
                     }

                     var6.method_4732(var0, var1, var2, var17, (class_91)var34, (class_91)var27, 256, var4, var30 * class_166.field_2079[var4], class_166.field_2080[var4] * var30, var20, var22);
                     return;
                  }

                  return;
               }

               if(var8 == 6) {
                  throw new IllegalStateException();
               }
            }

            label846: {
               if(-1 == 91732693 * var9.field_824) {
                  if(var8 == 6) {
                     throw new IllegalStateException();
                  }

                  if(var9.field_842 == null) {
                     if(var8 == 6) {
                        throw new IllegalStateException();
                     }

                     var23 = var9.method_1488(10, var4, var16, var18, var17, var19, (byte)109);
                     break label846;
                  }
               }

               var10000 = new class_96(var3, 10, var4, var0, var1, var2, var9.field_824 * 91732693, var9.field_850, (class_91)null);
               var23 = var10000;
            }

            if(null != var23) {
               if(var8 == 6) {
                  throw new IllegalStateException();
               }

               short var10008;
               if(11 == var5) {
                  if(var8 == 6) {
                     throw new IllegalStateException();
                  }

                  var10008 = 256;
               } else {
                  var10008 = 0;
               }

               if(var6.method_4807(var0, var1, var2, var17, var10, var11, (class_91)var23, var10008, var20, var22)) {
                  if(var8 == 6) {
                     return;
                  }

                  if(var9.field_832) {
                     if(var8 == 6) {
                        throw new IllegalStateException();
                     }

                     var24 = 15;
                     if(var23 instanceof class_92) {
                        var24 = ((class_92)var23).method_1649() / 4;
                        if(var24 > 30) {
                           if(var8 == 6) {
                              return;
                           }

                           var24 = 30;
                        }
                     }

                     for(int var25 = 0; var25 <= var10; ++var25) {
                        if(var8 == 6) {
                           throw new IllegalStateException();
                        }

                        for(int var26 = 0; var26 <= var11; ++var26) {
                           if(var8 == 6) {
                              throw new IllegalStateException();
                           }

                           if(var24 > class_391.field_4244[var0][var1 + var25][var2 + var26]) {
                              if(var8 == 6) {
                                 throw new IllegalStateException();
                              }

                              class_391.field_4244[var0][var25 + var1][var26 + var2] = (byte)var24;
                           }
                        }
                     }
                  }
               }
            }

            if(1384594797 * var9.field_818 != 0 && null != var7) {
               if(var8 == 6) {
                  throw new IllegalStateException();
               }

               var7.method_4611(var1, var2, var10, var11, var9.field_837, 281902458);
            }

         }
      } catch (RuntimeException var29) {
         throw class_223.method_4281(var29);
      }
   }

   // $FF: renamed from: f (int, int, byte) bi
   static class_101 method_3804(int var0, int var1) {
      try {
         class_175 var3 = (class_175)class_197.field_2338.get(Integer.valueOf(var0));
         return var3.method_3733(var1, -94614591);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }
}
