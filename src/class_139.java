import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// $FF: renamed from: bd
public class class_139 {

    // $FF: renamed from: j boolean
   public static boolean field_1781;
    // $FF: renamed from: d int
   public static int field_1783;
    // $FF: renamed from: c int[]
   protected int[] field_1785;
   // $FF: renamed from: e bm
   class_104 field_1786;
   // $FF: renamed from: t int
   int field_1787;
   // $FF: renamed from: a long
   long field_1788;
   // $FF: renamed from: k int
   int field_1789;
   // $FF: renamed from: m int
   int field_1790;
   // $FF: renamed from: x int
   int field_1791;
   // $FF: renamed from: z long
   long field_1792;
   // $FF: renamed from: p int
   public static int field_1793;
    // $FF: renamed from: h int
   int field_1795;
   // $FF: renamed from: q long
   long field_1796;
   // $FF: renamed from: i boolean
   boolean field_1797;
   // $FF: renamed from: ai int
   int field_1798;
   // $FF: renamed from: ar bm[]
   class_104[] field_1799;
   // $FF: renamed from: g int
   int field_1800;
   // $FF: renamed from: w int
   int field_1801;
    // $FF: renamed from: ag bm[]
   class_104[] field_1804;


    // $FF: renamed from: i (bm, byte) void
   public final synchronized void method_2989(class_104 var1, byte var2) {
      try {
         this.field_1786 = var1;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "bd.i(" + ')');
      }
   }

   // $FF: renamed from: ae (byte) void
   public final synchronized void method_2990(byte var1) {
      try {
         if(this.field_1785 == null) {
            if(var1 > -50) {
               ;
            }
         } else {
            long var2 = class_87.method_1516((byte)1);

            try {
               if(0L != 7200649757382554285L * this.field_1792) {
                  if(var1 <= -50) {
                     throw new IllegalStateException();
                  }

                  if(var2 < 7200649757382554285L * this.field_1792) {
                     if(var1 <= -50) {
                        throw new IllegalStateException();
                     }

                     return;
                  }

                  this.method_2998(1181152315 * this.field_1789, (short)-6942);
                  this.field_1792 = 0L;
                  this.field_1797 = true;
               }

               int var4 = this.method_2999((byte)-42);
               if(-70989363 * this.field_1795 - var4 > this.field_1801 * -847045713) {
                  if(var1 <= -50) {
                     throw new IllegalStateException();
                  }

                  this.field_1801 = 907090767 * (-70989363 * this.field_1795 - var4);
               }

               int var5 = this.field_1791 * 1178073075 + this.field_1790 * -908602587;
               if(256 + var5 > 16384) {
                  if(var1 <= -50) {
                     throw new IllegalStateException();
                  }

                  var5 = 16128;
               }

               if(256 + var5 > this.field_1789 * 1181152315) {
                  this.field_1789 += 789826560;
                  if(this.field_1789 * 1181152315 > 16384) {
                     if(var1 <= -50) {
                        return;
                     }

                     this.field_1789 = -247676928;
                  }

                  this.method_3001((short)-5323);
                  this.method_2998(this.field_1789 * 1181152315, (short)-31716);
                  var4 = 0;
                  this.field_1797 = true;
                  if(var5 + 256 > this.field_1789 * 1181152315) {
                     var5 = 1181152315 * this.field_1789 - 256;
                     this.field_1791 = (var5 - this.field_1790 * -908602587) * 293108027;
                  }
               }

               while(var4 < var5) {
                  if(var1 <= -50) {
                     throw new IllegalStateException();
                  }

                  this.method_3033(this.field_1785, 256);
                  this.method_3000();
                  var4 += 256;
               }

               if(var2 > this.field_1796 * -1818884622277911111L) {
                  if(var1 <= -50) {
                     throw new IllegalStateException();
                  }

                  if(!this.field_1797) {
                     if(var1 <= -50) {
                        throw new IllegalStateException();
                     }

                     if(-847045713 * this.field_1801 == 0 && this.field_1787 * 1580986367 == 0) {
                        if(var1 <= -50) {
                           return;
                        }

                        this.method_3001((short)-4332);
                        this.field_1792 = 9154890315640078629L * (2000L + var2);
                        return;
                     }

                     this.field_1791 = Math.min(this.field_1787 * 1580986367, -847045713 * this.field_1801) * 293108027;
                     this.field_1787 = this.field_1801 * 1983108177;
                  } else {
                     this.field_1797 = false;
                  }

                  this.field_1801 = 0;
                  this.field_1796 = (2000L + var2) * -3931617280022767479L;
               }

               this.field_1795 = -919778555 * var4;
            } catch (Exception var7) {
               this.method_3001((short)4345);
               this.field_1792 = 9154890315640078629L * (var2 + 2000L);
            }

            try {
               if(var2 > 2377200656236085237L * this.field_1788 + 500000L) {
                  if(var1 <= -50) {
                     throw new IllegalStateException();
                  }

                  var2 = this.field_1788 * 2377200656236085237L;
               }

               while(var2 > 5000L + this.field_1788 * 2377200656236085237L) {
                  if(var1 <= -50) {
                     throw new IllegalStateException();
                  }

                  this.method_3038(256, 1429485953);
                  this.field_1788 += (long)(256000 / (field_1793 * 1631160541)) * -5018830713457052579L;
               }
            } catch (Exception var6) {
               this.field_1788 = -5018830713457052579L * var2;
            }

         }
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "bd.ae(" + ')');
      }
   }

   // $FF: renamed from: ap (int) void
   public final void method_2991(int var1) {
      try {
         this.field_1797 = true;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "bd.ap(" + ')');
      }
   }

   // $FF: renamed from: w () void
   protected void method_2992() throws Exception {}

   // $FF: renamed from: al (int) void
   public final synchronized void method_2993(int var1) {
      try {
         if(class_101.field_1182 != null) {
            if(var1 >= -2085955341) {
               throw new IllegalStateException();
            }

            boolean var2 = true;

            for(int var3 = 0; var3 < 2; ++var3) {
               if(var1 >= -2085955341) {
                  throw new IllegalStateException();
               }

               if(this == class_101.field_1182.field_1934[var3]) {
                  if(var1 >= -2085955341) {
                     throw new IllegalStateException();
                  }

                  class_101.field_1182.field_1934[var3] = null;
               }

               if(null != class_101.field_1182.field_1934[var3]) {
                  if(var1 >= -2085955341) {
                     throw new IllegalStateException();
                  }

                  var2 = false;
               }
            }

            if(var2) {
               if(var1 >= -2085955341) {
                  throw new IllegalStateException();
               }

               class_276.field_3220.shutdownNow();
               class_276.field_3220 = null;
               class_101.field_1182 = null;
            }
         }

         this.method_3001((short)-5884);
         this.field_1785 = null;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "bd.al(" + ')');
      }
   }

   // $FF: renamed from: z () void
   protected void method_2995() throws Exception {}

   // $FF: renamed from: ag (bm, int, int) void
   final void method_2996(class_104 var1, int var2, int var3) {
      try {
         int var4 = var2 >> 5;
         class_104 var5 = this.field_1804[var4];
         if(var5 == null) {
            if(var3 >= -1501957179) {
               return;
            }

            this.field_1799[var4] = var1;
         } else {
            var5.field_1207 = var1;
         }

         this.field_1804[var4] = var1;
         var1.field_1206 = var2;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "bd.ag(" + ')');
      }
   }

   // $FF: renamed from: n (int, short) void
   protected void method_2998(int var1, short var2) throws Exception {
      try {
         ;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "bd.n(" + ')');
      }
   }

   // $FF: renamed from: f (byte) int
   protected int method_2999(byte var1) throws Exception {
      try {
         return 1181152315 * this.field_1789;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "bd.f(" + ')');
      }
   }

   // $FF: renamed from: y () void
   protected void method_3000() throws Exception {
      try {
         ;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "bd.y(" + ')');
      }
   }

   // $FF: renamed from: p (short) void
   protected void method_3001(short var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "bd.p(" + ')');
      }
   }

   // $FF: renamed from: j (int) void
   protected void method_3002(int var1) throws Exception {
      try {
         ;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "bd.j(" + ')');
      }
   }

   // $FF: renamed from: r () void
   protected void method_3003() throws Exception {}

   // $FF: renamed from: b () void
   protected void method_3004() throws Exception {}

   // $FF: renamed from: d (int) void
   protected void method_3005(int var1) throws Exception {}

   // $FF: renamed from: v (byte) void
   protected void method_3006(byte var1) throws Exception {
      try {
         ;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "bd.v(" + ')');
      }
   }

   // $FF: renamed from: u () int
   protected int method_3007() throws Exception {
      return 1181152315 * this.field_1789;
   }

   // $FF: renamed from: f (nb, int) void
   static final void method_3008(class_29 var0, int var1) {
      try {
         int var2 = 0;
         var0.method_358(-1595925425);

         int var3;
         int var4;
         int var5;
         int var7;
         int var8;
         for(var3 = 0; var3 < class_195.field_2313 * -1143549299; ++var3) {
            if(var1 >= -1368657540) {
               throw new IllegalStateException();
            }

            var4 = class_195.field_2318[var3];
            if((class_195.field_2308[var4] & 1) == 0) {
               if(var2 > 0) {
                  if(var1 >= -1368657540) {
                     return;
                  }

                  --var2;
                  class_195.field_2308[var4] = (byte)(class_195.field_2308[var4] | 2);
               } else {
                  var5 = var0.method_361(1, (byte)-13);
                  if(var5 == 0) {
                     if(var1 >= -1368657540) {
                        throw new IllegalStateException();
                     }

                     var7 = var0.method_361(2, (byte)48);
                     if(var7 == 0) {
                        var8 = 0;
                     } else if(1 == var7) {
                        if(var1 >= -1368657540) {
                           throw new IllegalStateException();
                        }

                        var8 = var0.method_361(5, (byte)-111);
                     } else if(2 == var7) {
                        if(var1 >= -1368657540) {
                           throw new IllegalStateException();
                        }

                        var8 = var0.method_361(8, (byte)54);
                     } else {
                        var8 = var0.method_361(11, (byte)-83);
                     }

                     var2 = var8;
                     class_195.field_2308[var4] = (byte)(class_195.field_2308[var4] | 2);
                  } else {
                     class_80.method_1337(var0, var4, (byte)100);
                  }
               }
            }
         }

         var0.method_362((byte)-15);
         if(0 != var2) {
            throw new RuntimeException();
         } else {
            var0.method_358(-937518936);

            for(var3 = 0; var3 < -1143549299 * class_195.field_2313; ++var3) {
               if(var1 >= -1368657540) {
                  return;
               }

               var4 = class_195.field_2318[var3];
               if(0 != (class_195.field_2308[var4] & 1)) {
                  if(var1 >= -1368657540) {
                     throw new IllegalStateException();
                  }

                  if(var2 > 0) {
                     if(var1 >= -1368657540) {
                        throw new IllegalStateException();
                     }

                     --var2;
                     class_195.field_2308[var4] = (byte)(class_195.field_2308[var4] | 2);
                  } else {
                     var5 = var0.method_361(1, (byte)46);
                     if(0 == var5) {
                        if(var1 >= -1368657540) {
                           throw new IllegalStateException();
                        }

                        var7 = var0.method_361(2, (byte)-38);
                        if(var7 == 0) {
                           if(var1 >= -1368657540) {
                              throw new IllegalStateException();
                           }

                           var8 = 0;
                        } else if(var7 == 1) {
                           var8 = var0.method_361(5, (byte)5);
                        } else if(var7 == 2) {
                           if(var1 >= -1368657540) {
                              throw new IllegalStateException();
                           }

                           var8 = var0.method_361(8, (byte)47);
                        } else {
                           var8 = var0.method_361(11, (byte)64);
                        }

                        var2 = var8;
                        class_195.field_2308[var4] = (byte)(class_195.field_2308[var4] | 2);
                     } else {
                        class_80.method_1337(var0, var4, (byte)78);
                     }
                  }
               }
            }

            var0.method_362((byte)-47);
            if(var2 != 0) {
               throw new RuntimeException();
            } else {
               var0.method_358(91077193);

               for(var3 = 0; var3 < class_195.field_2315 * -1936837699; ++var3) {
                  if(var1 >= -1368657540) {
                     throw new IllegalStateException();
                  }

                  var4 = class_195.field_2316[var3];
                  if(0 != (class_195.field_2308[var4] & 1)) {
                     if(var2 > 0) {
                        if(var1 >= -1368657540) {
                           throw new IllegalStateException();
                        }

                        --var2;
                        class_195.field_2308[var4] = (byte)(class_195.field_2308[var4] | 2);
                     } else {
                        var5 = var0.method_361(1, (byte)46);
                        if(0 == var5) {
                           if(var1 >= -1368657540) {
                              throw new IllegalStateException();
                           }

                           var7 = var0.method_361(2, (byte)34);
                           if(var7 == 0) {
                              if(var1 >= -1368657540) {
                                 throw new IllegalStateException();
                              }

                              var8 = 0;
                           } else if(1 == var7) {
                              var8 = var0.method_361(5, (byte)-36);
                           } else if(2 == var7) {
                              if(var1 >= -1368657540) {
                                 throw new IllegalStateException();
                              }

                              var8 = var0.method_361(8, (byte)108);
                           } else {
                              var8 = var0.method_361(11, (byte)-11);
                           }

                           var2 = var8;
                           class_195.field_2308[var4] = (byte)(class_195.field_2308[var4] | 2);
                        } else if(class_86.method_1481(var0, var4, 422196307)) {
                           if(var1 >= -1368657540) {
                              return;
                           }

                           class_195.field_2308[var4] = (byte)(class_195.field_2308[var4] | 2);
                        }
                     }
                  }
               }

               var0.method_362((byte)-14);
               if(var2 != 0) {
                  if(var1 >= -1368657540) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException();
                  }
               } else {
                  var0.method_358(-938893257);

                  for(var3 = 0; var3 < class_195.field_2315 * -1936837699; ++var3) {
                     if(var1 >= -1368657540) {
                        throw new IllegalStateException();
                     }

                     var4 = class_195.field_2316[var3];
                     if(0 == (class_195.field_2308[var4] & 1)) {
                        if(var1 >= -1368657540) {
                           throw new IllegalStateException();
                        }

                        if(var2 > 0) {
                           if(var1 >= -1368657540) {
                              throw new IllegalStateException();
                           }

                           --var2;
                           class_195.field_2308[var4] = (byte)(class_195.field_2308[var4] | 2);
                        } else {
                           var5 = var0.method_361(1, (byte)74);
                           if(var5 == 0) {
                              var7 = var0.method_361(2, (byte)42);
                              if(0 == var7) {
                                 if(var1 >= -1368657540) {
                                    throw new IllegalStateException();
                                 }

                                 var8 = 0;
                              } else if(1 == var7) {
                                 if(var1 >= -1368657540) {
                                    return;
                                 }

                                 var8 = var0.method_361(5, (byte)-101);
                              } else if(var7 == 2) {
                                 if(var1 >= -1368657540) {
                                    throw new IllegalStateException();
                                 }

                                 var8 = var0.method_361(8, (byte)29);
                              } else {
                                 var8 = var0.method_361(11, (byte)-10);
                              }

                              var2 = var8;
                              class_195.field_2308[var4] = (byte)(class_195.field_2308[var4] | 2);
                           } else if(class_86.method_1481(var0, var4, -1682216351)) {
                              if(var1 >= -1368657540) {
                                 return;
                              }

                              class_195.field_2308[var4] = (byte)(class_195.field_2308[var4] | 2);
                           }
                        }
                     }
                  }

                  var0.method_362((byte)-2);
                  if(var2 != 0) {
                     throw new RuntimeException();
                  } else {
                     class_195.field_2313 = 0;
                     class_195.field_2315 = 0;

                     for(var3 = 1; var3 < 2048; ++var3) {
                        if(var1 >= -1368657540) {
                           return;
                        }

                        class_195.field_2308[var3] = (byte)(class_195.field_2308[var3] >> 1);
                        class_100 var10 = client.field_1605[var3];
                        if(var10 != null) {
                           if(var1 >= -1368657540) {
                              return;
                           }

                           class_195.field_2318[(class_195.field_2313 += 1909342277) * -1143549299 - 1] = var3;
                        } else {
                           class_195.field_2316[(class_195.field_2315 += -262660203) * -1936837699 - 1] = var3;
                        }
                     }

                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9, "bd.f(" + ')');
      }
   }

   // $FF: renamed from: aa (int) void
   final void method_3009(int var1) {
      this.field_1798 -= 630272627 * var1;
      if(this.field_1798 * -1673925720 < 0) {
         this.field_1798 = 0;
      }

      if(null != this.field_1786) {
         this.field_1786.method_1933(var1);
      }

   }

   // $FF: renamed from: c () void
   protected void method_3010() throws Exception {}

   // $FF: renamed from: s (int) void
   protected void method_3011(int var1) throws Exception {}

   // $FF: renamed from: g () void
   protected void method_3012() throws Exception {}

   // $FF: renamed from: at () void
   public final synchronized void method_3013() {
      if(this.field_1785 != null) {
         long var1 = class_87.method_1516((byte)1);

         try {
            if(0L != 7200649757382554285L * this.field_1792) {
               if(var1 < 7200649757382554285L * this.field_1792) {
                  return;
               }

               this.method_2998(1181152315 * this.field_1789, (short)-26837);
               this.field_1792 = 0L;
               this.field_1797 = true;
            }

            int var3 = this.method_2999((byte)-16);
            if(-70989363 * this.field_1795 - var3 > this.field_1801 * -847045713) {
               this.field_1801 = 907090767 * (-70989363 * this.field_1795 - var3);
            }

            int var4 = this.field_1791 * 1178073075 + this.field_1790 * -908602587;
            if(256 + var4 > 16384) {
               var4 = 16128;
            }

            if(256 + var4 > this.field_1789 * 1181152315) {
               this.field_1789 += 789826560;
               if(this.field_1789 * 1181152315 > 16384) {
                  this.field_1789 = -247676928;
               }

               this.method_3001((short)13107);
               this.method_2998(this.field_1789 * 1181152315, (short)-3329);
               var3 = 0;
               this.field_1797 = true;
               if(var4 + 256 > this.field_1789 * 1181152315) {
                  var4 = 1181152315 * this.field_1789 - 256;
                  this.field_1791 = (var4 - this.field_1790 * -908602587) * 293108027;
               }
            }

            while(var3 < var4) {
               this.method_3033(this.field_1785, 256);
               this.method_3000();
               var3 += 256;
            }

            if(var1 > this.field_1796 * -1818884622277911111L) {
               if(!this.field_1797) {
                  if(-847045713 * this.field_1801 == 0 && this.field_1787 * 1580986367 == 0) {
                     this.method_3001((short)5660);
                     this.field_1792 = 9154890315640078629L * (2000L + var1);
                     return;
                  }

                  this.field_1791 = Math.min(this.field_1787 * 1580986367, -847045713 * this.field_1801) * 293108027;
                  this.field_1787 = this.field_1801 * 1983108177;
               } else {
                  this.field_1797 = false;
               }

               this.field_1801 = 0;
               this.field_1796 = (2000L + var1) * -3931617280022767479L;
            }

            this.field_1795 = -919778555 * var3;
         } catch (Exception var6) {
            this.method_3001((short)3340);
            this.field_1792 = 9154890315640078629L * (var1 + 2000L);
         }

         try {
            if(var1 > 2377200656236085237L * this.field_1788 + 500000L) {
               var1 = this.field_1788 * 2377200656236085237L;
            }

            while(var1 > 5000L + this.field_1788 * 2377200656236085237L) {
               this.method_3038(256, 1844553676);
               this.field_1788 += (long)(256000 / (field_1793 * 1631160541)) * -5018830713457052579L;
            }
         } catch (Exception var5) {
            this.field_1788 = -5018830713457052579L * var1;
         }

      }
   }

   // $FF: renamed from: k () void
   protected void method_3014() {}

   // $FF: renamed from: l () int
   protected int method_3015() throws Exception {
      return 1181152315 * this.field_1789;
   }

   // $FF: renamed from: bt (int[], int) void
   final void method_3016(int[] var1, int var2) {
      int var3 = var2;
      if(field_1781) {
         var3 = var2 << 1;
      }

      class_317.method_5628(var1, 0, var3);
      this.field_1798 -= var2 * 630272627;
      if(this.field_1786 != null && -1875393861 * this.field_1798 <= 0) {
         this.field_1798 += (1631160541 * field_1793 >> 4) * 630272627;
         class_82.method_1376(this.field_1786, (short)10032);
         this.method_2996(this.field_1786, this.field_1786.method_1932(), -1556768389);
         int var4 = 0;
         int var5 = 255;

         int var6;
         class_104 var10;
         label136:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if(var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; 0 != var9; var9 >>>= 4) {
               if((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  class_104 var11 = this.field_1799[var7];

                  while(null != var11) {
                     class_109 var12 = var11.field_1205;
                     if(null != var12 && var12.field_1261 > var8) {
                        var5 |= 1 << var7;
                        var10 = var11;
                        var11 = var11.field_1207;
                     } else {
                        var11.field_1208 = true;
                        int var13 = var11.method_1935();
                        var4 += var13;
                        if(var12 != null) {
                           var12.field_1261 += var13;
                        }

                        if(var4 >= 881118859 * this.field_1800) {
                           break label136;
                        }

                        class_104 var14 = var11.method_1931();
                        if(null != var14) {
                           for(int var15 = var11.field_1206; null != var14; var14 = var11.method_1947()) {
                              this.method_2996(var14, var15 * var14.method_1932() >> 8, -1936254145);
                           }
                        }

                        class_104 var18 = var11.field_1207;
                        var11.field_1207 = null;
                        if(var10 == null) {
                           this.field_1799[var7] = var18;
                        } else {
                           var10.field_1207 = var18;
                        }

                        if(var18 == null) {
                           this.field_1804[var7] = var10;
                        }

                        var11 = var18;
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            class_104 var16 = this.field_1799[var6];
            class_104[] var17 = this.field_1799;
            this.field_1804[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.field_1207;
               var16.field_1207 = null;
            }
         }
      }

      if(-1875393861 * this.field_1798 < 0) {
         this.field_1798 = 0;
      }

      if(this.field_1786 != null) {
         this.field_1786.method_1943(var1, 0, var2);
      }

      this.field_1788 = class_87.method_1516((byte)1) * -5018830713457052579L;
   }

   // $FF: renamed from: <init> () void
   protected class_139() {
      super();
      try {
         this.field_1800 = -950721440;
         this.field_1788 = class_87.method_1516((byte)1) * -5018830713457052579L;
         this.field_1792 = 0L;
         this.field_1801 = 0;
         this.field_1787 = 0;
         this.field_1795 = 0;
         this.field_1796 = 0L;
         this.field_1797 = true;
         this.field_1798 = 0;
         this.field_1799 = new class_104[8];
         this.field_1804 = new class_104[8];
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "bd.<init>(" + ')');
      }
   }

   // $FF: renamed from: x () void
   protected void method_3018() {}

   // $FF: renamed from: aj (dp, int, int) bd
   public static final class_139 method_3022(class_201 var0, int var1, int var2) {
      if(0 == 1631160541 * field_1793) {
         throw new IllegalStateException();
      } else if(var1 >= 0 && var1 < 2) {
         if(var2 < 256) {
            var2 = 256;
         }

         try {
            class_139 var3 = class_126.field_1372.method_5(-597712139);
            var3.field_1785 = new int[256 * (field_1781?2:1)];
            var3.field_1790 = -90643405 * var2;
            var3.method_3006((byte)4);
            var3.field_1789 = ((var2 & -1024) + 1024) * 1246361725;
            if(var3.field_1789 * 1012514340 > 16384) {
               var3.field_1789 = -247676928;
            }

            var3.method_2998(1181152315 * var3.field_1789, (short)-11166);
            if(field_1783 * 1120747367 > 0 && null == class_101.field_1182) {
               class_154 var5 = new class_154();
               class_101.field_1182 = var5;
               class_276.field_3220 = Executors.newScheduledThreadPool(1);
               class_276.field_3220.scheduleAtFixedRate(class_101.field_1182, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if(class_101.field_1182 != null) {
               if(class_101.field_1182.field_1934[var1] != null) {
                  throw new IllegalArgumentException();
               }

               class_101.field_1182.field_1934[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            class_139 var10000 = new class_139();
            return var10000;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   // $FF: renamed from: am (bm) void
   public final synchronized void method_3023(class_104 var1) {
      this.field_1786 = var1;
   }

   // $FF: renamed from: az (bm) void
   public final synchronized void method_3024(class_104 var1) {
      this.field_1786 = var1;
   }

   // $FF: renamed from: av (bm) void
   public final synchronized void method_3025(class_104 var1) {
      this.field_1786 = var1;
   }

   // $FF: renamed from: ac () void
   public final synchronized void method_3026() {
      if(this.field_1785 != null) {
         long var1 = class_87.method_1516((byte)1);

         try {
            if(0L != 7200649757382554285L * this.field_1792) {
               if(var1 < 7200649757382554285L * this.field_1792) {
                  return;
               }

               this.method_2998(1181152315 * this.field_1789, (short)-18733);
               this.field_1792 = 0L;
               this.field_1797 = true;
            }

            int var3 = this.method_2999((byte)-36);
            if(-70989363 * this.field_1795 - var3 > this.field_1801 * -847045713) {
               this.field_1801 = 907090767 * (-70989363 * this.field_1795 - var3);
            }

            int var4 = this.field_1791 * 1178073075 + this.field_1790 * -908602587;
            if(256 + var4 > 16384) {
               var4 = 16128;
            }

            if(256 + var4 > this.field_1789 * 1181152315) {
               this.field_1789 += 789826560;
               if(this.field_1789 * 1181152315 > 16384) {
                  this.field_1789 = -247676928;
               }

               this.method_3001((short)6669);
               this.method_2998(this.field_1789 * 1181152315, (short)-21273);
               var3 = 0;
               this.field_1797 = true;
               if(var4 + 256 > this.field_1789 * 1181152315) {
                  var4 = 1181152315 * this.field_1789 - 256;
                  this.field_1791 = (var4 - this.field_1790 * -908602587) * 293108027;
               }
            }

            while(var3 < var4) {
               this.method_3033(this.field_1785, 256);
               this.method_3000();
               var3 += 256;
            }

            if(var1 > this.field_1796 * -1818884622277911111L) {
               if(!this.field_1797) {
                  if(-847045713 * this.field_1801 == 0 && this.field_1787 * 1580986367 == 0) {
                     this.method_3001((short)-15570);
                     this.field_1792 = 9154890315640078629L * (2000L + var1);
                     return;
                  }

                  this.field_1791 = Math.min(this.field_1787 * 1580986367, -847045713 * this.field_1801) * 293108027;
                  this.field_1787 = this.field_1801 * 1983108177;
               } else {
                  this.field_1797 = false;
               }

               this.field_1801 = 0;
               this.field_1796 = (2000L + var1) * -3931617280022767479L;
            }

            this.field_1795 = -919778555 * var3;
         } catch (Exception var6) {
            this.method_3001((short)8564);
            this.field_1792 = 9154890315640078629L * (var1 + 2000L);
         }

         try {
            if(var1 > 2377200656236085237L * this.field_1788 + 500000L) {
               var1 = this.field_1788 * 2377200656236085237L;
            }

            while(var1 > 5000L + this.field_1788 * 2377200656236085237L) {
               this.method_3038(256, 1327996083);
               this.field_1788 += (long)(256000 / (field_1793 * 1631160541)) * -5018830713457052579L;
            }
         } catch (Exception var5) {
            this.field_1788 = -5018830713457052579L * var1;
         }

      }
   }

   // $FF: renamed from: af () void
   public final void method_3027() {
      this.field_1797 = true;
   }

   // $FF: renamed from: ax (bh) void
   public static final void method_3028(class_3 var0) {
      class_126.field_1372 = var0;
   }

   // $FF: renamed from: ao () void
   public final void method_3029() {
      this.field_1797 = true;
   }

   // $FF: renamed from: o () void
   protected void method_3030() throws Exception {}

   // $FF: renamed from: aw () void
   public final void method_3031() {
      this.field_1797 = true;
   }

   // $FF: renamed from: e () void
   protected void method_3032() throws Exception {}

   // $FF: renamed from: ai (int[], int) void
   final void method_3033(int[] var1, int var2) {
      int var3 = var2;
      if(field_1781) {
         var3 = var2 << 1;
      }

      class_317.method_5628(var1, 0, var3);
      this.field_1798 -= var2 * 630272627;
      if(this.field_1786 != null && -1875393861 * this.field_1798 <= 0) {
         this.field_1798 += (1631160541 * field_1793 >> 4) * 630272627;
         class_82.method_1376(this.field_1786, (short)10038);
         this.method_2996(this.field_1786, this.field_1786.method_1932(), -1859037567);
         int var4 = 0;
         int var5 = 255;

         int var6;
         class_104 var10;
         label132:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if(var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; 0 != var9; var9 >>>= 4) {
               if((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  class_104 var11 = this.field_1799[var7];

                  while(null != var11) {
                     class_109 var12 = var11.field_1205;
                     if(null != var12 && var12.field_1261 > var8) {
                        var5 |= 1 << var7;
                        var10 = var11;
                        var11 = var11.field_1207;
                     } else {
                        var11.field_1208 = true;
                        int var13 = var11.method_1935();
                        var4 += var13;
                        if(var12 != null) {
                           var12.field_1261 += var13;
                        }

                        if(var4 >= 881118859 * this.field_1800) {
                           break label132;
                        }

                        class_104 var14 = var11.method_1931();
                        if(null != var14) {
                           for(int var15 = var11.field_1206; null != var14; var14 = var11.method_1947()) {
                              this.method_2996(var14, var15 * var14.method_1932() >> 8, -2006794885);
                           }
                        }

                        class_104 var18 = var11.field_1207;
                        var11.field_1207 = null;
                        if(var10 == null) {
                           this.field_1799[var7] = var18;
                        } else {
                           var10.field_1207 = var18;
                        }

                        if(var18 == null) {
                           this.field_1804[var7] = var10;
                        }

                        var11 = var18;
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            class_104 var16 = this.field_1799[var6];
            class_104[] var17 = this.field_1799;
            this.field_1804[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.field_1207;
               var16.field_1207 = null;
            }
         }
      }

      if(-1875393861 * this.field_1798 < 0) {
         this.field_1798 = 0;
      }

      if(this.field_1786 != null) {
         this.field_1786.method_1943(var1, 0, var2);
      }

      this.field_1788 = class_87.method_1516((byte)1) * -5018830713457052579L;
   }

   // $FF: renamed from: ay (int) void
   final void method_3034(int var1) {
      this.field_1798 -= 630272627 * var1;
      if(this.field_1798 * -1875393861 < 0) {
         this.field_1798 = 0;
      }

      if(null != this.field_1786) {
         this.field_1786.method_1933(var1);
      }

   }

   // $FF: renamed from: bl (bm) void
   static final void method_3035(class_104 var0) {
      var0.field_1208 = false;
      if(var0.field_1205 != null) {
         var0.field_1205.field_1261 = 0;
      }

      for(class_104 var1 = var0.method_1931(); var1 != null; var1 = var0.method_1947()) {
         class_82.method_1376(var1, (short)-6524);
      }

   }

   // $FF: renamed from: m () void
   protected void method_3036() {}

   // $FF: renamed from: an (int[], int) void
   final void method_3037(int[] var1, int var2) {
      int var3 = var2;
      if(field_1781) {
         var3 = var2 << 1;
      }

      class_317.method_5628(var1, 0, var3);
      this.field_1798 -= var2 * 630272627;
      if(this.field_1786 != null && -1875393861 * this.field_1798 <= 0) {
         this.field_1798 += (1631160541 * field_1793 >> 4) * 630272627;
         class_82.method_1376(this.field_1786, (short)-19153);
         this.method_2996(this.field_1786, this.field_1786.method_1932(), -1617450459);
         int var4 = 0;
         int var5 = 255;

         int var6;
         class_104 var10;
         label134:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if(var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; 0 != var9; var9 >>>= 4) {
               if((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  class_104 var11 = this.field_1799[var7];

                  while(null != var11) {
                     class_109 var12 = var11.field_1205;
                     if(null != var12 && var12.field_1261 > var8) {
                        var5 |= 1 << var7;
                        var10 = var11;
                        var11 = var11.field_1207;
                     } else {
                        var11.field_1208 = true;
                        int var13 = var11.method_1935();
                        var4 += var13;
                        if(var12 != null) {
                           var12.field_1261 += var13;
                        }

                        if(var4 >= 881118859 * this.field_1800) {
                           break label134;
                        }

                        class_104 var14 = var11.method_1931();
                        if(null != var14) {
                           for(int var15 = var11.field_1206; null != var14; var14 = var11.method_1947()) {
                              this.method_2996(var14, var15 * var14.method_1932() >> 8, -1819723898);
                           }
                        }

                        class_104 var18 = var11.field_1207;
                        var11.field_1207 = null;
                        if(var10 == null) {
                           this.field_1799[var7] = var18;
                        } else {
                           var10.field_1207 = var18;
                        }

                        if(var18 == null) {
                           this.field_1804[var7] = var10;
                        }

                        var11 = var18;
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            class_104 var16 = this.field_1799[var6];
            class_104[] var17 = this.field_1799;
            this.field_1804[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.field_1207;
               var16.field_1207 = null;
            }
         }
      }

      if(-1875393861 * this.field_1798 < 0) {
         this.field_1798 = 0;
      }

      if(this.field_1786 != null) {
         this.field_1786.method_1943(var1, 0, var2);
      }

      this.field_1788 = class_87.method_1516((byte)1) * -5018830713457052579L;
   }

   // $FF: renamed from: ad (int, int) void
   final void method_3038(int var1, int var2) {
      try {
         this.field_1798 -= 630272627 * var1;
         if(this.field_1798 * -1875393861 < 0) {
            if(var2 <= 601951401) {
               return;
            }

            this.field_1798 = 0;
         }

         if(null != this.field_1786) {
            this.field_1786.method_1933(var1);
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "bd.ad(" + ')');
      }
   }

   // $FF: renamed from: t () void
   protected void method_3039() throws Exception {}

   // $FF: renamed from: bq (bm) void
   static final void method_3040(class_104 var0) {
      var0.field_1208 = false;
      if(var0.field_1205 != null) {
         var0.field_1205.field_1261 = 0;
      }

      for(class_104 var1 = var0.method_1931(); var1 != null; var1 = var0.method_1947()) {
         class_82.method_1376(var1, (short)1094);
      }

   }

   // $FF: renamed from: bu (bm) void
   static final void method_3041(class_104 var0) {
      var0.field_1208 = false;
      if(var0.field_1205 != null) {
         var0.field_1205.field_1261 = 0;
      }

      for(class_104 var1 = var0.method_1931(); var1 != null; var1 = var0.method_1947()) {
         class_82.method_1376(var1, (short)9327);
      }

   }

   // $FF: renamed from: a () void
   protected void method_3042() throws Exception {}

   // $FF: renamed from: bv (bm, int) void
   final void method_3043(class_104 var1, int var2) {
      int var3 = var2 >> 5;
      class_104 var4 = this.field_1804[var3];
      if(var4 == null) {
         this.field_1799[var3] = var1;
      } else {
         var4.field_1207 = var1;
      }

      this.field_1804[var3] = var1;
      var1.field_1206 = var2;
   }

   // $FF: renamed from: bm (bm, int) void
   final void method_3044(class_104 var1, int var2) {
      int var3 = var2 >> 5;
      class_104 var4 = this.field_1804[var3];
      if(var4 == null) {
         this.field_1799[var3] = var1;
      } else {
         var4.field_1207 = var1;
      }

      this.field_1804[var3] = var1;
      var1.field_1206 = var2;
   }

   // $FF: renamed from: hi (int, int, int, int, int) void
   static final void method_3045(int var0, int var1, int var2, int var3, int var4) {
      try {
         for(int var5 = 0; var5 < 257317803 * client.field_1646; ++var5) {
            if(var4 == 360095755) {
               throw new IllegalStateException();
            }

            if(client.field_1695[var5] + client.field_1539[var5] > var0) {
               if(var4 == 360095755) {
                  throw new IllegalStateException();
               }

               if(client.field_1695[var5] < var0 + var2) {
                  if(var4 == 360095755) {
                     throw new IllegalStateException();
                  }

                  if(client.field_1632[var5] + client.field_1518[var5] > var1) {
                     if(var4 == 360095755) {
                        throw new IllegalStateException();
                     }

                     if(client.field_1518[var5] < var3 + var1) {
                        if(var4 == 360095755) {
                           throw new IllegalStateException();
                        }

                        client.field_1556[var5] = true;
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "bd.hi(" + ')');
      }
   }

   // $FF: renamed from: ab (int) void
   public final synchronized void method_3046(int var1) {
      try {
         this.field_1797 = true;

         try {
            this.method_3002(-2070498959);
         } catch (Exception var3) {
            this.method_3001((short)-2186);
            this.field_1792 = (class_87.method_1516((byte)1) + 2000L) * 9154890315640078629L;
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "bd.ab(" + ')');
      }
   }
}
