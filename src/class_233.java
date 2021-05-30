import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

// $FF: renamed from: fq
public class class_233 {

   // $FF: renamed from: p hn
   public static class_264 field_2604;
    // $FF: renamed from: c java.util.HashMap
   final HashMap field_2606;
   // $FF: renamed from: j int
   int field_2607;
   // $FF: renamed from: s int
   int field_2608;
   // $FF: renamed from: r int
   int field_2609;
   // $FF: renamed from: b ft
   class_228 field_2610;
   // $FF: renamed from: d java.util.LinkedList
   LinkedList field_2611;
    // $FF: renamed from: u int
   int field_2613;
    // $FF: renamed from: o java.util.HashMap
   HashMap field_2615;
   // $FF: renamed from: l java.util.List
   List field_2616;
   // $FF: renamed from: qf lt
   static class_344 field_2617;


    // $FF: renamed from: n (int, int, int, int) void
   void method_4458(int var1, int var2, int var3, int var4) {
      try {
         int var6 = -1618950683 * this.field_2607;
         int var7 = this.field_2609 * 2001174097;
         int var8 = this.field_2613 * 1359138405;
         class_264 var9 = field_2604;
         long var10 = (long)(var8 << 16 | var6 << 8 | var7);
         class_67 var5 = (class_67)var9.method_5002(var10);
         if(var5 == null) {
            if(var4 == 376009810) {
               throw new IllegalStateException();
            }
         } else {
            if(var3 == this.field_2613 * 1085512000) {
               if(var4 == 376009810) {
                  throw new IllegalStateException();
               }

               var5.method_765(var1, var2);
            } else {
               var5.method_833(var1, var2, var3, var3);
            }

         }
      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12);
      }
   }

   // $FF: renamed from: f (ft, java.util.List, int) void
   void method_4459(class_228 var1, List var2) {
      try {
         this.field_2615.clear();
         this.field_2610 = var1;
         this.method_4464(var2, 1099621062);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: y (java.util.HashSet, java.util.List, int) void
   void method_4460(HashSet var1, List var2, int var3) {
      try {
         this.field_2615.clear();
         Iterator var4 = var1.iterator();

         while(var4.hasNext()) {
            if(var3 == 623518100) {
               throw new IllegalStateException();
            }

            class_227 var5 = (class_227)var4.next();
            if(var5.method_4300() == -1618950683 * this.field_2607) {
               if(var3 == 623518100) {
                  return;
               }

               if(var5.method_4302() == 2001174097 * this.field_2609) {
                  if(var3 == 623518100) {
                     return;
                  }

                  this.field_2611.add(var5);
               }
            }
         }

         this.method_4464(var2, -1677517743);
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

    // $FF: renamed from: r (short) void
   void method_4463(short var1) {
      try {
         Iterator var2 = this.field_2615.values().iterator();

         while(var2.hasNext()) {
            if(var1 <= 133) {
               throw new IllegalStateException();
            }

            class_218 var3 = (class_218)var2.next();
            if(var3 instanceof class_220) {
               if(var1 <= 133) {
                  throw new IllegalStateException();
               }

               ((class_220)var3).method_4230((short)25929);
            }
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: b (java.util.List, int) void
   void method_4464(List var1, int var2) {
      try {
         Iterator var3 = var1.iterator();

         while(var3.hasNext()) {
            if(var2 == -26460885) {
               return;
            }

            class_219 var4 = (class_219)var3.next();
            if(!class_116.method_2248(var4.field_2485 * -1937738349, 1647125333).field_608) {
               if(var2 == -26460885) {
                  return;
               }
            } else if(-2092998769 * var4.field_2482.field_3236 >> 6 == this.field_2607 * -1618950683) {
               if(var2 == -26460885) {
                  throw new IllegalStateException();
               }

               if(this.field_2609 * 2001174097 == 349527629 * var4.field_2482.field_3235 >> 6) {
                  if(var2 == -26460885) {
                     throw new IllegalStateException();
                  }

                  class_219 var10000 = new class_219(var4.field_2482, var4.field_2482, -1937738349 * var4.field_2485, this.method_4487(var4.field_2485 * -1937738349));
                  class_219 var5 = var10000;
                  this.field_2616.add(var5);
               }
            }
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

    // $FF: renamed from: u (int, gb, op[], jv, jv, int) void
   void method_4467(int var1, class_242 var2, class_66[] var3, class_306 var4, class_306 var5, int var6) {
      try {
         this.field_2613 = 1693463405 * var1;
         if(this.field_2610 == null) {
            if(var6 != -1087727229) {
               throw new IllegalStateException();
            }

            if(this.field_2611.isEmpty()) {
               return;
            }
         }

         if(class_56.method_593(-1618950683 * this.field_2607, this.field_2609 * 2001174097, var1) != null) {
            if(var6 != -1087727229) {
               throw new IllegalStateException();
            }
         } else {
            boolean var7 = true;
            var7 &= this.method_4471(var4, (short)27128);
            int var9;
            if(this.field_2610 != null) {
               if(var6 != -1087727229) {
                  throw new IllegalStateException();
               }

               var9 = -630921225 * this.field_2610.field_2560;
            } else {
               var9 = ((class_226)this.field_2611.getFirst()).field_2560 * -630921225;
            }

            var7 &= var5.method_5411(var9, (byte)96);
            if(!var7) {
               if(var6 == -1087727229) {
                  ;
               }
            } else {
               byte[] var8 = var5.method_5388(var9, (byte)-53);
               class_217 var10 = class_168.method_3611(var8, 775453768);
               class_67 var10000 = new class_67(1085512000 * this.field_2613, this.field_2613 * 1085512000);
               class_67 var11 = var10000;
               var11.method_758();
               if(null != this.field_2610) {
                  if(var6 != -1087727229) {
                     throw new IllegalStateException();
                  }

                  this.method_4470(var2, var3, var10, 1016970364);
               } else {
                  this.method_4587(var2, var3, var10, (byte)-39);
               }

               int var12 = this.field_2607 * -1618950683;
               int var13 = this.field_2609 * 2001174097;
               int var14 = this.field_2613 * 1359138405;
               class_264 var15 = field_2604;
               long var17 = (long)(var14 << 16 | var12 << 8 | var13);
               var15.method_5004(var11, var17, 4 * var11.field_502.length);
               this.method_4519(1753897051);
            }
         }
      } catch (RuntimeException var19) {
         throw class_223.method_4281(var19);
      }
   }

    // $FF: renamed from: o (java.util.HashSet, int, int, int) void
   void method_4469(HashSet var1, int var2, int var3, int var4) {
      try {
         Iterator var5 = this.field_2615.values().iterator();

         while(var5.hasNext()) {
            if(var4 != 685193317) {
               throw new IllegalStateException();
            }

            class_218 var6 = (class_218)var5.next();
            if(!var6.method_4209(1343648399)) {
               if(var4 != 685193317) {
                  throw new IllegalStateException();
               }
            } else {
               int var7 = var6.method_4205();
               if(var1.contains(Integer.valueOf(var7))) {
                  if(var4 != 685193317) {
                     throw new IllegalStateException();
                  }

                  class_75 var8 = class_116.method_2248(var7, 1647125333);
                  this.method_4544(var8, 1619813951 * var6.field_2481, var6.field_2479 * 1123629873, var2, var3, 1184916583);
               }
            }
         }

         this.method_4479(var1, var2, var3, -341047508);
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9);
      }
   }

   // $FF: renamed from: c (gb, op[], fd, int) void
   void method_4470(class_242 var1, class_66[] var2, class_217 var3, int var4) {
      try {
         int var5;
         int var6;
         for(var5 = 0; var5 < 64; ++var5) {
            if(var4 == 1705584997) {
               throw new IllegalStateException();
            }

            for(var6 = 0; var6 < 64; ++var6) {
               if(var4 == 1705584997) {
                  return;
               }

               this.method_4473(var5, var6, this.field_2610, var1, var3, -1821301029);
               this.method_4474(var5, var6, this.field_2610, var1, (byte)16);
            }
         }

         for(var5 = 0; var5 < 64; ++var5) {
            for(var6 = 0; var6 < 64; ++var6) {
               if(var4 == 1705584997) {
                  throw new IllegalStateException();
               }

               this.method_4541(var5, var6, this.field_2610, var2);
            }
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: s (jv, short) boolean
   boolean method_4471(class_306 var1, short var2) {
      try {
         this.field_2615.clear();
         if(null != this.field_2610) {
            if(var2 <= 512) {
               throw new IllegalStateException();
            } else {
               this.field_2610.method_4293(var1, -1881595992);
               if(this.field_2610.method_4292((byte)25)) {
                  if(var2 <= 512) {
                     throw new IllegalStateException();
                  } else {
                     this.method_4589(0, 0, 64, 64, this.field_2610, -1919437807);
                     return true;
                  }
               } else {
                  return false;
               }
            }
         } else {
            boolean var3 = true;

            Iterator var4;
            class_227 var5;
            for(var4 = this.field_2611.iterator(); var4.hasNext(); var3 &= var5.method_4292((byte)25)) {
               if(var2 <= 512) {
                  throw new IllegalStateException();
               }

               var5 = (class_227)var4.next();
               var5.method_4293(var1, -1898408625);
            }

            if(var3) {
               if(var2 <= 512) {
                  throw new IllegalStateException();
               }

               var4 = this.field_2611.iterator();

               while(var4.hasNext()) {
                  if(var2 <= 512) {
                     throw new IllegalStateException();
                  }

                  var5 = (class_227)var4.next();
                  this.method_4589(var5.method_4328() * 8, var5.method_4322() * 8, 8, 8, var5, -1439258329);
               }
            }

            return var3;
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: ae (gq, ew, int, int, float, short) void
   void method_4472(class_218 var1, class_75 var2, int var3, int var4, float var5, short var6) {
      try {
         class_237 var7 = var1.method_4206();
         if(null == var7) {
            if(var6 == 255) {
               throw new IllegalStateException();
            }
         } else if(!var7.field_2643.method_4448(var5, 535854948)) {
            if(var6 == 255) {
               throw new IllegalStateException();
            }
         } else {
            class_69 var8 = (class_69)this.field_2606.get(var7.field_2643);
            var8.method_884(var7.field_2642, var3 - var7.field_2640 * -1781114869 / 2, var4, -1781114869 * var7.field_2640, -733130897 * var7.field_2641, -16777216 | var2.field_605 * 1016348217, 0, 1, 0, var8.field_522 / 2);
         }
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9);
      }
   }

   // $FF: renamed from: a (int, int, fm, gb, fd, int) void
   void method_4473(int var1, int var2, class_226 var3, class_242 var4, class_217 var5, int var6) {
      try {
         int var7 = var3.field_2553[0][var1][var2] - 1;
         int var8 = var3.field_2554[0][var1][var2] - 1;
         if(var7 == -1 && var8 == -1) {
            if(var6 >= -1702273423) {
               return;
            }

            class_65.method_681(1359138405 * this.field_2613 * var1, (63 - var2) * this.field_2613 * 1359138405, 1359138405 * this.field_2613, this.field_2613 * 1359138405, this.field_2608 * -747005213);
         }

         int var9 = 16711935;
         int var10;
         if(-1 != var8) {
            if(var6 >= -1702273423) {
               throw new IllegalStateException();
            }

            int var11 = -747005213 * this.field_2608;
            class_82 var12 = class_154.method_3249(var8, -2098044368);
            if(null == var12) {
               var10 = var11;
            } else if(1447154143 * var12.field_761 >= 0) {
               if(var6 >= -1702273423) {
                  throw new IllegalStateException();
               }

               var10 = var12.field_761 * 1447154143 | -16777216;
            } else if(var12.field_759 * -1167855135 >= 0) {
               if(var6 >= -1702273423) {
                  return;
               }

               int var13 = class_239.method_4607(class_70.field_555.method_31(var12.field_759 * -1167855135, -275412604), 96, (short)12620);
               var10 = class_70.field_546[var13] | -16777216;
            } else if(-313850043 * var12.field_762 == 16711935) {
               if(var6 >= -1702273423) {
                  throw new IllegalStateException();
               }

               var10 = var11;
            } else {
               int var14 = var12.field_758 * 1593028731;
               int var15 = -1490944887 * var12.field_764;
               int var16 = 1914058459 * var12.field_769;
               if(var16 > 179) {
                  if(var6 >= -1702273423) {
                     throw new IllegalStateException();
                  }

                  var15 /= 2;
               }

               if(var16 > 192) {
                  if(var6 >= -1702273423) {
                     throw new IllegalStateException();
                  }

                  var15 /= 2;
               }

               if(var16 > 217) {
                  if(var6 >= -1702273423) {
                     throw new IllegalStateException();
                  }

                  var15 /= 2;
               }

               if(var16 > 243) {
                  var15 /= 2;
               }

               int var17 = var16 / 2 + (var15 / 32 << 7) + (var14 / 4 << 10);
               int var18 = class_239.method_4607(var17, 96, (short)28446);
               var10 = class_70.field_546[var18] | -16777216;
            }

            var9 = var10;
         }

         if(var8 > -1 && 0 == var3.field_2557[0][var1][var2]) {
            if(var6 >= -1702273423) {
               throw new IllegalStateException();
            } else {
               class_65.method_681(this.field_2613 * 1359138405 * var1, (63 - var2) * 1359138405 * this.field_2613, 1359138405 * this.field_2613, this.field_2613 * 1359138405, var9);
            }
         } else {
            var10 = this.method_4475(var1, var2, var3, var5, -404634884);
            if(var8 == -1) {
               class_65.method_681(var1 * 1359138405 * this.field_2613, 1359138405 * this.field_2613 * (63 - var2), this.field_2613 * 1359138405, 1359138405 * this.field_2613, var10);
            } else {
               var4.method_4651(var1 * 1359138405 * this.field_2613, (63 - var2) * this.field_2613 * 1359138405, var10, var9, 1359138405 * this.field_2613, 1359138405 * this.field_2613, var3.field_2557[0][var1][var2], var3.field_2555[0][var1][var2], (byte)45);
            }
         }
      } catch (RuntimeException var19) {
         throw class_223.method_4281(var19);
      }
   }

   // $FF: renamed from: k (int, int, fm, gb, byte) void
   void method_4474(int var1, int var2, class_226 var3, class_242 var4, byte var5) {
      try {
         for(int var6 = 1; var6 < var3.field_2550 * -1482547443; ++var6) {
            if(var5 == 0) {
               return;
            }

            int var7 = var3.field_2554[var6][var1][var2] - 1;
            if(var7 > -1) {
               if(var5 == 0) {
                  throw new IllegalStateException();
               }

               int var9 = -747005213 * this.field_2608;
               class_82 var10 = class_154.method_3249(var7, -1001825857);
               int var8;
               if(var10 == null) {
                  if(var5 == 0) {
                     return;
                  }

                  var8 = var9;
               } else if(var10.field_761 * 1447154143 >= 0) {
                  if(var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var8 = 1447154143 * var10.field_761 | -16777216;
               } else if(var10.field_759 * -1167855135 >= 0) {
                  if(var5 == 0) {
                     throw new IllegalStateException();
                  }

                  int var11 = class_239.method_4607(class_70.field_555.method_31(-1167855135 * var10.field_759, 1654805644), 96, (short)15760);
                  var8 = class_70.field_546[var11] | -16777216;
               } else if(16711935 == var10.field_762 * -313850043) {
                  if(var5 == 0) {
                     throw new IllegalStateException();
                  }

                  var8 = var9;
               } else {
                  int var12 = 1593028731 * var10.field_758;
                  int var13 = var10.field_764 * -1490944887;
                  int var14 = 1914058459 * var10.field_769;
                  if(var14 > 179) {
                     if(var5 == 0) {
                        throw new IllegalStateException();
                     }

                     var13 /= 2;
                  }

                  if(var14 > 192) {
                     var13 /= 2;
                  }

                  if(var14 > 217) {
                     if(var5 == 0) {
                        throw new IllegalStateException();
                     }

                     var13 /= 2;
                  }

                  if(var14 > 243) {
                     if(var5 == 0) {
                        throw new IllegalStateException();
                     }

                     var13 /= 2;
                  }

                  int var15 = var14 / 2 + (var13 / 32 << 7) + (var12 / 4 << 10);
                  int var16 = class_239.method_4607(var15, 96, (short)1979);
                  var8 = class_70.field_546[var16] | -16777216;
               }

               if(0 == var3.field_2557[var6][var1][var2]) {
                  class_65.method_681(var1 * this.field_2613 * 1359138405, (63 - var2) * 1359138405 * this.field_2613, 1359138405 * this.field_2613, this.field_2613 * 1359138405, var8);
               } else {
                  var4.method_4651(var1 * this.field_2613 * 1359138405, (63 - var2) * 1359138405 * this.field_2613, 0, var8, 1359138405 * this.field_2613, 1359138405 * this.field_2613, var3.field_2557[var6][var1][var2], var3.field_2555[var6][var1][var2], (byte)72);
               }
            }
         }

      } catch (RuntimeException var17) {
         throw class_223.method_4281(var17);
      }
   }

   // $FF: renamed from: m (int, int, fm, fd, int) int
   int method_4475(int var1, int var2, class_226 var3, class_217 var4, int var5) {
      try {
         if(0 == var3.field_2553[0][var1][var2]) {
            if(var5 >= 401480150) {
               throw new IllegalStateException();
            } else {
               return -747005213 * this.field_2608;
            }
         } else {
            return var4.method_4201(var1, var2);
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: x (int, int, fm, op[], int) void
   void method_4476(int var1, int var2, class_226 var3, class_66[] var4, int var5) {
      try {
         for(int var6 = 0; var6 < var3.field_2550 * -1482547443; ++var6) {
            if(var5 == 150908896) {
               throw new IllegalStateException();
            }

            class_223[] var7 = var3.field_2546[var6][var1][var2];
            if(null != var7) {
               if(var5 == 150908896) {
                  return;
               }

               if(0 == var7.length) {
                  if(var5 == 150908896) {
                     throw new IllegalStateException();
                  }
               } else {
                  class_223[] var8 = var7;

                  for(int var9 = 0; var9 < var8.length; ++var9) {
                     if(var5 == 150908896) {
                        throw new IllegalStateException();
                     }

                     class_223 var10 = var8[var9];
                     if(!class_40.method_479(var10.field_2522 * 739729953, -250082153)) {
                        if(var5 == 150908896) {
                           throw new IllegalStateException();
                        }

                        int var12 = var10.field_2522 * 739729953;
                        boolean var10000;
                        if(-2083476425 * class_290.field_3298.field_3309 == var12) {
                           if(var5 == 150908896) {
                              return;
                           }

                           var10000 = true;
                        } else {
                           var10000 = false;
                        }

                        boolean var11 = var10000;
                        if(!var11) {
                           if(var5 == 150908896) {
                              throw new IllegalStateException();
                           }
                           continue;
                        }
                     }

                     class_87 var14 = class_121.method_2269(-1952293629 * var10.field_2521, 1324058828);
                     if(-1 != var14.field_830 * 1953806269) {
                        if(var5 == 150908896) {
                           throw new IllegalStateException();
                        }

                        if(46 != var14.field_830 * 1953806269) {
                           if(var5 == 150908896) {
                              return;
                           }

                           if(var14.field_830 * 1953806269 != 52) {
                              var4[1953806269 * var14.field_830].method_751(this.field_2613 * 1359138405 * var1, this.field_2613 * 1359138405 * (63 - var2), this.field_2613 * -1576690486, -1576690486 * this.field_2613);
                              continue;
                           }

                           if(var5 == 150908896) {
                              throw new IllegalStateException();
                           }
                        }

                        var4[var14.field_830 * 1953806269].method_751(var1 * 1359138405 * this.field_2613, 1359138405 * this.field_2613 * (63 - var2), this.field_2613 * -1576690486 + 1, -1576690486 * this.field_2613 + 1);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13);
      }
   }

   // $FF: renamed from: z (int, int, fm, int) void
   void method_4477(int var1, int var2, class_226 var3, int var4) {
      try {
         for(int var5 = 0; var5 < var3.field_2550 * -1482547443; ++var5) {
            if(var4 == 1170526594) {
               throw new IllegalStateException();
            }

            class_223[] var6 = var3.field_2546[var5][var1][var2];
            if(var6 != null) {
               if(var6.length == 0) {
                  if(var4 == 1170526594) {
                     return;
                  }
               } else {
                  class_223[] var7 = var6;

                  for(int var8 = 0; var8 < var7.length; ++var8) {
                     if(var4 == 1170526594) {
                        throw new IllegalStateException();
                     }

                     class_223 var9 = var7[var8];
                     if(class_281.method_5169(739729953 * var9.field_2522, (byte)120)) {
                        if(var4 == 1170526594) {
                           return;
                        }

                        class_87 var10 = class_121.method_2269(var9.field_2521 * -1952293629, 1767911884);
                        int var11 = -1747290425 * var10.field_820 != 0?-3407872:-3355444;
                        if(class_290.field_3293.field_3309 * -2083476425 == var9.field_2522 * 739729953) {
                           if(var4 == 1170526594) {
                              throw new IllegalStateException();
                           }

                           this.method_4491(var1, var2, var9.field_2526 * -184500109, var11, 575857346);
                        }

                        if(739729953 * var9.field_2522 == class_290.field_3311.field_3309 * -2083476425) {
                           this.method_4491(var1, var2, -184500109 * var9.field_2526, -3355444, -2054722237);
                           this.method_4491(var1, var2, 1 + var9.field_2526 * -184500109, var11, -845727119);
                        }

                        if(739729953 * var9.field_2522 == -2083476425 * class_290.field_3289.field_3309) {
                           if(0 == -184500109 * var9.field_2526) {
                              if(var4 == 1170526594) {
                                 throw new IllegalStateException();
                              }

                              class_65.method_726(this.field_2613 * 1359138405 * var1, (63 - var2) * this.field_2613 * 1359138405, 1, var11);
                           }

                           if(1 == -184500109 * var9.field_2526) {
                              if(var4 == 1170526594) {
                                 throw new IllegalStateException();
                              }

                              class_65.method_726(var1 * 1359138405 * this.field_2613 + 1359138405 * this.field_2613 - 1, (63 - var2) * 1359138405 * this.field_2613, 1, var11);
                           }

                           if(var9.field_2526 * -184500109 == 2) {
                              if(var4 == 1170526594) {
                                 return;
                              }

                              class_65.method_726(1359138405 * this.field_2613 + 1359138405 * this.field_2613 * var1 - 1, this.field_2613 * 1359138405 * (63 - var2) + this.field_2613 * 1359138405 - 1, 1, var11);
                           }

                           if(-184500109 * var9.field_2526 == 3) {
                              if(var4 == 1170526594) {
                                 throw new IllegalStateException();
                              }

                              class_65.method_726(var1 * 1359138405 * this.field_2613, 1359138405 * this.field_2613 + 1359138405 * this.field_2613 * (63 - var2) - 1, 1, var11);
                           }
                        }

                        if(var9.field_2522 * 739729953 == class_290.field_3290.field_3309 * -2083476425) {
                           if(var4 == 1170526594) {
                              return;
                           }

                           int var12 = var9.field_2526 * -184500109 % 2;
                           int var13;
                           if(0 == var12) {
                              for(var13 = 0; var13 < this.field_2613 * 1359138405; ++var13) {
                                 if(var4 == 1170526594) {
                                    throw new IllegalStateException();
                                 }

                                 class_65.method_726(1359138405 * this.field_2613 * var1 + var13, (64 - var2) * this.field_2613 * 1359138405 - 1 - var13, 1, var11);
                              }
                           } else {
                              for(var13 = 0; var13 < this.field_2613 * 1359138405; ++var13) {
                                 if(var4 == 1170526594) {
                                    return;
                                 }

                                 class_65.method_726(var1 * this.field_2613 * 1359138405 + var13, this.field_2613 * 1359138405 * (63 - var2) + var13, 1, var11);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var14) {
         throw class_223.method_4281(var14);
      }
   }

   // $FF: renamed from: w (int, int, java.util.HashSet, int, int) void
   void method_4478(int var1, int var2, HashSet var3, int var4, int var5) {
      try {
         float var6 = (float)var4 / 64.0F;
         float var7 = var6 / 2.0F;
         Iterator var8 = this.field_2615.entrySet().iterator();

         while(var8.hasNext()) {
            if(var5 >= -804398158) {
               return;
            }

            Entry var9 = (Entry)var8.next();
            class_280 var10 = (class_280)var9.getKey();
            int var11 = (int)((float)(-2092998769 * var10.field_3236) * var6 + (float)var1 - var7);
            int var12 = (int)((float)(var2 + var4) - var6 * (float)(349527629 * var10.field_3235) - var7);
            class_218 var13 = (class_218)var9.getValue();
            if(var13 != null) {
               if(var5 >= -804398158) {
                  return;
               }

               if(var13.method_4209(-288212324)) {
                  if(var5 >= -804398158) {
                     throw new IllegalStateException();
                  }

                  var13.field_2481 = 1501071807 * var11;
                  var13.field_2479 = 858537425 * var12;
                  class_75 var14 = class_116.method_2248(var13.method_4205(), 1647125333);
                  if(!var3.contains(Integer.valueOf(var14.method_1136()))) {
                     this.method_4481(var13, var11, var12, var6);
                  }
               }
            }
         }

      } catch (RuntimeException var15) {
         throw class_223.method_4281(var15);
      }
   }

   // $FF: renamed from: t (java.util.HashSet, int, int, int) void
   void method_4479(HashSet var1, int var2, int var3, int var4) {
      try {
         Iterator var5 = this.field_2616.iterator();

         while(var5.hasNext()) {
            if(var4 != -341047508) {
               throw new IllegalStateException();
            }

            class_218 var6 = (class_218)var5.next();
            if(var6.method_4209(-417322274)) {
               class_75 var7 = class_116.method_2248(var6.method_4205(), 1647125333);
               if(var7 != null) {
                  if(var4 != -341047508) {
                     throw new IllegalStateException();
                  }

                  if(var1.contains(Integer.valueOf(var7.method_1136()))) {
                     if(var4 != -341047508) {
                        throw new IllegalStateException();
                     }

                     this.method_4544(var7, var6.field_2481 * 1619813951, var6.field_2479 * 1123629873, var2, var3, 1184916583);
                  }
               }
            }
         }

      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }

    // $FF: renamed from: q (gq, int, int, float, int) void
   void method_4481(class_218 var1, int var2, int var3, float var4) {
      try {
         class_75 var6 = class_116.method_2248(var1.method_4205(), 1647125333);
         this.method_4581(var6, var2, var3, -1515500646);
         this.method_4472(var1, var6, var2, var3, var4, (short)-4359);
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

    // $FF: renamed from: l (int, int, int, java.util.HashSet, int) void
   void method_4483(int var1, int var2, int var3, HashSet var4, int var5) {
      try {
         if(null == var4) {
            if(var5 <= 1079176387) {
               return;
            }

            var4 = new HashSet();
         }

         this.method_4478(var1, var2, var4, var3, -1949332191);
         this.method_4484(var1, var2, var4, var3, -810530478);
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: ap (int, int, java.util.HashSet, int, int) void
   void method_4484(int var1, int var2, HashSet var3, int var4, int var5) {
      try {
         float var6 = (float)var4 / 64.0F;
         Iterator var7 = this.field_2616.iterator();

         while(var7.hasNext()) {
            if(var5 <= -1899477200) {
               throw new IllegalStateException();
            }

            class_218 var8 = (class_218)var7.next();
            if(!var8.method_4209(-502045476)) {
               if(var5 <= -1899477200) {
                  throw new IllegalStateException();
               }
            } else {
               int var9 = var8.field_2482.field_3236 * -2092998769 % 64;
               int var10 = var8.field_2482.field_3235 * 349527629 % 64;
               var8.field_2481 = (int)(var6 * (float)var9 + (float)var1) * 1501071807;
               var8.field_2479 = 858537425 * (int)((float)var2 + var6 * (float)(63 - var10));
               if(var3.contains(Integer.valueOf(var8.method_4205()))) {
                  if(var5 <= -1899477200) {
                     throw new IllegalStateException();
                  }
               } else {
                  this.method_4481(var8, 1619813951 * var8.field_2481, var8.field_2479 * 1123629873, var6);
               }
            }
         }

      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11);
      }
   }

    // $FF: renamed from: al (oh, em, int) int
   int method_4486(class_67 var1, class_212 var2) {
      try {
         switch(var2.field_2436 * -1918765839) {
         case 0:
            return 0;
         case 1:
            return -var1.field_500 / 2;
         default:
            return -var1.field_500;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: ad (int, int) fv
   class_237 method_4487(int var1) {
      try {
         class_75 var3 = class_116.method_2248(var1, 1647125333);
         return this.method_4488(var3, -1933090336);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: ai (ew, int) fv
   class_237 method_4488(class_75 var1, int var2) {
      try {
         if(null != var1.field_604 && this.field_2606 != null) {
            if(var2 >= -1384220013) {
               throw new IllegalStateException();
            }

            if(this.field_2606.get(class_232.field_2594) != null) {
               class_232 var3 = class_232.method_4440(945546823 * var1.field_599);
               if(null == var3) {
                  if(var2 >= -1384220013) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               class_69 var4 = (class_69)this.field_2606.get(var3);
               if(null == var4) {
                  return null;
               }

               int var5 = var4.method_867(var1.field_604, 1000000);
               String[] var6 = new String[var5];
               var4.method_865(var1.field_604, (int[])null, var6);
               int var7 = var6.length * var4.field_522 / 2;
               int var8 = 0;
               String[] var9 = var6;

               for(int var10 = 0; var10 < var9.length; ++var10) {
                  String var11 = var9[var10];
                  int var12 = var4.method_885(var11);
                  if(var12 > var8) {
                     if(var2 >= -1384220013) {
                        throw new IllegalStateException();
                     }

                     var8 = var12;
                  }
               }

               class_237 var10000 = new class_237(var1.field_604, var8, var7, var3);
               return var10000;
            }

            if(var2 >= -1384220013) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13);
      }
   }

   // $FF: renamed from: ar (int, int, int, int, int, int) java.util.List
   List method_4489(int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         LinkedList var7 = new LinkedList();
         if(var4 >= var1) {
            if(var6 >= 211532895) {
               throw new IllegalStateException();
            }

            if(var5 >= var2) {
               if(var4 < var1 + var3) {
                  if(var5 < var2 + var3) {
                     Iterator var8 = this.field_2615.values().iterator();

                     class_218 var9;
                     while(var8.hasNext()) {
                        if(var6 >= 211532895) {
                           throw new IllegalStateException();
                        }

                        var9 = (class_218)var8.next();
                        if(var9.method_4209(-143687139) && var9.method_4224(var4, var5, (short)3474)) {
                           if(var6 >= 211532895) {
                              throw new IllegalStateException();
                           }

                           var7.add(var9);
                        }
                     }

                     var8 = this.field_2616.iterator();

                     while(var8.hasNext()) {
                        if(var6 >= 211532895) {
                           throw new IllegalStateException();
                        }

                        var9 = (class_218)var8.next();
                        if(var9.method_4209(1809517277)) {
                           if(var6 >= 211532895) {
                              throw new IllegalStateException();
                           }

                           if(var9.method_4224(var4, var5, (short)18944)) {
                              var7.add(var9);
                           }
                        }
                     }

                     return var7;
                  }

                  if(var6 >= 211532895) {
                     throw new IllegalStateException();
                  }
               }

               return var7;
            }

            if(var6 >= 211532895) {
               throw new IllegalStateException();
            }
         }

         return var7;
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }

    // $FF: renamed from: ax (int, int, int, int, int) void
   void method_4491(int var1, int var2, int var3, int var4, int var5) {
      try {
         var3 %= 4;
         if(0 == var3) {
            if(var5 == -688507067) {
               throw new IllegalStateException();
            }

            class_65.method_674(var1 * 1359138405 * this.field_2613, (63 - var2) * 1359138405 * this.field_2613, 1359138405 * this.field_2613, var4);
         }

         if(var3 == 1) {
            if(var5 == -688507067) {
               throw new IllegalStateException();
            }

            class_65.method_726(this.field_2613 * 1359138405 * var1, this.field_2613 * 1359138405 * (63 - var2), 1359138405 * this.field_2613, var4);
         }

         if(2 == var3) {
            if(var5 == -688507067) {
               throw new IllegalStateException();
            }

            class_65.method_674(var1 * 1359138405 * this.field_2613 + this.field_2613 * 1359138405 - 1, this.field_2613 * 1359138405 * (63 - var2), this.field_2613 * 1359138405, var4);
         }

         if(var3 == 3) {
            if(var5 == -688507067) {
               throw new IllegalStateException();
            }

            class_65.method_726(1359138405 * this.field_2613 * var1, this.field_2613 * 1359138405 + 1359138405 * this.field_2613 * (63 - var2) - 1, 1359138405 * this.field_2613, var4);
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_264 var10000 = new class_264(37748736, 256);
      field_2604 = var10000;
   }

    // $FF: renamed from: d (int) void
   void method_4519(int var1) {
      try {
         if(this.field_2610 != null) {
            if(var1 <= 1390365133) {
               throw new IllegalStateException();
            }

            this.field_2610.method_4291();
         } else {
            Iterator var2 = this.field_2611.iterator();

            while(var2.hasNext()) {
               if(var1 <= 1390365133) {
                  throw new IllegalStateException();
               }

               class_227 var3 = (class_227)var2.next();
               var3.method_4291();
            }
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

    // $FF: renamed from: ab (oh, en, int) int
   int method_4522(class_67 var1, class_213 var2) {
      try {
         switch(-161686761 * var2.field_2441) {
         case 0:
            return -var1.field_508 / 2;
         case 1:
            return 0;
         default:
            return -var1.field_508;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

    // $FF: renamed from: j (eg, int, int, int, fm, int) void
   void method_4530(class_87 var1, int var2, int var3, int var4, class_226 var5, int var6) {
      try {
         class_280 var10000 = new class_280(var2, var3 + -533628608 * this.field_2607, -773876672 * this.field_2609 + var4);
         class_280 var7 = var10000;
         class_280 var8 = null;
         if(this.field_2610 != null) {
            if(var6 <= -743972471) {
               throw new IllegalStateException();
            }

            var10000 = new class_280(var2 + -1260242687 * this.field_2610.field_2549, var3 + this.field_2610.field_2545 * -314518464, 230542016 * this.field_2610.field_2552 + var4);
            var8 = var10000;
         } else {
            class_227 var9 = (class_227)var5;
            var10000 = new class_280(var2 + -1260242687 * var9.field_2549, -314518464 * var9.field_2545 + var3 + var9.method_4326() * 8, var4 + 230542016 * var9.field_2552 + var9.method_4327() * 8);
            var8 = var10000;
         }

         class_75 var10;
         Object var12;
         if(var1.field_842 != null) {
            if(var6 <= -743972471) {
               throw new IllegalStateException();
            }

            class_220 var13 = new class_220(var8, var7, var1.field_808 * 1257920551, this);
            var12 = var13;
         } else {
            var10 = class_116.method_2248(715137677 * var1.field_815, 1647125333);
            class_219 var14 = new class_219(var8, var7, var10.field_607 * -298295867, this.method_4488(var10, -1909314466));
            var12 = var14;
         }

         var10 = class_116.method_2248(((class_218)var12).method_4205(), 1647125333);
         if(var10.field_608) {
            if(var6 <= -743972471) {
               return;
            }

            HashMap var15 = this.field_2615;
            class_280 var10001 = new class_280(0, var3, var4);
            var15.put(var10001, var12);
         }

      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11);
      }
   }

    // $FF: renamed from: ag (int) java.util.List
   List method_4539() {
      try {
         LinkedList var2 = new LinkedList();
         var2.addAll(this.field_2616);
         var2.addAll(this.field_2615.values());
         return var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

    // $FF: renamed from: g (int, int, fm, gb, op[], byte) void
   void method_4541(int var1, int var2, class_226 var3, class_66[] var5) {
      try {
         this.method_4477(var1, var2, var3, 1479082417);
         this.method_4476(var1, var2, var3, var5, 1218867013);
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

    // $FF: renamed from: h (ew, int, int, int, int, int) void
   void method_4544(class_75 var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         class_67 var7 = var1.method_1134(false, -2060838679);
         if(null != var7) {
            var7.method_767(var2 - var7.field_508 / 2, var3 - var7.field_500 / 2);
            if(var4 % var5 < var5 / 2) {
               if(var6 != 1184916583) {
                  throw new IllegalStateException();
               }

               class_65.method_677(var2, var3, 15, 16776960, 128);
               class_65.method_677(var2, var3, 7, 16777215, 256);
            }

         }
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }

    // $FF: renamed from: <init> (int, int, int, java.util.HashMap) void
   class_233(int var1, int var2, int var3, HashMap var4) {
      super();
      try {
         this.field_2607 = var1 * 1483272173;
         this.field_2609 = var2 * 89819825;
         this.field_2611 = new LinkedList();
         this.field_2616 = new LinkedList();
         this.field_2615 = new HashMap();
         this.field_2608 = 1809218251 * (var3 | -16777216);
         this.field_2606 = var4;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

    // $FF: renamed from: v (double, double, double) int
   public static final int method_4569(double var0, double var2, double var4) {
      try {
         double var6 = var4;
         double var8 = var4;
         double var10 = var4;
         if(0.0D != var2) {
            double var12;
            if(var4 < 0.5D) {
               var12 = var4 * (1.0D + var2);
            } else {
               var12 = var4 + var2 - var2 * var4;
            }

            double var14 = 2.0D * var4 - var12;
            double var16 = var0 + 0.3333333333333333D;
            if(var16 > 1.0D) {
               --var16;
            }

            double var20 = var0 - 0.3333333333333333D;
            if(var20 < 0.0D) {
               ++var20;
            }

            if(var16 * 6.0D < 1.0D) {
               var6 = (var12 - var14) * 6.0D * var16 + var14;
            } else if(var16 * 2.0D < 1.0D) {
               var6 = var12;
            } else if(var16 * 3.0D < 2.0D) {
               var6 = 6.0D * (var12 - var14) * (0.6666666666666666D - var16) + var14;
            } else {
               var6 = var14;
            }

            if(6.0D * var0 < 1.0D) {
               var8 = 6.0D * (var12 - var14) * var0 + var14;
            } else if(2.0D * var0 < 1.0D) {
               var8 = var12;
            } else if(3.0D * var0 < 2.0D) {
               var8 = var14 + (var12 - var14) * (0.6666666666666666D - var0) * 6.0D;
            } else {
               var8 = var14;
            }

            if(var20 * 6.0D < 1.0D) {
               var10 = var14 + (var12 - var14) * 6.0D * var20;
            } else if(2.0D * var20 < 1.0D) {
               var10 = var12;
            } else if(3.0D * var20 < 2.0D) {
               var10 = (var12 - var14) * (0.6666666666666666D - var20) * 6.0D + var14;
            } else {
               var10 = var14;
            }
         }

         int var23 = (int)(256.0D * var6);
         int var13 = (int)(var8 * 256.0D);
         int var24 = (int)(256.0D * var10);
         int var15 = (var23 << 16) + (var13 << 8) + var24;
         return var15;
      } catch (RuntimeException var22) {
         throw class_223.method_4281(var22);
      }
   }

    // $FF: renamed from: i (ew, int, int, int) void
   void method_4581(class_75 var1, int var2, int var3, int var4) {
      try {
         class_67 var5 = var1.method_1134(false, -2060838679);
         if(var5 != null) {
            if(var4 == 1712556332) {
               return;
            }

            int var6 = this.method_4522(var5, var1.field_617);
            int var7 = this.method_4486(var5, var1.field_603);
            var5.method_767(var2 + var6, var3 + var7);
         }

      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }

    // $FF: renamed from: e (gb, op[], fd, byte) void
   void method_4587(class_242 var1, class_66[] var2, class_217 var3, byte var4) {
      try {
         Iterator var5 = this.field_2611.iterator();

         class_227 var6;
         int var7;
         int var8;
         while(var5.hasNext()) {
            if(var4 == 3) {
               throw new IllegalStateException();
            }

            var6 = (class_227)var5.next();

            for(var7 = var6.method_4328() * 8; var7 < var6.method_4328() * 8 + 8; ++var7) {
               if(var4 == 3) {
                  return;
               }

               for(var8 = var6.method_4322() * 8; var8 < var6.method_4322() * 8 + 8; ++var8) {
                  if(var4 == 3) {
                     throw new IllegalStateException();
                  }

                  this.method_4473(var7, var8, var6, var1, var3, -1761849315);
                  this.method_4474(var7, var8, var6, var1, (byte)22);
               }
            }
         }

         var5 = this.field_2611.iterator();

         while(var5.hasNext()) {
            if(var4 == 3) {
               throw new IllegalStateException();
            }

            var6 = (class_227)var5.next();

            for(var7 = var6.method_4328() * 8; var7 < var6.method_4328() * 8 + 8; ++var7) {
               if(var4 == 3) {
                  throw new IllegalStateException();
               }

               for(var8 = var6.method_4322() * 8; var8 < var6.method_4322() * 8 + 8; ++var8) {
                  this.method_4541(var7, var8, var6, var2);
               }
            }
         }

      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9);
      }
   }

    // $FF: renamed from: p (int, int, int, int, fm, int) void
   void method_4589(int var1, int var2, int var3, int var4, class_226 var5, int var6) {
      try {
         for(int var7 = var1; var7 < var3 + var1; ++var7) {
            if(var6 >= -595959063) {
               throw new IllegalStateException();
            }

            int var8 = var2;

            while(var8 < var2 + var4) {
               if(var6 >= -595959063) {
                  return;
               }

               int var9 = 0;

               while(true) {
                  if(var9 < var5.field_2550 * -1482547443) {
                     label136: {
                        if(var6 >= -595959063) {
                           throw new IllegalStateException();
                        }

                        class_223[] var10 = var5.field_2546[var9][var7][var8];
                        if(null != var10) {
                           if(var6 >= -595959063) {
                              throw new IllegalStateException();
                           }

                           if(var10.length == 0) {
                              if(var6 >= -595959063) {
                                 throw new IllegalStateException();
                              }
                           } else {
                              class_223[] var11 = var10;

                              for(int var12 = 0; var12 < var11.length; ++var12) {
                                 if(var6 >= -595959063) {
                                    throw new IllegalStateException();
                                 }

                                 class_87 var14;
                                 boolean var15;
                                 label95: {
                                    class_223 var13 = var11[var12];
                                    var14 = class_121.method_2269(var13.field_2521 * -1952293629, -1452789644);
                                    if(var14.field_842 != null) {
                                       if(var6 >= -595959063) {
                                          throw new IllegalStateException();
                                       }

                                       int[] var16 = var14.field_842;

                                       for(int var17 = 0; var17 < var16.length; ++var17) {
                                          if(var6 >= -595959063) {
                                             throw new IllegalStateException();
                                          }

                                          int var18 = var16[var17];
                                          class_87 var19 = class_121.method_2269(var18, 442257966);
                                          if(var19.field_815 * 715137677 != -1) {
                                             if(var6 >= -595959063) {
                                                throw new IllegalStateException();
                                             }

                                             var15 = true;
                                             break label95;
                                          }
                                       }
                                    } else if(715137677 * var14.field_815 != -1) {
                                       if(var6 >= -595959063) {
                                          throw new IllegalStateException();
                                       }

                                       var15 = true;
                                       break label95;
                                    }

                                    var15 = false;
                                 }

                                 if(var15) {
                                    this.method_4530(var14, var9, var7, var8, var5, 1079929853);
                                    break label136;
                                 }

                                 if(var6 >= -595959063) {
                                    throw new IllegalStateException();
                                 }
                              }
                           }
                        }

                        ++var9;
                        continue;
                     }
                  }

                  ++var8;
                  break;
               }
            }
         }

      } catch (RuntimeException var20) {
         throw class_223.method_4281(var20);
      }
   }
}
