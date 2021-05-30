
// $FF: renamed from: cu
public class class_48 extends class_27 {

   // $FF: renamed from: v int
   int field_353;
   // $FF: renamed from: n int
   int field_354;
   // $FF: renamed from: f boolean
   boolean field_355;
   // $FF: renamed from: a java.lang.String[]
   public static String[] cacheDirectories;
   // $FF: renamed from: l int
   static final int field_357 = 12;
   // $FF: renamed from: bv int
   static final int field_358 = 1006;
   // $FF: renamed from: d int
   static final int field_359 = -306674912;


   // $FF: renamed from: n (int, int) er
   public static class_79 method_549(int var0, int var1) {
      try {
         class_79 var2 = (class_79)class_79.field_688.method_5065((long)var0);
         if(null != var2) {
            if(var1 != -647978763) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = class_79.field_690.method_5381(8, var0);
            class_79 var10000 = new class_79();
            var2 = var10000;
            if(var3 != null) {
               if(var1 != -647978763) {
                  throw new IllegalStateException();
               }

               Buffer var10001 = new Buffer(var3);
               var2.method_1241(var10001, 1467910885);
            }

            class_79.field_688.method_5064(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: <init> () void
   class_48() {
      super();
      try {
         this.field_355 = false;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: je (double) void
   static final void method_550(double var0) {
      try {
         class_70.method_973(var0);
         ((class_245)class_70.field_555).method_4692(var0);
         class_148.method_3125();
         class_87.preferences.field_2128 = var0;
         class_94.savePreferences(-1248407362);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: gq (cy, int) void
   static final void method_551(class_98 var0, int var1) {
      try {
         var0.field_1082 = 1692157187 * var0.field_1081;
         if(-664818219 * var0.field_1130 == 0) {
            if(var1 >= -156551559) {
               throw new IllegalStateException();
            } else {
               var0.field_1134 = 0;
            }
         } else {
            if(-1 != var0.field_1108 * -1762760413) {
               if(var1 >= -156551559) {
                  return;
               }

               if(var0.field_1111 * -1848146093 == 0) {
                  class_72 var2 = class_162.method_3412(var0.field_1108 * -1762760413, 1324400998);
                  if(var0.field_1114 * 313310131 > 0) {
                     if(var1 >= -156551559) {
                        throw new IllegalStateException();
                     }

                     if(-1960140293 * var2.field_573 == 0) {
                        if(var1 >= -156551559) {
                           throw new IllegalStateException();
                        }

                        var0.field_1134 += 350046797;
                        return;
                     }
                  }

                  if(var0.field_1114 * 313310131 <= 0) {
                     if(var1 >= -156551559) {
                        throw new IllegalStateException();
                     }

                     if(var2.field_580 * -263393733 == 0) {
                        var0.field_1134 += 350046797;
                        return;
                     }
                  }
               }
            }

            int var12 = -130212619 * var0.field_1077;
            int var3 = 1248597615 * var0.field_1076;
            int var4 = var0.field_1079 * -662659008 + 128 * var0.field_1112[-664818219 * var0.field_1130 - 1];
            int var5 = -662659008 * var0.field_1079 + 128 * var0.field_1126[var0.field_1130 * -664818219 - 1];
            if(var12 < var4) {
               if(var1 >= -156551559) {
                  throw new IllegalStateException();
               }

               if(var3 < var5) {
                  if(var1 >= -156551559) {
                     return;
                  }

                  var0.field_1106 = 63119616;
               } else if(var3 > var5) {
                  if(var1 >= -156551559) {
                     throw new IllegalStateException();
                  }

                  var0.field_1106 = -1629619456;
               } else {
                  var0.field_1106 = -783249920;
               }
            } else if(var12 > var4) {
               if(var3 < var5) {
                  var0.field_1106 = 1755858688;
               } else if(var3 > var5) {
                  if(var1 >= -156551559) {
                     throw new IllegalStateException();
                  }

                  var0.field_1106 = -846369536;
               } else {
                  var0.field_1106 = -1692739072;
               }
            } else if(var3 < var5) {
               if(var1 >= -156551559) {
                  return;
               }

               var0.field_1106 = 909489152;
            } else if(var3 > var5) {
               var0.field_1106 = 0;
            }

            byte var6 = var0.field_1086[var0.field_1130 * -664818219 - 1];
            if(var4 - var12 <= 256) {
               if(var1 >= -156551559) {
                  return;
               }

               if(var4 - var12 >= -256) {
                  if(var1 >= -156551559) {
                     throw new IllegalStateException();
                  }

                  if(var5 - var3 <= 256) {
                     if(var1 >= -156551559) {
                        throw new IllegalStateException();
                     }

                     if(var5 - var3 >= -256) {
                        int var7 = var0.field_1106 * -1173912475 - -1073291133 * var0.field_1119 & 2047;
                        if(var7 > 1024) {
                           var7 -= 2048;
                        }

                        int var8 = var0.field_1107 * -1808202573;
                        if(var7 >= -256 && var7 <= 256) {
                           if(var1 >= -156551559) {
                              return;
                           }

                           var8 = -152072953 * var0.field_1084;
                        } else {
                           label378: {
                              if(var7 >= 256) {
                                 if(var1 >= -156551559) {
                                    throw new IllegalStateException();
                                 }

                                 if(var7 < 768) {
                                    if(var1 >= -156551559) {
                                       throw new IllegalStateException();
                                    }

                                    var8 = var0.field_1087 * -1993879825;
                                    break label378;
                                 }
                              }

                              if(var7 >= -768) {
                                 if(var1 >= -156551559) {
                                    return;
                                 }

                                 if(var7 <= -256) {
                                    if(var1 >= -156551559) {
                                       throw new IllegalStateException();
                                    }

                                    var8 = var0.field_1132 * 1341114765;
                                 }
                              }
                           }
                        }

                        if(-1 == var8) {
                           if(var1 >= -156551559) {
                              throw new IllegalStateException();
                           }

                           var8 = -152072953 * var0.field_1084;
                        }

                        var0.field_1082 = var8 * -404487489;
                        int var9 = 4;
                        boolean var10 = true;
                        if(var0 instanceof class_99) {
                           if(var1 >= -156551559) {
                              throw new IllegalStateException();
                           }

                           var10 = ((class_99)var0).field_1141.field_887;
                        }

                        if(var10) {
                           if(-1073291133 * var0.field_1119 != var0.field_1106 * -1173912475) {
                              if(var1 >= -156551559) {
                                 throw new IllegalStateException();
                              }

                              if(-1 == var0.field_1128 * 637535539 && -1889632377 * var0.field_1129 != 0) {
                                 if(var1 >= -156551559) {
                                    throw new IllegalStateException();
                                 }

                                 var9 = 2;
                              }
                           }

                           if(-664818219 * var0.field_1130 > 2) {
                              var9 = 6;
                           }

                           if(-664818219 * var0.field_1130 > 3) {
                              var9 = 8;
                           }

                           if(var0.field_1134 * 110165637 > 0) {
                              if(var1 >= -156551559) {
                                 return;
                              }

                              if(var0.field_1130 * -664818219 > 1) {
                                 var9 = 8;
                                 var0.field_1134 -= 350046797;
                              }
                           }
                        } else {
                           if(-664818219 * var0.field_1130 > 1) {
                              if(var1 >= -156551559) {
                                 throw new IllegalStateException();
                              }

                              var9 = 6;
                           }

                           if(var0.field_1130 * -664818219 > 2) {
                              if(var1 >= -156551559) {
                                 throw new IllegalStateException();
                              }

                              var9 = 8;
                           }

                           if(110165637 * var0.field_1134 > 0 && var0.field_1130 * -664818219 > 1) {
                              var9 = 8;
                              var0.field_1134 -= 350046797;
                           }
                        }

                        if(2 == var6) {
                           if(var1 >= -156551559) {
                              return;
                           }

                           var9 <<= 1;
                        }

                        if(var9 >= 8) {
                           if(var1 >= -156551559) {
                              throw new IllegalStateException();
                           }

                           if(var0.field_1082 * -330797761 == var0.field_1084 * -152072953) {
                              if(var1 >= -156551559) {
                                 throw new IllegalStateException();
                              }

                              if(-1401897961 * var0.field_1133 != -1) {
                                 if(var1 >= -156551559) {
                                    throw new IllegalStateException();
                                 }

                                 var0.field_1082 = var0.field_1133 * -821001431;
                              }
                           }
                        }

                        label375: {
                           if(var4 == var12) {
                              if(var1 >= -156551559) {
                                 return;
                              }

                              if(var5 == var3) {
                                 break label375;
                              }

                              if(var1 >= -156551559) {
                                 throw new IllegalStateException();
                              }
                           }

                           if(var12 < var4) {
                              if(var1 >= -156551559) {
                                 return;
                              }

                              var0.field_1077 += var9 * -1369591971;
                              if(var0.field_1077 * -130212619 > var4) {
                                 if(var1 >= -156551559) {
                                    throw new IllegalStateException();
                                 }

                                 var0.field_1077 = -1369591971 * var4;
                              }
                           } else if(var12 > var4) {
                              var0.field_1077 -= -1369591971 * var9;
                              if(var0.field_1077 * -130212619 < var4) {
                                 var0.field_1077 = var4 * -1369591971;
                              }
                           }

                           if(var3 < var5) {
                              if(var1 >= -156551559) {
                                 throw new IllegalStateException();
                              }

                              var0.field_1076 += -1747711857 * var9;
                              if(1248597615 * var0.field_1076 > var5) {
                                 if(var1 >= -156551559) {
                                    return;
                                 }

                                 var0.field_1076 = var5 * -1747711857;
                              }
                           } else if(var3 > var5) {
                              if(var1 >= -156551559) {
                                 return;
                              }

                              var0.field_1076 -= var9 * -1747711857;
                              if(1248597615 * var0.field_1076 < var5) {
                                 if(var1 >= -156551559) {
                                    throw new IllegalStateException();
                                 }

                                 var0.field_1076 = var5 * -1747711857;
                              }
                           }
                        }

                        if(var0.field_1077 * -130212619 == var4 && var5 == 1248597615 * var0.field_1076) {
                           var0.field_1130 -= -2139872387;
                           if(313310131 * var0.field_1114 > 0) {
                              if(var1 >= -156551559) {
                                 throw new IllegalStateException();
                              }

                              var0.field_1114 -= 2050648955;
                           }
                        }

                        return;
                     }
                  }
               }
            }

            var0.field_1077 = var4 * -1369591971;
            var0.field_1076 = -1747711857 * var5;
            var0.field_1130 -= -2139872387;
            if(313310131 * var0.field_1114 > 0) {
               if(var1 >= -156551559) {
                  throw new IllegalStateException();
               }

               var0.field_1114 -= 2050648955;
            }

         }
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11);
      }
   }
}
