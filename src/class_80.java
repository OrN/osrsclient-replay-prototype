
// $FF: renamed from: eq
public class class_80 extends class_59 {

   // $FF: renamed from: au int
   int field_697;
   // $FF: renamed from: ak int
   public int field_698;
   // $FF: renamed from: f int
   public static final int field_699 = 2;
   // $FF: renamed from: p int
   static final int field_700 = -2;
   // $FF: renamed from: d int
   public static int field_701;
   // $FF: renamed from: s hz
   static class_272 field_702;
   // $FF: renamed from: u hz
   static class_272 field_703;
   // $FF: renamed from: l hz
   static class_272 field_704;
   // $FF: renamed from: ae int
   public int field_705;
   // $FF: renamed from: e int
   int field_706;
   // $FF: renamed from: g java.lang.String
   public String field_707;
   // $FF: renamed from: n int
   public static final int field_708 = 1;
   // $FF: renamed from: k short[]
   public short[] field_709;
   // $FF: renamed from: m short[]
   public short[] field_710;
   // $FF: renamed from: x short[]
   public short[] field_711;
   // $FF: renamed from: af int[]
   int[] field_712;
   // $FF: renamed from: z int
   public int field_713;
   // $FF: renamed from: t int
   public int field_714;
   // $FF: renamed from: h int
   public int field_715;
   // $FF: renamed from: q int
   public int field_716;
   // $FF: renamed from: i int
   public int field_717;
   // $FF: renamed from: av int
   int field_718;
   // $FF: renamed from: ap int
   public int field_719;
   // $FF: renamed from: ab boolean
   public boolean field_720;
   // $FF: renamed from: al java.lang.String[]
   public String[] field_721;
   // $FF: renamed from: aj int
   int field_722;
   // $FF: renamed from: ar int
   int field_723;
   // $FF: renamed from: ag int
   int field_724;
   // $FF: renamed from: ax int
   int field_725;
   // $FF: renamed from: as int
   int field_726;
   // $FF: renamed from: am int
   int field_727;
   // $FF: renamed from: az int
   int field_728;
   // $FF: renamed from: an int
   int field_729;
   // $FF: renamed from: ad java.lang.String[]
   public String[] field_730;
   // $FF: renamed from: ac int
   int field_731;
   // $FF: renamed from: at int
   int field_732;
   // $FF: renamed from: w int
   public int field_733;
   // $FF: renamed from: bv int
   int field_734;
   // $FF: renamed from: aq int
   int field_735;
   // $FF: renamed from: aw int[]
   int[] field_736;
   // $FF: renamed from: ao int
   int field_737;
   // $FF: renamed from: bq int
   public int field_738;
   // $FF: renamed from: ah int
   int field_739;
   // $FF: renamed from: aa int
   int field_740;
   // $FF: renamed from: a short[]
   public short[] field_741;
   // $FF: renamed from: bd int
   public int field_742;
   // $FF: renamed from: ay int
   public int field_743;
   // $FF: renamed from: bt int
   public int field_744;
   // $FF: renamed from: v int
   public static final int field_745 = 0;
   // $FF: renamed from: bu mr
   class_369 field_746;
   // $FF: renamed from: bl boolean
   public boolean field_747;
   // $FF: renamed from: c int
   public int field_748;
   // $FF: renamed from: bm int
   int field_749;
   // $FF: renamed from: bz int
   public int field_750;
   // $FF: renamed from: bh int
   public int field_751;
   // $FF: renamed from: cg int
   public static int field_752;


   // $FF: renamed from: aw (int) gr
   public final class_92 method_1258(int var1) {
      if(this.field_736 != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.field_712[var3] && 0 != this.field_712[var3]) {
               var2 = this.field_736[var3];
            }
         }

         if(var2 != -1) {
            return class_299.method_5347(var2, -1388790937).method_1267(1, -193631053);
         }
      }

      class_92 var5 = (class_92)field_703.method_5065((long)(-882422617 * this.field_748));
      if(var5 != null) {
         return var5;
      } else {
         class_93 var6 = class_93.method_1708(class_331.field_3859, 645832578 * this.field_706, 0);
         if(null == var6) {
            return null;
         } else {
            if(2074539784 != this.field_740 * 378472370 || this.field_697 * 1266413231 != 128 || 128 != -1763015860 * this.field_729) {
               var6.method_1730(1366362761 * this.field_740, this.field_697 * -326185815, this.field_729 * 2121450408);
            }

            int var4;
            if(this.field_741 != null) {
               for(var4 = 0; var4 < this.field_741.length; ++var4) {
                  var6.method_1703(this.field_741[var4], this.field_709[var4]);
               }
            }

            if(null != this.field_710) {
               for(var4 = 0; var4 < this.field_710.length; ++var4) {
                  var6.method_1701(this.field_710[var4], this.field_711[var4]);
               }
            }

            var5 = var6.method_1711(1334548173 + -333382647 * this.field_742, this.field_744 * -512843981 + 768, -50, -10, -50);
            var5.field_938 = true;
            field_703.method_5064(var5, (long)(this.field_748 * -882422617));
            return var5;
         }
      }
   }

   // $FF: renamed from: n (int) void
   void method_1259(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "eq.n(" + ')');
      }
   }

   // $FF: renamed from: f (nd, int) void
   void method_1260(class_28 var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method_130(-1021441715);
            if(var3 == 0) {
               if(var2 <= -1236565275) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.method_1320(var1, var3, -610453643);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "eq.f(" + ')');
      }
   }

   // $FF: renamed from: ap () void
   void method_1261() {}

   // $FF: renamed from: p (eq, eq, byte) void
   void method_1262(class_80 var1, class_80 var2, byte var3) {
      try {
         this.field_706 = 1 * var1.field_706;
         this.field_713 = 1 * var1.field_713;
         this.field_733 = 1 * var1.field_733;
         this.field_714 = 1 * var1.field_714;
         this.field_715 = var1.field_715 * 1;
         this.field_716 = 1 * var1.field_716;
         this.field_717 = 1 * var1.field_717;
         this.field_741 = var1.field_741;
         this.field_709 = var1.field_709;
         this.field_710 = var1.field_710;
         this.field_711 = var1.field_711;
         this.field_707 = var2.field_707;
         this.field_720 = var2.field_720;
         this.field_719 = var2.field_719 * 1;
         this.field_705 = -1031660485;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "eq.p(" + ')');
      }
   }

   // $FF: renamed from: j (eq, eq, int) void
   void method_1263(class_80 var1, class_80 var2, int var3) {
      try {
         this.field_706 = var1.field_706 * 1;
         this.field_713 = 1 * var1.field_713;
         this.field_733 = var1.field_733 * 1;
         this.field_714 = 1 * var1.field_714;
         this.field_715 = var1.field_715 * 1;
         this.field_716 = var1.field_716 * 1;
         this.field_717 = var1.field_717 * 1;
         this.field_741 = var2.field_741;
         this.field_709 = var2.field_709;
         this.field_710 = var2.field_710;
         this.field_711 = var2.field_711;
         this.field_707 = var2.field_707;
         this.field_720 = var2.field_720;
         this.field_705 = var2.field_705 * 1;
         this.field_724 = var2.field_724 * 1;
         this.field_725 = 1 * var2.field_725;
         this.field_718 = var2.field_718 * 1;
         this.field_722 = 1 * var2.field_722;
         this.field_727 = var2.field_727 * 1;
         this.field_731 = 1 * var2.field_731;
         this.field_732 = var2.field_732 * 1;
         this.field_739 = var2.field_739 * 1;
         this.field_737 = 1 * var2.field_737;
         this.field_735 = var2.field_735 * 1;
         this.field_738 = 1 * var2.field_738;
         this.field_721 = var2.field_721;
         this.field_730 = new String[5];
         if(null != var2.field_730) {
            if(var3 != 2093027907) {
               throw new IllegalStateException();
            }

            for(int var4 = 0; var4 < 4; ++var4) {
               if(var3 != 2093027907) {
                  return;
               }

               this.field_730[var4] = var2.field_730[var4];
            }
         }

         this.field_730[4] = class_305.field_3595;
         this.field_719 = 0;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "eq.j(" + ')');
      }
   }

   // $FF: renamed from: ab () void
   void method_1264() {}

   // $FF: renamed from: bx () void
   public static void method_1265() {
      field_702.method_5074();
      field_703.method_5074();
      field_704.method_5074();
   }

   // $FF: renamed from: bm (boolean) boolean
   public final boolean method_1266(boolean var1) {
      int var2 = 2115221939 * this.field_732;
      int var3 = this.field_739 * 1899720535;
      if(var1) {
         var2 = this.field_737 * 1556168093;
         var3 = this.field_735 * -337083769;
      }

      if(var2 == -1) {
         return true;
      } else {
         boolean var4 = true;
         if(!class_331.field_3859.method_5383(var2, 0, (byte)105)) {
            var4 = false;
         }

         if(-1 != var3 && !class_331.field_3859.method_5383(var3, 0, (byte)69)) {
            var4 = false;
         }

         return var4;
      }
   }

   // $FF: renamed from: d (int, int) gr
   public final class_92 method_1267(int var1, int var2) {
      try {
         if(this.field_736 != null && var1 > 1) {
            int var3 = -1;

            for(int var4 = 0; var4 < 10; ++var4) {
               if(var2 >= 1583721836) {
                  throw new IllegalStateException();
               }

               if(var1 >= this.field_712[var4] && 0 != this.field_712[var4]) {
                  if(var2 >= 1583721836) {
                     throw new IllegalStateException();
                  }

                  var3 = this.field_736[var4];
               }
            }

            if(var3 != -1) {
               if(var2 >= 1583721836) {
                  throw new IllegalStateException();
               }

               return class_299.method_5347(var3, -198787981).method_1267(1, -1523643132);
            }
         }

         class_92 var7 = (class_92)field_703.method_5065((long)(-882422617 * this.field_748));
         if(var7 != null) {
            return var7;
         } else {
            class_93 var8 = class_93.method_1708(class_331.field_3859, -1212146295 * this.field_706, 0);
            if(null == var8) {
               if(var2 >= 1583721836) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               label104: {
                  if(128 == this.field_740 * 1366362761) {
                     if(var2 >= 1583721836) {
                        throw new IllegalStateException();
                     }

                     if(this.field_697 * -1651193245 == 128) {
                        if(var2 >= 1583721836) {
                           throw new IllegalStateException();
                        }

                        if(128 == -867000627 * this.field_729) {
                           break label104;
                        }

                        if(var2 >= 1583721836) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  var8.method_1730(1366362761 * this.field_740, this.field_697 * -1651193245, this.field_729 * -867000627);
               }

               int var5;
               if(this.field_741 != null) {
                  for(var5 = 0; var5 < this.field_741.length; ++var5) {
                     var8.method_1703(this.field_741[var5], this.field_709[var5]);
                  }
               }

               if(null != this.field_710) {
                  if(var2 >= 1583721836) {
                     throw new IllegalStateException();
                  }

                  for(var5 = 0; var5 < this.field_710.length; ++var5) {
                     if(var2 >= 1583721836) {
                        throw new IllegalStateException();
                     }

                     var8.method_1701(this.field_710[var5], this.field_711[var5]);
                  }
               }

               var7 = var8.method_1711(64 + -333382647 * this.field_742, this.field_744 * -512843981 + 768, -50, -10, -50);
               var7.field_938 = true;
               field_703.method_5064(var7, (long)(this.field_748 * -882422617));
               return var7;
            }
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "eq.d(" + ')');
      }
   }

   // $FF: renamed from: <init> () void
   void method_105() {
      try {
         super.method_105();
         this.field_707 = class_305.field_3410;
         this.field_713 = -804765840;
         this.field_733 = 0;
         this.field_714 = 0;
         this.field_715 = 0;
         this.field_716 = 0;
         this.field_717 = 0;
         this.field_705 = 0;
         this.field_719 = 227172335;
         this.field_720 = false;
         this.field_721 = new String[]{null, null, class_305.field_3403, null, null};
         this.field_730 = new String[]{null, null, null, null, class_305.field_3404};
         this.field_723 = 1211679818;
         this.field_724 = -618428769;
         this.field_725 = -1754970571;
         this.field_726 = 0;
         this.field_722 = -378137877;
         this.field_727 = -18725913;
         this.field_728 = 0;
         this.field_718 = -1453592671;
         this.field_731 = -429285441;
         this.field_732 = -642882939;
         this.field_739 = -266267751;
         this.field_737 = -796537013;
         this.field_735 = 407464395;
         this.field_698 = -1615762991;
         this.field_743 = -495435323;
         this.field_740 = 264625280;
         this.field_697 = 1342416256;
         this.field_729 = -1858141568;
         this.field_742 = 0;
         this.field_744 = 0;
         this.field_738 = 0;
         this.field_747 = false;
         this.field_734 = 62272401;
         this.field_749 = -1956322155;
         this.field_750 = 942165519;
         this.field_751 = -921032403;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "eq.<init>(" + ')');
      }
   }

   // $FF: renamed from: o (boolean, int) gm
   public final class_93 method_1268(boolean var1, int var2) {
      try {
         int var3 = this.field_724 * 461761185;
         int var4 = -2090621981 * this.field_725;
         int var5 = this.field_718 * 1265781663;
         if(var1) {
            if(var2 >= -1118211459) {
               throw new IllegalStateException();
            }

            var3 = this.field_722 * 1881995837;
            var4 = 264233001 * this.field_727;
            var5 = this.field_731 * -459952191;
         }

         if(var3 == -1) {
            if(var2 >= -1118211459) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            class_93 var6 = class_93.method_1708(class_331.field_3859, var3, 0);
            if(var4 != -1) {
               if(var2 >= -1118211459) {
                  throw new IllegalStateException();
               }

               class_93 var7 = class_93.method_1708(class_331.field_3859, var4, 0);
               class_93 var10000;
               if(var5 != -1) {
                  if(var2 >= -1118211459) {
                     throw new IllegalStateException();
                  }

                  class_93 var8 = class_93.method_1708(class_331.field_3859, var5, 0);
                  class_93[] var9 = new class_93[]{var6, var7, var8};
                  var10000 = new class_93;
                  var10000.method_1704(var9, 3);
                  var6 = var10000;
               } else {
                  class_93[] var12 = new class_93[]{var6, var7};
                  var10000 = new class_93;
                  var10000.method_1704(var12, 2);
                  var6 = var10000;
               }
            }

            if(!var1 && this.field_726 * 2017655331 != 0) {
               if(var2 >= -1118211459) {
                  throw new IllegalStateException();
               }

               var6.method_1715(0, this.field_726 * 2017655331, 0);
            }

            if(var1) {
               if(var2 >= -1118211459) {
                  throw new IllegalStateException();
               }

               if(0 != 237060879 * this.field_728) {
                  if(var2 >= -1118211459) {
                     throw new IllegalStateException();
                  }

                  var6.method_1715(0, this.field_728 * 237060879, 0);
               }
            }

            int var11;
            if(this.field_741 != null) {
               if(var2 >= -1118211459) {
                  throw new IllegalStateException();
               }

               for(var11 = 0; var11 < this.field_741.length; ++var11) {
                  var6.method_1703(this.field_741[var11], this.field_709[var11]);
               }
            }

            if(this.field_710 != null) {
               if(var2 >= -1118211459) {
                  throw new IllegalStateException();
               }

               for(var11 = 0; var11 < this.field_710.length; ++var11) {
                  if(var2 >= -1118211459) {
                     throw new IllegalStateException();
                  }

                  var6.method_1701(this.field_710[var11], this.field_711[var11]);
               }
            }

            return var6;
         }
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10, "eq.o(" + ')');
      }
   }

   // $FF: renamed from: c (boolean, int) boolean
   public final boolean method_1269(boolean var1, int var2) {
      try {
         int var3 = 2115221939 * this.field_732;
         int var4 = this.field_739 * 1899720535;
         if(var1) {
            if(var2 == 443444821) {
               throw new IllegalStateException();
            }

            var3 = this.field_737 * 1556168093;
            var4 = this.field_735 * 586976285;
         }

         if(var3 == -1) {
            if(var2 == 443444821) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            boolean var5 = true;
            if(!class_331.field_3859.method_5383(var3, 0, (byte)13)) {
               var5 = false;
            }

            if(-1 != var4) {
               if(var2 == 443444821) {
                  throw new IllegalStateException();
               }

               if(!class_331.field_3859.method_5383(var4, 0, (byte)20)) {
                  if(var2 == 443444821) {
                     throw new IllegalStateException();
                  }

                  var5 = false;
               }
            }

            return var5;
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "eq.c(" + ')');
      }
   }

   // $FF: renamed from: e (boolean, byte) gm
   public final class_93 method_1270(boolean var1, byte var2) {
      try {
         int var3 = 2115221939 * this.field_732;
         int var4 = this.field_739 * 1899720535;
         if(var1) {
            if(var2 != 10) {
               throw new IllegalStateException();
            }

            var3 = 1556168093 * this.field_737;
            var4 = this.field_735 * 586976285;
         }

         if(-1 == var3) {
            if(var2 != 10) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            class_93 var5 = class_93.method_1708(class_331.field_3859, var3, 0);
            if(var4 != -1) {
               if(var2 != 10) {
                  throw new IllegalStateException();
               }

               class_93 var6 = class_93.method_1708(class_331.field_3859, var4, 0);
               class_93[] var7 = new class_93[]{var5, var6};
               class_93 var10000 = new class_93;
               var10000.method_1704(var7, 2);
               var5 = var10000;
            }

            int var9;
            if(this.field_741 != null) {
               if(var2 != 10) {
                  throw new IllegalStateException();
               }

               for(var9 = 0; var9 < this.field_741.length; ++var9) {
                  if(var2 != 10) {
                     throw new IllegalStateException();
                  }

                  var5.method_1703(this.field_741[var9], this.field_709[var9]);
               }
            }

            if(this.field_710 != null) {
               if(var2 != 10) {
                  throw new IllegalStateException();
               }

               for(var9 = 0; var9 < this.field_710.length; ++var9) {
                  if(var2 != 10) {
                     throw new IllegalStateException();
                  }

                  var5.method_1701(this.field_710[var9], this.field_711[var9]);
               }
            }

            return var5;
         }
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "eq.e(" + ')');
      }
   }

   // $FF: renamed from: g (int, int, byte) int
   public int method_1271(int var1, int var2, byte var3) {
      try {
         return class_174.method_3723(this.field_746, var1, var2, -1798951655);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "eq.g(" + ')');
      }
   }

   // $FF: renamed from: s (int, short) eq
   public class_80 method_1272(int var1, short var2) {
      try {
         if(this.field_736 != null) {
            if(var2 != 312) {
               throw new IllegalStateException();
            }

            if(var1 > 1) {
               if(var2 != 312) {
                  throw new IllegalStateException();
               }

               int var3 = -1;

               for(int var4 = 0; var4 < 10; ++var4) {
                  if(var2 != 312) {
                     throw new IllegalStateException();
                  }

                  if(var1 >= this.field_712[var4] && 0 != this.field_712[var4]) {
                     if(var2 != 312) {
                        throw new IllegalStateException();
                     }

                     var3 = this.field_736[var4];
                  }
               }

               if(var3 != -1) {
                  if(var2 != 312) {
                     throw new IllegalStateException();
                  }

                  return class_299.method_5347(var3, -992359076);
               }
            }
         }

         return this;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "eq.s(" + ')');
      }
   }

   // $FF: renamed from: k (int) int
   public int method_1273(int var1) {
      try {
         if(-1244064173 * this.field_723 != -1) {
            if(var1 != 1596135449) {
               throw new IllegalStateException();
            }

            if(null != this.field_730) {
               if(this.field_723 * -1244064173 >= 0) {
                  if(var1 != 1596135449) {
                     throw new IllegalStateException();
                  }

                  int var3;
                  if(this.field_730[this.field_723 * -1244064173] != null) {
                     if(var1 != 1596135449) {
                        throw new IllegalStateException();
                     }

                     var3 = this.field_723 * -1244064173;
                  } else {
                     var3 = -1;
                  }

                  return var3;
               }

               byte var10000;
               if(class_305.field_3404.equalsIgnoreCase(this.field_730[4])) {
                  if(var1 != 1596135449) {
                     throw new IllegalStateException();
                  }

                  var10000 = 4;
               } else {
                  var10000 = -1;
               }

               return var10000;
            }
         }

         return -1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "eq.k(" + ')');
      }
   }

   // $FF: renamed from: w (short) boolean
   boolean method_1274(short var1) {
      try {
         boolean var10000;
         if(this.field_709 != null) {
            if(var1 >= 3113) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "eq.w(" + ')');
      }
   }

   // $FF: renamed from: t (int) boolean
   boolean method_1275(int var1) {
      try {
         boolean var10000;
         if(this.field_711 != null) {
            if(var1 != 604113686) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "eq.t(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_1276() {
      class_272 var10000 = new class_272;
      var10000.method_5063(64);
      field_702 = var10000;
      var10000 = new class_272;
      var10000.method_5063(50);
      field_703 = var10000;
      var10000 = new class_272;
      var10000.method_5063(200);
      field_704 = var10000;
   }

   // $FF: renamed from: h (int) eq
   public static class_80 method_1277(int var0) {
      class_80 var1 = (class_80)field_702.method_5065((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class_368.field_4096.method_5381(10, var0, -26460885);
         class_80 var10000 = new class_80;
         var10000.method_105();
         var1 = var10000;
         var1.field_748 = -31876329 * var0;
         if(var2 != null) {
            class_28 var10001 = new class_28;
            var10001.method_178(var2);
            var1.method_1260(var10001, -1124272514);
         }

         var1.method_1259(-1154831575);
         if(-1 != 168192755 * var1.field_743) {
            var1.method_1262(class_299.method_5347(var1.field_743 * -672574031, -583780593), class_299.method_5347(1027633359 * var1.field_698, -515513005), (byte)112);
         }

         if(-1893254845 * var1.field_749 != -1) {
            var1.method_1263(class_299.method_5347(var1.field_749 * -1893254845, -1022330050), class_299.method_5347(var1.field_734 * 1817336115, -1797706890), 2093027907);
         }

         if(var1.field_751 * 384128102 != -1) {
            var1.method_1301(class_299.method_5347(var1.field_751 * 65353918, -951876513), class_299.method_5347(var1.field_750 * -775442367, -246705588), 1129712786);
         }

         if(!class_49.field_363 && var1.field_720) {
            var1.field_707 = class_305.field_3621;
            var1.field_747 = false;
            var1.field_721 = null;
            var1.field_730 = null;
            var1.field_723 = -1014546047;
            var1.field_738 = 0;
            if(null != var1.field_746) {
               boolean var3 = false;

               for(class_27 var4 = var1.field_746.method_6584(); null != var4; var4 = var1.field_746.method_6585()) {
                  class_86 var5 = class_190.method_3948((int)var4.field_9, 1846278875);
                  if(var5.field_800) {
                     var4.method_108();
                  } else {
                     var3 = true;
                  }
               }

               if(!var3) {
                  var1.field_746 = null;
               }
            }
         }

         field_702.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: q (int) eq
   public static class_80 method_1278(int var0) {
      class_80 var1 = (class_80)field_702.method_5065((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class_368.field_4096.method_5381(10, var0, -26460885);
         class_80 var10000 = new class_80;
         var10000.method_105();
         var1 = var10000;
         var1.field_748 = -31876329 * var0;
         if(var2 != null) {
            class_28 var10001 = new class_28;
            var10001.method_178(var2);
            var1.method_1260(var10001, -1151710764);
         }

         var1.method_1259(-1728386477);
         if(-1 != 168192755 * var1.field_743) {
            var1.method_1262(class_299.method_5347(var1.field_743 * 168192755, -1370793243), class_299.method_5347(-1107870022 * var1.field_698, 558434521), (byte)74);
         }

         if(-1893254845 * var1.field_749 != -1) {
            var1.method_1263(class_299.method_5347(var1.field_749 * -137908496, -1146004172), class_299.method_5347(var1.field_734 * -1249308017, -1704611162), 2093027907);
         }

         if(var1.field_751 * 1689317723 != -1) {
            var1.method_1301(class_299.method_5347(var1.field_751 * 954574277, 272182630), class_299.method_5347(var1.field_750 * 1418551207, -1868461261), 1493607213);
         }

         if(!class_49.field_363 && var1.field_720) {
            var1.field_707 = class_305.field_3621;
            var1.field_747 = false;
            var1.field_721 = null;
            var1.field_730 = null;
            var1.field_723 = -1541643739;
            var1.field_738 = 0;
            if(null != var1.field_746) {
               boolean var3 = false;

               for(class_27 var4 = var1.field_746.method_6584(); null != var4; var4 = var1.field_746.method_6585()) {
                  class_86 var5 = class_190.method_3948((int)var4.field_9, 499699450);
                  if(var5.field_800) {
                     var4.method_108();
                  } else {
                     var3 = true;
                  }
               }

               if(!var3) {
                  var1.field_746 = null;
               }
            }
         }

         field_702.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: by () boolean
   boolean method_1279() {
      return this.field_709 != null;
   }

   // $FF: renamed from: ae () void
   void method_1280() {}

   // $FF: renamed from: ag (eq, eq) void
   void method_1281(class_80 var1, class_80 var2) {
      this.field_706 = 1 * var1.field_706;
      this.field_713 = 1 * var1.field_713;
      this.field_733 = 1 * var1.field_733;
      this.field_714 = 1 * var1.field_714;
      this.field_715 = var1.field_715 * 1;
      this.field_716 = 1 * var1.field_716;
      this.field_717 = 1 * var1.field_717;
      this.field_741 = var1.field_741;
      this.field_709 = var1.field_709;
      this.field_710 = var1.field_710;
      this.field_711 = var1.field_711;
      this.field_707 = var2.field_707;
      this.field_720 = var2.field_720;
      this.field_719 = var2.field_719 * 1;
      this.field_705 = 362143867;
   }

   // $FF: renamed from: bc () boolean
   boolean method_1282() {
      return this.field_709 != null;
   }

   // $FF: renamed from: al (nd) void
   void method_1283(class_28 var1) {
      while(true) {
         int var2 = var1.method_130(-959614456);
         if(var2 == 0) {
            return;
         }

         this.method_1320(var1, var2, -1094424589);
      }
   }

   // $FF: renamed from: a (int, java.lang.String, short) java.lang.String
   public String method_1284(int var1, String var2, short var3) {
      try {
         return class_346.method_6180(this.field_746, var1, var2, (byte)51);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "eq.a(" + ')');
      }
   }

   // $FF: renamed from: ai (nd) void
   void method_1285(class_28 var1) {
      while(true) {
         int var2 = var1.method_130(-1124303449);
         if(var2 == 0) {
            return;
         }

         this.method_1320(var1, var2, 1930918980);
      }
   }

   // $FF: renamed from: ar (nd, int) void
   void method_1286(class_28 var1, int var2) {
      if(var2 == 1) {
         this.field_706 = var1.method_132((byte)-3) * -250386247;
      } else if(var2 == 2) {
         this.field_707 = var1.method_139(-391631059);
      } else if(4 == var2) {
         this.field_713 = var1.method_132((byte)-91) * -988244861;
      } else if(var2 == 5) {
         this.field_733 = var1.method_132((byte)-18) * -1441384969;
      } else if(var2 == 6) {
         this.field_714 = var1.method_132((byte)-68) * 1109200445;
      } else if(var2 == 7) {
         this.field_716 = var1.method_132((byte)-62) * -1305702203;
         if(-538415603 * this.field_716 > 32767) {
            this.field_716 -= -1866137600;
         }
      } else if(var2 == 8) {
         this.field_717 = var1.method_132((byte)-12) * 1947011915;
         if(this.field_717 * 1139180428 > 32767) {
            this.field_717 -= 189464576;
         }
      } else if(11 == var2) {
         this.field_705 = 1727155667;
      } else if(12 == var2) {
         this.field_719 = var1.method_135((byte)-63) * 227172335;
      } else if(16 == var2) {
         this.field_720 = true;
      } else if(23 == var2) {
         this.field_724 = var1.method_132((byte)-53) * 618428769;
         this.field_726 = var1.method_130(1085098871) * 830113163;
      } else if(var2 == 24) {
         this.field_725 = var1.method_132((byte)-37) * -1616493665;
      } else if(25 == var2) {
         this.field_722 = var1.method_132((byte)-53) * 378137877;
         this.field_728 = var1.method_130(1772855472) * -958182417;
      } else if(26 == var2) {
         this.field_727 = var1.method_132((byte)-108) * 18725913;
      } else if(var2 >= 30 && var2 < 35) {
         this.field_721[var2 - 30] = var1.method_139(-391631059);
         if(this.field_721[var2 - 30].equalsIgnoreCase(class_305.field_3405)) {
            this.field_721[var2 - 30] = null;
         }
      } else if(var2 >= 35 && var2 < -264447476) {
         this.field_730[var2 - -628202485] = var1.method_139(-391631059);
      } else {
         int var3;
         int var4;
         if(-2145759707 == var2) {
            var3 = var1.method_130(-635891442);
            this.field_741 = new short[var3];
            this.field_709 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field_741[var4] = (short)var1.method_132((byte)-55);
               this.field_709[var4] = (short)var1.method_132((byte)-44);
            }
         } else if(41 == var2) {
            var3 = var1.method_130(-1306442512);
            this.field_710 = new short[var3];
            this.field_711 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field_710[var4] = (short)var1.method_132((byte)-38);
               this.field_711[var4] = (short)var1.method_132((byte)-30);
            }
         } else if(42 == var2) {
            this.field_723 = var1.method_131((byte)-22) * 125712102;
         } else if(65 == var2) {
            this.field_747 = true;
         } else if(var2 == 392327446) {
            this.field_718 = var1.method_132((byte)-1) * 1453592671;
         } else if(79 == var2) {
            this.field_731 = var1.method_132((byte)-107) * -204342989;
         } else if(var2 == 90) {
            this.field_732 = var1.method_132((byte)-115) * -1445094571;
         } else if(var2 == 91) {
            this.field_737 = var1.method_132((byte)-95) * 796537013;
         } else if(92 == var2) {
            this.field_739 = var1.method_132((byte)-92) * 1007503466;
         } else if(93 == var2) {
            this.field_735 = var1.method_132((byte)-90) * 1877388735;
         } else if(var2 == -1676847891) {
            this.field_715 = var1.method_132((byte)-61) * -1213187159;
         } else if(var2 == 97) {
            this.field_698 = var1.method_132((byte)-52) * 1615762991;
         } else if(98 == var2) {
            this.field_743 = var1.method_132((byte)-60) * -2103626922;
         } else if(var2 >= 100 && var2 < -889544502) {
            if(this.field_736 == null) {
               this.field_736 = new int[10];
               this.field_712 = new int[10];
            }

            this.field_736[var2 - -560871651] = var1.method_132((byte)-2);
            this.field_712[var2 - 1425307615] = var1.method_132((byte)-4);
         } else if(var2 == 110) {
            this.field_740 = var1.method_132((byte)-126) * 129301244;
         } else if(111 == var2) {
            this.field_697 = var1.method_132((byte)-57) * -2103441589;
         } else if(1985582746 == var2) {
            this.field_729 = var1.method_132((byte)-109) * 1159888389;
         } else if(var2 == 113) {
            this.field_742 = var1.method_131((byte)-25) * -507162055;
         } else if(var2 == 114) {
            this.field_744 = var1.method_131((byte)-127) * -1469299737;
         } else if(var2 == 115) {
            this.field_738 = var1.method_130(833544520) * -1741147681;
         } else if(-595027500 == var2) {
            this.field_734 = var1.method_132((byte)-51) * -62272401;
         } else if(var2 == 140) {
            this.field_749 = var1.method_132((byte)-62) * 1042814678;
         } else if(var2 == -2014400893) {
            this.field_750 = var1.method_132((byte)-112) * -557681461;
         } else if(149 == var2) {
            this.field_751 = var1.method_132((byte)-98) * 921032403;
         } else if(249 == var2) {
            this.field_746 = class_325.method_5781(var1, this.field_746, -391561047);
         }
      }

   }

   // $FF: renamed from: br (int, java.lang.String) java.lang.String
   public String method_1287(int var1, String var2) {
      return class_346.method_6180(this.field_746, var1, var2, (byte)45);
   }

   // $FF: renamed from: bn () void
   public static void method_1288() {
      field_704.method_5074();
   }

   // $FF: renamed from: as (eq, eq) void
   void method_1289(class_80 var1, class_80 var2) {
      this.field_706 = var1.field_706 * 1;
      this.field_713 = 1 * var1.field_713;
      this.field_733 = var1.field_733 * 1;
      this.field_714 = 1 * var1.field_714;
      this.field_715 = var1.field_715 * 1;
      this.field_716 = var1.field_716 * 1;
      this.field_717 = var1.field_717 * 1;
      this.field_741 = var2.field_741;
      this.field_709 = var2.field_709;
      this.field_710 = var2.field_710;
      this.field_711 = var2.field_711;
      this.field_707 = var2.field_707;
      this.field_720 = var2.field_720;
      this.field_705 = var2.field_705 * 1;
      this.field_724 = var2.field_724 * 1;
      this.field_725 = 1 * var2.field_725;
      this.field_718 = var2.field_718 * 1;
      this.field_722 = 1 * var2.field_722;
      this.field_727 = var2.field_727 * 1;
      this.field_731 = 1 * var2.field_731;
      this.field_732 = var2.field_732 * 1;
      this.field_739 = var2.field_739 * 1;
      this.field_737 = 1 * var2.field_737;
      this.field_735 = var2.field_735 * 1;
      this.field_738 = 1 * var2.field_738;
      this.field_721 = var2.field_721;
      this.field_730 = new String[5];
      if(null != var2.field_730) {
         for(int var3 = 0; var3 < 4; ++var3) {
            this.field_730[var3] = var2.field_730[var3];
         }
      }

      this.field_730[4] = class_305.field_3595;
      this.field_719 = 0;
   }

   // $FF: renamed from: aj (eq, eq) void
   void method_1290(class_80 var1, class_80 var2) {
      this.field_706 = var1.field_706 * 1;
      this.field_713 = 1 * var1.field_713;
      this.field_733 = var1.field_733 * 1;
      this.field_714 = 1 * var1.field_714;
      this.field_715 = var1.field_715 * 1;
      this.field_716 = var1.field_716 * 1;
      this.field_717 = var1.field_717 * 1;
      this.field_741 = var2.field_741;
      this.field_709 = var2.field_709;
      this.field_710 = var2.field_710;
      this.field_711 = var2.field_711;
      this.field_707 = var2.field_707;
      this.field_720 = var2.field_720;
      this.field_705 = var2.field_705 * 1;
      this.field_724 = var2.field_724 * 1;
      this.field_725 = 1 * var2.field_725;
      this.field_718 = var2.field_718 * 1;
      this.field_722 = 1 * var2.field_722;
      this.field_727 = var2.field_727 * 1;
      this.field_731 = 1 * var2.field_731;
      this.field_732 = var2.field_732 * 1;
      this.field_739 = var2.field_739 * 1;
      this.field_737 = 1 * var2.field_737;
      this.field_735 = var2.field_735 * 1;
      this.field_738 = 1 * var2.field_738;
      this.field_721 = var2.field_721;
      this.field_730 = new String[5];
      if(null != var2.field_730) {
         for(int var3 = 0; var3 < 4; ++var3) {
            this.field_730[var3] = var2.field_730[var3];
         }
      }

      this.field_730[4] = class_305.field_3595;
      this.field_719 = 0;
   }

   // $FF: renamed from: am (eq, eq) void
   void method_1291(class_80 var1, class_80 var2) {
      this.field_706 = var1.field_706 * 1;
      this.field_713 = 1 * var1.field_713;
      this.field_733 = var1.field_733 * 1;
      this.field_714 = 1 * var1.field_714;
      this.field_715 = var1.field_715 * 1;
      this.field_716 = var1.field_716 * 1;
      this.field_717 = var1.field_717 * 1;
      this.field_741 = var2.field_741;
      this.field_709 = var2.field_709;
      this.field_710 = var2.field_710;
      this.field_711 = var2.field_711;
      this.field_707 = var2.field_707;
      this.field_720 = var2.field_720;
      this.field_705 = var2.field_705 * 1;
      this.field_724 = var2.field_724 * 1;
      this.field_725 = 1 * var2.field_725;
      this.field_718 = var2.field_718 * 1;
      this.field_722 = 1 * var2.field_722;
      this.field_727 = var2.field_727 * 1;
      this.field_731 = 1 * var2.field_731;
      this.field_732 = var2.field_732 * 1;
      this.field_739 = var2.field_739 * 1;
      this.field_737 = 1 * var2.field_737;
      this.field_735 = var2.field_735 * 1;
      this.field_738 = 1 * var2.field_738;
      this.field_721 = var2.field_721;
      this.field_730 = new String[5];
      if(null != var2.field_730) {
         for(int var3 = 0; var3 < 4; ++var3) {
            this.field_730[var3] = var2.field_730[var3];
         }
      }

      this.field_730[4] = class_305.field_3595;
      this.field_719 = 0;
   }

   // $FF: renamed from: bj () void
   public static void method_1292() {
      field_702.method_5074();
      field_703.method_5074();
      field_704.method_5074();
   }

   // $FF: renamed from: aa (int, int, int, int, int, boolean) oh
   public static final class_67 method_1293(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if(var1 == -1) {
         var4 = 0;
      } else if(var4 == 2 && 1 != var1) {
         var4 = 1;
      }

      long var6 = ((long)var3 << 42) + ((long)var4 << 40) + (long)var0 + ((long)var1 << 16) + ((long)var2 << 38);
      class_67 var8;
      if(!var5) {
         var8 = (class_67)field_704.method_5065(var6);
         if(null != var8) {
            return var8;
         }
      }

      class_80 var9 = class_299.method_5347(var0, -384145704);
      if(var1 > 1 && var9.field_736 != null) {
         int var10 = -1;

         for(int var11 = 0; var11 < 10; ++var11) {
            if(var1 >= var9.field_712[var11] && 0 != var9.field_712[var11]) {
               var10 = var9.field_736[var11];
            }
         }

         if(var10 != -1) {
            var9 = class_299.method_5347(var10, -1409759350);
         }
      }

      class_92 var21 = var9.method_1267(1, -71598512);
      if(null == var21) {
         return null;
      } else {
         class_67 var22 = null;
         if(-1 != var9.field_743 * 168192755) {
            var22 = class_271.method_5060(var9.field_698 * 1027633359, 10, 1, 0, 0, true, 1965074157);
            if(null == var22) {
               return null;
            }
         } else if(var9.field_749 * -1893254845 != -1) {
            var22 = class_271.method_5060(-1249308017 * var9.field_734, var1, var2, var3, 0, false, 1890292051);
            if(var22 == null) {
               return null;
            }
         } else if(var9.field_751 * 1689317723 != -1) {
            var22 = class_271.method_5060(var9.field_750 * 1563500305, var1, 0, 0, 0, false, 881838640);
            if(null == var22) {
               return null;
            }
         }

         int[] var12 = class_65.field_490;
         int var13 = class_65.field_484;
         int var14 = class_65.field_486;
         int[] var15 = new int[4];
         class_65.method_655(var15);
         class_67 var10000 = new class_67;
         var10000.method_754(36, 32);
         var8 = var10000;
         class_65.method_656(var8.field_502, 36, 32);
         class_65.method_662();
         class_70.method_968();
         class_70.method_971(16, 16);
         class_70.field_556 = false;
         if(1689317723 * var9.field_751 != -1) {
            var22.method_767(0, 0);
         }

         int var16 = 1180916267 * var9.field_713;
         if(var5) {
            var16 = (int)((double)var16 * 1.5D);
         } else if(var2 == 2) {
            var16 = (int)((double)var16 * 1.04D);
         }

         int var17 = class_70.field_548[143465415 * var9.field_733] * var16 >> 16;
         int var18 = class_70.field_559[var9.field_733 * 143465415] * var16 >> 16;
         var21.method_1621();
         var21.method_1686(0, 10451221 * var9.field_714, var9.field_715 * -1707042663, 143465415 * var9.field_733, -538415603 * var9.field_716, var17 + 267422413 * var21.field_911 / 2 + -1515805085 * var9.field_717, var18 + -1515805085 * var9.field_717);
         if(var9.field_749 * -1893254845 != -1) {
            var22.method_767(0, 0);
         }

         if(var2 >= 1) {
            var8.method_763(1);
         }

         if(var2 >= 2) {
            var8.method_763(16777215);
         }

         if(var3 != 0) {
            var8.method_764(var3);
         }

         class_65.method_656(var8.field_502, 36, 32);
         if(-1 != var9.field_743 * 168192755) {
            var22.method_767(0, 0);
         }

         if(var4 == 1 || 2 == var4 && -1049731853 * var9.field_705 == 1) {
            class_69 var19 = class_322.field_3809;
            String var20;
            if(var1 < 100000) {
               var20 = "<col=ffff00>" + var1 + "</col>";
            } else if(var1 < 10000000) {
               var20 = "<col=ffffff>" + var1 / 1000 + class_305.field_3463 + "</col>";
            } else {
               var20 = "<col=00ff80>" + var1 / 1000000 + class_305.field_3409 + "</col>";
            }

            var19.method_869(var20, 0, 9, 16776960, 1);
         }

         if(!var5) {
            field_704.method_5064(var8, var6);
         }

         class_65.method_656(var12, var13, var14);
         class_65.method_690(var15);
         class_70.method_968();
         class_70.field_556 = true;
         return var8;
      }
   }

   // $FF: renamed from: ac (int) gm
   public final class_93 method_1294(int var1) {
      int var3;
      if(this.field_736 != null && var1 > 1) {
         int var2 = -1;

         for(var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.field_712[var3] && this.field_712[var3] != 0) {
               var2 = this.field_736[var3];
            }
         }

         if(var2 != -1) {
            return class_299.method_5347(var2, -1155471507).method_1316(1, 191038261);
         }
      }

      class_93 var4 = class_93.method_1708(class_331.field_3859, 1050924339 * this.field_706, 0);
      if(null == var4) {
         return null;
      } else {
         if(128 != 1366362761 * this.field_740 || -1011923392 * this.field_697 != 128 || -1451972427 != this.field_729 * -867000627) {
            var4.method_1730(-65441181 * this.field_740, this.field_697 * -1006253797, this.field_729 * 164690556);
         }

         if(null != this.field_741) {
            for(var3 = 0; var3 < this.field_741.length; ++var3) {
               var4.method_1703(this.field_741[var3], this.field_709[var3]);
            }
         }

         if(this.field_710 != null) {
            for(var3 = 0; var3 < this.field_710.length; ++var3) {
               var4.method_1701(this.field_710[var3], this.field_711[var3]);
            }
         }

         return var4;
      }
   }

   // $FF: renamed from: at (int) gm
   public final class_93 method_1295(int var1) {
      int var3;
      if(this.field_736 != null && var1 > 1) {
         int var2 = -1;

         for(var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.field_712[var3] && this.field_712[var3] != 0) {
               var2 = this.field_736[var3];
            }
         }

         if(var2 != -1) {
            return class_299.method_5347(var2, -1077721469).method_1316(1, 907773858);
         }
      }

      class_93 var4 = class_93.method_1708(class_331.field_3859, -1212146295 * this.field_706, 0);
      if(null == var4) {
         return null;
      } else {
         if(128 != 1366362761 * this.field_740 || -1651193245 * this.field_697 != 128 || 128 != this.field_729 * -867000627) {
            var4.method_1730(1366362761 * this.field_740, this.field_697 * -1651193245, this.field_729 * -867000627);
         }

         if(null != this.field_741) {
            for(var3 = 0; var3 < this.field_741.length; ++var3) {
               var4.method_1703(this.field_741[var3], this.field_709[var3]);
            }
         }

         if(this.field_710 != null) {
            for(var3 = 0; var3 < this.field_710.length; ++var3) {
               var4.method_1701(this.field_710[var3], this.field_711[var3]);
            }
         }

         return var4;
      }
   }

   // $FF: renamed from: ah (int) gr
   public final class_92 method_1296(int var1) {
      if(this.field_736 != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.field_712[var3] && 0 != this.field_712[var3]) {
               var2 = this.field_736[var3];
            }
         }

         if(var2 != -1) {
            return class_299.method_5347(var2, -1870644538).method_1267(1, 155631812);
         }
      }

      class_92 var5 = (class_92)field_703.method_5065((long)(-882422617 * this.field_748));
      if(var5 != null) {
         return var5;
      } else {
         class_93 var6 = class_93.method_1708(class_331.field_3859, -1212146295 * this.field_706, 0);
         if(null == var6) {
            return null;
         } else {
            if(128 != this.field_740 * 1366362761 || this.field_697 * -1651193245 != 128 || 128 != -867000627 * this.field_729) {
               var6.method_1730(1366362761 * this.field_740, this.field_697 * -1651193245, this.field_729 * -867000627);
            }

            int var4;
            if(this.field_741 != null) {
               for(var4 = 0; var4 < this.field_741.length; ++var4) {
                  var6.method_1703(this.field_741[var4], this.field_709[var4]);
               }
            }

            if(null != this.field_710) {
               for(var4 = 0; var4 < this.field_710.length; ++var4) {
                  var6.method_1701(this.field_710[var4], this.field_711[var4]);
               }
            }

            var5 = var6.method_1711(64 + -333382647 * this.field_742, this.field_744 * -512843981 + 768, -50, -10, -50);
            var5.field_938 = true;
            field_703.method_5064(var5, (long)(this.field_748 * -882422617));
            return var5;
         }
      }
   }

   // $FF: renamed from: l (boolean, byte) boolean
   public final boolean method_1297(boolean var1, byte var2) {
      try {
         int var3 = this.field_724 * 461761185;
         int var4 = this.field_725 * -2090621981;
         int var5 = this.field_718 * 1265781663;
         if(var1) {
            var3 = this.field_722 * 1881995837;
            var4 = this.field_727 * 264233001;
            var5 = -459952191 * this.field_731;
         }

         if(var3 == -1) {
            return true;
         } else {
            boolean var6 = true;
            if(!class_331.field_3859.method_5383(var3, 0, (byte)70)) {
               if(var2 == 16) {
                  throw new IllegalStateException();
               }

               var6 = false;
            }

            if(var4 != -1 && !class_331.field_3859.method_5383(var4, 0, (byte)35)) {
               if(var2 == 16) {
                  throw new IllegalStateException();
               }

               var6 = false;
            }

            if(-1 != var5) {
               if(var2 == 16) {
                  throw new IllegalStateException();
               }

               if(!class_331.field_3859.method_5383(var5, 0, (byte)116)) {
                  if(var2 == 16) {
                     throw new IllegalStateException();
                  }

                  var6 = false;
               }
            }

            return var6;
         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "eq.l(" + ')');
      }
   }

   // $FF: renamed from: au (int, int, int, int, int, boolean) oh
   public static final class_67 method_1298(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if(var1 == -1) {
         var4 = 0;
      } else if(var4 == 2 && 1 != var1) {
         var4 = 1;
      }

      long var6 = ((long)var3 << 42) + ((long)var4 << 1676775960) + (long)var0 + ((long)var1 << 16) + ((long)var2 << 38);
      class_67 var8;
      if(!var5) {
         var8 = (class_67)field_704.method_5065(var6);
         if(null != var8) {
            return var8;
         }
      }

      class_80 var9 = class_299.method_5347(var0, -1102965412);
      if(var1 > 1 && var9.field_736 != null) {
         int var10 = -1;

         for(int var11 = 0; var11 < 10; ++var11) {
            if(var1 >= var9.field_712[var11] && 0 != var9.field_712[var11]) {
               var10 = var9.field_736[var11];
            }
         }

         if(var10 != -1) {
            var9 = class_299.method_5347(var10, 148639774);
         }
      }

      class_92 var21 = var9.method_1267(1, -1816270085);
      if(null == var21) {
         return null;
      } else {
         class_67 var22 = null;
         if(-1 != var9.field_743 * -1177512850) {
            var22 = class_271.method_5060(var9.field_698 * 1027633359, 10, 1, 0, 0, true, 1592884728);
            if(null == var22) {
               return null;
            }
         } else if(var9.field_749 * -1893254845 != -1) {
            var22 = class_271.method_5060(-1249308017 * var9.field_734, var1, var2, var3, 0, false, 541738505);
            if(var22 == null) {
               return null;
            }
         } else if(var9.field_751 * -772417054 != -1) {
            var22 = class_271.method_5060(var9.field_750 * -1600229255, var1, 0, 0, 0, false, 1232128391);
            if(null == var22) {
               return null;
            }
         }

         int[] var12 = class_65.field_490;
         int var13 = class_65.field_484;
         int var14 = class_65.field_486;
         int[] var15 = new int[4];
         class_65.method_655(var15);
         class_67 var10000 = new class_67;
         var10000.method_754(-2018074252, -1625217917);
         var8 = var10000;
         class_65.method_656(var8.field_502, -2049483367, 1260138724);
         class_65.method_662();
         class_70.method_968();
         class_70.method_971(16, 16);
         class_70.field_556 = false;
         if(2028815975 * var9.field_751 != -1) {
            var22.method_767(0, 0);
         }

         int var16 = -2105277012 * var9.field_713;
         if(var5) {
            var16 = (int)((double)var16 * 1.5D);
         } else if(var2 == 2) {
            var16 = (int)((double)var16 * 1.04D);
         }

         int var17 = class_70.field_548[990226171 * var9.field_733] * var16 >> 16;
         int var18 = class_70.field_559[var9.field_733 * -40981009] * var16 >> 16;
         var21.method_1621();
         var21.method_1686(0, 10451221 * var9.field_714, var9.field_715 * 733635216, 643915458 * var9.field_733, -538415603 * var9.field_716, var17 + 1603754278 * var21.field_911 / 2 + -912017550 * var9.field_717, var18 + -1858944453 * var9.field_717);
         if(var9.field_749 * -882813378 != -1) {
            var22.method_767(0, 0);
         }

         if(var2 >= 1) {
            var8.method_763(1);
         }

         if(var2 >= 2) {
            var8.method_763(823059397);
         }

         if(var3 != 0) {
            var8.method_764(var3);
         }

         class_65.method_656(var8.field_502, 1845174955, 32);
         if(-1 != var9.field_743 * -1923239704) {
            var22.method_767(0, 0);
         }

         if(var4 == 1 || 2 == var4 && 1499355989 * var9.field_705 == 1) {
            class_69 var19 = class_322.field_3809;
            String var20;
            if(var1 < 117506106) {
               var20 = "<col=ffff00>" + var1 + "</col>";
            } else if(var1 < 10000000) {
               var20 = "<col=ffffff>" + var1 / 1000 + class_305.field_3463 + "</col>";
            } else {
               var20 = "<col=00ff80>" + var1 / 1000000 + class_305.field_3409 + "</col>";
            }

            var19.method_869(var20, 0, 9, -1066720389, 1);
         }

         if(!var5) {
            field_704.method_5064(var8, var6);
         }

         class_65.method_656(var12, var13, var14);
         class_65.method_690(var15);
         class_70.method_968();
         class_70.field_556 = true;
         return var8;
      }
   }

   // $FF: renamed from: aq (int) gr
   public final class_92 method_1299(int var1) {
      if(this.field_736 != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.field_712[var3] && 0 != this.field_712[var3]) {
               var2 = this.field_736[var3];
            }
         }

         if(var2 != -1) {
            return class_299.method_5347(var2, -121776400).method_1267(1, 864683457);
         }
      }

      class_92 var5 = (class_92)field_703.method_5065((long)(-882422617 * this.field_748));
      if(var5 != null) {
         return var5;
      } else {
         class_93 var6 = class_93.method_1708(class_331.field_3859, -1212146295 * this.field_706, 0);
         if(null == var6) {
            return null;
         } else {
            if(128 != this.field_740 * 1366362761 || this.field_697 * -1651193245 != 128 || 128 != -867000627 * this.field_729) {
               var6.method_1730(1366362761 * this.field_740, this.field_697 * -1651193245, this.field_729 * -867000627);
            }

            int var4;
            if(this.field_741 != null) {
               for(var4 = 0; var4 < this.field_741.length; ++var4) {
                  var6.method_1703(this.field_741[var4], this.field_709[var4]);
               }
            }

            if(null != this.field_710) {
               for(var4 = 0; var4 < this.field_710.length; ++var4) {
                  var6.method_1701(this.field_710[var4], this.field_711[var4]);
               }
            }

            var5 = var6.method_1711(64 + -333382647 * this.field_742, this.field_744 * -512843981 + 768, -50, -10, -50);
            var5.field_938 = true;
            field_703.method_5064(var5, (long)(this.field_748 * -882422617));
            return var5;
         }
      }
   }

   // $FF: renamed from: af (int) gr
   public final class_92 method_1300(int var1) {
      if(this.field_736 != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.field_712[var3] && 0 != this.field_712[var3]) {
               var2 = this.field_736[var3];
            }
         }

         if(var2 != -1) {
            return class_299.method_5347(var2, 523910301).method_1267(1, 1508758974);
         }
      }

      class_92 var5 = (class_92)field_703.method_5065((long)(-882422617 * this.field_748));
      if(var5 != null) {
         return var5;
      } else {
         class_93 var6 = class_93.method_1708(class_331.field_3859, 1851836313 * this.field_706, 0);
         if(null == var6) {
            return null;
         } else {
            if(192228056 != this.field_740 * 1366362761 || this.field_697 * -1651193245 != 880859979 || -1128539099 != 348023282 * this.field_729) {
               var6.method_1730(1366362761 * this.field_740, this.field_697 * -1651193245, this.field_729 * -867000627);
            }

            int var4;
            if(this.field_741 != null) {
               for(var4 = 0; var4 < this.field_741.length; ++var4) {
                  var6.method_1703(this.field_741[var4], this.field_709[var4]);
               }
            }

            if(null != this.field_710) {
               for(var4 = 0; var4 < this.field_710.length; ++var4) {
                  var6.method_1701(this.field_710[var4], this.field_711[var4]);
               }
            }

            var5 = var6.method_1711(-835931145 + -333382647 * this.field_742, this.field_744 * 1475568311 + -324360184, -698002247, -10, -470683258);
            var5.field_938 = true;
            field_703.method_5064(var5, (long)(this.field_748 * -882422617));
            return var5;
         }
      }
   }

   // $FF: renamed from: r (eq, eq, int) void
   void method_1301(class_80 var1, class_80 var2, int var3) {
      try {
         this.field_706 = 1 * var1.field_706;
         this.field_713 = 1 * var1.field_713;
         this.field_733 = var1.field_733 * 1;
         this.field_714 = var1.field_714 * 1;
         this.field_715 = 1 * var1.field_715;
         this.field_716 = var1.field_716 * 1;
         this.field_717 = var1.field_717 * 1;
         this.field_741 = var1.field_741;
         this.field_709 = var1.field_709;
         this.field_710 = var1.field_710;
         this.field_711 = var1.field_711;
         this.field_705 = 1 * var1.field_705;
         this.field_707 = var2.field_707;
         this.field_719 = 0;
         this.field_720 = false;
         this.field_747 = false;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "eq.r(" + ')');
      }
   }

   // $FF: renamed from: ay (int) eq
   public class_80 method_1302(int var1) {
      if(this.field_736 != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.field_712[var3] && 0 != this.field_712[var3]) {
               var2 = this.field_736[var3];
            }
         }

         if(var2 != -1) {
            return class_299.method_5347(var2, -471472003);
         }
      }

      return this;
   }

   // $FF: renamed from: cd () boolean
   boolean method_1303() {
      return this.field_711 != null;
   }

   // $FF: renamed from: bu (boolean) gm
   public final class_93 method_1304(boolean var1) {
      int var2 = this.field_724 * 461761185;
      int var3 = -2090621981 * this.field_725;
      int var4 = this.field_718 * 1265781663;
      if(var1) {
         var2 = this.field_722 * 1881995837;
         var3 = 264233001 * this.field_727;
         var4 = this.field_731 * -459952191;
      }

      if(var2 == -1) {
         return null;
      } else {
         class_93 var5 = class_93.method_1708(class_331.field_3859, var2, 0);
         if(var3 != -1) {
            class_93 var6 = class_93.method_1708(class_331.field_3859, var3, 0);
            class_93 var10000;
            if(var4 != -1) {
               class_93 var7 = class_93.method_1708(class_331.field_3859, var4, 0);
               class_93[] var8 = new class_93[]{var5, var6, var7};
               var10000 = new class_93;
               var10000.method_1704(var8, 3);
               var5 = var10000;
            } else {
               class_93[] var10 = new class_93[]{var5, var6};
               var10000 = new class_93;
               var10000.method_1704(var10, 2);
               var5 = var10000;
            }
         }

         if(!var1 && this.field_726 * 2017655331 != 0) {
            var5.method_1715(0, this.field_726 * 2017655331, 0);
         }

         if(var1 && 0 != 237060879 * this.field_728) {
            var5.method_1715(0, this.field_728 * 237060879, 0);
         }

         int var9;
         if(this.field_741 != null) {
            for(var9 = 0; var9 < this.field_741.length; ++var9) {
               var5.method_1703(this.field_741[var9], this.field_709[var9]);
            }
         }

         if(this.field_710 != null) {
            for(var9 = 0; var9 < this.field_710.length; ++var9) {
               var5.method_1701(this.field_710[var9], this.field_711[var9]);
            }
         }

         return var5;
      }
   }

   // $FF: renamed from: an (int, int, int, int, int, boolean) oh
   public static final class_67 method_1305(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if(var1 == -1) {
         var4 = 0;
      } else if(var4 == 2 && 1 != var1) {
         var4 = 1;
      }

      long var6 = ((long)var3 << 1091323417) + ((long)var4 << -214626016) + (long)var0 + ((long)var1 << 16) + ((long)var2 << 38);
      class_67 var8;
      if(!var5) {
         var8 = (class_67)field_704.method_5065(var6);
         if(null != var8) {
            return var8;
         }
      }

      class_80 var9 = class_299.method_5347(var0, -1082725899);
      if(var1 > 1 && var9.field_736 != null) {
         int var10 = -1;

         for(int var11 = 0; var11 < 10; ++var11) {
            if(var1 >= var9.field_712[var11] && 0 != var9.field_712[var11]) {
               var10 = var9.field_736[var11];
            }
         }

         if(var10 != -1) {
            var9 = class_299.method_5347(var10, 502264200);
         }
      }

      class_92 var21 = var9.method_1267(1, -693510735);
      if(null == var21) {
         return null;
      } else {
         class_67 var22 = null;
         if(-1 != var9.field_743 * 168192755) {
            var22 = class_271.method_5060(var9.field_698 * -696166350, 10, 1, 0, 0, true, 783205741);
            if(null == var22) {
               return null;
            }
         } else if(var9.field_749 * -57137480 != -1) {
            var22 = class_271.method_5060(-1700983199 * var9.field_734, var1, var2, var3, 0, false, 2083980735);
            if(var22 == null) {
               return null;
            }
         } else if(var9.field_751 * 1689317723 != -1) {
            var22 = class_271.method_5060(var9.field_750 * 1563500305, var1, 0, 0, 0, false, 1083837086);
            if(null == var22) {
               return null;
            }
         }

         int[] var12 = class_65.field_490;
         int var13 = class_65.field_484;
         int var14 = class_65.field_486;
         int[] var15 = new int[4];
         class_65.method_655(var15);
         class_67 var10000 = new class_67;
         var10000.method_754(36, 32);
         var8 = var10000;
         class_65.method_656(var8.field_502, 36, 32);
         class_65.method_662();
         class_70.method_968();
         class_70.method_971(16, 16);
         class_70.field_556 = false;
         if(1607244715 * var9.field_751 != -1) {
            var22.method_767(0, 0);
         }

         int var16 = -609211234 * var9.field_713;
         if(var5) {
            var16 = (int)((double)var16 * 1.5D);
         } else if(var2 == 2) {
            var16 = (int)((double)var16 * 1.04D);
         }

         int var17 = class_70.field_548[-491696160 * var9.field_733] * var16 >> 16;
         int var18 = class_70.field_559[var9.field_733 * 1370247833] * var16 >> 16;
         var21.method_1621();
         var21.method_1686(0, 10451221 * var9.field_714, var9.field_715 * 285167491, 143465415 * var9.field_733, -1913904226 * var9.field_716, var17 + 267422413 * var21.field_911 / 2 + -1515805085 * var9.field_717, var18 + -1515805085 * var9.field_717);
         if(var9.field_749 * 1205547377 != -1) {
            var22.method_767(0, 0);
         }

         if(var2 >= 1) {
            var8.method_763(1);
         }

         if(var2 >= 2) {
            var8.method_763(-745274726);
         }

         if(var3 != 0) {
            var8.method_764(var3);
         }

         class_65.method_656(var8.field_502, -1775827522, -1968255841);
         if(-1 != var9.field_743 * 168192755) {
            var22.method_767(0, 0);
         }

         if(var4 == 1 || 2 == var4 && -1049731853 * var9.field_705 == 1) {
            class_69 var19 = class_322.field_3809;
            String var20;
            if(var1 < 100000) {
               var20 = "<col=ffff00>" + var1 + "</col>";
            } else if(var1 < 1118970098) {
               var20 = "<col=ffffff>" + var1 / 1000 + class_305.field_3463 + "</col>";
            } else {
               var20 = "<col=00ff80>" + var1 / -1582946742 + class_305.field_3409 + "</col>";
            }

            var19.method_869(var20, 0, 9, 16776960, 1);
         }

         if(!var5) {
            field_704.method_5064(var8, var6);
         }

         class_65.method_656(var12, var13, var14);
         class_65.method_690(var15);
         class_70.method_968();
         class_70.field_556 = true;
         return var8;
      }
   }

   // $FF: renamed from: bd (int, int, int, int, int, boolean) oh
   public static final class_67 method_1306(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if(var1 == -1) {
         var4 = 0;
      } else if(var4 == 2 && 1 != var1) {
         var4 = 1;
      }

      long var6 = ((long)var3 << -716760486) + ((long)var4 << -422863561) + (long)var0 + ((long)var1 << 16) + ((long)var2 << 38);
      class_67 var8;
      if(!var5) {
         var8 = (class_67)field_704.method_5065(var6);
         if(null != var8) {
            return var8;
         }
      }

      class_80 var9 = class_299.method_5347(var0, -308388106);
      if(var1 > 1 && var9.field_736 != null) {
         int var10 = -1;

         for(int var11 = 0; var11 < 10; ++var11) {
            if(var1 >= var9.field_712[var11] && 0 != var9.field_712[var11]) {
               var10 = var9.field_736[var11];
            }
         }

         if(var10 != -1) {
            var9 = class_299.method_5347(var10, -2100775608);
         }
      }

      class_92 var21 = var9.method_1267(1, -282984900);
      if(null == var21) {
         return null;
      } else {
         class_67 var22 = null;
         if(-1 != var9.field_743 * 168192755) {
            var22 = class_271.method_5060(var9.field_698 * -1921918446, 10, 1, 0, 0, true, 1783234333);
            if(null == var22) {
               return null;
            }
         } else if(var9.field_749 * -1893254845 != -1) {
            var22 = class_271.method_5060(-1249308017 * var9.field_734, var1, var2, var3, 0, false, 953195118);
            if(var22 == null) {
               return null;
            }
         } else if(var9.field_751 * 1689317723 != -1) {
            var22 = class_271.method_5060(var9.field_750 * 1563500305, var1, 0, 0, 0, false, 993841648);
            if(null == var22) {
               return null;
            }
         }

         int[] var12 = class_65.field_490;
         int var13 = class_65.field_484;
         int var14 = class_65.field_486;
         int[] var15 = new int[4];
         class_65.method_655(var15);
         class_67 var10000 = new class_67;
         var10000.method_754(1428129032, 32);
         var8 = var10000;
         class_65.method_656(var8.field_502, 36, 32);
         class_65.method_662();
         class_70.method_968();
         class_70.method_971(16, 16);
         class_70.field_556 = false;
         if(1340802368 * var9.field_751 != -1) {
            var22.method_767(0, 0);
         }

         int var16 = 1180916267 * var9.field_713;
         if(var5) {
            var16 = (int)((double)var16 * 1.5D);
         } else if(var2 == 2) {
            var16 = (int)((double)var16 * 1.04D);
         }

         int var17 = class_70.field_548[-855667881 * var9.field_733] * var16 >> 16;
         int var18 = class_70.field_559[var9.field_733 * -1710911377] * var16 >> 16;
         var21.method_1621();
         var21.method_1686(0, 10451221 * var9.field_714, var9.field_715 * 1953625002, 143465415 * var9.field_733, -538415603 * var9.field_716, var17 + 591865310 * var21.field_911 / 2 + -1515805085 * var9.field_717, var18 + -1515805085 * var9.field_717);
         if(var9.field_749 * -1893254845 != -1) {
            var22.method_767(0, 0);
         }

         if(var2 >= 1) {
            var8.method_763(1);
         }

         if(var2 >= 2) {
            var8.method_763(16777215);
         }

         if(var3 != 0) {
            var8.method_764(var3);
         }

         class_65.method_656(var8.field_502, 36, -802270153);
         if(-1 != var9.field_743 * 168192755) {
            var22.method_767(0, 0);
         }

         if(var4 == 1 || 2 == var4 && 1318233509 * var9.field_705 == 1) {
            class_69 var19 = class_322.field_3809;
            String var20;
            if(var1 < 100000) {
               var20 = "<col=ffff00>" + var1 + "</col>";
            } else if(var1 < -739296560) {
               var20 = "<col=ffffff>" + var1 / -466662082 + class_305.field_3463 + "</col>";
            } else {
               var20 = "<col=00ff80>" + var1 / 1000000 + class_305.field_3409 + "</col>";
            }

            var19.method_869(var20, 0, 9, 16776960, 1);
         }

         if(!var5) {
            field_704.method_5064(var8, var6);
         }

         class_65.method_656(var12, var13, var14);
         class_65.method_690(var15);
         class_70.method_968();
         class_70.field_556 = true;
         return var8;
      }
   }

   // $FF: renamed from: bt (boolean) boolean
   public final boolean method_1307(boolean var1) {
      int var2 = this.field_724 * 461761185;
      int var3 = this.field_725 * -2090621981;
      int var4 = this.field_718 * 1265781663;
      if(var1) {
         var2 = this.field_722 * 1881995837;
         var3 = this.field_727 * 264233001;
         var4 = -459952191 * this.field_731;
      }

      if(var2 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if(!class_331.field_3859.method_5383(var2, 0, (byte)90)) {
            var5 = false;
         }

         if(var3 != -1 && !class_331.field_3859.method_5383(var3, 0, (byte)110)) {
            var5 = false;
         }

         if(-1 != var4 && !class_331.field_3859.method_5383(var4, 0, (byte)98)) {
            var5 = false;
         }

         return var5;
      }
   }

   // $FF: renamed from: ax (eq, eq) void
   void method_1308(class_80 var1, class_80 var2) {
      this.field_706 = 1 * var1.field_706;
      this.field_713 = 1 * var1.field_713;
      this.field_733 = 1 * var1.field_733;
      this.field_714 = 1 * var1.field_714;
      this.field_715 = var1.field_715 * 1;
      this.field_716 = 1 * var1.field_716;
      this.field_717 = 1 * var1.field_717;
      this.field_741 = var1.field_741;
      this.field_709 = var1.field_709;
      this.field_710 = var1.field_710;
      this.field_711 = var1.field_711;
      this.field_707 = var2.field_707;
      this.field_720 = var2.field_720;
      this.field_719 = var2.field_719 * 1;
      this.field_705 = -1031660485;
   }

   // $FF: renamed from: cm () boolean
   boolean method_1309() {
      return this.field_711 != null;
   }

   // $FF: renamed from: bl (boolean) boolean
   public final boolean method_1310(boolean var1) {
      int var2 = -2039231501 * this.field_732;
      int var3 = this.field_739 * 1305434646;
      if(var1) {
         var2 = this.field_737 * 1556168093;
         var3 = this.field_735 * 586976285;
      }

      if(var2 == -1) {
         return true;
      } else {
         boolean var4 = true;
         if(!class_331.field_3859.method_5383(var2, 0, (byte)101)) {
            var4 = false;
         }

         if(-1 != var3 && !class_331.field_3859.method_5383(var3, 0, (byte)107)) {
            var4 = false;
         }

         return var4;
      }
   }

   // $FF: renamed from: bv (boolean) boolean
   public final boolean method_1311(boolean var1) {
      int var2 = 2115221939 * this.field_732;
      int var3 = this.field_739 * 1899720535;
      if(var1) {
         var2 = this.field_737 * 1556168093;
         var3 = this.field_735 * -751076629;
      }

      if(var2 == -1) {
         return true;
      } else {
         boolean var4 = true;
         if(!class_331.field_3859.method_5383(var2, 0, (byte)114)) {
            var4 = false;
         }

         if(-1 != var3 && !class_331.field_3859.method_5383(var3, 0, (byte)86)) {
            var4 = false;
         }

         return var4;
      }
   }

   // $FF: renamed from: i () void
   void method_1312() {}

   // $FF: renamed from: bz (boolean) boolean
   public final boolean method_1313(boolean var1) {
      int var2 = 2115221939 * this.field_732;
      int var3 = this.field_739 * -196024329;
      if(var1) {
         var2 = this.field_737 * 1556168093;
         var3 = this.field_735 * 586976285;
      }

      if(var2 == -1) {
         return true;
      } else {
         boolean var4 = true;
         if(!class_331.field_3859.method_5383(var2, 0, (byte)62)) {
            var4 = false;
         }

         if(-1 != var3 && !class_331.field_3859.method_5383(var3, 0, (byte)63)) {
            var4 = false;
         }

         return var4;
      }
   }

   // $FF: renamed from: bh (boolean) gm
   public final class_93 method_1314(boolean var1) {
      int var2 = 2115221939 * this.field_732;
      int var3 = this.field_739 * 1899720535;
      if(var1) {
         var2 = 1454860922 * this.field_737;
         var3 = this.field_735 * 2080544288;
      }

      if(-1 == var2) {
         return null;
      } else {
         class_93 var4 = class_93.method_1708(class_331.field_3859, var2, 0);
         if(var3 != -1) {
            class_93 var5 = class_93.method_1708(class_331.field_3859, var3, 0);
            class_93[] var6 = new class_93[]{var4, var5};
            class_93 var10000 = new class_93;
            var10000.method_1704(var6, 2);
            var4 = var10000;
         }

         int var7;
         if(this.field_741 != null) {
            for(var7 = 0; var7 < this.field_741.length; ++var7) {
               var4.method_1703(this.field_741[var7], this.field_709[var7]);
            }
         }

         if(this.field_710 != null) {
            for(var7 = 0; var7 < this.field_710.length; ++var7) {
               var4.method_1701(this.field_710[var7], this.field_711[var7]);
            }
         }

         return var4;
      }
   }

   // $FF: renamed from: bs (int, int) int
   public int method_1315(int var1, int var2) {
      return class_174.method_3723(this.field_746, var1, var2, -2051018107);
   }

   // $FF: renamed from: b (int, int) gm
   public final class_93 method_1316(int var1, int var2) {
      try {
         int var4;
         if(this.field_736 != null && var1 > 1) {
            if(var2 <= -280712354) {
               throw new IllegalStateException();
            }

            int var3 = -1;

            for(var4 = 0; var4 < 10; ++var4) {
               if(var2 <= -280712354) {
                  throw new IllegalStateException();
               }

               if(var1 >= this.field_712[var4]) {
                  if(var2 <= -280712354) {
                     throw new IllegalStateException();
                  }

                  if(this.field_712[var4] != 0) {
                     if(var2 <= -280712354) {
                        throw new IllegalStateException();
                     }

                     var3 = this.field_736[var4];
                  }
               }
            }

            if(var3 != -1) {
               if(var2 <= -280712354) {
                  throw new IllegalStateException();
               }

               return class_299.method_5347(var3, -1724896088).method_1316(1, 1820694562);
            }
         }

         class_93 var6 = class_93.method_1708(class_331.field_3859, -1212146295 * this.field_706, 0);
         if(null == var6) {
            if(var2 <= -280712354) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            label104: {
               if(128 == 1366362761 * this.field_740 && -1651193245 * this.field_697 == 128) {
                  if(var2 <= -280712354) {
                     throw new IllegalStateException();
                  }

                  if(128 == this.field_729 * -867000627) {
                     break label104;
                  }

                  if(var2 <= -280712354) {
                     throw new IllegalStateException();
                  }
               }

               var6.method_1730(1366362761 * this.field_740, this.field_697 * -1651193245, this.field_729 * -867000627);
            }

            if(null != this.field_741) {
               if(var2 <= -280712354) {
                  throw new IllegalStateException();
               }

               for(var4 = 0; var4 < this.field_741.length; ++var4) {
                  var6.method_1703(this.field_741[var4], this.field_709[var4]);
               }
            }

            if(this.field_710 != null) {
               if(var2 <= -280712354) {
                  throw new IllegalStateException();
               }

               for(var4 = 0; var4 < this.field_710.length; ++var4) {
                  if(var2 <= -280712354) {
                     throw new IllegalStateException();
                  }

                  var6.method_1701(this.field_710[var4], this.field_711[var4]);
               }
            }

            return var6;
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "eq.b(" + ')');
      }
   }

   // $FF: renamed from: bf (int, java.lang.String) java.lang.String
   public String method_1317(int var1, String var2) {
      return class_346.method_6180(this.field_746, var1, var2, (byte)127);
   }

   // $FF: renamed from: ba (int, java.lang.String) java.lang.String
   public String method_1318(int var1, String var2) {
      return class_346.method_6180(this.field_746, var1, var2, (byte)74);
   }

   // $FF: renamed from: be () int
   public int method_1319() {
      return -1244064173 * this.field_723 != -1 && null != this.field_730?(this.field_723 * -1244064173 >= 0?(this.field_730[this.field_723 * -1244064173] != null?this.field_723 * -1244064173:-1):(class_305.field_3404.equalsIgnoreCase(this.field_730[4])?4:-1)):-1;
   }

   // $FF: renamed from: y (nd, int, int) void
   void method_1320(class_28 var1, int var2, int var3) {
      try {
         if(var2 == 1) {
            this.field_706 = var1.method_132((byte)-105) * -250386247;
         } else if(var2 == 2) {
            this.field_707 = var1.method_139(-391631059);
         } else if(4 == var2) {
            if(var3 == -1311253189) {
               throw new IllegalStateException();
            }

            this.field_713 = var1.method_132((byte)-52) * -988244861;
         } else if(var2 == 5) {
            if(var3 == -1311253189) {
               throw new IllegalStateException();
            }

            this.field_733 = var1.method_132((byte)-14) * -1441384969;
         } else if(var2 == 6) {
            if(var3 == -1311253189) {
               throw new IllegalStateException();
            }

            this.field_714 = var1.method_132((byte)-89) * 1109200445;
         } else if(var2 == 7) {
            if(var3 == -1311253189) {
               throw new IllegalStateException();
            }

            this.field_716 = var1.method_132((byte)-6) * -1305702203;
            if(-538415603 * this.field_716 > 32767) {
               this.field_716 -= -1866137600;
            }
         } else if(var2 == 8) {
            if(var3 == -1311253189) {
               throw new IllegalStateException();
            }

            this.field_717 = var1.method_132((byte)-63) * 1947011915;
            if(this.field_717 * -1515805085 > 32767) {
               if(var3 == -1311253189) {
                  throw new IllegalStateException();
               }

               this.field_717 -= 189464576;
            }
         } else if(11 == var2) {
            if(var3 == -1311253189) {
               return;
            }

            this.field_705 = -1031660485;
         } else if(12 == var2) {
            this.field_719 = var1.method_135((byte)-101) * 227172335;
         } else if(16 == var2) {
            if(var3 == -1311253189) {
               throw new IllegalStateException();
            }

            this.field_720 = true;
         } else if(23 == var2) {
            if(var3 == -1311253189) {
               throw new IllegalStateException();
            }

            this.field_724 = var1.method_132((byte)-121) * 618428769;
            this.field_726 = var1.method_130(1284020007) * 830113163;
         } else if(var2 == 24) {
            this.field_725 = var1.method_132((byte)-97) * 1754970571;
         } else if(25 == var2) {
            if(var3 == -1311253189) {
               return;
            }

            this.field_722 = var1.method_132((byte)-7) * 378137877;
            this.field_728 = var1.method_130(-2141302992) * -958182417;
         } else if(26 == var2) {
            if(var3 == -1311253189) {
               return;
            }

            this.field_727 = var1.method_132((byte)-40) * 18725913;
         } else {
            if(var2 >= 30) {
               if(var3 == -1311253189) {
                  return;
               }

               if(var2 < 35) {
                  this.field_721[var2 - 30] = var1.method_139(-391631059);
                  if(this.field_721[var2 - 30].equalsIgnoreCase(class_305.field_3405)) {
                     if(var3 == -1311253189) {
                        throw new IllegalStateException();
                     }

                     this.field_721[var2 - 30] = null;
                  }

                  return;
               }
            }

            if(var2 >= 35) {
               if(var3 == -1311253189) {
                  throw new IllegalStateException();
               }

               if(var2 < 40) {
                  if(var3 == -1311253189) {
                     throw new IllegalStateException();
                  }

                  this.field_730[var2 - 35] = var1.method_139(-391631059);
                  return;
               }
            }

            int var4;
            int var5;
            if(40 == var2) {
               if(var3 == -1311253189) {
                  return;
               }

               var4 = var1.method_130(1436069361);
               this.field_741 = new short[var4];
               this.field_709 = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if(var3 == -1311253189) {
                     return;
                  }

                  this.field_741[var5] = (short)var1.method_132((byte)-89);
                  this.field_709[var5] = (short)var1.method_132((byte)-80);
               }
            } else if(41 == var2) {
               var4 = var1.method_130(-1973827007);
               this.field_710 = new short[var4];
               this.field_711 = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if(var3 == -1311253189) {
                     throw new IllegalStateException();
                  }

                  this.field_710[var5] = (short)var1.method_132((byte)-50);
                  this.field_711[var5] = (short)var1.method_132((byte)-80);
               }
            } else if(42 == var2) {
               this.field_723 = var1.method_131((byte)-78) * 1541643739;
            } else if(65 == var2) {
               if(var3 == -1311253189) {
                  throw new IllegalStateException();
               }

               this.field_747 = true;
            } else if(var2 == 78) {
               if(var3 == -1311253189) {
                  return;
               }

               this.field_718 = var1.method_132((byte)-95) * 1453592671;
            } else if(79 == var2) {
               if(var3 == -1311253189) {
                  throw new IllegalStateException();
               }

               this.field_731 = var1.method_132((byte)-100) * 429285441;
            } else if(var2 == 90) {
               this.field_732 = var1.method_132((byte)-45) * 642882939;
            } else if(var2 == 91) {
               if(var3 == -1311253189) {
                  throw new IllegalStateException();
               }

               this.field_737 = var1.method_132((byte)-13) * 796537013;
            } else if(92 == var2) {
               if(var3 == -1311253189) {
                  return;
               }

               this.field_739 = var1.method_132((byte)-120) * 266267751;
            } else if(93 == var2) {
               this.field_735 = var1.method_132((byte)-15) * -407464395;
            } else if(var2 == 95) {
               if(var3 == -1311253189) {
                  throw new IllegalStateException();
               }

               this.field_715 = var1.method_132((byte)-104) * -1213187159;
            } else if(var2 == 97) {
               if(var3 == -1311253189) {
                  return;
               }

               this.field_698 = var1.method_132((byte)-14) * 1615762991;
            } else if(98 == var2) {
               if(var3 == -1311253189) {
                  throw new IllegalStateException();
               }

               this.field_743 = var1.method_132((byte)-80) * 495435323;
            } else {
               if(var2 >= 100) {
                  if(var3 == -1311253189) {
                     throw new IllegalStateException();
                  }

                  if(var2 < 110) {
                     if(var3 == -1311253189) {
                        return;
                     }

                     if(this.field_736 == null) {
                        if(var3 == -1311253189) {
                           throw new IllegalStateException();
                        }

                        this.field_736 = new int[10];
                        this.field_712 = new int[10];
                     }

                     this.field_736[var2 - 100] = var1.method_132((byte)-121);
                     this.field_712[var2 - 100] = var1.method_132((byte)-58);
                     return;
                  }
               }

               if(var2 == 110) {
                  this.field_740 = var1.method_132((byte)-84) * 236948409;
               } else if(111 == var2) {
                  if(var3 == -1311253189) {
                     throw new IllegalStateException();
                  }

                  this.field_697 = var1.method_132((byte)-2) * -2103441589;
               } else if(112 == var2) {
                  if(var3 == -1311253189) {
                     throw new IllegalStateException();
                  }

                  this.field_729 = var1.method_132((byte)-96) * 1159888389;
               } else if(var2 == 113) {
                  if(var3 == -1311253189) {
                     return;
                  }

                  this.field_742 = var1.method_131((byte)-94) * -507162055;
               } else if(var2 == 114) {
                  if(var3 == -1311253189) {
                     throw new IllegalStateException();
                  }

                  this.field_744 = var1.method_131((byte)-3) * -1469299737;
               } else if(var2 == 115) {
                  if(var3 == -1311253189) {
                     throw new IllegalStateException();
                  }

                  this.field_738 = var1.method_130(1002455828) * -1741147681;
               } else if(139 == var2) {
                  this.field_734 = var1.method_132((byte)-13) * -62272401;
               } else if(var2 == 140) {
                  if(var3 == -1311253189) {
                     throw new IllegalStateException();
                  }

                  this.field_749 = var1.method_132((byte)-106) * 1956322155;
               } else if(var2 == 148) {
                  this.field_750 = var1.method_132((byte)-61) * -942165519;
               } else if(149 == var2) {
                  this.field_751 = var1.method_132((byte)-102) * 921032403;
               } else if(249 == var2) {
                  if(var3 == -1311253189) {
                     throw new IllegalStateException();
                  }

                  this.field_746 = class_325.method_5781(var1, this.field_746, -391561047);
               }
            }
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "eq.y(" + ')');
      }
   }

   // $FF: renamed from: bi (boolean) void
   public static void method_1321(boolean var0) {
      if(var0 != class_49.field_363) {
         class_241.method_4648(1097338030);
         class_49.field_363 = var0;
      }

   }

   // $FF: renamed from: bp () void
   public static void method_1322() {
      field_704.method_5074();
   }

   // $FF: renamed from: ao (int) gr
   public final class_92 method_1323(int var1) {
      if(this.field_736 != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.field_712[var3] && 0 != this.field_712[var3]) {
               var2 = this.field_736[var3];
            }
         }

         if(var2 != -1) {
            return class_299.method_5347(var2, -526651174).method_1267(1, 599380176);
         }
      }

      class_92 var5 = (class_92)field_703.method_5065((long)(-882422617 * this.field_748));
      if(var5 != null) {
         return var5;
      } else {
         class_93 var6 = class_93.method_1708(class_331.field_3859, -1212146295 * this.field_706, 0);
         if(null == var6) {
            return null;
         } else {
            if(-899706060 != this.field_740 * 33609601 || this.field_697 * -1651193245 != 128 || 128 != -1832974628 * this.field_729) {
               var6.method_1730(1175659292 * this.field_740, this.field_697 * -1651193245, this.field_729 * -1072818290);
            }

            int var4;
            if(this.field_741 != null) {
               for(var4 = 0; var4 < this.field_741.length; ++var4) {
                  var6.method_1703(this.field_741[var4], this.field_709[var4]);
               }
            }

            if(null != this.field_710) {
               for(var4 = 0; var4 < this.field_710.length; ++var4) {
                  var6.method_1701(this.field_710[var4], this.field_711[var4]);
               }
            }

            var5 = var6.method_1711(64 + -919085284 * this.field_742, this.field_744 * 2049153237 + -1549077218, -1670868053, -10, -50);
            var5.field_938 = true;
            field_703.method_5064(var5, (long)(this.field_748 * -882422617));
            return var5;
         }
      }
   }

   // $FF: renamed from: bo () void
   public static void method_1324() {
      field_704.method_5074();
   }

   // $FF: renamed from: bw (boolean) void
   public static void method_1325(boolean var0) {
      if(var0 != class_49.field_363) {
         class_241.method_4648(-554530817);
         class_49.field_363 = var0;
      }

   }

   // $FF: renamed from: ak (int) eq
   public class_80 method_1326(int var1) {
      if(this.field_736 != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.field_712[var3] && 0 != this.field_712[var3]) {
               var2 = this.field_736[var3];
            }
         }

         if(var2 != -1) {
            return class_299.method_5347(var2, -153606456);
         }
      }

      return this;
   }

   // $FF: renamed from: bb (boolean) void
   public static void method_1327(boolean var0) {
      if(var0 != class_49.field_363) {
         class_241.method_4648(-1079501343);
         class_49.field_363 = var0;
      }

   }

   // $FF: renamed from: bk (boolean) void
   public static void method_1328(boolean var0) {
      if(var0 != class_49.field_363) {
         class_241.method_4648(495188208);
         class_49.field_363 = var0;
      }

   }

   // $FF: renamed from: bg () boolean
   boolean method_1329() {
      return this.field_709 != null;
   }

   // $FF: renamed from: az (int) gm
   public final class_93 method_1330(int var1) {
      int var3;
      if(this.field_736 != null && var1 > 1) {
         int var2 = -1;

         for(var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.field_712[var3] && this.field_712[var3] != 0) {
               var2 = this.field_736[var3];
            }
         }

         if(var2 != -1) {
            return class_299.method_5347(var2, -2081865781).method_1316(1, 403853547);
         }
      }

      class_93 var4 = class_93.method_1708(class_331.field_3859, 1434860729 * this.field_706, 0);
      if(null == var4) {
         return null;
      } else {
         if(128 != 2089317667 * this.field_740 || -1651193245 * this.field_697 != 128 || -226794743 != this.field_729 * -867000627) {
            var4.method_1730(1366362761 * this.field_740, this.field_697 * -1651193245, this.field_729 * -867000627);
         }

         if(null != this.field_741) {
            for(var3 = 0; var3 < this.field_741.length; ++var3) {
               var4.method_1703(this.field_741[var3], this.field_709[var3]);
            }
         }

         if(this.field_710 != null) {
            for(var3 = 0; var3 < this.field_710.length; ++var3) {
               var4.method_1701(this.field_710[var3], this.field_711[var3]);
            }
         }

         return var4;
      }
   }

   // $FF: renamed from: ad (nd) void
   void method_1331(class_28 var1) {
      while(true) {
         int var2 = var1.method_130(939139323);
         if(var2 == 0) {
            return;
         }

         this.method_1320(var1, var2, -430430043);
      }
   }

   // $FF: renamed from: av (int) gm
   public final class_93 method_1332(int var1) {
      int var3;
      if(this.field_736 != null && var1 > 1) {
         int var2 = -1;

         for(var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.field_712[var3] && this.field_712[var3] != 0) {
               var2 = this.field_736[var3];
            }
         }

         if(var2 != -1) {
            return class_299.method_5347(var2, 632630470).method_1316(1, 114966903);
         }
      }

      class_93 var4 = class_93.method_1708(class_331.field_3859, -1212146295 * this.field_706, 0);
      if(null == var4) {
         return null;
      } else {
         if(128 != 1366362761 * this.field_740 || -1651193245 * this.field_697 != 128 || 128 != this.field_729 * -867000627) {
            var4.method_1730(1366362761 * this.field_740, this.field_697 * -1651193245, this.field_729 * -867000627);
         }

         if(null != this.field_741) {
            for(var3 = 0; var3 < this.field_741.length; ++var3) {
               var4.method_1703(this.field_741[var3], this.field_709[var3]);
            }
         }

         if(this.field_710 != null) {
            for(var3 = 0; var3 < this.field_710.length; ++var3) {
               var4.method_1701(this.field_710[var3], this.field_711[var3]);
            }
         }

         return var4;
      }
   }

   // $FF: renamed from: bq (boolean) gm
   public final class_93 method_1333(boolean var1) {
      int var2 = this.field_724 * 461761185;
      int var3 = -2090621981 * this.field_725;
      int var4 = this.field_718 * 1265781663;
      if(var1) {
         var2 = this.field_722 * 1881995837;
         var3 = 264233001 * this.field_727;
         var4 = this.field_731 * -459952191;
      }

      if(var2 == -1) {
         return null;
      } else {
         class_93 var5 = class_93.method_1708(class_331.field_3859, var2, 0);
         if(var3 != -1) {
            class_93 var6 = class_93.method_1708(class_331.field_3859, var3, 0);
            class_93 var10000;
            if(var4 != -1) {
               class_93 var7 = class_93.method_1708(class_331.field_3859, var4, 0);
               class_93[] var8 = new class_93[]{var5, var6, var7};
               var10000 = new class_93;
               var10000.method_1704(var8, 3);
               var5 = var10000;
            } else {
               class_93[] var10 = new class_93[]{var5, var6};
               var10000 = new class_93;
               var10000.method_1704(var10, 2);
               var5 = var10000;
            }
         }

         if(!var1 && this.field_726 * 2017655331 != 0) {
            var5.method_1715(0, this.field_726 * 2017655331, 0);
         }

         if(var1 && 0 != 237060879 * this.field_728) {
            var5.method_1715(0, this.field_728 * 237060879, 0);
         }

         int var9;
         if(this.field_741 != null) {
            for(var9 = 0; var9 < this.field_741.length; ++var9) {
               var5.method_1703(this.field_741[var9], this.field_709[var9]);
            }
         }

         if(this.field_710 != null) {
            for(var9 = 0; var9 < this.field_710.length; ++var9) {
               var5.method_1701(this.field_710[var9], this.field_711[var9]);
            }
         }

         return var5;
      }
   }

   // $FF: renamed from: cv () boolean
   boolean method_1334() {
      return this.field_711 != null;
   }

   // $FF: renamed from: v (int) int
   public static int method_1335(int var0) {
      try {
         return class_255.field_2882 * 253416581;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "eq.v(" + ')');
      }
   }

   // $FF: renamed from: f (int, int, int, int, int) void
   static final void method_1336(int var0, int var1, int var2, int var3, int var4) {
      try {
         for(int var5 = var1; var5 <= var3 + var1; ++var5) {
            if(var4 == 1456209395) {
               throw new IllegalStateException();
            }

            for(int var6 = var0; var6 <= var0 + var2; ++var6) {
               if(var4 == 1456209395) {
                  throw new IllegalStateException();
               }

               if(var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                  class_391.field_4244[0][var6][var5] = 127;
                  if(var6 == var0) {
                     if(var4 == 1456209395) {
                        return;
                     }

                     if(var6 > 0) {
                        if(var4 == 1456209395) {
                           throw new IllegalStateException();
                        }

                        class_166.field_2078[0][var6][var5] = class_166.field_2078[0][var6 - 1][var5];
                     }
                  }

                  if(var6 == var2 + var0 && var6 < 103) {
                     if(var4 == 1456209395) {
                        return;
                     }

                     class_166.field_2078[0][var6][var5] = class_166.field_2078[0][1 + var6][var5];
                  }

                  if(var5 == var1) {
                     if(var4 == 1456209395) {
                        return;
                     }

                     if(var5 > 0) {
                        if(var4 == 1456209395) {
                           throw new IllegalStateException();
                        }

                        class_166.field_2078[0][var6][var5] = class_166.field_2078[0][var6][var5 - 1];
                     }
                  }

                  if(var5 == var1 + var3) {
                     if(var4 == 1456209395) {
                        throw new IllegalStateException();
                     }

                     if(var5 < 103) {
                        class_166.field_2078[0][var6][var5] = class_166.field_2078[0][var6][var5 + 1];
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "eq.f(" + ')');
      }
   }

   // $FF: renamed from: y (nb, int, byte) void
   static void method_1337(class_29 var0, int var1, byte var2) {
      try {
         boolean var10000;
         if(var0.method_361(1, (byte)-62) == 1) {
            if(var2 <= 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var3 = var10000;
         if(var3) {
            if(var2 <= 0) {
               throw new IllegalStateException();
            }

            class_195.field_2314[(class_195.field_2320 += -1575538987) * -1149592963 - 1] = var1;
         }

         int var4 = var0.method_361(2, (byte)-1);
         class_100 var5 = client.field_1605[var1];
         if(var4 == 0) {
            if(var2 <= 0) {
               throw new IllegalStateException();
            } else if(var3) {
               var5.field_1168 = false;
            } else if(var1 == 929092845 * client.field_1534) {
               if(var2 <= 0) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException();
               }
            } else {
               class_195.field_2309[var1] = (var5.field_1112[0] + class_243.field_2700 * 697161691 >> 13 << 14) + (var5.field_1163 * 671262203 << 28) + (var5.field_1126[0] + -27903763 * class_154.field_1929 >> 13);
               if(var5.field_1104 * 800070667 != -1) {
                  if(var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  class_195.field_2310[var1] = var5.field_1104 * 800070667;
               } else {
                  class_195.field_2310[var1] = var5.field_1106 * -1173912475;
               }

               class_195.field_2317[var1] = var5.field_1128 * 637535539;
               client.field_1605[var1] = null;
               if(var0.method_361(1, (byte)66) != 0) {
                  if(var2 <= 0) {
                     return;
                  }

                  class_86.method_1481(var0, var1, 1866076342);
               }

            }
         } else {
            int var6;
            int var7;
            int var8;
            if(var4 == 1) {
               if(var2 <= 0) {
                  throw new IllegalStateException();
               } else {
                  var6 = var0.method_361(3, (byte)-58);
                  var7 = var5.field_1112[0];
                  var8 = var5.field_1126[0];
                  if(var6 == 0) {
                     if(var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     --var7;
                     --var8;
                  } else if(var6 == 1) {
                     if(var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     --var8;
                  } else if(2 == var6) {
                     if(var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     ++var7;
                     --var8;
                  } else if(3 == var6) {
                     if(var2 <= 0) {
                        return;
                     }

                     --var7;
                  } else if(4 == var6) {
                     if(var2 <= 0) {
                        return;
                     }

                     ++var7;
                  } else if(var6 == 5) {
                     if(var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     --var7;
                     ++var8;
                  } else if(6 == var6) {
                     ++var8;
                  } else if(7 == var6) {
                     if(var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     ++var7;
                     ++var8;
                  }

                  if(client.field_1534 * 929092845 == var1) {
                     label485: {
                        if(var2 <= 0) {
                           throw new IllegalStateException();
                        }

                        if(-130212619 * var5.field_1077 >= 1536 && 1248597615 * var5.field_1076 >= 1536 && var5.field_1077 * -130212619 < 11776) {
                           if(var5.field_1076 * 1248597615 < 11776) {
                              break label485;
                           }

                           if(var2 <= 0) {
                              throw new IllegalStateException();
                           }
                        }

                        var5.method_1835(var7, var8, 1441238495);
                        var5.field_1168 = false;
                        return;
                     }
                  }

                  if(var3) {
                     if(var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     var5.field_1168 = true;
                     var5.field_1155 = var7 * 258210291;
                     var5.field_1144 = var8 * 770404467;
                  } else {
                     var5.field_1168 = false;
                     var5.method_1846(var7, var8, class_195.field_2311[var1], 2070611264);
                  }

               }
            } else if(2 == var4) {
               var6 = var0.method_361(4, (byte)16);
               var7 = var5.field_1112[0];
               var8 = var5.field_1126[0];
               if(0 == var6) {
                  if(var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  var7 -= 2;
                  var8 -= 2;
               } else if(var6 == 1) {
                  if(var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  --var7;
                  var8 -= 2;
               } else if(2 == var6) {
                  if(var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  var8 -= 2;
               } else if(3 == var6) {
                  if(var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  ++var7;
                  var8 -= 2;
               } else if(4 == var6) {
                  if(var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  var7 += 2;
                  var8 -= 2;
               } else if(var6 == 5) {
                  if(var2 <= 0) {
                     return;
                  }

                  var7 -= 2;
                  --var8;
               } else if(var6 == 6) {
                  if(var2 <= 0) {
                     return;
                  }

                  var7 += 2;
                  --var8;
               } else if(var6 == 7) {
                  if(var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  var7 -= 2;
               } else if(var6 == 8) {
                  if(var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  var7 += 2;
               } else if(var6 == 9) {
                  var7 -= 2;
                  ++var8;
               } else if(10 == var6) {
                  if(var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  var7 += 2;
                  ++var8;
               } else if(11 == var6) {
                  if(var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  var7 -= 2;
                  var8 += 2;
               } else if(var6 == 12) {
                  if(var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  --var7;
                  var8 += 2;
               } else if(13 == var6) {
                  if(var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  var8 += 2;
               } else if(14 == var6) {
                  if(var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  ++var7;
                  var8 += 2;
               } else if(var6 == 15) {
                  var7 += 2;
                  var8 += 2;
               }

               if(client.field_1534 * 929092845 == var1) {
                  label487: {
                     if(var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     if(-130212619 * var5.field_1077 >= 1536) {
                        if(var2 <= 0) {
                           return;
                        }

                        if(1248597615 * var5.field_1076 >= 1536) {
                           if(var2 <= 0) {
                              throw new IllegalStateException();
                           }

                           if(-130212619 * var5.field_1077 < 11776) {
                              if(var2 <= 0) {
                                 throw new IllegalStateException();
                              }

                              if(var5.field_1076 * 1248597615 < 11776) {
                                 break label487;
                              }

                              if(var2 <= 0) {
                                 return;
                              }
                           }
                        }
                     }

                     var5.method_1835(var7, var8, 1441238495);
                     var5.field_1168 = false;
                     return;
                  }
               }

               if(var3) {
                  var5.field_1168 = true;
                  var5.field_1155 = 258210291 * var7;
                  var5.field_1144 = 770404467 * var8;
               } else {
                  var5.field_1168 = false;
                  var5.method_1846(var7, var8, class_195.field_2311[var1], 2070611264);
               }

            } else {
               var6 = var0.method_361(1, (byte)13);
               int var9;
               int var10;
               int var11;
               int var12;
               if(var6 == 0) {
                  if(var2 <= 0) {
                     throw new IllegalStateException();
                  } else {
                     var7 = var0.method_361(12, (byte)-35);
                     var8 = var7 >> 10;
                     var9 = var7 >> 5 & 31;
                     if(var9 > 15) {
                        var9 -= 32;
                     }

                     var10 = var7 & 31;
                     if(var10 > 15) {
                        var10 -= 32;
                     }

                     label432: {
                        var11 = var5.field_1112[0] + var9;
                        var12 = var10 + var5.field_1126[0];
                        if(var1 == client.field_1534 * 929092845) {
                           label430: {
                              if(-130212619 * var5.field_1077 >= 1536) {
                                 if(var2 <= 0) {
                                    throw new IllegalStateException();
                                 }

                                 if(var5.field_1076 * 1248597615 >= 1536) {
                                    if(var2 <= 0) {
                                       throw new IllegalStateException();
                                    }

                                    if(-130212619 * var5.field_1077 < 11776) {
                                       if(var2 <= 0) {
                                          throw new IllegalStateException();
                                       }

                                       if(var5.field_1076 * 1248597615 < 11776) {
                                          break label430;
                                       }

                                       if(var2 <= 0) {
                                          throw new IllegalStateException();
                                       }
                                    }
                                 }
                              }

                              var5.method_1835(var11, var12, 1441238495);
                              var5.field_1168 = false;
                              break label432;
                           }
                        }

                        if(var3) {
                           var5.field_1168 = true;
                           var5.field_1155 = 258210291 * var11;
                           var5.field_1144 = var12 * 770404467;
                        } else {
                           var5.field_1168 = false;
                           var5.method_1846(var11, var12, class_195.field_2311[var1], 2070611264);
                        }
                     }

                     var5.field_1163 = 1571462451 * (byte)(671262203 * var5.field_1163 + var8 & 3);
                     if(929092845 * client.field_1534 == var1) {
                        if(var2 <= 0) {
                           throw new IllegalStateException();
                        }

                        class_115.field_1289 = var5.field_1163 * -1993331315;
                     }

                  }
               } else {
                  label452: {
                     var7 = var0.method_361(30, (byte)69);
                     var8 = var7 >> 28;
                     var9 = var7 >> 14 & 16383;
                     var10 = var7 & 16383;
                     var11 = (var5.field_1112[0] + 697161691 * class_243.field_2700 + var9 & 16383) - 697161691 * class_243.field_2700;
                     var12 = (var5.field_1126[0] + -27903763 * class_154.field_1929 + var10 & 16383) - -27903763 * class_154.field_1929;
                     if(var1 == 929092845 * client.field_1534) {
                        label468: {
                           if(var2 <= 0) {
                              return;
                           }

                           if(-130212619 * var5.field_1077 >= 1536) {
                              if(var2 <= 0) {
                                 return;
                              }

                              if(var5.field_1076 * 1248597615 >= 1536) {
                                 if(var2 <= 0) {
                                    return;
                                 }

                                 if(-130212619 * var5.field_1077 < 11776) {
                                    if(var2 <= 0) {
                                       throw new IllegalStateException();
                                    }

                                    if(var5.field_1076 * 1248597615 < 11776) {
                                       break label468;
                                    }
                                 }
                              }
                           }

                           var5.method_1835(var11, var12, 1441238495);
                           var5.field_1168 = false;
                           break label452;
                        }
                     }

                     if(var3) {
                        if(var2 <= 0) {
                           throw new IllegalStateException();
                        }

                        var5.field_1168 = true;
                        var5.field_1155 = var11 * 258210291;
                        var5.field_1144 = var12 * 770404467;
                     } else {
                        var5.field_1168 = false;
                        var5.method_1846(var11, var12, class_195.field_2311[var1], 2070611264);
                     }
                  }

                  var5.field_1163 = (byte)(var5.field_1163 * 671262203 + var8 & 3) * 1571462451;
                  if(var1 == 929092845 * client.field_1534) {
                     if(var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     class_115.field_1289 = -1993331315 * var5.field_1163;
                  }

               }
            }
         }
      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13, "eq.y(" + ')');
      }
   }

   // $FF: renamed from: f (jv, int, int, int) oh[]
   public static class_67[] method_1338(class_306 var0, int var1, int var2, int var3) {
      try {
         return !class_370.method_6606(var0, var1, var2, (byte)108)?null:class_209.method_4162((byte)61);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "eq.f(" + ')');
      }
   }
}
