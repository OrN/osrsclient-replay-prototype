
// $FF: renamed from: bc
public final class class_103 extends class_27 {

   // $FF: renamed from: n int
   int field_1188;
   // $FF: renamed from: ag int
   static final int field_1189 = 35;
   // $FF: renamed from: c int
   int field_1190;
   // $FF: renamed from: y int
   int field_1191;
   // $FF: renamed from: p int
   int field_1192;
   // $FF: renamed from: j int
   int field_1193;
   // $FF: renamed from: b int
   int field_1194;
   // $FF: renamed from: d int
   int field_1195;
   // $FF: renamed from: u bv
   class_107 field_1196;
   // $FF: renamed from: s int
   int field_1197;
   // $FF: renamed from: f int
   int field_1198;
   // $FF: renamed from: o int[]
   int[] field_1199;
   // $FF: renamed from: l int
   int field_1200;
   // $FF: renamed from: e bv
   class_107 field_1201;
   // $FF: renamed from: r eg
   class_87 field_1202;
   // $FF: renamed from: v kx
   static class_335 field_1203;
   // $FF: renamed from: cp int
   static final int field_1204 = 13;


   // $FF: renamed from: g (int, int, int, int) void
   static void method_1916(int var0, int var1, int var2, int var3) {
      for(class_103 var4 = (class_103)field_1203.method_5944(); var4 != null; var4 = (class_103)field_1203.method_5972()) {
         if(-1 != 2113426875 * var4.field_1195 || var4.field_1199 != null) {
            int var5 = 0;
            if(var1 > var4.field_1192 * -1913199289) {
               var5 += var1 - -1913199289 * var4.field_1192;
            } else if(var1 < var4.field_1198 * 382039955) {
               var5 += var4.field_1198 * 382039955 - var1;
            }

            if(var2 > var4.field_1193 * 846164283) {
               var5 += var2 - var4.field_1193 * 846164283;
            } else if(var2 < var4.field_1191 * -377542945) {
               var5 += -377542945 * var4.field_1191 - var2;
            }

            if(var5 - 64 <= var4.field_1194 * 2101998419 && 0 != -1768933319 * class_87.field_852.field_2115 && var0 == var4.field_1188 * 1262714503) {
               var5 -= 64;
               if(var5 < 0) {
                  var5 = 0;
               }

               int var6 = class_87.field_852.field_2115 * -1768933319 * (var4.field_1194 * 2101998419 - var5) / (var4.field_1194 * 2101998419);
               if(null == var4.field_1196) {
                  if(var4.field_1195 * 2113426875 >= 0) {
                     class_24 var7 = class_24.method_79(class_137.field_1762, var4.field_1195 * 2113426875, 0);
                     if(var7 != null) {
                        class_110 var8 = var7.method_78().method_2225(class_94.field_1025);
                        class_107 var9 = class_107.method_2071(var8, 100, var6);
                        var9.method_2074(-1);
                        class_320.field_3804.method_2198(var9);
                        var4.field_1196 = var9;
                     }
                  }
               } else {
                  var4.field_1196.method_2075(var6);
               }

               if(var4.field_1201 == null) {
                  if(var4.field_1199 != null && (var4.field_1190 -= var3 * -1252270037) * 1313201795 <= 0) {
                     int var11 = (int)(Math.random() * (double)var4.field_1199.length);
                     class_24 var12 = class_24.method_79(class_137.field_1762, var4.field_1199[var11], 0);
                     if(var12 != null) {
                        class_110 var13 = var12.method_78().method_2225(class_94.field_1025);
                        class_107 var10 = class_107.method_2071(var13, 100, var6);
                        var10.method_2074(0);
                        class_320.field_3804.method_2198(var10);
                        var4.field_1201 = var10;
                        var4.field_1190 = (var4.field_1197 * 1385478755 + (int)(Math.random() * (double)(-1819837691 * var4.field_1200 - 1385478755 * var4.field_1197))) * -1252270037;
                     }
                  }
               } else {
                  var4.field_1201.method_2075(var6);
                  if(!var4.field_1201.method_103()) {
                     var4.field_1201 = null;
                  }
               }
            } else {
               if(null != var4.field_1196) {
                  class_320.field_3804.method_2199(var4.field_1196);
                  var4.field_1196 = null;
               }

               if(null != var4.field_1201) {
                  class_320.field_3804.method_2199(var4.field_1201);
                  var4.field_1201 = null;
               }
            }
         }
      }

   }

   // $FF: renamed from: f (byte) void
   void method_1917(byte var1) {
      try {
         int var2 = 2113426875 * this.field_1195;
         class_87 var3 = this.field_1202.method_1492(-122421567);
         if(null != var3) {
            this.field_1195 = var3.field_829 * 931435553;
            this.field_1194 = 1819323520 * var3.field_846;
            this.field_1197 = var3.field_847 * 9959657;
            this.field_1200 = 200523271 * var3.field_848;
            this.field_1199 = var3.field_849;
         } else {
            this.field_1195 = 1777981581;
            this.field_1194 = 0;
            this.field_1197 = 0;
            this.field_1200 = 0;
            this.field_1199 = null;
         }

         if(var2 != 2113426875 * this.field_1195) {
            if(var1 <= 0) {
               throw new IllegalStateException();
            }

            if(null != this.field_1196) {
               if(var1 <= 0) {
                  throw new IllegalStateException();
               }

               class_320.field_3804.method_2199(this.field_1196);
               this.field_1196 = null;
            }
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "bc.f(" + ')');
      }
   }

   // $FF: renamed from: ki (io, int, int, int, int) void
   static final void method_1918(class_37 var0, int var1, int var2, int var3, int var4) {
      try {
         class_46.method_536(-1808857292);
         class_61 var5 = var0.method_409(false, 295498065);
         if(var5 == null) {
            if(var4 < 1957183103) {
               ;
            }
         } else {
            label291: {
               class_65.method_694(var1, var2, var1 + 1279799405 * var5.field_479, var2 + var5.field_477 * -1973837741);
               if(-771809921 * client.field_1655 != 2) {
                  if(var4 >= 1957183103) {
                     throw new IllegalStateException();
                  }

                  if(5 != client.field_1655 * -771809921) {
                     if(var4 >= 1957183103) {
                        return;
                     }

                     int var6 = -574530013 * client.field_1629 & 2047;
                     int var7 = -130212619 * class_164.field_2044.field_1077 / 32 + 48;
                     int var8 = 464 - class_164.field_2044.field_1076 * 1248597615 / 32;
                     GameApplet.field_1410.method_842(var1, var2, 1279799405 * var5.field_479, -1973837741 * var5.field_477, var7, var8, var6, 256, var5.field_476, var5.field_478);

                     int var9;
                     int var10;
                     int var11;
                     for(var9 = 0; var9 < -1674931291 * client.field_1649; ++var9) {
                        if(var4 >= 1957183103) {
                           throw new IllegalStateException();
                        }

                        var10 = 2 + client.field_1650[var9] * 4 - -130212619 * class_164.field_2044.field_1077 / 32;
                        var11 = 4 * client.field_1651[var9] + 2 - class_164.field_2044.field_1076 * 1248597615 / 32;
                        class_87.method_1535(var1, var2, var10, var11, client.field_1652[var9], var5, -1287867325);
                     }

                     int var12;
                     int var13;
                     for(var9 = 0; var9 < 104; ++var9) {
                        for(var10 = 0; var10 < 104; ++var10) {
                           class_335 var18 = client.field_1635[1115122599 * class_115.field_1289][var9][var10];
                           if(null != var18) {
                              if(var4 >= 1957183103) {
                                 throw new IllegalStateException();
                              }

                              var12 = 2 + 4 * var9 - -130212619 * class_164.field_2044.field_1077 / 32;
                              var13 = 4 * var10 + 2 - 1248597615 * class_164.field_2044.field_1076 / 32;
                              class_87.method_1535(var1, var2, var12, var13, class_222.field_2518[0], var5, -1287867325);
                           }
                        }
                     }

                     for(var9 = 0; var9 < client.field_1459 * -1300723479; ++var9) {
                        if(var4 >= 1957183103) {
                           throw new IllegalStateException();
                        }

                        class_99 var16 = client.field_1458[client.field_1460[var9]];
                        if(var16 != null && var16.method_1796((byte)-6)) {
                           if(var4 >= 1957183103) {
                              throw new IllegalStateException();
                           }

                           class_88 var19 = var16.field_1141;
                           if(null != var19) {
                              if(var4 >= 1957183103) {
                                 throw new IllegalStateException();
                              }

                              if(null != var19.field_862) {
                                 if(var4 >= 1957183103) {
                                    throw new IllegalStateException();
                                 }

                                 var19 = var19.method_1545((byte)22);
                              }
                           }

                           if(null != var19) {
                              if(var4 >= 1957183103) {
                                 throw new IllegalStateException();
                              }

                              if(var19.field_883) {
                                 if(var4 >= 1957183103) {
                                    throw new IllegalStateException();
                                 }

                                 if(var19.field_886) {
                                    if(var4 >= 1957183103) {
                                       throw new IllegalStateException();
                                    }

                                    var12 = -130212619 * var16.field_1077 / 32 - -130212619 * class_164.field_2044.field_1077 / 32;
                                    var13 = 1248597615 * var16.field_1076 / 32 - 1248597615 * class_164.field_2044.field_1076 / 32;
                                    class_87.method_1535(var1, var2, var12, var13, class_222.field_2518[1], var5, -1287867325);
                                 }
                              }
                           }
                        }
                     }

                     var9 = class_195.field_2313 * -1143549299;
                     int[] var17 = class_195.field_2318;

                     for(var11 = 0; var11 < var9; ++var11) {
                        if(var4 >= 1957183103) {
                           throw new IllegalStateException();
                        }

                        class_100 var20 = client.field_1605[var17[var11]];
                        if(var20 != null) {
                           if(var4 >= 1957183103) {
                              throw new IllegalStateException();
                           }

                           if(var20.method_1796((byte)-33)) {
                              if(var4 >= 1957183103) {
                                 throw new IllegalStateException();
                              }

                              if(!var20.field_1154) {
                                 if(var4 >= 1957183103) {
                                    throw new IllegalStateException();
                                 }

                                 if(var20 != class_164.field_2044) {
                                    if(var4 >= 1957183103) {
                                       throw new IllegalStateException();
                                    }

                                    var13 = var20.field_1077 * -130212619 / 32 - -130212619 * class_164.field_2044.field_1077 / 32;
                                    int var14 = 1248597615 * var20.field_1076 / 32 - class_164.field_2044.field_1076 * 1248597615 / 32;
                                    if(var20.method_1825(2031085482)) {
                                       if(var4 >= 1957183103) {
                                          throw new IllegalStateException();
                                       }

                                       class_87.method_1535(var1, var2, var13, var14, class_222.field_2518[3], var5, -1287867325);
                                    } else {
                                       if(0 != class_164.field_2044.field_1161 * 1597353853) {
                                          if(var4 >= 1957183103) {
                                             return;
                                          }

                                          if(0 != var20.field_1161 * 1597353853 && class_164.field_2044.field_1161 * 1597353853 == var20.field_1161 * 1597353853) {
                                             if(var4 >= 1957183103) {
                                                throw new IllegalStateException();
                                             }

                                             class_87.method_1535(var1, var2, var13, var14, class_222.field_2518[4], var5, -1287867325);
                                             continue;
                                          }
                                       }

                                       if(var20.method_1867((byte)-78)) {
                                          class_87.method_1535(var1, var2, var13, var14, class_222.field_2518[5], var5, -1287867325);
                                       } else if(var20.method_1843(1964192988)) {
                                          if(var4 >= 1957183103) {
                                             throw new IllegalStateException();
                                          }

                                          class_87.method_1535(var1, var2, var13, var14, class_222.field_2518[6], var5, -1287867325);
                                       } else {
                                          class_87.method_1535(var1, var2, var13, var14, class_222.field_2518[2], var5, -1287867325);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }

                     if(-1764619255 * client.field_1433 != 0) {
                        if(var4 >= 1957183103) {
                           throw new IllegalStateException();
                        }

                        if(client.field_1425 * -1702273423 % 20 < 10) {
                           if(var4 >= 1957183103) {
                              throw new IllegalStateException();
                           }

                           if(-1764619255 * client.field_1433 == 1) {
                              if(var4 >= 1957183103) {
                                 throw new IllegalStateException();
                              }

                              if(1564576307 * client.field_1587 >= 0 && client.field_1587 * 1564576307 < client.field_1458.length) {
                                 if(var4 >= 1957183103) {
                                    throw new IllegalStateException();
                                 }

                                 class_99 var21 = client.field_1458[client.field_1587 * 1564576307];
                                 if(var21 != null) {
                                    var12 = -130212619 * var21.field_1077 / 32 - -130212619 * class_164.field_2044.field_1077 / 32;
                                    var13 = 1248597615 * var21.field_1076 / 32 - 1248597615 * class_164.field_2044.field_1076 / 32;
                                    class_173.method_3712(var1, var2, var12, var13, class_230.field_2576[1], var5, 836097385);
                                 }
                              }
                           }

                           if(client.field_1433 * -1764619255 == 2) {
                              if(var4 >= 1957183103) {
                                 throw new IllegalStateException();
                              }

                              var11 = 2 + (client.field_1436 * 1657661012 - class_243.field_2700 * -1506320532) - -130212619 * class_164.field_2044.field_1077 / 32;
                              var12 = 490641868 * client.field_1437 - -111615052 * class_154.field_1929 + 2 - class_164.field_2044.field_1076 * 1248597615 / 32;
                              class_173.method_3712(var1, var2, var11, var12, class_230.field_2576[1], var5, 939945955);
                           }

                           if(10 == -1764619255 * client.field_1433) {
                              if(var4 >= 1957183103) {
                                 throw new IllegalStateException();
                              }

                              if(1851530429 * client.field_1691 >= 0 && 1851530429 * client.field_1691 < client.field_1605.length) {
                                 class_100 var22 = client.field_1605[client.field_1691 * 1851530429];
                                 if(null != var22) {
                                    if(var4 >= 1957183103) {
                                       return;
                                    }

                                    var12 = -130212619 * var22.field_1077 / 32 - class_164.field_2044.field_1077 * -130212619 / 32;
                                    var13 = var22.field_1076 * 1248597615 / 32 - 1248597615 * class_164.field_2044.field_1076 / 32;
                                    class_173.method_3712(var1, var2, var12, var13, class_230.field_2576[1], var5, 1974417928);
                                 }
                              }
                           }
                        }
                     }

                     if(client.field_1520 * -1714532039 != 0) {
                        if(var4 >= 1957183103) {
                           throw new IllegalStateException();
                        }

                        var11 = client.field_1520 * 1731806436 + 2 - -130212619 * class_164.field_2044.field_1077 / 32;
                        var12 = -1349043644 * client.field_1562 + 2 - class_164.field_2044.field_1076 * 1248597615 / 32;
                        class_87.method_1535(var1, var2, var11, var12, class_230.field_2576[0], var5, -1287867325);
                     }

                     if(!class_164.field_2044.field_1154) {
                        if(var4 >= 1957183103) {
                           throw new IllegalStateException();
                        }

                        class_65.method_681(var1 + 1279799405 * var5.field_479 / 2 - 1, -1973837741 * var5.field_477 / 2 + var2 - 1, 3, 3, 16777215);
                     }
                     break label291;
                  }
               }

               class_65.method_708(var1, var2, 0, var5.field_476, var5.field_478);
            }

            client.field_1556[var3] = true;
         }
      } catch (RuntimeException var15) {
         throw class_223.method_4281(var15, "bc.ki(" + ')');
      }
   }

   // $FF: renamed from: j () void
   static void method_1919() {
      for(class_103 var0 = (class_103)field_1203.method_5944(); var0 != null; var0 = (class_103)field_1203.method_5972()) {
         if(var0.field_1196 != null) {
            class_320.field_3804.method_2199(var0.field_1196);
            var0.field_1196 = null;
         }

         if(var0.field_1201 != null) {
            class_320.field_3804.method_2199(var0.field_1201);
            var0.field_1201 = null;
         }
      }

      field_1203.method_5966();
   }

   // $FF: renamed from: r () void
   static void method_1920() {
      for(class_103 var0 = (class_103)field_1203.method_5944(); var0 != null; var0 = (class_103)field_1203.method_5972()) {
         if(var0.field_1196 != null) {
            class_320.field_3804.method_2199(var0.field_1196);
            var0.field_1196 = null;
         }

         if(var0.field_1201 != null) {
            class_320.field_3804.method_2199(var0.field_1201);
            var0.field_1201 = null;
         }
      }

      field_1203.method_5966();
   }

   // $FF: renamed from: b () void
   static void method_1921() {
      for(class_103 var0 = (class_103)field_1203.method_5944(); var0 != null; var0 = (class_103)field_1203.method_5972()) {
         if(null != var0.field_1202) {
            var0.method_1917((byte)95);
         }
      }

   }

   // $FF: renamed from: d () void
   void method_1922() {
      int var1 = -2014183684 * this.field_1195;
      class_87 var2 = this.field_1202.method_1492(1320313377);
      if(null != var2) {
         this.field_1195 = var2.field_829 * 931435553;
         this.field_1194 = 1819323520 * var2.field_846;
         this.field_1197 = var2.field_847 * -116600955;
         this.field_1200 = 200523271 * var2.field_848;
         this.field_1199 = var2.field_849;
      } else {
         this.field_1195 = 1777981581;
         this.field_1194 = 0;
         this.field_1197 = 0;
         this.field_1200 = 0;
         this.field_1199 = null;
      }

      if(var1 != 2113426875 * this.field_1195 && null != this.field_1196) {
         class_320.field_3804.method_2199(this.field_1196);
         this.field_1196 = null;
      }

   }

   // $FF: renamed from: s () void
   void method_1923() {
      int var1 = 2113426875 * this.field_1195;
      class_87 var2 = this.field_1202.method_1492(440382788);
      if(null != var2) {
         this.field_1195 = var2.field_829 * -1725081217;
         this.field_1194 = 1819323520 * var2.field_846;
         this.field_1197 = var2.field_847 * 9959657;
         this.field_1200 = 1292385982 * var2.field_848;
         this.field_1199 = var2.field_849;
      } else {
         this.field_1195 = -1799367005;
         this.field_1194 = 0;
         this.field_1197 = 0;
         this.field_1200 = 0;
         this.field_1199 = null;
      }

      if(var1 != 2113426875 * this.field_1195 && null != this.field_1196) {
         class_320.field_3804.method_2199(this.field_1196);
         this.field_1196 = null;
      }

   }

   // $FF: renamed from: u (int, int, int, eg, int) void
   static void method_1924(int var0, int var1, int var2, class_87 var3, int var4) {
      class_103 var10000 = new class_103();
      class_103 var5 = var10000;
      var5.field_1188 = -921901257 * var0;
      var5.field_1198 = -1130410624 * var1;
      var5.field_1191 = -351629440 * var2;
      int var6 = var3.field_839 * -288612135;
      int var7 = -1812944985 * var3.field_851;
      if(var4 == 1 || var4 == 3) {
         var6 = var3.field_851 * -1812944985;
         var7 = var3.field_839 * -288612135;
      }

      var5.field_1192 = -946193536 * (var1 + var6);
      var5.field_1193 = (var7 + var2) * 924842368;
      var5.field_1195 = var3.field_829 * 931435553;
      var5.field_1194 = var3.field_846 * 1819323520;
      var5.field_1197 = 9959657 * var3.field_847;
      var5.field_1200 = var3.field_848 * 200523271;
      var5.field_1199 = var3.field_849;
      if(null != var3.field_842) {
         var5.field_1202 = var3;
         var5.method_1917((byte)15);
      }

      field_1203.method_5939(var5);
      if(var5.field_1199 != null) {
         var5.field_1190 = (1385478755 * var5.field_1197 + (int)(Math.random() * (double)(var5.field_1200 * -1819837691 - var5.field_1197 * 1385478755))) * -1252270037;
      }

   }

   // $FF: renamed from: l (int, int, int, eg, int) void
   static void method_1925(int var0, int var1, int var2, class_87 var3, int var4) {
      class_103 var10000 = new class_103();
      class_103 var5 = var10000;
      var5.field_1188 = -921901257 * var0;
      var5.field_1198 = -1130410624 * var1;
      var5.field_1191 = -351629440 * var2;
      int var6 = var3.field_839 * -288612135;
      int var7 = -1812944985 * var3.field_851;
      if(var4 == 1 || var4 == 3) {
         var6 = var3.field_851 * -1812944985;
         var7 = var3.field_839 * -288612135;
      }

      var5.field_1192 = -946193536 * (var1 + var6);
      var5.field_1193 = (var7 + var2) * 924842368;
      var5.field_1195 = var3.field_829 * 931435553;
      var5.field_1194 = var3.field_846 * 1819323520;
      var5.field_1197 = 9959657 * var3.field_847;
      var5.field_1200 = var3.field_848 * 200523271;
      var5.field_1199 = var3.field_849;
      if(null != var3.field_842) {
         var5.field_1202 = var3;
         var5.method_1917((byte)12);
      }

      field_1203.method_5939(var5);
      if(var5.field_1199 != null) {
         var5.field_1190 = (1385478755 * var5.field_1197 + (int)(Math.random() * (double)(var5.field_1200 * -1819837691 - var5.field_1197 * 1385478755))) * -1252270037;
      }

   }

   // $FF: renamed from: e (int, int, int, int) void
   static void method_1926(int var0, int var1, int var2, int var3) {
      for(class_103 var4 = (class_103)field_1203.method_5944(); var4 != null; var4 = (class_103)field_1203.method_5972()) {
         if(-1 != 2113426875 * var4.field_1195 || var4.field_1199 != null) {
            int var5 = 0;
            if(var1 > var4.field_1192 * -1913199289) {
               var5 += var1 - -1913199289 * var4.field_1192;
            } else if(var1 < var4.field_1198 * 382039955) {
               var5 += var4.field_1198 * 382039955 - var1;
            }

            if(var2 > var4.field_1193 * 846164283) {
               var5 += var2 - var4.field_1193 * 846164283;
            } else if(var2 < var4.field_1191 * -377542945) {
               var5 += -377542945 * var4.field_1191 - var2;
            }

            if(var5 - 64 <= var4.field_1194 * 2101998419 && 0 != -1768933319 * class_87.field_852.field_2115 && var0 == var4.field_1188 * 1262714503) {
               var5 -= 64;
               if(var5 < 0) {
                  var5 = 0;
               }

               int var6 = class_87.field_852.field_2115 * -1768933319 * (var4.field_1194 * 2101998419 - var5) / (var4.field_1194 * 2101998419);
               if(null == var4.field_1196) {
                  if(var4.field_1195 * 2113426875 >= 0) {
                     class_24 var7 = class_24.method_79(class_137.field_1762, var4.field_1195 * 2113426875, 0);
                     if(var7 != null) {
                        class_110 var8 = var7.method_78().method_2225(class_94.field_1025);
                        class_107 var9 = class_107.method_2071(var8, 100, var6);
                        var9.method_2074(-1);
                        class_320.field_3804.method_2198(var9);
                        var4.field_1196 = var9;
                     }
                  }
               } else {
                  var4.field_1196.method_2075(var6);
               }

               if(var4.field_1201 == null) {
                  if(var4.field_1199 != null && (var4.field_1190 -= var3 * -1252270037) * 1313201795 <= 0) {
                     int var11 = (int)(Math.random() * (double)var4.field_1199.length);
                     class_24 var12 = class_24.method_79(class_137.field_1762, var4.field_1199[var11], 0);
                     if(var12 != null) {
                        class_110 var13 = var12.method_78().method_2225(class_94.field_1025);
                        class_107 var10 = class_107.method_2071(var13, 100, var6);
                        var10.method_2074(0);
                        class_320.field_3804.method_2198(var10);
                        var4.field_1201 = var10;
                        var4.field_1190 = (var4.field_1197 * 1385478755 + (int)(Math.random() * (double)(-1819837691 * var4.field_1200 - 1385478755 * var4.field_1197))) * -1252270037;
                     }
                  }
               } else {
                  var4.field_1201.method_2075(var6);
                  if(!var4.field_1201.method_103()) {
                     var4.field_1201 = null;
                  }
               }
            } else {
               if(null != var4.field_1196) {
                  class_320.field_3804.method_2199(var4.field_1196);
                  var4.field_1196 = null;
               }

               if(null != var4.field_1201) {
                  class_320.field_3804.method_2199(var4.field_1201);
                  var4.field_1201 = null;
               }
            }
         }
      }

   }

   // $FF: renamed from: c (int, int, int, int) void
   static void method_1927(int var0, int var1, int var2, int var3) {
      for(class_103 var4 = (class_103)field_1203.method_5944(); var4 != null; var4 = (class_103)field_1203.method_5972()) {
         if(-1 != 2113426875 * var4.field_1195 || var4.field_1199 != null) {
            int var5 = 0;
            if(var1 > var4.field_1192 * -1913199289) {
               var5 += var1 - -1913199289 * var4.field_1192;
            } else if(var1 < var4.field_1198 * 382039955) {
               var5 += var4.field_1198 * 382039955 - var1;
            }

            if(var2 > var4.field_1193 * 846164283) {
               var5 += var2 - var4.field_1193 * 846164283;
            } else if(var2 < var4.field_1191 * -377542945) {
               var5 += -377542945 * var4.field_1191 - var2;
            }

            if(var5 - 64 <= var4.field_1194 * 2101998419 && 0 != -1768933319 * class_87.field_852.field_2115 && var0 == var4.field_1188 * 1262714503) {
               var5 -= 64;
               if(var5 < 0) {
                  var5 = 0;
               }

               int var6 = class_87.field_852.field_2115 * -1768933319 * (var4.field_1194 * 2101998419 - var5) / (var4.field_1194 * 2101998419);
               if(null == var4.field_1196) {
                  if(var4.field_1195 * 2113426875 >= 0) {
                     class_24 var7 = class_24.method_79(class_137.field_1762, var4.field_1195 * 2113426875, 0);
                     if(var7 != null) {
                        class_110 var8 = var7.method_78().method_2225(class_94.field_1025);
                        class_107 var9 = class_107.method_2071(var8, 100, var6);
                        var9.method_2074(-1);
                        class_320.field_3804.method_2198(var9);
                        var4.field_1196 = var9;
                     }
                  }
               } else {
                  var4.field_1196.method_2075(var6);
               }

               if(var4.field_1201 == null) {
                  if(var4.field_1199 != null && (var4.field_1190 -= var3 * -1252270037) * 1313201795 <= 0) {
                     int var11 = (int)(Math.random() * (double)var4.field_1199.length);
                     class_24 var12 = class_24.method_79(class_137.field_1762, var4.field_1199[var11], 0);
                     if(var12 != null) {
                        class_110 var13 = var12.method_78().method_2225(class_94.field_1025);
                        class_107 var10 = class_107.method_2071(var13, 100, var6);
                        var10.method_2074(0);
                        class_320.field_3804.method_2198(var10);
                        var4.field_1201 = var10;
                        var4.field_1190 = (var4.field_1197 * 1385478755 + (int)(Math.random() * (double)(-1819837691 * var4.field_1200 - 1385478755 * var4.field_1197))) * -1252270037;
                     }
                  }
               } else {
                  var4.field_1201.method_2075(var6);
                  if(!var4.field_1201.method_103()) {
                     var4.field_1201 = null;
                  }
               }
            } else {
               if(null != var4.field_1196) {
                  class_320.field_3804.method_2199(var4.field_1196);
                  var4.field_1196 = null;
               }

               if(null != var4.field_1201) {
                  class_320.field_3804.method_2199(var4.field_1201);
                  var4.field_1201 = null;
               }
            }
         }
      }

   }

   // $FF: renamed from: <init> () void
   class_103() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "bc.<init>(" + ')');
      }
   }

   // $FF: renamed from: o (int, int, int, eg, int) void
   static void method_1928(int var0, int var1, int var2, class_87 var3, int var4) {
      class_103 var10000 = new class_103();
      class_103 var5 = var10000;
      var5.field_1188 = -375707528 * var0;
      var5.field_1198 = 1921924430 * var1;
      var5.field_1191 = -917037491 * var2;
      int var6 = var3.field_839 * -288612135;
      int var7 = 994837853 * var3.field_851;
      if(var4 == 1 || var4 == 3) {
         var6 = var3.field_851 * -1818180235;
         var7 = var3.field_839 * -299204049;
      }

      var5.field_1192 = -946193536 * (var1 + var6);
      var5.field_1193 = (var7 + var2) * -794141577;
      var5.field_1195 = var3.field_829 * 931435553;
      var5.field_1194 = var3.field_846 * 1801965264;
      var5.field_1197 = 9959657 * var3.field_847;
      var5.field_1200 = var3.field_848 * 200523271;
      var5.field_1199 = var3.field_849;
      if(null != var3.field_842) {
         var5.field_1202 = var3;
         var5.method_1917((byte)115);
      }

      field_1203.method_5939(var5);
      if(var5.field_1199 != null) {
         var5.field_1190 = (1385478755 * var5.field_1197 + (int)(Math.random() * (double)(var5.field_1200 * 1616893239 - var5.field_1197 * 1385478755))) * -1365250510;
      }

   }

   // $FF: renamed from: <clinit> () void
   static {
      class_335 var10000 = new class_335();
      field_1203 = var10000;
   }

   // $FF: renamed from: ls (int) void
   static void method_1930(int var0) {
      try {
         if(class_183.field_2249 != null) {
            if(var0 >= -891996540) {
               return;
            }

            client.field_1493 = client.field_1425 * -146799985;
            class_183.field_2249.method_5331(-2075850075);

            for(int var1 = 0; var1 < client.field_1605.length; ++var1) {
               if(var0 >= -891996540) {
                  return;
               }

               if(client.field_1605[var1] != null) {
                  if(var0 >= -891996540) {
                     throw new IllegalStateException();
                  }

                  class_183.field_2249.method_5322(697161691 * class_243.field_2700 + (-130212619 * client.field_1605[var1].field_1077 >> 7), -27903763 * class_154.field_1929 + (client.field_1605[var1].field_1076 * 1248597615 >> 7), (byte)14);
               }
            }
         }

      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "bc.ls(" + ')');
      }
   }
}
