
// $FF: renamed from: hy
public class class_271 {

   // $FF: renamed from: j jv
   public static class_306 field_3186;
   // $FF: renamed from: f int
   public static int field_3187;
   // $FF: renamed from: iq int
   static int field_3188;


   // $FF: renamed from: y (nd, int, byte) java.lang.String
   static String method_5058(Buffer var0, int var1, byte var2) {
      try {
         try {
            int var3 = var0.method_144();
            if(var3 > var1) {
               if(var2 == 1) {
                  throw new IllegalStateException();
               }

               var3 = var1;
            }

            byte[] var4 = new byte[var3];
            var0.offset += class_283.field_3254.method_5130(var0.data, var0.offset * -442398587, var4, 0, var3, 2146568122) * -1025691571;
            String var5 = class_135.method_2948(var4, 0, var3, (byte)92);
            return var5;
         } catch (Exception var6) {
            return "Cabbage";
         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: <init> () void
   class_271() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: u (int, int, int, int, int, boolean, int) oh
   public static final class_67 method_5060(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         if(var1 == -1) {
            if(var6 <= 134358560) {
               throw new IllegalStateException();
            }

            var4 = 0;
         } else if(var4 == 2) {
            if(var6 <= 134358560) {
               throw new IllegalStateException();
            }

            if(1 != var1) {
               var4 = 1;
            }
         }

         long var7 = ((long)var3 << 42) + ((long)var4 << 40) + (long)var0 + ((long)var1 << 16) + ((long)var2 << 38);
         class_67 var9;
         if(!var5) {
            if(var6 <= 134358560) {
               throw new IllegalStateException();
            }

            var9 = (class_67)class_80.field_704.method_5065(var7);
            if(null != var9) {
               if(var6 <= 134358560) {
                  throw new IllegalStateException();
               }

               return var9;
            }
         }

         class_80 var10 = class_299.method_5347(var0, -353384305);
         if(var1 > 1) {
            if(var6 <= 134358560) {
               throw new IllegalStateException();
            }

            if(var10.field_736 != null) {
               if(var6 <= 134358560) {
                  throw new IllegalStateException();
               }

               int var11 = -1;

               for(int var12 = 0; var12 < 10; ++var12) {
                  if(var1 >= var10.field_712[var12]) {
                     if(var6 <= 134358560) {
                        throw new IllegalStateException();
                     }

                     if(0 != var10.field_712[var12]) {
                        if(var6 <= 134358560) {
                           throw new IllegalStateException();
                        }

                        var11 = var10.field_736[var12];
                     }
                  }
               }

               if(var11 != -1) {
                  if(var6 <= 134358560) {
                     throw new IllegalStateException();
                  }

                  var10 = class_299.method_5347(var11, -410532896);
               }
            }
         }

         class_92 var23 = var10.method_1267(1, 1212682396);
         if(null == var23) {
            if(var6 <= 134358560) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            class_67 var24 = null;
            if(-1 != var10.field_743 * 168192755) {
               if(var6 <= 134358560) {
                  throw new IllegalStateException();
               }

               var24 = method_5060(var10.field_698 * 1027633359, 10, 1, 0, 0, true, 1627930789);
               if(null == var24) {
                  if(var6 <= 134358560) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            } else if(var10.field_749 * -1893254845 != -1) {
               if(var6 <= 134358560) {
                  throw new IllegalStateException();
               }

               var24 = method_5060(-1249308017 * var10.field_734, var1, var2, var3, 0, false, 2134710361);
               if(var24 == null) {
                  if(var6 <= 134358560) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            } else if(var10.field_751 * 1689317723 != -1) {
               if(var6 <= 134358560) {
                  throw new IllegalStateException();
               }

               var24 = method_5060(var10.field_750 * 1563500305, var1, 0, 0, 0, false, 1961971132);
               if(null == var24) {
                  if(var6 <= 134358560) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            }

            int[] var13 = class_65.field_490;
            int var14 = class_65.field_484;
            int var15 = class_65.field_486;
            int[] var16 = new int[4];
            class_65.method_655(var16);
            class_67 var10000 = new class_67(36, 32);
            var9 = var10000;
            class_65.method_656(var9.field_502, 36, 32);
            class_65.method_662();
            class_70.method_968();
            class_70.method_971(16, 16);
            class_70.field_556 = false;
            if(1689317723 * var10.field_751 != -1) {
               if(var6 <= 134358560) {
                  throw new IllegalStateException();
               }

               var24.method_767(0, 0);
            }

            int var17 = 1180916267 * var10.field_713;
            if(var5) {
               if(var6 <= 134358560) {
                  throw new IllegalStateException();
               }

               var17 = (int)((double)var17 * 1.5D);
            } else if(var2 == 2) {
               if(var6 <= 134358560) {
                  throw new IllegalStateException();
               }

               var17 = (int)((double)var17 * 1.04D);
            }

            int var18 = class_70.field_548[143465415 * var10.field_733] * var17 >> 16;
            int var19 = class_70.field_559[var10.field_733 * 143465415] * var17 >> 16;
            var23.method_1621();
            var23.method_1686(0, 10451221 * var10.field_714, var10.field_715 * -1707042663, 143465415 * var10.field_733, -538415603 * var10.field_716, var18 + 267422413 * var23.field_911 / 2 + -1515805085 * var10.field_717, var19 + -1515805085 * var10.field_717);
            if(var10.field_749 * -1893254845 != -1) {
               if(var6 <= 134358560) {
                  throw new IllegalStateException();
               }

               var24.method_767(0, 0);
            }

            if(var2 >= 1) {
               var9.method_763(1);
            }

            if(var2 >= 2) {
               var9.method_763(16777215);
            }

            if(var3 != 0) {
               if(var6 <= 134358560) {
                  throw new IllegalStateException();
               }

               var9.method_764(var3);
            }

            class_65.method_656(var9.field_502, 36, 32);
            if(-1 != var10.field_743 * 168192755) {
               if(var6 <= 134358560) {
                  throw new IllegalStateException();
               }

               var24.method_767(0, 0);
            }

            label263: {
               if(var4 != 1) {
                  if(var6 <= 134358560) {
                     throw new IllegalStateException();
                  }

                  if(2 != var4) {
                     break label263;
                  }

                  if(var6 <= 134358560) {
                     throw new IllegalStateException();
                  }

                  if(-1049731853 * var10.field_705 != 1) {
                     break label263;
                  }

                  if(var6 <= 134358560) {
                     throw new IllegalStateException();
                  }
               }

               class_69 var20 = class_322.field_3809;
               String var21;
               if(var1 < 100000) {
                  if(var6 <= 134358560) {
                     throw new IllegalStateException();
                  }

                  var21 = "<col=ffff00>" + var1 + "</col>";
               } else if(var1 < 10000000) {
                  if(var6 <= 134358560) {
                     throw new IllegalStateException();
                  }

                  var21 = "<col=ffffff>" + var1 / 1000 + class_305.field_3463 + "</col>";
               } else {
                  var21 = "<col=00ff80>" + var1 / 1000000 + class_305.field_3409 + "</col>";
               }

               var20.method_869(var21, 0, 9, 16776960, 1);
            }

            if(!var5) {
               if(var6 <= 134358560) {
                  throw new IllegalStateException();
               }

               class_80.field_704.method_5064(var9, var7);
            }

            class_65.method_656(var13, var14, var15);
            class_65.method_690(var16);
            class_70.method_968();
            class_70.field_556 = true;
            return var9;
         }
      } catch (RuntimeException var22) {
         throw class_223.method_4281(var22);
      }
   }
}
