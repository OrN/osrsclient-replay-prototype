
// $FF: renamed from: cs
public class class_175 {

   // $FF: renamed from: v int
   static final int field_2169 = 100;
   // $FF: renamed from: ey int
   static int field_2170;
   // $FF: renamed from: f int
   int field_2171;
   // $FF: renamed from: s int[]
   static int[] field_2172;
   // $FF: renamed from: ad int
   static final int field_2173 = 19136830;
   // $FF: renamed from: n bi[]
   class_101[] field_2174;
   // $FF: renamed from: d int
   public static final int field_2175 = 9;
   // $FF: renamed from: cp int
   static final int field_2176 = 102;


   // $FF: renamed from: f (byte) int
   int method_3731(byte var1) {
      try {
         return -1182640923 * this.field_2171;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "cs.f(" + ')');
      }
   }

   // $FF: renamed from: v (int, java.lang.String, java.lang.String, java.lang.String, int) bi
   class_101 method_3732(int var1, String var2, String var3, String var4, int var5) {
      try {
         class_101 var6 = this.field_2174[99];

         for(int var7 = this.field_2171 * -1182640923; var7 > 0; --var7) {
            if(var7 == 100) {
               if(var5 == -1377059989) {
                  throw new IllegalStateException();
               }
            } else {
               this.field_2174[var7] = this.field_2174[var7 - 1];
            }
         }

         if(var6 == null) {
            if(var5 == -1377059989) {
               throw new IllegalStateException();
            }

            class_101 var10000 = new class_101(var1, var2, var4, var3);
            var6 = var10000;
         } else {
            var6.method_108();
            var6.method_635();
            var6.method_1883(var1, var2, var4, var3, -449593753);
         }

         this.field_2174[0] = var6;
         if(-1182640923 * this.field_2171 < 100) {
            if(var5 == -1377059989) {
               throw new IllegalStateException();
            }

            this.field_2171 += 2016102637;
         }

         return var6;
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "cs.v(" + ')');
      }
   }

   // $FF: renamed from: n (int, int) bi
   class_101 method_3733(int var1, int var2) {
      try {
         if(var1 >= 0) {
            if(var2 != -94614591) {
               throw new IllegalStateException();
            }

            if(var1 < -1182640923 * this.field_2171) {
               return this.field_2174[var1];
            }

            if(var2 != -94614591) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "cs.n(" + ')');
      }
   }

   // $FF: renamed from: <init> () void
   class_175() {
      super();
      try {
         this.field_2174 = new class_101[100];
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "cs.<init>(" + ')');
      }
   }

   // $FF: renamed from: y (int, java.lang.String, java.lang.String, java.lang.String) bi
   class_101 method_3735(int var1, String var2, String var3, String var4) {
      class_101 var5 = this.field_2174[99];

      for(int var6 = this.field_2171 * -495110777; var6 > 0; --var6) {
         if(var6 != 100) {
            this.field_2174[var6] = this.field_2174[var6 - 1];
         }
      }

      if(var5 == null) {
         class_101 var10000 = new class_101(var1, var2, var4, var3);
         var5 = var10000;
      } else {
         var5.method_108();
         var5.method_635();
         var5.method_1883(var1, var2, var4, var3, 877871781);
      }

      this.field_2174[0] = var5;
      if(74750156 * this.field_2171 < 100) {
         this.field_2171 += 83025307;
      }

      return var5;
   }

   // $FF: renamed from: b (int, cf, boolean, byte) int
   static int method_3736(int var0, class_90 var1, boolean var2, byte var3) {
      try {
         boolean var4 = true;
         class_37 var5;
         if(var0 >= 2000) {
            if(var3 == 1) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            var5 = class_71.method_1047(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885], 1732711476);
            var4 = false;
         } else {
            class_37 var10000;
            if(var2) {
               if(var3 == 1) {
                  throw new IllegalStateException();
               }

               var10000 = class_124.field_1357;
            } else {
               var10000 = class_165.field_2064;
            }

            var5 = var10000;
         }

         int var10;
         if(var0 == 1300) {
            if(var3 == 1) {
               throw new IllegalStateException();
            } else {
               var10 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] - 1;
               if(var10 >= 0) {
                  if(var3 == 1) {
                     throw new IllegalStateException();
                  }

                  if(var10 <= 9) {
                     var5.method_410(var10, class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293], (byte)-22);
                     return 1;
                  }

                  if(var3 == 1) {
                     throw new IllegalStateException();
                  }
               }

               class_165.field_2054 -= 1647125333;
               return 1;
            }
         } else {
            int var7;
            if(1301 == var0) {
               if(var3 == 1) {
                  throw new IllegalStateException();
               } else {
                  class_136.field_1752 -= 2119512838;
                  var10 = class_165.field_2052[class_136.field_1752 * -26460885];
                  var7 = class_165.field_2052[-26460885 * class_136.field_1752 + 1];
                  var5.field_182 = class_325.method_5779(var10, var7, 458013745);
                  return 1;
               }
            } else {
               boolean var10001;
               if(1302 == var0) {
                  if(var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                        if(var3 == 1) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                     } else {
                        var10001 = false;
                     }

                     var5.field_96 = var10001;
                     return 1;
                  }
               } else if(1303 == var0) {
                  if(var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     var5.field_183 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] * -1211289725;
                     return 1;
                  }
               } else if(var0 == 1304) {
                  if(var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     var5.field_184 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] * 1442392119;
                     return 1;
                  }
               } else if(var0 == 1305) {
                  if(var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     var5.field_91 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                     return 1;
                  }
               } else if(var0 == 1306) {
                  if(var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     var5.field_110 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
                     return 1;
                  }
               } else if(var0 == 1307) {
                  if(var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     var5.field_129 = null;
                     return 1;
                  }
               } else if(var0 == 1308) {
                  if(var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                        if(var3 == 1) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                     } else {
                        var10001 = false;
                     }

                     var5.field_172 = var10001;
                     return 1;
                  }
               } else if(var0 == 1309) {
                  if(var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     class_136.field_1752 -= -1087727229;
                     return 1;
                  }
               } else {
                  int var8;
                  byte[] var12;
                  if(var0 == 1350) {
                     if(var3 == 1) {
                        throw new IllegalStateException();
                     } else {
                        byte[] var11 = null;
                        var12 = null;
                        if(var4) {
                           class_136.field_1752 -= 2007629598;

                           for(var8 = 0; var8 < 10; var8 += 2) {
                              if(var3 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(class_165.field_2052[class_136.field_1752 * -26460885 + var8] < 0) {
                                 if(var3 == 1) {
                                    throw new IllegalStateException();
                                 }
                                 break;
                              }
                           }

                           if(var8 > 0) {
                              if(var3 == 1) {
                                 throw new IllegalStateException();
                              }

                              var11 = new byte[var8 / 2];
                              var12 = new byte[var8 / 2];

                              for(var8 -= 2; var8 >= 0; var8 -= 2) {
                                 if(var3 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 var11[var8 / 2] = (byte)class_165.field_2052[var8 + -26460885 * class_136.field_1752];
                                 var12[var8 / 2] = (byte)class_165.field_2052[1 + class_136.field_1752 * -26460885 + var8];
                              }
                           }
                        } else {
                           class_136.field_1752 -= 2119512838;
                           var11 = new byte[]{(byte)class_165.field_2052[class_136.field_1752 * -26460885]};
                           var12 = new byte[]{(byte)class_165.field_2052[1 + -26460885 * class_136.field_1752]};
                        }

                        var8 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] - 1;
                        if(var8 >= 0) {
                           if(var3 == 1) {
                              throw new IllegalStateException();
                           }

                           if(var8 <= 9) {
                              class_273.method_5081(var5, var8, var11, var12, -26460885);
                              return 1;
                           }

                           if(var3 == 1) {
                              throw new IllegalStateException();
                           }
                        }

                        throw new RuntimeException();
                     }
                  } else {
                     byte var6;
                     if(var0 == 1351) {
                        if(var3 == 1) {
                           throw new IllegalStateException();
                        } else {
                           class_136.field_1752 -= 2119512838;
                           var6 = 10;
                           var12 = new byte[]{(byte)class_165.field_2052[class_136.field_1752 * -26460885]};
                           byte[] var13 = new byte[]{(byte)class_165.field_2052[class_136.field_1752 * -26460885 + 1]};
                           class_273.method_5081(var5, var6, var12, var13, -26460885);
                           return 1;
                        }
                     } else if(var0 == 1352) {
                        if(var3 == 1) {
                           throw new IllegalStateException();
                        } else {
                           class_136.field_1752 -= 1031785609;
                           var10 = class_165.field_2052[class_136.field_1752 * -26460885] - 1;
                           var7 = class_165.field_2052[1 + -26460885 * class_136.field_1752];
                           var8 = class_165.field_2052[class_136.field_1752 * -26460885 + 2];
                           if(var10 >= 0) {
                              if(var3 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var10 <= 9) {
                                 class_404.method_6843(var5, var10, var7, var8, (byte)-36);
                                 return 1;
                              }

                              if(var3 == 1) {
                                 throw new IllegalStateException();
                              }
                           }

                           throw new RuntimeException();
                        }
                     } else if(1353 == var0) {
                        if(var3 == 1) {
                           throw new IllegalStateException();
                        } else {
                           var6 = 10;
                           var7 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                           var8 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                           class_404.method_6843(var5, var6, var7, var8, (byte)-43);
                           return 1;
                        }
                     } else if(var0 == 1354) {
                        if(var3 == 1) {
                           throw new IllegalStateException();
                        } else {
                           class_136.field_1752 -= -1087727229;
                           var10 = class_165.field_2052[-26460885 * class_136.field_1752] - 1;
                           if(var10 >= 0 && var10 <= 9) {
                              class_121.method_2268(var5, var10, (byte)-104);
                              return 1;
                           } else {
                              throw new RuntimeException();
                           }
                        }
                     } else if(1355 == var0) {
                        if(var3 == 1) {
                           throw new IllegalStateException();
                        } else {
                           var6 = 10;
                           class_121.method_2268(var5, var6, (byte)-43);
                           return 1;
                        }
                     } else {
                        return 2;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9, "cs.b(" + ')');
      }
   }

   // $FF: renamed from: j (int) bi
   class_101 method_3737(int var1) {
      return var1 >= 0 && var1 < -1729706357 * this.field_2171?this.field_2174[var1]:null;
   }

   // $FF: renamed from: r (int) bi
   class_101 method_3738(int var1) {
      return var1 >= 0 && var1 < -802734255 * this.field_2171?this.field_2174[var1]:null;
   }

   // $FF: renamed from: v (jv, jv, int) void
   public static void method_3739(class_306 var0, class_306 var1, int var2) {
      try {
         class_394.field_4247 = var0;
         class_83.field_782 = var1;
         class_271.field_3187 = class_394.field_4247.method_5393(3, 933813720) * 376939071;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "cs.v(" + ')');
      }
   }

   // $FF: renamed from: n (java.lang.String[], int[], int) void
   public static void method_3740(String[] var0, int[] var1, int var2) {
      try {
         class_201.method_4060(var0, var1, 0, var0.length - 1, (byte)121);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "cs.n(" + ')');
      }
   }

   // $FF: renamed from: gd (int, int, int) void
   static final void method_3741(int var0, int var1, int var2) {
      try {
         if(client.field_1433 * -1764619255 != 2) {
            if(var2 <= 16777215) {
               throw new IllegalStateException();
            }
         } else {
            class_303.method_5369(client.field_1491 * -213439381 + (client.field_1436 * -659326571 - class_243.field_2700 * 697161691 << 7), client.field_1440 * 2031424669 + (122660467 * client.field_1437 - class_154.field_1929 * -27903763 << 7), -1867413038 * client.field_1438, -1158444411);
            if(client.field_1434 * 1057202329 > -1 && -1702273423 * client.field_1425 % 20 < 10) {
               class_40.field_270[0].method_767(client.field_1434 * 1057202329 + var0 - 12, var1 + client.field_1517 * -1775322899 - 28);
            }

         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "cs.gd(" + ')');
      }
   }

   // $FF: renamed from: u (int) void
   public static void method_3742(int var0) {
      try {
         class_275.field_3213.method_5074();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "cs.u(" + ')');
      }
   }

   // $FF: renamed from: p (int, java.lang.String, java.lang.String, java.lang.String) bi
   class_101 method_3743(int var1, String var2, String var3, String var4) {
      class_101 var5 = this.field_2174[99];

      for(int var6 = this.field_2171 * 144559705; var6 > 0; --var6) {
         if(var6 != 550330253) {
            this.field_2174[var6] = this.field_2174[var6 - 1];
         }
      }

      if(var5 == null) {
         class_101 var10000 = new class_101(var1, var2, var4, var3);
         var5 = var10000;
      } else {
         var5.method_108();
         var5.method_635();
         var5.method_1883(var1, var2, var4, var3, -511168425);
      }

      this.field_2174[0] = var5;
      if(-1182640923 * this.field_2171 < 100) {
         this.field_2171 += 2016102637;
      }

      return var5;
   }
}
