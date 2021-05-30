
// $FF: renamed from: lo
public class class_345 extends class_343 {

   // $FF: renamed from: v int
   static final int field_3916 = 400;
   // $FF: renamed from: n int
   public static final int field_3917 = 100;
   // $FF: renamed from: f nc
   final class_375 field_3918;


   // $FF: renamed from: v (byte) lx
   class_338 method_6079(byte var1) {
      try {
         class_342 var10000 = new class_342();
         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "lo.v(" + ')');
      }
   }

   // $FF: renamed from: f (nd, int, short) void
   public void method_6164(class_28 var1, int var2, short var3) {
      try {
         while(true) {
            if(-442398587 * var1.field_15 < var2) {
               if(var3 == 255) {
                  throw new IllegalStateException();
               }

               int var4 = var1.method_130(-1246687521);
               boolean var10000;
               if((var4 & 1) == 1) {
                  if(var3 == 255) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var5 = var10000;
               class_359 var12 = new class_359(var1.method_139(-391631059), this.field_3918);
               class_359 var6 = var12;
               var12 = new class_359(var1.method_139(-391631059), this.field_3918);
               class_359 var7 = var12;
               var1.method_139(-391631059);
               if(null != var6) {
                  if(var6.method_6273((byte)0)) {
                     class_342 var8 = (class_342)this.method_6065(var6, (byte)7);
                     if(var5) {
                        if(var3 == 255) {
                           throw new IllegalStateException();
                        }

                        class_342 var9 = (class_342)this.method_6065(var7, (byte)7);
                        if(null != var9) {
                           if(var3 == 255) {
                              throw new IllegalStateException();
                           }

                           if(var8 != var9) {
                              if(var3 == 255) {
                                 throw new IllegalStateException();
                              }

                              if(null != var8) {
                                 if(var3 == 255) {
                                    throw new IllegalStateException();
                                 }

                                 this.method_6068(var9, 272693377);
                              } else {
                                 var8 = var9;
                              }
                           }
                        }
                     }

                     if(null != var8) {
                        if(var3 == 255) {
                           return;
                        }

                        this.method_6073(var8, var6, var7, (byte)8);
                        continue;
                     }

                     if(this.method_6061(367316870) >= 400) {
                        continue;
                     }

                     if(var3 == 255) {
                        throw new IllegalStateException();
                     }

                     int var11 = this.method_6061(-764390500);
                     var8 = (class_342)this.method_6070(var6, var7, -656990705);
                     var8.field_3899 = var11 * -1532729417;
                     continue;
                  }

                  if(var3 == 255) {
                     throw new IllegalStateException();
                  }
               }

               throw new IllegalStateException();
            }

            return;
         }
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10, "lo.f(" + ')');
      }
   }

   // $FF: renamed from: <init> (nc) void
   public class_345(class_375 var1) {
      super(400);
      try {
         this.field_3918 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "lo.<init>(" + ')');
      }
   }

   // $FF: renamed from: y () lx
   class_338 method_6059() {
      class_342 var10000 = new class_342();
      return var10000;
   }

   // $FF: renamed from: n (int, int) lx[]
   class_338[] method_6080(int var1, int var2) {
      try {
         return new class_342[var1];
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "lo.n(" + ')');
      }
   }

   // $FF: renamed from: p (int) lx[]
   class_338[] method_6103(int var1) {
      return new class_342[var1];
   }

   // $FF: renamed from: j (int) lx[]
   class_338[] method_6085(int var1) {
      return new class_342[var1];
   }

   // $FF: renamed from: r (int) lx[]
   class_338[] method_6126(int var1) {
      return new class_342[var1];
   }

   // $FF: renamed from: b (nd, int) void
   public void method_6166(class_28 var1, int var2) {
      while(true) {
         if(-442398587 * var1.field_15 < var2) {
            int var3 = var1.method_130(2024107323);
            boolean var4 = (var3 & 1) == 1;
            class_359 var10000 = new class_359(var1.method_139(-391631059), this.field_3918);
            class_359 var5 = var10000;
            var10000 = new class_359(var1.method_139(-391631059), this.field_3918);
            class_359 var6 = var10000;
            var1.method_139(-391631059);
            if(null != var5 && var5.method_6273((byte)0)) {
               class_342 var7 = (class_342)this.method_6065(var5, (byte)7);
               if(var4) {
                  class_342 var8 = (class_342)this.method_6065(var6, (byte)7);
                  if(null != var8 && var7 != var8) {
                     if(null != var7) {
                        this.method_6068(var8, 303292286);
                     } else {
                        var7 = var8;
                     }
                  }
               }

               if(null != var7) {
                  this.method_6073(var7, var5, var6, (byte)8);
                  continue;
               }

               if(this.method_6061(551749944) < 400) {
                  int var9 = this.method_6061(207757717);
                  var7 = (class_342)this.method_6070(var5, var6, -656990705);
                  var7.field_3899 = var9 * -1532729417;
               }
               continue;
            }

            throw new IllegalStateException();
         }

         return;
      }
   }

   // $FF: renamed from: d (nd, int) void
   public void method_6167(class_28 var1, int var2) {
      while(true) {
         if(-442398587 * var1.field_15 < var2) {
            int var3 = var1.method_130(1824747967);
            boolean var4 = (var3 & 1) == 1;
            class_359 var10000 = new class_359(var1.method_139(-391631059), this.field_3918);
            class_359 var5 = var10000;
            var10000 = new class_359(var1.method_139(-391631059), this.field_3918);
            class_359 var6 = var10000;
            var1.method_139(-391631059);
            if(null != var5 && var5.method_6273((byte)0)) {
               class_342 var7 = (class_342)this.method_6065(var5, (byte)7);
               if(var4) {
                  class_342 var8 = (class_342)this.method_6065(var6, (byte)7);
                  if(null != var8 && var7 != var8) {
                     if(null != var7) {
                        this.method_6068(var8, 1704148783);
                     } else {
                        var7 = var8;
                     }
                  }
               }

               if(null != var7) {
                  this.method_6073(var7, var5, var6, (byte)8);
                  continue;
               }

               if(this.method_6061(1670043084) < 400) {
                  int var9 = this.method_6061(-1670754285);
                  var7 = (class_342)this.method_6070(var5, var6, -656990705);
                  var7.field_3899 = var9 * -1532729417;
               }
               continue;
            }

            throw new IllegalStateException();
         }

         return;
      }
   }

   // $FF: renamed from: f (int, cf, boolean, int) int
   static int method_6168(int var0, class_90 var1, boolean var2, int var3) {
      try {
         if(var0 < 1000) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_290.method_5291(var0, var1, var2, (byte)29);
            }
         } else if(var0 < 1100) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_356.method_6243(var0, var1, var2, (byte)-9);
            }
         } else if(var0 < 1200) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_81.method_1357(var0, var1, var2, 1464061704);
            }
         } else if(var0 < 1300) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_135.method_2944(var0, var1, var2, 1427864151);
            }
         } else if(var0 < 1400) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_175.method_3736(var0, var1, var2, (byte)-84);
            }
         } else if(var0 < 1500) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_211.method_4174(var0, var1, var2, 1611533259);
            }
         } else if(var0 < 1600) {
            return class_241.method_4646(var0, var1, var2, (byte)1);
         } else if(var0 < 1700) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_333.method_5905(var0, var1, var2, -1991704132);
            }
         } else if(var0 < 1800) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_311.method_5549(var0, var1, var2, 918594995);
            }
         } else if(var0 < 1900) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_45.method_528(var0, var1, var2, (byte)0);
            }
         } else if(var0 < 2000) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_126.method_2292(var0, var1, var2, 1261558074);
            }
         } else if(var0 < 2100) {
            return class_356.method_6243(var0, var1, var2, (byte)-85);
         } else if(var0 < 2200) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_81.method_1357(var0, var1, var2, 601949874);
            }
         } else if(var0 < 2300) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_135.method_2944(var0, var1, var2, -552113796);
            }
         } else if(var0 < 2400) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_175.method_3736(var0, var1, var2, (byte)-55);
            }
         } else if(var0 < 2500) {
            return class_211.method_4174(var0, var1, var2, 2009043123);
         } else if(var0 < 2600) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_74.method_1128(var0, var1, var2, -2015232474);
            }
         } else if(var0 < 2700) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_373.method_6617(var0, var1, var2, 1272154519);
            }
         } else if(var0 < 2800) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_164.method_3427(var0, var1, var2, 992004750);
            }
         } else if(var0 < 2900) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_247.method_4715(var0, var1, var2, -1000061278);
            }
         } else if(var0 < 3000) {
            return class_126.method_2292(var0, var1, var2, 2109627355);
         } else if(var0 < 3200) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_187.method_3885(var0, var1, var2, 910297623);
            }
         } else if(var0 < 3300) {
            return class_87.method_1495(var0, var1, var2, 2009331321);
         } else if(var0 < 3400) {
            return class_216.method_4196(var0, var1, var2, -2037016852);
         } else if(var0 < 3500) {
            return class_232.method_4450(var0, var1, var2, 1091146417);
         } else if(var0 < 3700) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_126.method_2291(var0, var1, var2, (byte)55);
            }
         } else if(var0 < 3800) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_44.method_517(var0, var1, var2, 1446319005);
            }
         } else if(var0 < 3900) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_232.method_4452(var0, var1, var2, (short)-12947);
            }
         } else if(var0 < 4000) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_334.method_5934(var0, var1, var2, 1682823323);
            }
         } else if(var0 < 4100) {
            return class_346.method_6176(var0, var1, var2, 574138081);
         } else if(var0 < 4200) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_179.method_3805(var0, var1, var2, 1607858695);
            }
         } else if(var0 < 4300) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_232.method_4442(var0, var1, var2, (byte)-41);
            }
         } else if(var0 < 5100) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_176.method_3748(var0, var1, var2, (byte)5);
            }
         } else if(var0 < 5400) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_56.method_590(var0, var1, var2, 1498995212);
            }
         } else if(var0 < 5600) {
            return class_53.method_580(var0, var1, var2, (byte)101);
         } else if(var0 < 5700) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_77.method_1221(var0, var1, var2, -849038542);
            }
         } else if(var0 < 6300) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_200.method_4052(var0, var1, var2, 1175355119);
            }
         } else if(var0 < 6600) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_97.method_1784(var0, var1, var2, -510374773);
            }
         } else if(var0 < 6700) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_301.method_5358(var0, var1, var2, (byte)4);
            }
         } else if(var0 < 6800) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_125.method_2285(var0, var1, var2, 1927970682);
            }
         } else if(var0 < 6900) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_257.method_4948(var0, var1, var2, -592432279);
            }
         } else if(var0 < 7000) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_177.method_3779(var0, var1, var2, -1087727229);
            }
         } else if(var0 < 7100) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_241.method_4649(var0, var1, var2, -1626936369);
            }
         } else if(var0 < 7200) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_123.method_2277(var0, var1, var2, (byte)-51);
            }
         } else if(var0 < 7300) {
            if(var3 <= -1598725575) {
               throw new IllegalStateException();
            } else {
               return class_145.method_3089(var0, var1, var2, 946272501);
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "lo.f(" + ')');
      }
   }
}
