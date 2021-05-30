import java.util.HashSet;
import java.util.Set;

// $FF: renamed from: kl
public class class_325 implements class_14 {

   // $FF: renamed from: v kl
   static final class_325 field_3825;
   // $FF: renamed from: j kl
   static final class_325 field_3826;
   // $FF: renamed from: k int
   static final int field_3827 = 131072;
   // $FF: renamed from: o kl
   static final class_325 field_3828;
   // $FF: renamed from: p kl
   static final class_325 field_3829;
   // $FF: renamed from: c int
   final int field_3830;
   // $FF: renamed from: r kl
   static final class_325 field_3831;
   // $FF: renamed from: b kl
   static final class_325 field_3832;
   // $FF: renamed from: d kl
   static final class_325 field_3833;
   // $FF: renamed from: s kl
   static final class_325 field_3834;
   // $FF: renamed from: u kl
   static final class_325 field_3835;
   // $FF: renamed from: l kl
   static final class_325 field_3836;
   // $FF: renamed from: y kl
   static final class_325 field_3837;
   // $FF: renamed from: f kl
   static final class_325 field_3838;
   // $FF: renamed from: e java.util.Set
   final Set field_3839;
   // $FF: renamed from: mh int
   static final int field_3840 = 3;
   // $FF: renamed from: n kl
   static final class_325 field_3841;


   // $FF: renamed from: v (int) int
   public int method_50(int var1) {
      try {
         return this.field_3830 * 448487515;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "kl.v(" + ')');
      }
   }

   // $FF: renamed from: <init> (java.lang.String, int, ky[]) void
   class_325(String var1, int var2, class_336[] var3) {
      super();
      try {
         this.field_3839 = new HashSet();
         this.field_3830 = 1590874067 * var2;
         class_336[] var4 = var3;

         for(int var5 = 0; var5 < var4.length; ++var5) {
            class_336 var6 = var4[var5];
            this.field_3839.add(var6);
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "kl.<init>(" + ')');
      }
   }

   // $FF: renamed from: f () int
   public int method_51() {
      return this.field_3830 * 448487515;
   }

   // $FF: renamed from: <init> (java.lang.String, int) void
   class_325(String var1, int var2) {
      super();
      try {
         this.field_3839 = new HashSet();
         this.field_3830 = 1590874067 * var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "kl.<init>(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_325 var10000 = new class_325("", 0, new class_336[]{class_336.field_3876});
      field_3825 = var10000;
      var10000 = new class_325("", 1, new class_336[]{class_336.field_3877, class_336.field_3876});
      field_3841 = var10000;
      var10000 = new class_325("", 2, new class_336[]{class_336.field_3877, class_336.field_3880, class_336.field_3876});
      field_3838 = var10000;
      var10000 = new class_325("", 3, new class_336[]{class_336.field_3877});
      field_3837 = var10000;
      var10000 = new class_325("", 4);
      field_3829 = var10000;
      var10000 = new class_325("", 5, new class_336[]{class_336.field_3877, class_336.field_3876});
      field_3826 = var10000;
      var10000 = new class_325("", 6, new class_336[]{class_336.field_3876});
      field_3831 = var10000;
      var10000 = new class_325("", 8, new class_336[]{class_336.field_3877, class_336.field_3876});
      field_3832 = var10000;
      var10000 = new class_325("", 9, new class_336[]{class_336.field_3877, class_336.field_3880});
      field_3833 = var10000;
      var10000 = new class_325("", 10, new class_336[]{class_336.field_3877});
      field_3834 = var10000;
      var10000 = new class_325("", 11, new class_336[]{class_336.field_3877});
      field_3835 = var10000;
      var10000 = new class_325("", 12, new class_336[]{class_336.field_3877, class_336.field_3876});
      field_3836 = var10000;
      var10000 = new class_325("", 13, new class_336[]{class_336.field_3877});
      field_3828 = var10000;
      method_5782(1537765097);
   }

   // $FF: renamed from: n () int
   public int method_49() {
      return this.field_3830 * 448487515;
   }

   // $FF: renamed from: j () kl[]
   static class_325[] method_5777() {
      return new class_325[]{field_3841, field_3834, field_3836, field_3825, field_3838, field_3835, field_3831, field_3826, field_3837, field_3833, field_3829, field_3832, field_3828};
   }

   // $FF: renamed from: p () kl[]
   static class_325[] method_5778() {
      return new class_325[]{field_3841, field_3834, field_3836, field_3825, field_3838, field_3835, field_3831, field_3826, field_3837, field_3833, field_3829, field_3832, field_3828};
   }

   // $FF: renamed from: n (int, int, int) io
   public static class_37 method_5779(int var0, int var1, int var2) {
      try {
         class_37 var3 = class_71.method_1047(var0, 527654126);
         if(var1 == -1) {
            if(var2 <= -789816294) {
               throw new IllegalStateException();
            } else {
               return var3;
            }
         } else {
            if(null != var3) {
               if(var2 <= -789816294) {
                  throw new IllegalStateException();
               }

               if(null != var3.field_233) {
                  if(var2 <= -789816294) {
                     throw new IllegalStateException();
                  }

                  if(var1 < var3.field_233.length) {
                     return var3.field_233[var1];
                  }

                  if(var2 <= -789816294) {
                     throw new IllegalStateException();
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "kl.n(" + ')');
      }
   }

   // $FF: renamed from: jn (io, int, int) int
   static final int method_5780(class_37 var0, int var1, int var2) {
      try {
         if(var0.field_221 != null) {
            if(var2 <= 388871013) {
               throw new IllegalStateException();
            }

            if(var1 < var0.field_221.length) {
               try {
                  int[] var3 = var0.field_221[var1];
                  int var4 = 0;
                  int var5 = 0;
                  byte var6 = 0;

                  while(true) {
                     int var7 = var3[var5++];
                     int var8 = 0;
                     byte var9 = 0;
                     if(var7 == 0) {
                        if(var2 <= 388871013) {
                           throw new IllegalStateException();
                        }

                        return var4;
                     }

                     if(1 == var7) {
                        if(var2 <= 388871013) {
                           throw new IllegalStateException();
                        }

                        var8 = client.field_1549[var3[var5++]];
                     }

                     if(var7 == 2) {
                        if(var2 <= 388871013) {
                           throw new IllegalStateException();
                        }

                        var8 = client.field_1550[var3[var5++]];
                     }

                     if(var7 == 3) {
                        if(var2 <= 388871013) {
                           throw new IllegalStateException();
                        }

                        var8 = client.field_1551[var3[var5++]];
                     }

                     int var10;
                     class_37 var11;
                     int var12;
                     int var13;
                     if(var7 == 4) {
                        if(var2 <= 388871013) {
                           throw new IllegalStateException();
                        }

                        var10 = var3[var5++] << 16;
                        var10 += var3[var5++];
                        var11 = class_71.method_1047(var10, 1840991250);
                        var12 = var3[var5++];
                        if(-1 != var12) {
                           if(var2 <= 388871013) {
                              throw new IllegalStateException();
                           }

                           if(!class_299.method_5347(var12, -1858306397).field_720 || client.field_1416) {
                              for(var13 = 0; var13 < var11.field_227.length; ++var13) {
                                 if(var2 <= 388871013) {
                                    throw new IllegalStateException();
                                 }

                                 if(var11.field_227[var13] == 1 + var12) {
                                    if(var2 <= 388871013) {
                                       throw new IllegalStateException();
                                    }

                                    var8 += var11.field_228[var13];
                                 }
                              }
                           }
                        }
                     }

                     if(var7 == 5) {
                        if(var2 <= 388871013) {
                           throw new IllegalStateException();
                        }

                        var8 = class_282.field_3246[var3[var5++]];
                     }

                     if(var7 == 6) {
                        var8 = class_289.field_3282[client.field_1550[var3[var5++]] - 1];
                     }

                     if(var7 == 7) {
                        var8 = class_282.field_3246[var3[var5++]] * 100 / '\ub71b';
                     }

                     if(8 == var7) {
                        if(var2 <= 388871013) {
                           throw new IllegalStateException();
                        }

                        var8 = class_164.field_2044.field_1147 * -1947441591;
                     }

                     if(9 == var7) {
                        if(var2 <= 388871013) {
                           throw new IllegalStateException();
                        }

                        for(var10 = 0; var10 < 25; ++var10) {
                           if(class_289.field_3285[var10]) {
                              if(var2 <= 388871013) {
                                 throw new IllegalStateException();
                              }

                              var8 += client.field_1550[var10];
                           }
                        }
                     }

                     if(10 == var7) {
                        if(var2 <= 388871013) {
                           throw new IllegalStateException();
                        }

                        var10 = var3[var5++] << 16;
                        var10 += var3[var5++];
                        var11 = class_71.method_1047(var10, 1111979401);
                        var12 = var3[var5++];
                        if(var12 != -1) {
                           label325: {
                              if(var2 <= 388871013) {
                                 throw new IllegalStateException();
                              }

                              if(class_299.method_5347(var12, -1695764448).field_720) {
                                 if(var2 <= 388871013) {
                                    throw new IllegalStateException();
                                 }

                                 if(!client.field_1416) {
                                    break label325;
                                 }

                                 if(var2 <= 388871013) {
                                    throw new IllegalStateException();
                                 }
                              }

                              for(var13 = 0; var13 < var11.field_227.length; ++var13) {
                                 if(var2 <= 388871013) {
                                    throw new IllegalStateException();
                                 }

                                 if(var11.field_227[var13] == var12 + 1) {
                                    var8 = 999999999;
                                    break;
                                 }
                              }
                           }
                        }
                     }

                     if(11 == var7) {
                        if(var2 <= 388871013) {
                           throw new IllegalStateException();
                        }

                        var8 = 1008679671 * client.field_1674;
                     }

                     if(12 == var7) {
                        if(var2 <= 388871013) {
                           throw new IllegalStateException();
                        }

                        var8 = client.field_1542 * -612986977;
                     }

                     if(var7 == 13) {
                        if(var2 <= 388871013) {
                           throw new IllegalStateException();
                        }

                        var10 = class_282.field_3246[var3[var5++]];
                        int var16 = var3[var5++];
                        byte var10000;
                        if((var10 & 1 << var16) != 0) {
                           if(var2 <= 388871013) {
                              throw new IllegalStateException();
                           }

                           var10000 = 1;
                        } else {
                           var10000 = 0;
                        }

                        var8 = var10000;
                     }

                     if(14 == var7) {
                        if(var2 <= 388871013) {
                           throw new IllegalStateException();
                        }

                        var10 = var3[var5++];
                        var8 = class_43.method_496(var10, 1398845416);
                     }

                     if(var7 == 15) {
                        if(var2 <= 388871013) {
                           throw new IllegalStateException();
                        }

                        var9 = 1;
                     }

                     if(var7 == 16) {
                        if(var2 <= 388871013) {
                           throw new IllegalStateException();
                        }

                        var9 = 2;
                     }

                     if(17 == var7) {
                        if(var2 <= 388871013) {
                           throw new IllegalStateException();
                        }

                        var9 = 3;
                     }

                     if(var7 == 18) {
                        if(var2 <= 388871013) {
                           throw new IllegalStateException();
                        }

                        var8 = (class_164.field_2044.field_1077 * -130212619 >> 7) + 697161691 * class_243.field_2700;
                     }

                     if(var7 == 19) {
                        if(var2 <= 388871013) {
                           throw new IllegalStateException();
                        }

                        var8 = (1248597615 * class_164.field_2044.field_1076 >> 7) + class_154.field_1929 * -27903763;
                     }

                     if(20 == var7) {
                        var8 = var3[var5++];
                     }

                     if(0 == var9) {
                        if(var2 <= 388871013) {
                           throw new IllegalStateException();
                        }

                        if(0 == var6) {
                           if(var2 <= 388871013) {
                              throw new IllegalStateException();
                           }

                           var4 += var8;
                        }

                        if(var6 == 1) {
                           var4 -= var8;
                        }

                        if(2 == var6) {
                           if(var2 <= 388871013) {
                              throw new IllegalStateException();
                           }

                           if(var8 != 0) {
                              if(var2 <= 388871013) {
                                 throw new IllegalStateException();
                              }

                              var4 /= var8;
                           }
                        }

                        if(var6 == 3) {
                           if(var2 <= 388871013) {
                              throw new IllegalStateException();
                           }

                           var4 *= var8;
                        }

                        var6 = 0;
                     } else {
                        var6 = var9;
                     }
                  }
               } catch (Exception var14) {
                  return -1;
               }
            }

            if(var2 <= 388871013) {
               throw new IllegalStateException();
            }
         }

         return -2;
      } catch (RuntimeException var15) {
         throw class_223.method_4281(var15, "kl.jn(" + ')');
      }
   }

   // $FF: renamed from: v (nd, mr, int) mr
   static final class_369 method_5781(class_28 var0, class_369 var1, int var2) {
      try {
         int var3 = var0.method_130(-1955734861);
         int var4;
         if(var1 == null) {
            if(var2 != -391561047) {
               throw new IllegalStateException();
            }

            var4 = class_100.method_1845(var3, -124194447);
            class_369 var10000 = new class_369(var4);
            var1 = var10000;
         }

         for(var4 = 0; var4 < var3; ++var4) {
            if(var2 != -391561047) {
               throw new IllegalStateException();
            }

            boolean var9;
            if(var0.method_130(337071307) == 1) {
               if(var2 != -391561047) {
                  throw new IllegalStateException();
               }

               var9 = true;
            } else {
               var9 = false;
            }

            boolean var5 = var9;
            int var6 = var0.method_134((byte)-37);
            Object var7;
            if(var5) {
               if(var2 != -391561047) {
                  throw new IllegalStateException();
               }

               class_34 var10 = new class_34(var0.method_139(-391631059));
               var7 = var10;
            } else {
               class_32 var11 = new class_32(var0.method_135((byte)-86));
               var7 = var11;
            }

            var1.method_6588((class_27)var7, (long)var6);
         }

         return var1;
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "kl.v(" + ')');
      }
   }

   // $FF: renamed from: y (int) kl[]
   static class_325[] method_5782(int var0) {
      try {
         return new class_325[]{field_3841, field_3834, field_3836, field_3825, field_3838, field_3835, field_3831, field_3826, field_3837, field_3833, field_3829, field_3832, field_3828};
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "kl.y(" + ')');
      }
   }
}
