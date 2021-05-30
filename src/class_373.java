
// $FF: renamed from: mv
public class class_373 {

   // $FF: renamed from: p mv
   public static final class_373 field_4115;
   // $FF: renamed from: v mv
   public static final class_373 field_4116;
   // $FF: renamed from: f mv
   public static final class_373 field_4117;
   // $FF: renamed from: y mv
   public static final class_373 field_4118;
   // $FF: renamed from: j mv
   public static final class_373 field_4119;
   // $FF: renamed from: tv int
   static final int field_4120 = 600;
   // $FF: renamed from: r java.lang.String
   String field_4121;
   // $FF: renamed from: cq int
   static final int field_4122 = 105;
   // $FF: renamed from: eu jp
   static class_307 field_4123;
   // $FF: renamed from: n mv
   public static final class_373 field_4124;


   // $FF: renamed from: fp (int, boolean, boolean, boolean, byte) jp
   static class_307 method_6613(int var0, boolean var1, boolean var2, boolean var3, byte var4) {
      try {
         class_350 var5 = null;
         if(null != class_199.field_2346) {
            if(var4 == 30) {
               throw new IllegalStateException();
            }

            class_350 var10000 = new class_350(var0, class_199.field_2346, class_164.field_2041[var0], 1000000);
            var5 = var10000;
         }

         class_307 var7 = new class_307(var5, class_135.field_1749, var0, var1, var2, var3);
         return var7;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "mv.fp(" + ')');
      }
   }

   // $FF: renamed from: r (byte[], int, int, int, int, int, int, int, gt, fz[], int) void
   static final void method_6614(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class_251 var8, class_240[] var9, int var10) {
      try {
         class_28 var10000 = new class_28(var0);
         class_28 var11 = var10000;
         int var12 = -1;

         while(true) {
            int var13 = var11.method_124(-1225252005);
            if(0 == var13) {
               return;
            }

            var12 += var13;
            int var14 = 0;

            while(true) {
               int var15 = var11.method_144((byte)79);
               if(0 == var15) {
                  if(var10 == 1819908173) {
                     throw new IllegalStateException();
                  }
                  break;
               }

               var14 += var15 - 1;
               int var16 = var14 & 63;
               int var17 = var14 >> 6 & 63;
               int var18 = var14 >> 12;
               int var19 = var11.method_130(-227900655);
               int var20 = var19 >> 2;
               int var21 = var19 & 3;
               if(var18 == var4) {
                  if(var10 == 1819908173) {
                     return;
                  }

                  if(var17 >= var5 && var17 < 8 + var5 && var16 >= var6 && var16 < 8 + var6) {
                     if(var10 == 1819908173) {
                        return;
                     }

                     class_87 var22 = class_121.method_2269(var12, 220361975);
                     int var25 = var17 & 7;
                     int var26 = var16 & 7;
                     int var28 = var22.field_839 * -288612135;
                     int var29 = var22.field_851 * -1812944985;
                     int var30;
                     if(1 == (var21 & 1)) {
                        if(var10 == 1819908173) {
                           throw new IllegalStateException();
                        }

                        var30 = var28;
                        var28 = var29;
                        var29 = var30;
                     }

                     int var27 = var7 & 3;
                     int var24;
                     if(var27 == 0) {
                        if(var10 == 1819908173) {
                           throw new IllegalStateException();
                        }

                        var24 = var25;
                     } else if(var27 == 1) {
                        if(var10 == 1819908173) {
                           throw new IllegalStateException();
                        }

                        var24 = var26;
                     } else if(2 == var27) {
                        if(var10 == 1819908173) {
                           throw new IllegalStateException();
                        }

                        var24 = 7 - var25 - (var28 - 1);
                     } else {
                        var24 = 7 - var26 - (var29 - 1);
                     }

                     var30 = var24 + var2;
                     int var31 = var3 + class_229.method_4361(var17 & 7, var16 & 7, var7, -288612135 * var22.field_839, -1812944985 * var22.field_851, var21, (short)4030);
                     if(var30 > 0) {
                        if(var10 == 1819908173) {
                           throw new IllegalStateException();
                        }

                        if(var31 > 0) {
                           if(var10 == 1819908173) {
                              throw new IllegalStateException();
                           }

                           if(var30 < 103) {
                              if(var10 == 1819908173) {
                                 throw new IllegalStateException();
                              }

                              if(var31 < 103) {
                                 if(var10 == 1819908173) {
                                    throw new IllegalStateException();
                                 }

                                 int var32 = var1;
                                 if(2 == (class_166.field_2069[1][var30][var31] & 2)) {
                                    if(var10 == 1819908173) {
                                       throw new IllegalStateException();
                                    }

                                    var32 = var1 - 1;
                                 }

                                 class_240 var33 = null;
                                 if(var32 >= 0) {
                                    if(var10 == 1819908173) {
                                       throw new IllegalStateException();
                                    }

                                    var33 = var9[var32];
                                 }

                                 class_178.method_3803(var1, var30, var31, var12, var21 + var7 & 3, var20, var8, var33, (byte)19);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var34) {
         throw class_223.method_4281(var34, "mv.r(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_373 var10000 = new class_373("p11_full");
      field_4116 = var10000;
      var10000 = new class_373("p12_full");
      field_4124 = var10000;
      var10000 = new class_373("b12_full");
      field_4117 = var10000;
      var10000 = new class_373("verdana_11pt_regular");
      field_4118 = var10000;
      var10000 = new class_373("verdana_13pt_regular");
      field_4115 = var10000;
      var10000 = new class_373("verdana_15pt_regular");
      field_4119 = var10000;
   }

   // $FF: renamed from: ln (int) boolean
   public static boolean method_6616(int var0) {
      try {
         return client.field_1586 * -816484905 >= 2;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "mv.ln(" + ')');
      }
   }

   // $FF: renamed from: m (int, cf, boolean, int) int
   static int method_6617(int var0, class_90 var1, boolean var2, int var3) {
      try {
         class_37 var4 = class_71.method_1047(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885], 1962701030);
         if(2600 == var0) {
            if(var3 != 1272154519) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -1662391635 * var4.field_122;
               return 1;
            }
         } else if(var0 == 2601) {
            if(var3 != 1272154519) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 1974901921 * var4.field_123;
               return 1;
            }
         } else if(var0 == 2602) {
            if(var3 != 1272154519) {
               throw new IllegalStateException();
            } else {
               class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var4.field_136;
               return 1;
            }
         } else if(2603 == var0) {
            if(var3 != 1272154519) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 1489642403 * var4.field_219;
               return 1;
            }
         } else if(var0 == 2604) {
            if(var3 != 1272154519) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var4.field_125 * 1577090123;
               return 1;
            }
         } else if(var0 == 2605) {
            if(var3 != 1272154519) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var4.field_205 * 1456177915;
               return 1;
            }
         } else if(var0 == 2606) {
            class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var4.field_142 * -1005507705;
            return 1;
         } else if(var0 == 2607) {
            if(var3 != 1272154519) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 625190029 * var4.field_137;
               return 1;
            }
         } else if(var0 == 2608) {
            if(var3 != 1272154519) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 490585271 * var4.field_153;
               return 1;
            }
         } else if(var0 == 2609) {
            if(var3 != 1272154519) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 225521737 * var4.field_132;
               return 1;
            }
         } else if(var0 == 2610) {
            if(var3 != 1272154519) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 1352946151 * var4.field_154;
               return 1;
            }
         } else if(2611 == var0) {
            class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var4.field_245 * -1017532251;
            return 1;
         } else if(var0 == 2612) {
            class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -681284339 * var4.field_127;
            return 1;
         } else if(var0 == 2613) {
            if(var3 != 1272154519) {
               throw new IllegalStateException();
            } else {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var4.field_131.method_50(1962190737);
               return 1;
            }
         } else if(2614 == var0) {
            int[] var10000 = class_165.field_2052;
            int var10001 = (class_136.field_1752 += -1087727229) * -26460885 - 1;
            byte var10002;
            if(var4.field_248) {
               if(var3 != 1272154519) {
                  throw new IllegalStateException();
               }

               var10002 = 1;
            } else {
               var10002 = 0;
            }

            var10000[var10001] = var10002;
            return 1;
         } else {
            if(2615 != var0) {
               if(var3 != 1272154519) {
                  throw new IllegalStateException();
               }

               if(var0 != 2616) {
                  return 2;
               }

               if(var3 != 1272154519) {
                  throw new IllegalStateException();
               }
            }

            class_136.field_1752 += -1087727229;
            return 1;
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "mv.m(" + ')');
      }
   }

   // $FF: renamed from: n (int, int) ee
   public static class_89 method_6618(int var0, int var1) {
      try {
         class_89 var2 = (class_89)class_89.field_893.method_5065((long)var0);
         if(null != var2) {
            if(var1 == 1790954535) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = class_89.field_897.method_5381(14, var0, -26460885);
            class_89 var10000 = new class_89();
            var2 = var10000;
            if(var3 != null) {
               class_28 var10001 = new class_28(var3);
               var2.method_1569(var10001, -558470326);
            }

            class_89.field_893.method_5064(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "mv.n(" + ')');
      }
   }

   // $FF: renamed from: <init> (java.lang.String) void
   class_373(String var1) {
      super();
      try {
         this.field_4121 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mv.<init>(" + ')');
      }
   }
}
