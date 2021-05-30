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
   // $FF: renamed from: f int
   static final int field_2605 = 37748736;
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
   // $FF: renamed from: y int
   static final int field_2612 = 256;
   // $FF: renamed from: u int
   int field_2613;
   // $FF: renamed from: v int
   static final int field_2614 = -3355444;
   // $FF: renamed from: o java.util.HashMap
   HashMap field_2615;
   // $FF: renamed from: l java.util.List
   List field_2616;
   // $FF: renamed from: qf lt
   static class_344 field_2617;


   // $FF: renamed from: bb (gb, op[], fd) void
   void method_4457(class_242 var1, class_66[] var2, class_217 var3) {
      Iterator var4 = this.field_2611.iterator();

      class_227 var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (class_227)var4.next();

         for(var6 = var5.method_4328(1958276296) * 8; var6 < var5.method_4328(306510488) * 8 + 8; ++var6) {
            for(var7 = var5.method_4322(999111637) * 8; var7 < var5.method_4322(965062144) * 8 + 8; ++var7) {
               this.method_4473(var6, var7, var5, var1, var3, -2065059937);
               this.method_4474(var6, var7, var5, var1, (byte)-26);
            }
         }
      }

      var4 = this.field_2611.iterator();

      while(var4.hasNext()) {
         var5 = (class_227)var4.next();

         for(var6 = var5.method_4328(-821386676) * 8; var6 < var5.method_4328(-145388736) * 8 + 8; ++var6) {
            for(var7 = var5.method_4322(606138158) * 8; var7 < var5.method_4322(728406122) * 8 + 8; ++var7) {
               this.method_4541(var6, var7, var5, var1, var2, (byte)115);
            }
         }
      }

   }

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
         throw class_223.method_4281(var12, "fq.n(" + ')');
      }
   }

   // $FF: renamed from: f (ft, java.util.List, int) void
   void method_4459(class_228 var1, List var2, int var3) {
      try {
         this.field_2615.clear();
         this.field_2610 = var1;
         this.method_4464(var2, 1099621062);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "fq.f(" + ')');
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
            if(var5.method_4300(-802989109) == -1618950683 * this.field_2607) {
               if(var3 == 623518100) {
                  return;
               }

               if(var5.method_4302((byte)-49) == 2001174097 * this.field_2609) {
                  if(var3 == 623518100) {
                     return;
                  }

                  this.field_2611.add(var5);
               }
            }
         }

         this.method_4464(var2, -1677517743);
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "fq.y(" + ')');
      }
   }

   // $FF: renamed from: cw (ew, int, int) void
   void method_4461(class_75 var1, int var2, int var3) {
      class_67 var4 = var1.method_1134(false, -2060838679);
      if(var4 != null) {
         int var5 = this.method_4522(var4, var1.field_617, 491939852);
         int var6 = this.method_4486(var4, var1.field_603, 1869587508);
         var4.method_767(var2 + var5, var3 + var6);
      }

   }

   // $FF: renamed from: dq (int, int, int, int, int) java.util.List
   List method_4462(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if(var4 >= var1 && var5 >= var2) {
         if(var4 < var1 + var3 && var5 < var2 + var3) {
            Iterator var7 = this.field_2615.values().iterator();

            class_218 var8;
            while(var7.hasNext()) {
               var8 = (class_218)var7.next();
               if(var8.method_4209(-385878374) && var8.method_4224(var4, var5, (short)4016)) {
                  var6.add(var8);
               }
            }

            var7 = this.field_2616.iterator();

            while(var7.hasNext()) {
               var8 = (class_218)var7.next();
               if(var8.method_4209(-165189600) && var8.method_4224(var4, var5, (short)-3509)) {
                  var6.add(var8);
               }
            }

            return var6;
         } else {
            return var6;
         }
      } else {
         return var6;
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
         throw class_223.method_4281(var4, "fq.r(" + ')');
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

                  class_219 var10000 = new class_219(var4.field_2482, var4.field_2482, -1937738349 * var4.field_2485, this.method_4487(var4.field_2485 * -1937738349, 1606957307));
                  class_219 var5 = var10000;
                  this.field_2616.add(var5);
               }
            }
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "fq.b(" + ')');
      }
   }

   // $FF: renamed from: bg (gb, op[], fd) void
   void method_4465(class_242 var1, class_66[] var2, class_217 var3) {
      Iterator var4 = this.field_2611.iterator();

      class_227 var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (class_227)var4.next();

         for(var6 = var5.method_4328(248857914) * 8; var6 < var5.method_4328(265609587) * 8 + 8; ++var6) {
            for(var7 = var5.method_4322(422141504) * 8; var7 < var5.method_4322(1204850672) * 8 + 8; ++var7) {
               this.method_4473(var6, var7, var5, var1, var3, -1841688341);
               this.method_4474(var6, var7, var5, var1, (byte)-88);
            }
         }
      }

      var4 = this.field_2611.iterator();

      while(var4.hasNext()) {
         var5 = (class_227)var4.next();

         for(var6 = var5.method_4328(-53554649) * 8; var6 < var5.method_4328(883062091) * 8 + 8; ++var6) {
            for(var7 = var5.method_4322(1010550156) * 8; var7 < var5.method_4322(604409861) * 8 + 8; ++var7) {
               this.method_4541(var6, var7, var5, var1, var2, (byte)89);
            }
         }
      }

   }

   // $FF: renamed from: aw (java.util.HashSet, java.util.List) void
   void method_4466(HashSet var1, List var2) {
      this.field_2615.clear();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class_227 var4 = (class_227)var3.next();
         if(var4.method_4300(1375891103) == -1618950683 * this.field_2607 && var4.method_4302((byte)-98) == 2001174097 * this.field_2609) {
            this.field_2611.add(var4);
         }
      }

      this.method_4464(var2, 1610725178);
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

         if(class_56.method_593(-1618950683 * this.field_2607, this.field_2609 * 2001174097, var1, -1133094232) != null) {
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
         throw class_223.method_4281(var19, "fq.u(" + ')');
      }
   }

   // $FF: renamed from: ak (int, int, int, int, fm) void
   void method_4468(int var1, int var2, int var3, int var4, class_226 var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         int var7 = var2;

         while(var7 < var2 + var4) {
            int var8 = 0;

            while(true) {
               if(var8 < var5.field_2550 * -1482547443) {
                  label73: {
                     class_223[] var9 = var5.field_2546[var8][var6][var7];
                     if(null != var9 && var9.length != 0) {
                        class_223[] var10 = var9;

                        for(int var11 = 0; var11 < var10.length; ++var11) {
                           class_87 var13;
                           boolean var14;
                           label60: {
                              class_223 var12 = var10[var11];
                              var13 = class_121.method_2269(var12.field_2521 * -1952293629, -1708557913);
                              if(var13.field_842 != null) {
                                 int[] var15 = var13.field_842;

                                 for(int var16 = 0; var16 < var15.length; ++var16) {
                                    int var17 = var15[var16];
                                    class_87 var18 = class_121.method_2269(var17, -1586527081);
                                    if(var18.field_815 * 715137677 != -1) {
                                       var14 = true;
                                       break label60;
                                    }
                                 }
                              } else if(715137677 * var13.field_815 != -1) {
                                 var14 = true;
                                 break label60;
                              }

                              var14 = false;
                           }

                           if(var14) {
                              this.method_4530(var13, var8, var6, var7, var5, 1142896283);
                              break label73;
                           }
                        }
                     }

                     ++var8;
                     continue;
                  }
               }

               ++var7;
               break;
            }
         }
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
               int var7 = var6.method_4205(2145111782);
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
         throw class_223.method_4281(var9, "fq.o(" + ')');
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

               this.method_4541(var5, var6, this.field_2610, var1, var2, (byte)27);
            }
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "fq.c(" + ')');
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
                  this.method_4589(var5.method_4328(-20705095) * 8, var5.method_4322(1881961313) * 8, 8, 8, var5, -1439258329);
               }
            }

            return var3;
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "fq.s(" + ')');
      }
   }

   // $FF: renamed from: ae (gq, ew, int, int, float, short) void
   void method_4472(class_218 var1, class_75 var2, int var3, int var4, float var5, short var6) {
      try {
         class_237 var7 = var1.method_4206(1434591255);
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
         throw class_223.method_4281(var9, "fq.ae(" + ')');
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
         throw class_223.method_4281(var19, "fq.a(" + ')');
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
         throw class_223.method_4281(var17, "fq.k(" + ')');
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
            return var4.method_4201(var1, var2, -26460885);
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "fq.m(" + ')');
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
         throw class_223.method_4281(var13, "fq.x(" + ')');
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
         throw class_223.method_4281(var14, "fq.z(" + ')');
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
                  class_75 var14 = class_116.method_2248(var13.method_4205(2145528765), 1647125333);
                  if(!var3.contains(Integer.valueOf(var14.method_1136(1931066057)))) {
                     this.method_4481(var13, var11, var12, var6, -266654765);
                  }
               }
            }
         }

      } catch (RuntimeException var15) {
         throw class_223.method_4281(var15, "fq.w(" + ')');
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
               class_75 var7 = class_116.method_2248(var6.method_4205(2146111613), 1647125333);
               if(var7 != null) {
                  if(var4 != -341047508) {
                     throw new IllegalStateException();
                  }

                  if(var1.contains(Integer.valueOf(var7.method_1136(-432318346)))) {
                     if(var4 != -341047508) {
                        throw new IllegalStateException();
                     }

                     this.method_4544(var7, var6.field_2481 * 1619813951, var6.field_2479 * 1123629873, var2, var3, 1184916583);
                  }
               }
            }
         }

      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "fq.t(" + ')');
      }
   }

   // $FF: renamed from: af (int, int, int, int, fm) void
   void method_4480(int var1, int var2, int var3, int var4, class_226 var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         int var7 = var2;

         while(var7 < var2 + var4) {
            int var8 = 0;

            while(true) {
               if(var8 < var5.field_2550 * -1482547443) {
                  label92: {
                     class_223[] var9 = var5.field_2546[var8][var6][var7];
                     if(null != var9 && var9.length != 0) {
                        class_223[] var10 = var9;

                        for(int var11 = 0; var11 < var10.length; ++var11) {
                           class_87 var13;
                           boolean var14;
                           label57: {
                              class_223 var12 = var10[var11];
                              var13 = class_121.method_2269(var12.field_2521 * -1952293629, -1397339948);
                              if(var13.field_842 != null) {
                                 int[] var15 = var13.field_842;

                                 for(int var16 = 0; var16 < var15.length; ++var16) {
                                    int var17 = var15[var16];
                                    class_87 var18 = class_121.method_2269(var17, 1793018577);
                                    if(var18.field_815 * 715137677 != -1) {
                                       var14 = true;
                                       break label57;
                                    }
                                 }
                              } else if(2084542977 * var13.field_815 != -1) {
                                 var14 = true;
                                 break label57;
                              }

                              var14 = false;
                           }

                           if(var14) {
                              this.method_4530(var13, var8, var6, var7, var5, 1613339628);
                              break label92;
                           }
                        }
                     }

                     ++var8;
                     continue;
                  }
               }

               ++var7;
               break;
            }
         }
      }

   }

   // $FF: renamed from: q (gq, int, int, float, int) void
   void method_4481(class_218 var1, int var2, int var3, float var4, int var5) {
      try {
         class_75 var6 = class_116.method_2248(var1.method_4205(2146941461), 1647125333);
         this.method_4581(var6, var2, var3, -1515500646);
         this.method_4472(var1, var6, var2, var3, var4, (short)-4359);
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "fq.q(" + ')');
      }
   }

   // $FF: renamed from: dv (oh, en) int
   int method_4482(class_67 var1, class_213 var2) {
      switch(-43813293 * var2.field_2441) {
      case 0:
         return -var1.field_508 / 2;
      case 1:
         return 0;
      default:
         return -var1.field_508;
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
         throw class_223.method_4281(var6, "fq.l(" + ')');
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
               if(var3.contains(Integer.valueOf(var8.method_4205(2147145492)))) {
                  if(var5 <= -1899477200) {
                     throw new IllegalStateException();
                  }
               } else {
                  this.method_4481(var8, 1619813951 * var8.field_2481, var8.field_2479 * 1123629873, var6, -1335414658);
               }
            }
         }

      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11, "fq.ap(" + ')');
      }
   }

   // $FF: renamed from: dl (ew) fv
   class_237 method_4485(class_75 var1) {
      if(null != var1.field_604 && this.field_2606 != null && this.field_2606.get(class_232.field_2594) != null) {
         class_232 var2 = class_232.method_4440(945546823 * var1.field_599, 1691270538);
         if(null == var2) {
            return null;
         } else {
            class_69 var3 = (class_69)this.field_2606.get(var2);
            if(null == var3) {
               return null;
            } else {
               int var4 = var3.method_867(var1.field_604, -776397638);
               String[] var5 = new String[var4];
               var3.method_865(var1.field_604, (int[])null, var5);
               int var6 = var5.length * var3.field_522 / 2;
               int var7 = 0;
               String[] var8 = var5;

               for(int var9 = 0; var9 < var8.length; ++var9) {
                  String var10 = var8[var9];
                  int var11 = var3.method_885(var10);
                  if(var11 > var7) {
                     var7 = var11;
                  }
               }

               class_237 var10000 = new class_237(var1.field_604, var7, var6, var2);
               return var10000;
            }
         }
      } else {
         return null;
      }
   }

   // $FF: renamed from: al (oh, em, int) int
   int method_4486(class_67 var1, class_212 var2, int var3) {
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
         throw class_223.method_4281(var4, "fq.al(" + ')');
      }
   }

   // $FF: renamed from: ad (int, int) fv
   class_237 method_4487(int var1, int var2) {
      try {
         class_75 var3 = class_116.method_2248(var1, 1647125333);
         return this.method_4488(var3, -1933090336);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "fq.ad(" + ')');
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
               class_232 var3 = class_232.method_4440(945546823 * var1.field_599, 658176697);
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
         throw class_223.method_4281(var13, "fq.ai(" + ')');
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
         throw class_223.method_4281(var10, "fq.ar(" + ')');
      }
   }

   // $FF: renamed from: ct (int, int, fm, gb, fd) void
   void method_4490(int var1, int var2, class_226 var3, class_242 var4, class_217 var5) {
      int var6 = var3.field_2553[0][var1][var2] - 1;
      int var7 = var3.field_2554[0][var1][var2] - 1;
      if(var6 == -1 && var7 == -1) {
         class_65.method_681(1359138405 * this.field_2613 * var1, (63 - var2) * this.field_2613 * 1359138405, 1359138405 * this.field_2613, this.field_2613 * 1359138405, this.field_2608 * -747005213);
      }

      int var8 = 16711935;
      int var9;
      if(-1 != var7) {
         int var10 = -747005213 * this.field_2608;
         class_82 var11 = class_154.method_3249(var7, -1019804083);
         if(null == var11) {
            var9 = var10;
         } else if(1447154143 * var11.field_761 >= 0) {
            var9 = var11.field_761 * 1447154143 | -16777216;
         } else if(var11.field_759 * -1167855135 >= 0) {
            int var12 = class_239.method_4607(class_70.field_555.method_31(var11.field_759 * -1167855135, -701828825), 96, (short)14089);
            var9 = class_70.field_546[var12] | -16777216;
         } else if(-313850043 * var11.field_762 == 16711935) {
            var9 = var10;
         } else {
            int var13 = var11.field_758 * 1593028731;
            int var14 = -1490944887 * var11.field_764;
            int var15 = 1914058459 * var11.field_769;
            if(var15 > 179) {
               var14 /= 2;
            }

            if(var15 > 192) {
               var14 /= 2;
            }

            if(var15 > 217) {
               var14 /= 2;
            }

            if(var15 > 243) {
               var14 /= 2;
            }

            int var16 = var15 / 2 + (var14 / 32 << 7) + (var13 / 4 << 10);
            int var17 = class_239.method_4607(var16, 96, (short)12130);
            var9 = class_70.field_546[var17] | -16777216;
         }

         var8 = var9;
      }

      if(var7 > -1 && 0 == var3.field_2557[0][var1][var2]) {
         class_65.method_681(this.field_2613 * 1359138405 * var1, (63 - var2) * 1359138405 * this.field_2613, 1359138405 * this.field_2613, this.field_2613 * 1359138405, var8);
      } else {
         var9 = this.method_4475(var1, var2, var3, var5, -908691497);
         if(var7 == -1) {
            class_65.method_681(var1 * 1359138405 * this.field_2613, 1359138405 * this.field_2613 * (63 - var2), this.field_2613 * 1359138405, 1359138405 * this.field_2613, var9);
         } else {
            var4.method_4651(var1 * 1359138405 * this.field_2613, (63 - var2) * this.field_2613 * 1359138405, var9, var8, 1359138405 * this.field_2613, 1359138405 * this.field_2613, var3.field_2557[0][var1][var2], var3.field_2555[0][var1][var2], (byte)39);
         }
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
         throw class_223.method_4281(var6, "fq.ax(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_264 var10000 = new class_264(37748736, 256);
      field_2604 = var10000;
   }

   // $FF: renamed from: as (int, int, int) oh
   static class_67 method_4493(int var0, int var1, int var2) {
      class_264 var3 = field_2604;
      long var4 = (long)(var2 << 16 | var0 << 8 | var1);
      return (class_67)var3.method_5002(var4);
   }

   // $FF: renamed from: aj (int, int, int) void
   void method_4494(int var1, int var2, int var3) {
      int var5 = -1618950683 * this.field_2607;
      int var6 = this.field_2609 * 2001174097;
      int var7 = this.field_2613 * 1359138405;
      class_264 var8 = field_2604;
      long var9 = (long)(var7 << 16 | var5 << 8 | var6);
      class_67 var4 = (class_67)var8.method_5002(var9);
      if(var4 != null) {
         if(var3 == this.field_2613 * 1085512000) {
            var4.method_765(var1, var2);
         } else {
            var4.method_833(var1, var2, var3, var3);
         }

      }
   }

   // $FF: renamed from: am (int, int, int) void
   void method_4495(int var1, int var2, int var3) {
      int var5 = -1618950683 * this.field_2607;
      int var6 = this.field_2609 * 1461307480;
      int var7 = this.field_2613 * 1359138405;
      class_264 var8 = field_2604;
      long var9 = (long)(var7 << 16 | var5 << 8 | var6);
      class_67 var4 = (class_67)var8.method_5002(var9);
      if(var4 != null) {
         if(var3 == this.field_2613 * -636093050) {
            var4.method_765(var1, var2);
         } else {
            var4.method_833(var1, var2, var3, var3);
         }

      }
   }

   // $FF: renamed from: az (int, int, int) void
   void method_4496(int var1, int var2, int var3) {
      int var5 = -1618950683 * this.field_2607;
      int var6 = this.field_2609 * 560116227;
      int var7 = this.field_2613 * 1359138405;
      class_264 var8 = field_2604;
      long var9 = (long)(var7 << 16 | var5 << 8 | var6);
      class_67 var4 = (class_67)var8.method_5002(var9);
      if(var4 != null) {
         if(var3 == this.field_2613 * 1999200432) {
            var4.method_765(var1, var2);
         } else {
            var4.method_833(var1, var2, var3, var3);
         }

      }
   }

   // $FF: renamed from: av (int, int, int) void
   void method_4497(int var1, int var2, int var3) {
      int var5 = -1618950683 * this.field_2607;
      int var6 = this.field_2609 * 2001174097;
      int var7 = this.field_2613 * 1359138405;
      class_264 var8 = field_2604;
      long var9 = (long)(var7 << 16 | var5 << 8 | var6);
      class_67 var4 = (class_67)var8.method_5002(var9);
      if(var4 != null) {
         if(var3 == this.field_2613 * 616166412) {
            var4.method_765(var1, var2);
         } else {
            var4.method_833(var1, var2, var3, var3);
         }

      }
   }

   // $FF: renamed from: ac (ft, java.util.List) void
   void method_4498(class_228 var1, List var2) {
      this.field_2615.clear();
      this.field_2610 = var1;
      this.method_4464(var2, 475092253);
   }

   // $FF: renamed from: dc (int, int, java.util.HashSet, int) void
   void method_4499(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      Iterator var6 = this.field_2616.iterator();

      while(var6.hasNext()) {
         class_218 var7 = (class_218)var6.next();
         if(var7.method_4209(1498134370)) {
            int var8 = var7.field_2482.field_3236 * -2092998769 % 64;
            int var9 = var7.field_2482.field_3235 * 349527629 % 64;
            var7.field_2481 = (int)(var5 * (float)var8 + (float)var1) * 1501071807;
            var7.field_2479 = 858537425 * (int)((float)var2 + var5 * (float)(63 - var9));
            if(!var3.contains(Integer.valueOf(var7.method_4205(2146866977)))) {
               this.method_4481(var7, 1619813951 * var7.field_2481, var7.field_2479 * 1123629873, var5, -364044821);
            }
         }
      }

   }

   // $FF: renamed from: ah (java.util.HashSet, java.util.List) void
   void method_4500(HashSet var1, List var2) {
      this.field_2615.clear();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class_227 var4 = (class_227)var3.next();
         if(var4.method_4300(-532380542) == -1618950683 * this.field_2607 && var4.method_4302((byte)-59) == 2001174097 * this.field_2609) {
            this.field_2611.add(var4);
         }
      }

      this.method_4464(var2, 1117369532);
   }

   // $FF: renamed from: ao (java.util.HashSet, java.util.List) void
   void method_4501(HashSet var1, List var2) {
      this.field_2615.clear();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class_227 var4 = (class_227)var3.next();
         if(var4.method_4300(-1694453734) == -2115267806 * this.field_2607 && var4.method_4302((byte)-32) == 2001174097 * this.field_2609) {
            this.field_2611.add(var4);
         }
      }

      this.method_4464(var2, -229577869);
   }

   // $FF: renamed from: aq (java.util.HashSet, java.util.List) void
   void method_4502(HashSet var1, List var2) {
      this.field_2615.clear();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class_227 var4 = (class_227)var3.next();
         if(var4.method_4300(256215135) == -1618950683 * this.field_2607 && var4.method_4302((byte)-64) == -851795913 * this.field_2609) {
            this.field_2611.add(var4);
         }
      }

      this.method_4464(var2, 1458313771);
   }

   // $FF: renamed from: ck (int, int, fm) void
   void method_4503(int var1, int var2, class_226 var3) {
      for(int var4 = 0; var4 < var3.field_2550 * -1482547443; ++var4) {
         class_223[] var5 = var3.field_2546[var4][var1][var2];
         if(var5 != null && var5.length != 0) {
            class_223[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               class_223 var8 = var6[var7];
               if(class_281.method_5169(739729953 * var8.field_2522, (byte)126)) {
                  class_87 var9 = class_121.method_2269(var8.field_2521 * -1952293629, -1901984135);
                  int var10 = -1747290425 * var9.field_820 != 0?-3407872:-3355444;
                  if(class_290.field_3293.field_3309 * -2083476425 == var8.field_2522 * 739729953) {
                     this.method_4491(var1, var2, var8.field_2526 * -184500109, var10, 30896446);
                  }

                  if(739729953 * var8.field_2522 == class_290.field_3311.field_3309 * -2083476425) {
                     this.method_4491(var1, var2, -184500109 * var8.field_2526, -3355444, -364208098);
                     this.method_4491(var1, var2, 1 + var8.field_2526 * -184500109, var10, 1359341527);
                  }

                  if(739729953 * var8.field_2522 == -2083476425 * class_290.field_3289.field_3309) {
                     if(0 == -184500109 * var8.field_2526) {
                        class_65.method_726(this.field_2613 * 1359138405 * var1, (63 - var2) * this.field_2613 * 1359138405, 1, var10);
                     }

                     if(1 == -184500109 * var8.field_2526) {
                        class_65.method_726(var1 * 1359138405 * this.field_2613 + 1359138405 * this.field_2613 - 1, (63 - var2) * 1359138405 * this.field_2613, 1, var10);
                     }

                     if(var8.field_2526 * -184500109 == 2) {
                        class_65.method_726(1359138405 * this.field_2613 + 1359138405 * this.field_2613 * var1 - 1, this.field_2613 * 1359138405 * (63 - var2) + this.field_2613 * 1359138405 - 1, 1, var10);
                     }

                     if(-184500109 * var8.field_2526 == 3) {
                        class_65.method_726(var1 * 1359138405 * this.field_2613, 1359138405 * this.field_2613 + 1359138405 * this.field_2613 * (63 - var2) - 1, 1, var10);
                     }
                  }

                  if(var8.field_2522 * 739729953 == class_290.field_3290.field_3309 * -2083476425) {
                     int var11 = var8.field_2526 * -184500109 % 2;
                     int var12;
                     if(0 == var11) {
                        for(var12 = 0; var12 < this.field_2613 * 1359138405; ++var12) {
                           class_65.method_726(1359138405 * this.field_2613 * var1 + var12, (64 - var2) * this.field_2613 * 1359138405 - 1 - var12, 1, var10);
                        }
                     } else {
                        for(var12 = 0; var12 < this.field_2613 * 1359138405; ++var12) {
                           class_65.method_726(var1 * this.field_2613 * 1359138405 + var12, this.field_2613 * 1359138405 * (63 - var2) + var12, 1, var10);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: ds (int, int, java.util.HashSet, int) void
   void method_4504(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      Iterator var6 = this.field_2616.iterator();

      while(var6.hasNext()) {
         class_218 var7 = (class_218)var6.next();
         if(var7.method_4209(1322123702)) {
            int var8 = var7.field_2482.field_3236 * -2092998769 % 64;
            int var9 = var7.field_2482.field_3235 * 349527629 % 64;
            var7.field_2481 = (int)(var5 * (float)var8 + (float)var1) * 1501071807;
            var7.field_2479 = 858537425 * (int)((float)var2 + var5 * (float)(63 - var9));
            if(!var3.contains(Integer.valueOf(var7.method_4205(2145215623)))) {
               this.method_4481(var7, 1619813951 * var7.field_2481, var7.field_2479 * 1123629873, var5, 1484165268);
            }
         }
      }

   }

   // $FF: renamed from: bi (gb, op[], fd) void
   void method_4505(class_242 var1, class_66[] var2, class_217 var3) {
      int var4;
      int var5;
      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.method_4473(var4, var5, this.field_2610, var1, var3, -1882547272);
            this.method_4474(var4, var5, this.field_2610, var1, (byte)-48);
         }
      }

      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.method_4541(var4, var5, this.field_2610, var1, var2, (byte)69);
         }
      }

   }

   // $FF: renamed from: ay (int, int, int, int, fm) void
   void method_4506(int var1, int var2, int var3, int var4, class_226 var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         int var7 = var2;

         while(var7 < var2 + var4) {
            int var8 = 0;

            while(true) {
               if(var8 < var5.field_2550 * -77195714) {
                  label93: {
                     class_223[] var9 = var5.field_2546[var8][var6][var7];
                     if(null != var9 && var9.length != 0) {
                        class_223[] var10 = var9;

                        for(int var11 = 0; var11 < var10.length; ++var11) {
                           class_87 var13;
                           boolean var14;
                           label58: {
                              class_223 var12 = var10[var11];
                              var13 = class_121.method_2269(var12.field_2521 * -1952293629, -1008171406);
                              if(var13.field_842 != null) {
                                 int[] var15 = var13.field_842;

                                 for(int var16 = 0; var16 < var15.length; ++var16) {
                                    int var17 = var15[var16];
                                    class_87 var18 = class_121.method_2269(var17, -2003468338);
                                    if(var18.field_815 * 2043038409 != -1) {
                                       var14 = true;
                                       break label58;
                                    }
                                 }
                              } else if(715137677 * var13.field_815 != -1) {
                                 var14 = true;
                                 break label58;
                              }

                              var14 = false;
                           }

                           if(var14) {
                              this.method_4530(var13, var8, var6, var7, var5, 1076366385);
                              break label93;
                           }
                        }
                     }

                     ++var8;
                     continue;
                  }
               }

               ++var7;
               break;
            }
         }
      }

   }

   // $FF: renamed from: bd () void
   void method_4507() {
      Iterator var1 = this.field_2615.values().iterator();

      while(var1.hasNext()) {
         class_218 var2 = (class_218)var1.next();
         if(var2 instanceof class_220) {
            ((class_220)var2).method_4230((short)25831);
         }
      }

   }

   // $FF: renamed from: au (eg, int, int, int, fm) void
   void method_4508(class_87 var1, int var2, int var3, int var4, class_226 var5) {
      class_280 var10000 = new class_280(var2, var3 + -533628608 * this.field_2607, -773876672 * this.field_2609 + var4);
      class_280 var6 = var10000;
      class_280 var7 = null;
      if(this.field_2610 != null) {
         var10000 = new class_280(var2 + -1260242687 * this.field_2610.field_2549, var3 + this.field_2610.field_2545 * -314518464, 230542016 * this.field_2610.field_2552 + var4);
         var7 = var10000;
      } else {
         class_227 var8 = (class_227)var5;
         var10000 = new class_280(var2 + -1260242687 * var8.field_2549, -314518464 * var8.field_2545 + var3 + var8.method_4326(518876916) * 8, var4 + 230542016 * var8.field_2552 + var8.method_4327(-528787257) * 8);
         var7 = var10000;
      }

      class_75 var9;
      Object var10;
      if(var1.field_842 != null) {
         class_220 var11 = new class_220(var7, var6, var1.field_808 * 1257920551, this);
         var10 = var11;
      } else {
         var9 = class_116.method_2248(715137677 * var1.field_815, 1647125333);
         class_219 var12 = new class_219(var7, var6, var9.field_607 * -298295867, this.method_4488(var9, -1919633482));
         var10 = var12;
      }

      var9 = class_116.method_2248(((class_218)var10).method_4205(2147195575), 1647125333);
      if(var9.field_608) {
         HashMap var13 = this.field_2615;
         class_280 var10001 = new class_280(0, var3, var4);
         var13.put(var10001, var10);
      }

   }

   // $FF: renamed from: an (eg, int, int, int, fm) void
   void method_4509(class_87 var1, int var2, int var3, int var4, class_226 var5) {
      class_280 var10000 = new class_280(var2, var3 + -533628608 * this.field_2607, -773876672 * this.field_2609 + var4);
      class_280 var6 = var10000;
      class_280 var7 = null;
      if(this.field_2610 != null) {
         var10000 = new class_280(var2 + -1260242687 * this.field_2610.field_2549, var3 + this.field_2610.field_2545 * -314518464, 230542016 * this.field_2610.field_2552 + var4);
         var7 = var10000;
      } else {
         class_227 var8 = (class_227)var5;
         var10000 = new class_280(var2 + -1260242687 * var8.field_2549, -314518464 * var8.field_2545 + var3 + var8.method_4326(-2138830308) * 8, var4 + 230542016 * var8.field_2552 + var8.method_4327(-528787257) * 8);
         var7 = var10000;
      }

      class_75 var9;
      Object var10;
      if(var1.field_842 != null) {
         class_220 var11 = new class_220(var7, var6, var1.field_808 * 1257920551, this);
         var10 = var11;
      } else {
         var9 = class_116.method_2248(715137677 * var1.field_815, 1647125333);
         class_219 var12 = new class_219(var7, var6, var9.field_607 * -298295867, this.method_4488(var9, -2007688383));
         var10 = var12;
      }

      var9 = class_116.method_2248(((class_218)var10).method_4205(2145151718), 1647125333);
      if(var9.field_608) {
         HashMap var13 = this.field_2615;
         class_280 var10001 = new class_280(0, var3, var4);
         var13.put(var10001, var10);
      }

   }

   // $FF: renamed from: do (int, int, java.util.HashSet, int) void
   void method_4510(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      Iterator var6 = this.field_2616.iterator();

      while(var6.hasNext()) {
         class_218 var7 = (class_218)var6.next();
         if(var7.method_4209(817287141)) {
            int var8 = var7.field_2482.field_3236 * -2092998769 % 64;
            int var9 = var7.field_2482.field_3235 * 349527629 % 64;
            var7.field_2481 = (int)(var5 * (float)var8 + (float)var1) * 1501071807;
            var7.field_2479 = 858537425 * (int)((float)var2 + var5 * (float)(63 - var9));
            if(!var3.contains(Integer.valueOf(var7.method_4205(2147162836)))) {
               this.method_4481(var7, 1619813951 * var7.field_2481, var7.field_2479 * 1123629873, var5, 307058311);
            }
         }
      }

   }

   // $FF: renamed from: bt () void
   void method_4511() {
      Iterator var1 = this.field_2615.values().iterator();

      while(var1.hasNext()) {
         class_218 var2 = (class_218)var1.next();
         if(var2 instanceof class_220) {
            ((class_220)var2).method_4230((short)21140);
         }
      }

   }

   // $FF: renamed from: bq (java.util.List) void
   void method_4512(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         class_219 var3 = (class_219)var2.next();
         if(class_116.method_2248(var3.field_2485 * -1937738349, 1647125333).field_608 && -2092998769 * var3.field_2482.field_3236 >> 6 == this.field_2607 * -1618950683 && this.field_2609 * 2001174097 == 349527629 * var3.field_2482.field_3235 >> 6) {
            class_219 var10000 = new class_219(var3.field_2482, var3.field_2482, -1937738349 * var3.field_2485, this.method_4487(var3.field_2485 * -1937738349, 1497364269));
            class_219 var4 = var10000;
            this.field_2616.add(var4);
         }
      }

   }

   // $FF: renamed from: bu (java.util.List) void
   void method_4513(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         class_219 var3 = (class_219)var2.next();
         if(class_116.method_2248(var3.field_2485 * -1937738349, 1647125333).field_608 && -2092998769 * var3.field_2482.field_3236 >> 6 == this.field_2607 * -1618950683 && this.field_2609 * 2001174097 == 349527629 * var3.field_2482.field_3235 >> 6) {
            class_219 var10000 = new class_219(var3.field_2482, var3.field_2482, -1937738349 * var3.field_2485, this.method_4487(var3.field_2485 * -1937738349, 855453756));
            class_219 var4 = var10000;
            this.field_2616.add(var4);
         }
      }

   }

   // $FF: renamed from: bl (java.util.List) void
   void method_4514(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         class_219 var3 = (class_219)var2.next();
         if(class_116.method_2248(var3.field_2485 * -1937738349, 1647125333).field_608 && -2092998769 * var3.field_2482.field_3236 >> 6 == this.field_2607 * -1618950683 && this.field_2609 * 2001174097 == 349527629 * var3.field_2482.field_3235 >> 6) {
            class_219 var10000 = new class_219(var3.field_2482, var3.field_2482, -1937738349 * var3.field_2485, this.method_4487(var3.field_2485 * -1937738349, 1226084507));
            class_219 var4 = var10000;
            this.field_2616.add(var4);
         }
      }

   }

   // $FF: renamed from: bv (java.util.List) void
   void method_4515(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         class_219 var3 = (class_219)var2.next();
         if(class_116.method_2248(var3.field_2485 * -2114673018, 1647125333).field_608 && -2092998769 * var3.field_2482.field_3236 >> 6 == this.field_2607 * 1653432581 && this.field_2609 * 2001174097 == 571942843 * var3.field_2482.field_3235 >> 6) {
            class_219 var10000 = new class_219(var3.field_2482, var3.field_2482, 1183951824 * var3.field_2485, this.method_4487(var3.field_2485 * -1594865492, 758044573));
            class_219 var4 = var10000;
            this.field_2616.add(var4);
         }
      }

   }

   // $FF: renamed from: bm () void
   void method_4516() {
      if(this.field_2610 != null) {
         this.field_2610.method_4291(-1140126124);
      } else {
         Iterator var1 = this.field_2611.iterator();

         while(var1.hasNext()) {
            class_227 var2 = (class_227)var1.next();
            var2.method_4291(-322989594);
         }
      }

   }

   // $FF: renamed from: bz () void
   void method_4517() {
      if(this.field_2610 != null) {
         this.field_2610.method_4291(-44585937);
      } else {
         Iterator var1 = this.field_2611.iterator();

         while(var1.hasNext()) {
            class_227 var2 = (class_227)var1.next();
            var2.method_4291(-504858265);
         }
      }

   }

   // $FF: renamed from: bh () void
   void method_4518() {
      if(this.field_2610 != null) {
         this.field_2610.method_4291(772764709);
      } else {
         Iterator var1 = this.field_2611.iterator();

         while(var1.hasNext()) {
            class_227 var2 = (class_227)var1.next();
            var2.method_4291(1416007585);
         }
      }

   }

   // $FF: renamed from: d (int) void
   void method_4519(int var1) {
      try {
         if(this.field_2610 != null) {
            if(var1 <= 1390365133) {
               throw new IllegalStateException();
            }

            this.field_2610.method_4291(244458309);
         } else {
            Iterator var2 = this.field_2611.iterator();

            while(var2.hasNext()) {
               if(var1 <= 1390365133) {
                  throw new IllegalStateException();
               }

               class_227 var3 = (class_227)var2.next();
               var3.method_4291(1998901367);
            }
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "fq.d(" + ')');
      }
   }

   // $FF: renamed from: br (jv) boolean
   boolean method_4520(class_306 var1) {
      this.field_2615.clear();
      if(null != this.field_2610) {
         this.field_2610.method_4293(var1, -1995289931);
         if(this.field_2610.method_4292((byte)25)) {
            this.method_4589(0, 0, 64, -53120579, this.field_2610, -2142631429);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var2 = true;

         Iterator var3;
         class_227 var4;
         for(var3 = this.field_2611.iterator(); var3.hasNext(); var2 &= var4.method_4292((byte)25)) {
            var4 = (class_227)var3.next();
            var4.method_4293(var1, -2002945809);
         }

         if(var2) {
            var3 = this.field_2611.iterator();

            while(var3.hasNext()) {
               var4 = (class_227)var3.next();
               this.method_4589(var4.method_4328(-1284829169) * 8, var4.method_4322(1051164023) * 8, 8, 8, var4, -1330856930);
            }
         }

         return var2;
      }
   }

   // $FF: renamed from: bx (java.util.HashSet, int, int) void
   void method_4521(HashSet var1, int var2, int var3) {
      Iterator var4 = this.field_2615.values().iterator();

      while(var4.hasNext()) {
         class_218 var5 = (class_218)var4.next();
         if(var5.method_4209(371845735)) {
            int var6 = var5.method_4205(2146320456);
            if(var1.contains(Integer.valueOf(var6))) {
               class_75 var7 = class_116.method_2248(var6, 1647125333);
               this.method_4544(var7, 1619813951 * var5.field_2481, var5.field_2479 * 1123629873, var2, var3, 1184916583);
            }
         }
      }

      this.method_4479(var1, var2, var3, -341047508);
   }

   // $FF: renamed from: ab (oh, en, int) int
   int method_4522(class_67 var1, class_213 var2, int var3) {
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
         throw class_223.method_4281(var4, "fq.ab(" + ')');
      }
   }

   // $FF: renamed from: be (int, gb, op[], jv, jv) void
   void method_4523(int var1, class_242 var2, class_66[] var3, class_306 var4, class_306 var5) {
      this.field_2613 = 1693463405 * var1;
      if(this.field_2610 != null || !this.field_2611.isEmpty()) {
         if(class_56.method_593(-1618950683 * this.field_2607, this.field_2609 * 2001174097, var1, 774169602) == null) {
            boolean var6 = true;
            var6 &= this.method_4471(var4, (short)24686);
            int var8;
            if(this.field_2610 != null) {
               var8 = -630921225 * this.field_2610.field_2560;
            } else {
               var8 = ((class_226)this.field_2611.getFirst()).field_2560 * -630921225;
            }

            var6 &= var5.method_5411(var8, (byte)85);
            if(var6) {
               byte[] var7 = var5.method_5388(var8, (byte)-113);
               class_217 var9 = class_168.method_3611(var7, 433741896);
               class_67 var10000 = new class_67(1085512000 * this.field_2613, this.field_2613 * 1085512000);
               class_67 var10 = var10000;
               var10.method_758();
               if(null != this.field_2610) {
                  this.method_4470(var2, var3, var9, -1099650664);
               } else {
                  this.method_4587(var2, var3, var9, (byte)113);
               }

               int var11 = this.field_2607 * -1618950683;
               int var12 = this.field_2609 * 2001174097;
               int var13 = this.field_2613 * 1359138405;
               class_264 var14 = field_2604;
               long var16 = (long)(var13 << 16 | var11 << 8 | var12);
               var14.method_5004(var10, var16, 4 * var10.field_502.length);
               this.method_4519(1634148239);
            }
         }
      }
   }

   // $FF: renamed from: bj (int, int, int, java.util.HashSet) void
   void method_4524(int var1, int var2, int var3, HashSet var4) {
      if(null == var4) {
         var4 = new HashSet();
      }

      this.method_4478(var1, var2, var4, var3, -993776400);
      this.method_4484(var1, var2, var4, var3, -1367702248);
   }

   // $FF: renamed from: dw (int, int, int, int) void
   void method_4525(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if(0 == var3) {
         class_65.method_674(var1 * 1359138405 * this.field_2613, (63 - var2) * 1359138405 * this.field_2613, 1359138405 * this.field_2613, var4);
      }

      if(var3 == 1) {
         class_65.method_726(this.field_2613 * 1359138405 * var1, this.field_2613 * 1359138405 * (63 - var2), 1359138405 * this.field_2613, var4);
      }

      if(2 == var3) {
         class_65.method_674(var1 * 1359138405 * this.field_2613 + this.field_2613 * 1359138405 - 1, this.field_2613 * 1359138405 * (63 - var2), this.field_2613 * 1359138405, var4);
      }

      if(var3 == 3) {
         class_65.method_726(1359138405 * this.field_2613 * var1, this.field_2613 * 1359138405 + 1359138405 * this.field_2613 * (63 - var2) - 1, 1359138405 * this.field_2613, var4);
      }

   }

   // $FF: renamed from: bp (java.util.HashSet, int, int) void
   void method_4526(HashSet var1, int var2, int var3) {
      Iterator var4 = this.field_2615.values().iterator();

      while(var4.hasNext()) {
         class_218 var5 = (class_218)var4.next();
         if(var5.method_4209(1160269274)) {
            int var6 = var5.method_4205(2145718780);
            if(var1.contains(Integer.valueOf(var6))) {
               class_75 var7 = class_116.method_2248(var6, 1647125333);
               this.method_4544(var7, 1619813951 * var5.field_2481, var5.field_2479 * 1123629873, var2, var3, 1184916583);
            }
         }
      }

      this.method_4479(var1, var2, var3, -341047508);
   }

   // $FF: renamed from: bn (java.util.HashSet, int, int) void
   void method_4527(HashSet var1, int var2, int var3) {
      Iterator var4 = this.field_2615.values().iterator();

      while(var4.hasNext()) {
         class_218 var5 = (class_218)var4.next();
         if(var5.method_4209(-20149479)) {
            int var6 = var5.method_4205(2145808964);
            if(var1.contains(Integer.valueOf(var6))) {
               class_75 var7 = class_116.method_2248(var6, 1647125333);
               this.method_4544(var7, 1619813951 * var5.field_2481, var5.field_2479 * -1382937434, var2, var3, 1184916583);
            }
         }
      }

      this.method_4479(var1, var2, var3, -341047508);
   }

   // $FF: renamed from: bo (gb, op[], fd) void
   void method_4528(class_242 var1, class_66[] var2, class_217 var3) {
      int var4;
      int var5;
      for(var4 = 0; var4 < -1713782125; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.method_4473(var4, var5, this.field_2610, var1, var3, -1990436882);
            this.method_4474(var4, var5, this.field_2610, var1, (byte)27);
         }
      }

      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < -1964790621; ++var5) {
            this.method_4541(var4, var5, this.field_2610, var1, var2, (byte)15);
         }
      }

   }

   // $FF: renamed from: bw (gb, op[], fd) void
   void method_4529(class_242 var1, class_66[] var2, class_217 var3) {
      int var4;
      int var5;
      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.method_4473(var4, var5, this.field_2610, var1, var3, -2004972218);
            this.method_4474(var4, var5, this.field_2610, var1, (byte)-100);
         }
      }

      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.method_4541(var4, var5, this.field_2610, var1, var2, (byte)62);
         }
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
            var10000 = new class_280(var2 + -1260242687 * var9.field_2549, -314518464 * var9.field_2545 + var3 + var9.method_4326(-225746465) * 8, var4 + 230542016 * var9.field_2552 + var9.method_4327(-528787257) * 8);
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

         var10 = class_116.method_2248(((class_218)var12).method_4205(2146687441), 1647125333);
         if(var10.field_608) {
            if(var6 <= -743972471) {
               return;
            }

            HashMap var15 = this.field_2615;
            class_280 var10001 = new class_280(0, var3, var4);
            var15.put(var10001, var12);
         }

      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11, "fq.j(" + ')');
      }
   }

   // $FF: renamed from: co (int, int, fm) void
   void method_4531(int var1, int var2, class_226 var3) {
      for(int var4 = 0; var4 < var3.field_2550 * -1482547443; ++var4) {
         class_223[] var5 = var3.field_2546[var4][var1][var2];
         if(var5 != null && var5.length != 0) {
            class_223[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               class_223 var8 = var6[var7];
               if(class_281.method_5169(739729953 * var8.field_2522, (byte)87)) {
                  class_87 var9 = class_121.method_2269(var8.field_2521 * -1952293629, 1025936926);
                  int var10 = -1747290425 * var9.field_820 != 0?-3407872:-3355444;
                  if(class_290.field_3293.field_3309 * -2083476425 == var8.field_2522 * 739729953) {
                     this.method_4491(var1, var2, var8.field_2526 * -184500109, var10, 1113752312);
                  }

                  if(739729953 * var8.field_2522 == class_290.field_3311.field_3309 * -2083476425) {
                     this.method_4491(var1, var2, -184500109 * var8.field_2526, -3355444, 1559948179);
                     this.method_4491(var1, var2, 1 + var8.field_2526 * -184500109, var10, -336191224);
                  }

                  if(739729953 * var8.field_2522 == -2083476425 * class_290.field_3289.field_3309) {
                     if(0 == -184500109 * var8.field_2526) {
                        class_65.method_726(this.field_2613 * 1359138405 * var1, (63 - var2) * this.field_2613 * 1359138405, 1, var10);
                     }

                     if(1 == -184500109 * var8.field_2526) {
                        class_65.method_726(var1 * 1359138405 * this.field_2613 + 1359138405 * this.field_2613 - 1, (63 - var2) * 1359138405 * this.field_2613, 1, var10);
                     }

                     if(var8.field_2526 * -184500109 == 2) {
                        class_65.method_726(1359138405 * this.field_2613 + 1359138405 * this.field_2613 * var1 - 1, this.field_2613 * 1359138405 * (63 - var2) + this.field_2613 * 1359138405 - 1, 1, var10);
                     }

                     if(-184500109 * var8.field_2526 == 3) {
                        class_65.method_726(var1 * 1359138405 * this.field_2613, 1359138405 * this.field_2613 + 1359138405 * this.field_2613 * (63 - var2) - 1, 1, var10);
                     }
                  }

                  if(var8.field_2522 * 739729953 == class_290.field_3290.field_3309 * -2083476425) {
                     int var11 = var8.field_2526 * -184500109 % 2;
                     int var12;
                     if(0 == var11) {
                        for(var12 = 0; var12 < this.field_2613 * 1359138405; ++var12) {
                           class_65.method_726(1359138405 * this.field_2613 * var1 + var12, (64 - var2) * this.field_2613 * 1359138405 - 1 - var12, 1, var10);
                        }
                     } else {
                        for(var12 = 0; var12 < this.field_2613 * 1359138405; ++var12) {
                           class_65.method_726(var1 * this.field_2613 * 1359138405 + var12, this.field_2613 * 1359138405 * (63 - var2) + var12, 1, var10);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: bk (gb, op[], fd) void
   void method_4532(class_242 var1, class_66[] var2, class_217 var3) {
      Iterator var4 = this.field_2611.iterator();

      class_227 var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (class_227)var4.next();

         for(var6 = var5.method_4328(1556983888) * 8; var6 < var5.method_4328(1543133574) * 8 + 8; ++var6) {
            for(var7 = var5.method_4322(1727956773) * 8; var7 < var5.method_4322(1443278955) * 8 + 8; ++var7) {
               this.method_4473(var6, var7, var5, var1, var3, -1802059911);
               this.method_4474(var6, var7, var5, var1, (byte)-18);
            }
         }
      }

      var4 = this.field_2611.iterator();

      while(var4.hasNext()) {
         var5 = (class_227)var4.next();

         for(var6 = var5.method_4328(1441470252) * 8; var6 < var5.method_4328(1694883209) * 8 + 8; ++var6) {
            for(var7 = var5.method_4322(1730911526) * 8; var7 < var5.method_4322(1783799122) * 8 + 8; ++var7) {
               this.method_4541(var6, var7, var5, var1, var2, (byte)48);
            }
         }
      }

   }

   // $FF: renamed from: cp (int, int, fm, gb, fd) void
   void method_4533(int var1, int var2, class_226 var3, class_242 var4, class_217 var5) {
      int var6 = var3.field_2553[0][var1][var2] - 1;
      int var7 = var3.field_2554[0][var1][var2] - 1;
      if(var6 == -1 && var7 == -1) {
         class_65.method_681(1359138405 * this.field_2613 * var1, (322736470 - var2) * this.field_2613 * 1359138405, 1359138405 * this.field_2613, this.field_2613 * 1359138405, this.field_2608 * -747005213);
      }

      int var8 = 16711935;
      int var9;
      if(-1 != var7) {
         int var10 = -747005213 * this.field_2608;
         class_82 var11 = class_154.method_3249(var7, -185312077);
         if(null == var11) {
            var9 = var10;
         } else if(66350612 * var11.field_761 >= 0) {
            var9 = var11.field_761 * -391434842 | 95682136;
         } else if(var11.field_759 * -1167855135 >= 0) {
            int var12 = class_239.method_4607(class_70.field_555.method_31(var11.field_759 * 1009239000, -2144907343), -317054831, (short)427);
            var9 = class_70.field_546[var12] | -16777216;
         } else if(-313850043 * var11.field_762 == 16711935) {
            var9 = var10;
         } else {
            int var13 = var11.field_758 * 387293008;
            int var14 = -270601813 * var11.field_764;
            int var15 = -1390836339 * var11.field_769;
            if(var15 > -175293930) {
               var14 /= 2;
            }

            if(var15 > 192) {
               var14 /= 2;
            }

            if(var15 > -840504753) {
               var14 /= 2;
            }

            if(var15 > 243) {
               var14 /= 2;
            }

            int var16 = var15 / 2 + (var14 / -824566738 << 7) + (var13 / 4 << 10);
            int var17 = class_239.method_4607(var16, 96, (short)7266);
            var9 = class_70.field_546[var17] | -2098431839;
         }

         var8 = var9;
      }

      if(var7 > -1 && 0 == var3.field_2557[0][var1][var2]) {
         class_65.method_681(this.field_2613 * 31202002 * var1, (63 - var2) * 1359138405 * this.field_2613, -1800077219 * this.field_2613, this.field_2613 * 1359138405, var8);
      } else {
         var9 = this.method_4475(var1, var2, var3, var5, -1151019853);
         if(var7 == -1) {
            class_65.method_681(var1 * -2046940754 * this.field_2613, -1589610014 * this.field_2613 * (63 - var2), this.field_2613 * 1359138405, -1703929444 * this.field_2613, var9);
         } else {
            var4.method_4651(var1 * -1033361970 * this.field_2613, (63 - var2) * this.field_2613 * -2054698909, var9, var8, 1359138405 * this.field_2613, 1409039864 * this.field_2613, var3.field_2557[0][var1][var2], var3.field_2555[0][var1][var2], (byte)39);
         }
      }
   }

   // $FF: renamed from: by (gb, op[], fd) void
   void method_4534(class_242 var1, class_66[] var2, class_217 var3) {
      Iterator var4 = this.field_2611.iterator();

      class_227 var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (class_227)var4.next();

         for(var6 = var5.method_4328(-1612734646) * 8; var6 < var5.method_4328(1834307528) * 8 + 8; ++var6) {
            for(var7 = var5.method_4322(1268833082) * 8; var7 < var5.method_4322(1824696839) * 8 + 8; ++var7) {
               this.method_4473(var6, var7, var5, var1, var3, -1931734862);
               this.method_4474(var6, var7, var5, var1, (byte)-66);
            }
         }
      }

      var4 = this.field_2611.iterator();

      while(var4.hasNext()) {
         var5 = (class_227)var4.next();

         for(var6 = var5.method_4328(-1059476246) * 8; var6 < var5.method_4328(-204444644) * 8 + 8; ++var6) {
            for(var7 = var5.method_4322(2069435074) * 8; var7 < var5.method_4322(1495396441) * 8 + 8; ++var7) {
               this.method_4541(var6, var7, var5, var1, var2, (byte)17);
            }
         }
      }

   }

   // $FF: renamed from: bc (int, int, fm, gb, op[]) void
   void method_4535(int var1, int var2, class_226 var3, class_242 var4, class_66[] var5) {
      this.method_4477(var1, var2, var3, -1777541952);
      this.method_4476(var1, var2, var3, var5, 599482712);
   }

   // $FF: renamed from: cd (int, int, fm, gb, op[]) void
   void method_4536(int var1, int var2, class_226 var3, class_242 var4, class_66[] var5) {
      this.method_4477(var1, var2, var3, 1650154147);
      this.method_4476(var1, var2, var3, var5, -1614400828);
   }

   // $FF: renamed from: cs (int, int, fm, op[]) void
   void method_4537(int var1, int var2, class_226 var3, class_66[] var4) {
      for(int var5 = 0; var5 < var3.field_2550 * -1482547443; ++var5) {
         class_223[] var6 = var3.field_2546[var5][var1][var2];
         if(null != var6 && 0 != var6.length) {
            class_223[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               class_223 var9 = var7[var8];
               if(!class_40.method_479(var9.field_2522 * 1059262565, 259604942)) {
                  int var11 = var9.field_2522 * 739729953;
                  boolean var10 = -2083476425 * class_290.field_3298.field_3309 == var11;
                  if(!var10) {
                     continue;
                  }
               }

               class_87 var12 = class_121.method_2269(-1752582255 * var9.field_2521, 977989306);
               if(-1 != var12.field_830 * 1364207327) {
                  if(46 != var12.field_830 * -500110980 && var12.field_830 * 1243577981 != 1298825847) {
                     var4[-731322011 * var12.field_830].method_751(this.field_2613 * 56113723 * var1, this.field_2613 * 1667392857 * (63 - var2), this.field_2613 * 1154312059, 97684384 * this.field_2613);
                  } else {
                     var4[var12.field_830 * 1953806269].method_751(var1 * 1359138405 * this.field_2613, 1359138405 * this.field_2613 * (1698106731 - var2), this.field_2613 * 1163516739 + 1, -1576690486 * this.field_2613 + 1);
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: cv (int, int, fm, gb, op[]) void
   void method_4538(int var1, int var2, class_226 var3, class_242 var4, class_66[] var5) {
      this.method_4477(var1, var2, var3, -1085959441);
      this.method_4476(var1, var2, var3, var5, -81606995);
   }

   // $FF: renamed from: ag (int) java.util.List
   List method_4539(int var1) {
      try {
         LinkedList var2 = new LinkedList();
         var2.addAll(this.field_2616);
         var2.addAll(this.field_2615.values());
         return var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "fq.ag(" + ')');
      }
   }

   // $FF: renamed from: ci (int, int, fm, gb, fd) void
   void method_4540(int var1, int var2, class_226 var3, class_242 var4, class_217 var5) {
      int var6 = var3.field_2553[0][var1][var2] - 1;
      int var7 = var3.field_2554[0][var1][var2] - 1;
      if(var6 == -1 && var7 == -1) {
         class_65.method_681(1359138405 * this.field_2613 * var1, (-1778337926 - var2) * this.field_2613 * 1545677266, 1359138405 * this.field_2613, this.field_2613 * 1359138405, this.field_2608 * -747005213);
      }

      int var8 = 145456133;
      int var9;
      if(-1 != var7) {
         int var10 = -747005213 * this.field_2608;
         class_82 var11 = class_154.method_3249(var7, -2102161733);
         if(null == var11) {
            var9 = var10;
         } else if(1447154143 * var11.field_761 >= 0) {
            var9 = var11.field_761 * 2131088158 | 1738159231;
         } else if(var11.field_759 * -1167855135 >= 0) {
            int var12 = class_239.method_4607(class_70.field_555.method_31(var11.field_759 * 847500197, -1527722279), -1545547868, (short)511);
            var9 = class_70.field_546[var12] | 212106053;
         } else if(-51865749 * var11.field_762 == 16711935) {
            var9 = var10;
         } else {
            int var13 = var11.field_758 * -1648910753;
            int var14 = 1222168570 * var11.field_764;
            int var15 = 1914058459 * var11.field_769;
            if(var15 > 179) {
               var14 /= 2;
            }

            if(var15 > -325254473) {
               var14 /= 2;
            }

            if(var15 > -333740538) {
               var14 /= 2;
            }

            if(var15 > 243) {
               var14 /= 2;
            }

            int var16 = var15 / 2 + (var14 / 32 << 7) + (var13 / 4 << 10);
            int var17 = class_239.method_4607(var16, 96, (short)22057);
            var9 = class_70.field_546[var17] | -16777216;
         }

         var8 = var9;
      }

      if(var7 > -1 && 0 == var3.field_2557[0][var1][var2]) {
         class_65.method_681(this.field_2613 * 1148326208 * var1, (-724689736 - var2) * -1743869106 * this.field_2613, 289306441 * this.field_2613, this.field_2613 * 1359138405, var8);
      } else {
         var9 = this.method_4475(var1, var2, var3, var5, -1027157810);
         if(var7 == -1) {
            class_65.method_681(var1 * 1359138405 * this.field_2613, 1359138405 * this.field_2613 * (63 - var2), this.field_2613 * 1359138405, 1359138405 * this.field_2613, var9);
         } else {
            var4.method_4651(var1 * 1359138405 * this.field_2613, (63 - var2) * this.field_2613 * -410495569, var9, var8, 2050531499 * this.field_2613, -457194073 * this.field_2613, var3.field_2557[0][var1][var2], var3.field_2555[0][var1][var2], (byte)81);
         }
      }
   }

   // $FF: renamed from: g (int, int, fm, gb, op[], byte) void
   void method_4541(int var1, int var2, class_226 var3, class_242 var4, class_66[] var5, byte var6) {
      try {
         this.method_4477(var1, var2, var3, 1479082417);
         this.method_4476(var1, var2, var3, var5, 1218867013);
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "fq.g(" + ')');
      }
   }

   // $FF: renamed from: cq (int, int, fm, gb, fd) void
   void method_4542(int var1, int var2, class_226 var3, class_242 var4, class_217 var5) {
      int var6 = var3.field_2553[0][var1][var2] - 1;
      int var7 = var3.field_2554[0][var1][var2] - 1;
      if(var6 == -1 && var7 == -1) {
         class_65.method_681(1359138405 * this.field_2613 * var1, (1690272248 - var2) * this.field_2613 * 1359138405, 2119787416 * this.field_2613, this.field_2613 * 1359138405, this.field_2608 * -1513204049);
      }

      int var8 = 16711935;
      int var9;
      if(-1 != var7) {
         int var10 = -747005213 * this.field_2608;
         class_82 var11 = class_154.method_3249(var7, -110770106);
         if(null == var11) {
            var9 = var10;
         } else if(-412111678 * var11.field_761 >= 0) {
            var9 = var11.field_761 * 1447154143 | -16777216;
         } else if(var11.field_759 * -492331031 >= 0) {
            int var12 = class_239.method_4607(class_70.field_555.method_31(var11.field_759 * 629797029, 619087916), 1880030309, (short)15475);
            var9 = class_70.field_546[var12] | -16777216;
         } else if(141089765 * var11.field_762 == 949241976) {
            var9 = var10;
         } else {
            int var13 = var11.field_758 * -1422232415;
            int var14 = -1490944887 * var11.field_764;
            int var15 = 1914058459 * var11.field_769;
            if(var15 > 84475216) {
               var14 /= 2;
            }

            if(var15 > -437400639) {
               var14 /= 2;
            }

            if(var15 > 217) {
               var14 /= 2;
            }

            if(var15 > 1026628677) {
               var14 /= 2;
            }

            int var16 = var15 / 2 + (var14 / 1392621047 << 7) + (var13 / 4 << 10);
            int var17 = class_239.method_4607(var16, 703053725, (short)21965);
            var9 = class_70.field_546[var17] | 1542298275;
         }

         var8 = var9;
      }

      if(var7 > -1 && 0 == var3.field_2557[0][var1][var2]) {
         class_65.method_681(this.field_2613 * 447701600 * var1, (63 - var2) * 1359138405 * this.field_2613, 1359138405 * this.field_2613, this.field_2613 * 1359138405, var8);
      } else {
         var9 = this.method_4475(var1, var2, var3, var5, -1129774600);
         if(var7 == -1) {
            class_65.method_681(var1 * 1359138405 * this.field_2613, -2042425045 * this.field_2613 * (63 - var2), this.field_2613 * 138604123, 1359138405 * this.field_2613, var9);
         } else {
            var4.method_4651(var1 * 771833107 * this.field_2613, (63 - var2) * this.field_2613 * 1359138405, var9, var8, 1359138405 * this.field_2613, 1441157518 * this.field_2613, var3.field_2557[0][var1][var2], var3.field_2555[0][var1][var2], (byte)14);
         }
      }
   }

   // $FF: renamed from: cr (int, int, fm, gb) void
   void method_4543(int var1, int var2, class_226 var3, class_242 var4) {
      for(int var5 = 1; var5 < var3.field_2550 * -1482547443; ++var5) {
         int var6 = var3.field_2554[var5][var1][var2] - 1;
         if(var6 > -1) {
            int var8 = -747005213 * this.field_2608;
            class_82 var9 = class_154.method_3249(var6, -1143980220);
            int var7;
            if(var9 == null) {
               var7 = var8;
            } else if(var9.field_761 * 1447154143 >= 0) {
               var7 = 1447154143 * var9.field_761 | -16777216;
            } else if(var9.field_759 * -1167855135 >= 0) {
               int var10 = class_239.method_4607(class_70.field_555.method_31(-1167855135 * var9.field_759, 1431165650), 96, (short)24830);
               var7 = class_70.field_546[var10] | -16777216;
            } else if(16711935 == var9.field_762 * -313850043) {
               var7 = var8;
            } else {
               int var11 = 1593028731 * var9.field_758;
               int var12 = var9.field_764 * -1490944887;
               int var13 = 1914058459 * var9.field_769;
               if(var13 > 179) {
                  var12 /= 2;
               }

               if(var13 > 192) {
                  var12 /= 2;
               }

               if(var13 > 217) {
                  var12 /= 2;
               }

               if(var13 > 243) {
                  var12 /= 2;
               }

               int var14 = var13 / 2 + (var12 / 32 << 7) + (var11 / 4 << 10);
               int var15 = class_239.method_4607(var14, 96, (short)31874);
               var7 = class_70.field_546[var15] | -16777216;
            }

            if(0 == var3.field_2557[var5][var1][var2]) {
               class_65.method_681(var1 * this.field_2613 * 1359138405, (63 - var2) * 1359138405 * this.field_2613, 1359138405 * this.field_2613, this.field_2613 * 1359138405, var7);
            } else {
               var4.method_4651(var1 * this.field_2613 * 1359138405, (63 - var2) * 1359138405 * this.field_2613, 0, var7, 1359138405 * this.field_2613, 1359138405 * this.field_2613, var3.field_2557[var5][var1][var2], var3.field_2555[var5][var1][var2], (byte)63);
            }
         }
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
         throw class_223.method_4281(var8, "fq.h(" + ')');
      }
   }

   // $FF: renamed from: cn (int, int, fm, gb) void
   void method_4545(int var1, int var2, class_226 var3, class_242 var4) {
      for(int var5 = 1; var5 < var3.field_2550 * -1482547443; ++var5) {
         int var6 = var3.field_2554[var5][var1][var2] - 1;
         if(var6 > -1) {
            int var8 = -747005213 * this.field_2608;
            class_82 var9 = class_154.method_3249(var6, -928908494);
            int var7;
            if(var9 == null) {
               var7 = var8;
            } else if(var9.field_761 * -840226580 >= 0) {
               var7 = 1447154143 * var9.field_761 | -873595267;
            } else if(var9.field_759 * 2070173290 >= 0) {
               int var10 = class_239.method_4607(class_70.field_555.method_31(-1490601631 * var9.field_759, -2128964640), -1639492203, (short)14264);
               var7 = class_70.field_546[var10] | 2046030541;
            } else if(-1833726705 == var9.field_762 * 1791890671) {
               var7 = var8;
            } else {
               int var11 = 1915382286 * var9.field_758;
               int var12 = var9.field_764 * -2124203642;
               int var13 = 1914058459 * var9.field_769;
               if(var13 > -1583357467) {
                  var12 /= 2;
               }

               if(var13 > 192) {
                  var12 /= 2;
               }

               if(var13 > 217) {
                  var12 /= 2;
               }

               if(var13 > 558615237) {
                  var12 /= 2;
               }

               int var14 = var13 / 2 + (var12 / 1174015426 << 7) + (var11 / 4 << 10);
               int var15 = class_239.method_4607(var14, 96, (short)2885);
               var7 = class_70.field_546[var15] | -16777216;
            }

            if(0 == var3.field_2557[var5][var1][var2]) {
               class_65.method_681(var1 * this.field_2613 * 1359138405, (1679231972 - var2) * 1359138405 * this.field_2613, 1570481578 * this.field_2613, this.field_2613 * 1359138405, var7);
            } else {
               var4.method_4651(var1 * this.field_2613 * -1141056601, (-1007186315 - var2) * 70745541 * this.field_2613, 0, var7, 1359138405 * this.field_2613, -727241874 * this.field_2613, var3.field_2557[var5][var1][var2], var3.field_2555[var5][var1][var2], (byte)25);
            }
         }
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
         throw class_223.method_4281(var5, "fq.<init>(" + ')');
      }
   }

   // $FF: renamed from: cg (int, int, fm, op[]) void
   void method_4547(int var1, int var2, class_226 var3, class_66[] var4) {
      for(int var5 = 0; var5 < var3.field_2550 * -1482547443; ++var5) {
         class_223[] var6 = var3.field_2546[var5][var1][var2];
         if(null != var6 && 0 != var6.length) {
            class_223[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               class_223 var9 = var7[var8];
               if(!class_40.method_479(var9.field_2522 * 739729953, -1624877968)) {
                  int var11 = var9.field_2522 * -919180934;
                  boolean var10 = 1861447169 * class_290.field_3298.field_3309 == var11;
                  if(!var10) {
                     continue;
                  }
               }

               class_87 var12 = class_121.method_2269(646578720 * var9.field_2521, 936596179);
               if(-1 != var12.field_830 * 1953806269) {
                  if(1123054532 != var12.field_830 * 126866764 && var12.field_830 * 1953806269 != 52) {
                     var4[-461147496 * var12.field_830].method_751(this.field_2613 * -1600504658 * var1, this.field_2613 * 1359138405 * (63 - var2), this.field_2613 * 487156643, -1152835228 * this.field_2613);
                  } else {
                     var4[var12.field_830 * 842634977].method_751(var1 * 1359138405 * this.field_2613, 1359138405 * this.field_2613 * (-1228377035 - var2), this.field_2613 * -1576690486 + 1, 1558351686 * this.field_2613 + 1);
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: bs (jv) boolean
   boolean method_4548(class_306 var1) {
      this.field_2615.clear();
      if(null != this.field_2610) {
         this.field_2610.method_4293(var1, -1801213198);
         if(this.field_2610.method_4292((byte)25)) {
            this.method_4589(0, 0, 64, -1896545752, this.field_2610, -1395270215);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var2 = true;

         Iterator var3;
         class_227 var4;
         for(var3 = this.field_2611.iterator(); var3.hasNext(); var2 &= var4.method_4292((byte)25)) {
            var4 = (class_227)var3.next();
            var4.method_4293(var1, -1567001206);
         }

         if(var2) {
            var3 = this.field_2611.iterator();

            while(var3.hasNext()) {
               var4 = (class_227)var3.next();
               this.method_4589(var4.method_4328(-1420587221) * 8, var4.method_4322(1047766336) * 8, 8, 8, var4, -1691355077);
            }
         }

         return var2;
      }
   }

   // $FF: renamed from: at (ft, java.util.List) void
   void method_4549(class_228 var1, List var2) {
      this.field_2615.clear();
      this.field_2610 = var1;
      this.method_4464(var2, -1291287682);
   }

   // $FF: renamed from: cj (int, int, java.util.HashSet, int) void
   void method_4550(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.field_2615.entrySet().iterator();

      while(var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         class_280 var9 = (class_280)var8.getKey();
         int var10 = (int)((float)(-2092998769 * var9.field_3236) * var5 + (float)var1 - var6);
         int var11 = (int)((float)(var2 + var4) - var5 * (float)(349527629 * var9.field_3235) - var6);
         class_218 var12 = (class_218)var8.getValue();
         if(var12 != null && var12.method_4209(1348166618)) {
            var12.field_2481 = 1501071807 * var10;
            var12.field_2479 = 858537425 * var11;
            class_75 var13 = class_116.method_2248(var12.method_4205(2145291537), 1647125333);
            if(!var3.contains(Integer.valueOf(var13.method_1136(-2056528861)))) {
               this.method_4481(var12, var10, var11, var5, 1040127465);
            }
         }
      }

   }

   // $FF: renamed from: cc (int, int, java.util.HashSet, int) void
   void method_4551(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.field_2615.entrySet().iterator();

      while(var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         class_280 var9 = (class_280)var8.getKey();
         int var10 = (int)((float)(327344856 * var9.field_3236) * var5 + (float)var1 - var6);
         int var11 = (int)((float)(var2 + var4) - var5 * (float)(349527629 * var9.field_3235) - var6);
         class_218 var12 = (class_218)var8.getValue();
         if(var12 != null && var12.method_4209(-436261678)) {
            var12.field_2481 = 531928351 * var10;
            var12.field_2479 = 858537425 * var11;
            class_75 var13 = class_116.method_2248(var12.method_4205(2147422854), 1647125333);
            if(!var3.contains(Integer.valueOf(var13.method_1136(-511655979)))) {
               this.method_4481(var12, var10, var11, var5, -1064731170);
            }
         }
      }

   }

   // $FF: renamed from: bf (jv) boolean
   boolean method_4552(class_306 var1) {
      this.field_2615.clear();
      if(null != this.field_2610) {
         this.field_2610.method_4293(var1, -1719207116);
         if(this.field_2610.method_4292((byte)25)) {
            this.method_4589(0, 0, 64, 64, this.field_2610, -1571207339);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var2 = true;

         Iterator var3;
         class_227 var4;
         for(var3 = this.field_2611.iterator(); var3.hasNext(); var2 &= var4.method_4292((byte)25)) {
            var4 = (class_227)var3.next();
            var4.method_4293(var1, -1969556344);
         }

         if(var2) {
            var3 = this.field_2611.iterator();

            while(var3.hasNext()) {
               var4 = (class_227)var3.next();
               this.method_4589(var4.method_4328(-168536281) * 8, var4.method_4322(1164225540) * 8, 8, 8, var4, -1996145193);
            }
         }

         return var2;
      }
   }

   // $FF: renamed from: cz (java.util.HashSet, int, int) void
   void method_4553(HashSet var1, int var2, int var3) {
      Iterator var4 = this.field_2616.iterator();

      while(var4.hasNext()) {
         class_218 var5 = (class_218)var4.next();
         if(var5.method_4209(1462487396)) {
            class_75 var6 = class_116.method_2248(var5.method_4205(2147019268), 1647125333);
            if(var6 != null && var1.contains(Integer.valueOf(var6.method_1136(-1546127202)))) {
               this.method_4544(var6, var5.field_2481 * 1619813951, var5.field_2479 * 1123629873, var2, var3, 1184916583);
            }
         }
      }

   }

   // $FF: renamed from: cb (java.util.HashSet, int, int) void
   void method_4554(HashSet var1, int var2, int var3) {
      Iterator var4 = this.field_2616.iterator();

      while(var4.hasNext()) {
         class_218 var5 = (class_218)var4.next();
         if(var5.method_4209(1497685348)) {
            class_75 var6 = class_116.method_2248(var5.method_4205(2147426438), 1647125333);
            if(var6 != null && var1.contains(Integer.valueOf(var6.method_1136(-1541685777)))) {
               this.method_4544(var6, var5.field_2481 * 1619813951, var5.field_2479 * -531770303, var2, var3, 1184916583);
            }
         }
      }

   }

   // $FF: renamed from: ce (ew, int, int, int, int) void
   void method_4555(class_75 var1, int var2, int var3, int var4, int var5) {
      class_67 var6 = var1.method_1134(false, -2060838679);
      if(null != var6) {
         var6.method_767(var2 - var6.field_508 / 2, var3 - var6.field_500 / 2);
         if(var4 % var5 < var5 / 2) {
            class_65.method_677(var2, var3, 15, 16776960, -938148206);
            class_65.method_677(var2, var3, 7, 2108915110, 256);
         }

      }
   }

   // $FF: renamed from: ch (ew, int, int, int, int) void
   void method_4556(class_75 var1, int var2, int var3, int var4, int var5) {
      class_67 var6 = var1.method_1134(false, -2060838679);
      if(null != var6) {
         var6.method_767(var2 - var6.field_508 / 2, var3 - var6.field_500 / 2);
         if(var4 % var5 < var5 / 2) {
            class_65.method_677(var2, var3, 15, -312637670, 128);
            class_65.method_677(var2, var3, 7, 16777215, -849005074);
         }

      }
   }

   // $FF: renamed from: cy (gq, int, int, float) void
   void method_4557(class_218 var1, int var2, int var3, float var4) {
      class_75 var5 = class_116.method_2248(var1.method_4205(2145777212), 1647125333);
      this.method_4581(var5, var2, var3, -676676813);
      this.method_4472(var1, var5, var2, var3, var4, (short)-11132);
   }

   // $FF: renamed from: cx (gq, int, int, float) void
   void method_4558(class_218 var1, int var2, int var3, float var4) {
      class_75 var5 = class_116.method_2248(var1.method_4205(2146928990), 1647125333);
      this.method_4581(var5, var2, var3, 1035889035);
      this.method_4472(var1, var5, var2, var3, var4, (short)1805);
   }

   // $FF: renamed from: ca (gq, int, int, float) void
   void method_4559(class_218 var1, int var2, int var3, float var4) {
      class_75 var5 = class_116.method_2248(var1.method_4205(2145365121), 1647125333);
      this.method_4581(var5, var2, var3, 1925448908);
      this.method_4472(var1, var5, var2, var3, var4, (short)5040);
   }

   // $FF: renamed from: cm (int, int, fm, gb, op[]) void
   void method_4560(int var1, int var2, class_226 var3, class_242 var4, class_66[] var5) {
      this.method_4477(var1, var2, var3, 665671703);
      this.method_4476(var1, var2, var3, var5, -427799310);
   }

   // $FF: renamed from: aa (int, int, int, int, fm) void
   void method_4561(int var1, int var2, int var3, int var4, class_226 var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         int var7 = var2;

         while(var7 < var2 + var4) {
            int var8 = 0;

            while(true) {
               if(var8 < var5.field_2550 * -1482547443) {
                  label93: {
                     class_223[] var9 = var5.field_2546[var8][var6][var7];
                     if(null != var9 && var9.length != 0) {
                        class_223[] var10 = var9;

                        for(int var11 = 0; var11 < var10.length; ++var11) {
                           class_87 var13;
                           boolean var14;
                           label58: {
                              class_223 var12 = var10[var11];
                              var13 = class_121.method_2269(var12.field_2521 * -1952293629, -2019676100);
                              if(var13.field_842 != null) {
                                 int[] var15 = var13.field_842;

                                 for(int var16 = 0; var16 < var15.length; ++var16) {
                                    int var17 = var15[var16];
                                    class_87 var18 = class_121.method_2269(var17, 403879625);
                                    if(var18.field_815 * 715137677 != -1) {
                                       var14 = true;
                                       break label58;
                                    }
                                 }
                              } else if(715137677 * var13.field_815 != -1) {
                                 var14 = true;
                                 break label58;
                              }

                              var14 = false;
                           }

                           if(var14) {
                              this.method_4530(var13, var8, var6, var7, var5, 256179092);
                              break label93;
                           }
                        }
                     }

                     ++var8;
                     continue;
                  }
               }

               ++var7;
               break;
            }
         }
      }

   }

   // $FF: renamed from: db (ew, int, int) void
   void method_4562(class_75 var1, int var2, int var3) {
      class_67 var4 = var1.method_1134(false, -2060838679);
      if(var4 != null) {
         int var5 = this.method_4522(var4, var1.field_617, 491939852);
         int var6 = this.method_4486(var4, var1.field_603, 416516198);
         var4.method_767(var2 + var5, var3 + var6);
      }

   }

   // $FF: renamed from: dz (gq, ew, int, int, float) void
   void method_4563(class_218 var1, class_75 var2, int var3, int var4, float var5) {
      class_237 var6 = var1.method_4206(258588451);
      if(null != var6) {
         if(var6.field_2643.method_4448(var5, 2063063360)) {
            class_69 var7 = (class_69)this.field_2606.get(var6.field_2643);
            var7.method_884(var6.field_2642, var3 - var6.field_2640 * -1781114869 / 2, var4, -1474744741 * var6.field_2640, 886076885 * var6.field_2641, 545733804 | var2.field_605 * 1016348217, 0, 1, 0, var7.field_522 / 2);
         }
      }
   }

   // $FF: renamed from: dj (gq, ew, int, int, float) void
   void method_4564(class_218 var1, class_75 var2, int var3, int var4, float var5) {
      class_237 var6 = var1.method_4206(50171355);
      if(null != var6) {
         if(var6.field_2643.method_4448(var5, 1595536972)) {
            class_69 var7 = (class_69)this.field_2606.get(var6.field_2643);
            var7.method_884(var6.field_2642, var3 - var6.field_2640 * -1781114869 / 2, var4, -1781114869 * var6.field_2640, -733130897 * var6.field_2641, -16777216 | var2.field_605 * 1016348217, 0, 1, 0, var7.field_522 / 2);
         }
      }
   }

   // $FF: renamed from: dr (gq, ew, int, int, float) void
   void method_4565(class_218 var1, class_75 var2, int var3, int var4, float var5) {
      class_237 var6 = var1.method_4206(1073259673);
      if(null != var6) {
         if(var6.field_2643.method_4448(var5, 245674076)) {
            class_69 var7 = (class_69)this.field_2606.get(var6.field_2643);
            var7.method_884(var6.field_2642, var3 - var6.field_2640 * 61688556 / 2, var4, 1780040350 * var6.field_2640, -445607085 * var6.field_2641, -16777216 | var2.field_605 * 1016348217, 0, 1, 0, var7.field_522 / 2);
         }
      }
   }

   // $FF: renamed from: di (gq, ew, int, int, float) void
   void method_4566(class_218 var1, class_75 var2, int var3, int var4, float var5) {
      class_237 var6 = var1.method_4206(-455733276);
      if(null != var6) {
         if(var6.field_2643.method_4448(var5, 1659989785)) {
            class_69 var7 = (class_69)this.field_2606.get(var6.field_2643);
            var7.method_884(var6.field_2642, var3 - var6.field_2640 * 741935416 / 2, var4, -1781114869 * var6.field_2640, -733130897 * var6.field_2641, -16777216 | var2.field_605 * 1016348217, 0, 1, 0, var7.field_522 / 2);
         }
      }
   }

   // $FF: renamed from: ba (jv) boolean
   boolean method_4567(class_306 var1) {
      this.field_2615.clear();
      if(null != this.field_2610) {
         this.field_2610.method_4293(var1, -2016400804);
         if(this.field_2610.method_4292((byte)25)) {
            this.method_4589(0, 0, 64, 64, this.field_2610, -2103924620);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var2 = true;

         Iterator var3;
         class_227 var4;
         for(var3 = this.field_2611.iterator(); var3.hasNext(); var2 &= var4.method_4292((byte)25)) {
            var4 = (class_227)var3.next();
            var4.method_4293(var1, -2102005618);
         }

         if(var2) {
            var3 = this.field_2611.iterator();

            while(var3.hasNext()) {
               var4 = (class_227)var3.next();
               this.method_4589(var4.method_4328(-1046926674) * 8, var4.method_4322(1801467534) * 8, 8, 8, var4, -1930460418);
            }
         }

         return var2;
      }
   }

   // $FF: renamed from: dk (int, int, java.util.HashSet, int) void
   void method_4568(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      Iterator var6 = this.field_2616.iterator();

      while(var6.hasNext()) {
         class_218 var7 = (class_218)var6.next();
         if(var7.method_4209(436110175)) {
            int var8 = var7.field_2482.field_3236 * 609013790 % -1277229536;
            int var9 = var7.field_2482.field_3235 * -1346280928 % 64;
            var7.field_2481 = (int)(var5 * (float)var8 + (float)var1) * 1501071807;
            var7.field_2479 = 858537425 * (int)((float)var2 + var5 * (float)(-338498427 - var9));
            if(!var3.contains(Integer.valueOf(var7.method_4205(2145761253)))) {
               this.method_4481(var7, -1196161028 * var7.field_2481, var7.field_2479 * -2004169701, var5, -348161646);
            }
         }
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
         throw class_223.method_4281(var22, "fq.v(" + ')');
      }
   }

   // $FF: renamed from: cu (int, int, java.util.HashSet, int) void
   void method_4570(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.field_2615.entrySet().iterator();

      while(var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         class_280 var9 = (class_280)var8.getKey();
         int var10 = (int)((float)(-2092998769 * var9.field_3236) * var5 + (float)var1 - var6);
         int var11 = (int)((float)(var2 + var4) - var5 * (float)(349527629 * var9.field_3235) - var6);
         class_218 var12 = (class_218)var8.getValue();
         if(var12 != null && var12.method_4209(190131334)) {
            var12.field_2481 = 1501071807 * var10;
            var12.field_2479 = 858537425 * var11;
            class_75 var13 = class_116.method_2248(var12.method_4205(2147034250), 1647125333);
            if(!var3.contains(Integer.valueOf(var13.method_1136(-1935207201)))) {
               this.method_4481(var12, var10, var11, var5, 1414642562);
            }
         }
      }

   }

   // $FF: renamed from: df (int, int, java.util.HashSet, int) void
   void method_4571(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      Iterator var6 = this.field_2616.iterator();

      while(var6.hasNext()) {
         class_218 var7 = (class_218)var6.next();
         if(var7.method_4209(-550313071)) {
            int var8 = var7.field_2482.field_3236 * -855091914 % -1870463551;
            int var9 = var7.field_2482.field_3235 * 349527629 % -575989955;
            var7.field_2481 = (int)(var5 * (float)var8 + (float)var1) * -1458676158;
            var7.field_2479 = -659046458 * (int)((float)var2 + var5 * (float)(63 - var9));
            if(!var3.contains(Integer.valueOf(var7.method_4205(2146322433)))) {
               this.method_4481(var7, -1679686427 * var7.field_2481, var7.field_2479 * -445509753, var5, -573509921);
            }
         }
      }

   }

   // $FF: renamed from: dh (ew) fv
   class_237 method_4572(class_75 var1) {
      if(null != var1.field_604 && this.field_2606 != null && this.field_2606.get(class_232.field_2594) != null) {
         class_232 var2 = class_232.method_4440(1154924047 * var1.field_599, 1629988561);
         if(null == var2) {
            return null;
         } else {
            class_69 var3 = (class_69)this.field_2606.get(var2);
            if(null == var3) {
               return null;
            } else {
               int var4 = var3.method_867(var1.field_604, 1000000);
               String[] var5 = new String[var4];
               var3.method_865(var1.field_604, (int[])null, var5);
               int var6 = var5.length * var3.field_522 / 2;
               int var7 = 0;
               String[] var8 = var5;

               for(int var9 = 0; var9 < var8.length; ++var9) {
                  String var10 = var8[var9];
                  int var11 = var3.method_885(var10);
                  if(var11 > var7) {
                     var7 = var11;
                  }
               }

               class_237 var10000 = new class_237(var1.field_604, var7, var6, var2);
               return var10000;
            }
         }
      } else {
         return null;
      }
   }

   // $FF: renamed from: dy (oh, en) int
   int method_4573(class_67 var1, class_213 var2) {
      switch(-161686761 * var2.field_2441) {
      case 0:
         return -var1.field_508 / 2;
      case 1:
         return 0;
      default:
         return -var1.field_508;
      }
   }

   // $FF: renamed from: dd (oh, en) int
   int method_4574(class_67 var1, class_213 var2) {
      switch(-161686761 * var2.field_2441) {
      case 0:
         return -var1.field_508 / 2;
      case 1:
         return 0;
      default:
         return -var1.field_508;
      }
   }

   // $FF: renamed from: da (oh, en) int
   int method_4575(class_67 var1, class_213 var2) {
      switch(434596772 * var2.field_2441) {
      case 0:
         return -var1.field_508 / 2;
      case 1:
         return 0;
      default:
         return -var1.field_508;
      }
   }

   // $FF: renamed from: dx (oh, em) int
   int method_4576(class_67 var1, class_212 var2) {
      switch(var2.field_2436 * 710830646) {
      case 0:
         return 0;
      case 1:
         return -var1.field_500 / 2;
      default:
         return -var1.field_500;
      }
   }

   // $FF: renamed from: dg (oh, em) int
   int method_4577(class_67 var1, class_212 var2) {
      switch(var2.field_2436 * -1115422857) {
      case 0:
         return 0;
      case 1:
         return -var1.field_500 / 2;
      default:
         return -var1.field_500;
      }
   }

   // $FF: renamed from: du (oh, em) int
   int method_4578(class_67 var1, class_212 var2) {
      switch(var2.field_2436 * -1918765839) {
      case 0:
         return 0;
      case 1:
         return -var1.field_500 / 2;
      default:
         return -var1.field_500;
      }
   }

   // $FF: renamed from: dt (int) fv
   class_237 method_4579(int var1) {
      class_75 var2 = class_116.method_2248(var1, 1647125333);
      return this.method_4488(var2, -2054665822);
   }

   // $FF: renamed from: dn (int) fv
   class_237 method_4580(int var1) {
      class_75 var2 = class_116.method_2248(var1, 1647125333);
      return this.method_4488(var2, -1628368049);
   }

   // $FF: renamed from: i (ew, int, int, int) void
   void method_4581(class_75 var1, int var2, int var3, int var4) {
      try {
         class_67 var5 = var1.method_1134(false, -2060838679);
         if(var5 != null) {
            if(var4 == 1712556332) {
               return;
            }

            int var6 = this.method_4522(var5, var1.field_617, 491939852);
            int var7 = this.method_4486(var5, var1.field_603, 1319342568);
            var5.method_767(var2 + var6, var3 + var7);
         }

      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "fq.i(" + ')');
      }
   }

   // $FF: renamed from: cl (ew, int, int) void
   void method_4582(class_75 var1, int var2, int var3) {
      class_67 var4 = var1.method_1134(false, -2060838679);
      if(var4 != null) {
         int var5 = this.method_4522(var4, var1.field_617, 491939852);
         int var6 = this.method_4486(var4, var1.field_603, 1214273532);
         var4.method_767(var2 + var5, var3 + var6);
      }

   }

   // $FF: renamed from: cf (int, int, fm, gb) void
   void method_4583(int var1, int var2, class_226 var3, class_242 var4) {
      for(int var5 = 1; var5 < var3.field_2550 * -1482547443; ++var5) {
         int var6 = var3.field_2554[var5][var1][var2] - 1;
         if(var6 > -1) {
            int var8 = -747005213 * this.field_2608;
            class_82 var9 = class_154.method_3249(var6, -1322482540);
            int var7;
            if(var9 == null) {
               var7 = var8;
            } else if(var9.field_761 * 1447154143 >= 0) {
               var7 = 1447154143 * var9.field_761 | -16777216;
            } else if(var9.field_759 * -1167855135 >= 0) {
               int var10 = class_239.method_4607(class_70.field_555.method_31(-1167855135 * var9.field_759, -1184856763), 96, (short)260);
               var7 = class_70.field_546[var10] | -16777216;
            } else if(16711935 == var9.field_762 * -313850043) {
               var7 = var8;
            } else {
               int var11 = 1593028731 * var9.field_758;
               int var12 = var9.field_764 * -1490944887;
               int var13 = 1914058459 * var9.field_769;
               if(var13 > 179) {
                  var12 /= 2;
               }

               if(var13 > 192) {
                  var12 /= 2;
               }

               if(var13 > 217) {
                  var12 /= 2;
               }

               if(var13 > 243) {
                  var12 /= 2;
               }

               int var14 = var13 / 2 + (var12 / 32 << 7) + (var11 / 4 << 10);
               int var15 = class_239.method_4607(var14, 96, (short)2686);
               var7 = class_70.field_546[var15] | -16777216;
            }

            if(0 == var3.field_2557[var5][var1][var2]) {
               class_65.method_681(var1 * this.field_2613 * 1359138405, (63 - var2) * 1359138405 * this.field_2613, 1359138405 * this.field_2613, this.field_2613 * 1359138405, var7);
            } else {
               var4.method_4651(var1 * this.field_2613 * 1359138405, (63 - var2) * 1359138405 * this.field_2613, 0, var7, 1359138405 * this.field_2613, 1359138405 * this.field_2613, var3.field_2557[var5][var1][var2], var3.field_2555[var5][var1][var2], (byte)89);
            }
         }
      }

   }

   // $FF: renamed from: de () java.util.List
   List method_4584() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.field_2616);
      var1.addAll(this.field_2615.values());
      return var1;
   }

   // $FF: renamed from: dp () java.util.List
   List method_4585() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.field_2616);
      var1.addAll(this.field_2615.values());
      return var1;
   }

   // $FF: renamed from: dm (int, int, int, int) void
   void method_4586(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if(0 == var3) {
         class_65.method_674(var1 * 1359138405 * this.field_2613, (63 - var2) * 1359138405 * this.field_2613, 1359138405 * this.field_2613, var4);
      }

      if(var3 == 1) {
         class_65.method_726(this.field_2613 * 1359138405 * var1, this.field_2613 * 1359138405 * (63 - var2), 1359138405 * this.field_2613, var4);
      }

      if(2 == var3) {
         class_65.method_674(var1 * 1359138405 * this.field_2613 + this.field_2613 * 1359138405 - 1, this.field_2613 * 1359138405 * (63 - var2), this.field_2613 * 1359138405, var4);
      }

      if(var3 == 3) {
         class_65.method_726(1359138405 * this.field_2613 * var1, this.field_2613 * 1359138405 + 1359138405 * this.field_2613 * (63 - var2) - 1, 1359138405 * this.field_2613, var4);
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

            for(var7 = var6.method_4328(483474001) * 8; var7 < var6.method_4328(-729357281) * 8 + 8; ++var7) {
               if(var4 == 3) {
                  return;
               }

               for(var8 = var6.method_4322(1137583127) * 8; var8 < var6.method_4322(738460707) * 8 + 8; ++var8) {
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

            for(var7 = var6.method_4328(1801895087) * 8; var7 < var6.method_4328(-1949596701) * 8 + 8; ++var7) {
               if(var4 == 3) {
                  throw new IllegalStateException();
               }

               for(var8 = var6.method_4322(1833178675) * 8; var8 < var6.method_4322(475611382) * 8 + 8; ++var8) {
                  this.method_4541(var7, var8, var6, var1, var2, (byte)44);
               }
            }
         }

      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9, "fq.e(" + ')');
      }
   }

   // $FF: renamed from: ec (int, int, int, int) void
   void method_4588(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if(0 == var3) {
         class_65.method_674(var1 * 1359138405 * this.field_2613, (63 - var2) * -2088600251 * this.field_2613, 1007577612 * this.field_2613, var4);
      }

      if(var3 == 1) {
         class_65.method_726(this.field_2613 * -2065836431 * var1, this.field_2613 * 1359138405 * (63 - var2), 1359138405 * this.field_2613, var4);
      }

      if(2 == var3) {
         class_65.method_674(var1 * 1359138405 * this.field_2613 + this.field_2613 * 1876725141 - 1, this.field_2613 * 1359138405 * (63 - var2), this.field_2613 * 1359138405, var4);
      }

      if(var3 == 3) {
         class_65.method_726(1885822048 * this.field_2613 * var1, this.field_2613 * 1359138405 + 1359138405 * this.field_2613 * (-114212702 - var2) - 1, 1359138405 * this.field_2613, var4);
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
         throw class_223.method_4281(var20, "fq.p(" + ')');
      }
   }
}
