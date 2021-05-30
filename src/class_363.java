import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// $FF: renamed from: mc
public class class_363 {

   // $FF: renamed from: x ff
   class_221 field_4021;
   // $FF: renamed from: y float
   static final float field_4022 = 30.0F;
   // $FF: renamed from: r jv
   class_306 field_4023;
   // $FF: renamed from: v int
   static final int field_4024 = -65536;
   // $FF: renamed from: al int
   int field_4025;
   // $FF: renamed from: s mv
   static final class_373 field_4026;
   // $FF: renamed from: u mv
   static final class_373 field_4027;
   // $FF: renamed from: l mv
   static final class_373 field_4028;
   // $FF: renamed from: aq boolean
   boolean field_4029;
   // $FF: renamed from: an boolean
   boolean field_4030;
   // $FF: renamed from: e op[]
   class_66[] field_4031;
   // $FF: renamed from: d jv
   class_306 field_4032;
   // $FF: renamed from: a fo
   class_230 field_4033;
   // $FF: renamed from: k fo
   class_230 field_4034;
   // $FF: renamed from: m fo
   class_230 field_4035;
   // $FF: renamed from: ba int
   int field_4036;
   // $FF: renamed from: z ma
   class_361 field_4037;
   // $FF: renamed from: au java.util.HashSet
   HashSet field_4038;
   // $FF: renamed from: t int
   int field_4039;
   // $FF: renamed from: h int
   int field_4040;
   // $FF: renamed from: bs int
   int field_4041;
   // $FF: renamed from: i float
   float field_4042;
   // $FF: renamed from: ae float
   float field_4043;
   // $FF: renamed from: ai int
   int field_4044;
   // $FF: renamed from: ab int
   int field_4045;
   // $FF: renamed from: as int
   int field_4046;
   // $FF: renamed from: ad int
   int field_4047;
   // $FF: renamed from: aa java.util.HashSet
   HashSet field_4048;
   // $FF: renamed from: ar int
   int field_4049;
   // $FF: renamed from: ag boolean
   boolean field_4050;
   // $FF: renamed from: ax java.util.HashSet
   HashSet field_4051;
   // $FF: renamed from: ao int
   int field_4052;
   // $FF: renamed from: aj int
   int field_4053;
   // $FF: renamed from: am int
   int field_4054;
   // $FF: renamed from: az int
   int field_4055;
   // $FF: renamed from: av int
   int field_4056;
   // $FF: renamed from: ac int
   int field_4057;
   // $FF: renamed from: g java.util.HashMap
   HashMap field_4058;
   // $FF: renamed from: c java.util.HashMap
   HashMap field_4059;
   // $FF: renamed from: ay java.util.HashSet
   HashSet field_4060;
   // $FF: renamed from: bv java.util.HashSet
   HashSet field_4061;
   // $FF: renamed from: ak java.util.HashSet
   HashSet field_4062;
   // $FF: renamed from: bq int[]
   final int[] field_4063;
   // $FF: renamed from: at long
   long field_4064;
   // $FF: renamed from: w int
   int field_4065;
   // $FF: renamed from: b jv
   class_306 field_4066;
   // $FF: renamed from: bd int
   int field_4067;
   // $FF: renamed from: bz boolean
   public boolean field_4068;
   // $FF: renamed from: bu java.util.List
   List field_4069;
   // $FF: renamed from: bl java.util.Iterator
   Iterator field_4070;
   // $FF: renamed from: ah int
   int field_4071;
   // $FF: renamed from: bm ii
   class_280 field_4072;
   // $FF: renamed from: ap int
   int field_4073;
   // $FF: renamed from: bh oh
   class_67 field_4074;
   // $FF: renamed from: q int
   int field_4075;
   // $FF: renamed from: br int
   int field_4076;
   // $FF: renamed from: bf int
   int field_4077;
   // $FF: renamed from: o kt
   class_69 field_4078;


   // $FF: renamed from: fg (int, boolean) void
   public void method_6326(int var1, boolean var2) {
      if(!var2) {
         this.field_4062.add(Integer.valueOf(var1));
      } else {
         this.field_4062.remove(Integer.valueOf(var1));
      }

      this.method_6331(1702553770);
   }

   // $FF: renamed from: cy (fo) void
   void method_6327(class_230 var1) {
      if(null == this.field_4034 || this.field_4034 != var1) {
         this.method_6343(var1, 1690698622);
         this.method_6345(-1, -1, -1, 1196314609);
      }
   }

   // $FF: renamed from: n (byte) void
   public void method_6328(byte var1) {
      try {
         class_233.field_2604.method_5007(5);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mc.n(" + ')');
      }
   }

   // $FF: renamed from: bj (int, int, boolean, long) void
   void method_6329(int var1, int var2, boolean var3, long var4) {
      if(null != this.field_4034) {
         int var6 = (int)((float)(this.field_4065 * 832010327) + ((float)(var1 - -1688617501 * this.field_4025) - (float)this.method_6364(674989041) * this.field_4042 / 2.0F) / this.field_4042);
         int var7 = (int)((float)(this.field_4039 * 1449678648) - ((float)(var2 - -530472683 * this.field_4047) - (float)this.method_6365(-675409464) * this.field_4042 / 2.0F) / this.field_4042);
         this.field_4072 = this.field_4034.method_4399(var6 + this.field_4034.method_4376(1057202329) * 64, var7 + this.field_4034.method_4378((byte)-8) * 64, -1364697083);
         if(null != this.field_4072 && var3) {
            if(class_373.method_6616(-73925177) && class_145.field_1840[82] && class_145.field_1840[81]) {
               class_117.method_2253(this.field_4072.field_3236 * -1789274412, 349527629 * this.field_4072.field_3235, this.field_4072.field_3234 * -1820038389, false, 1279637997);
            } else {
               boolean var8 = true;
               if(this.field_4029) {
                  int var9 = var1 - this.field_4071 * 1421734232;
                  int var10 = var2 - this.field_4052 * -559799129;
                  if(var4 - this.field_4064 * 5467077858169346091L > 500L || var9 < -25 || var9 > 25 || var10 < -1014368273 || var10 > 25) {
                     var8 = false;
                  }
               }

               if(var8) {
                  class_40 var11 = class_112.method_2238(class_266.field_3080, client.field_1463.field_2384, (byte)8);
                  var11.field_263.method_176(this.field_4072.method_5156(-738811910), -1020694375);
                  client.field_1463.method_4079(var11, -2116421712);
                  this.field_4064 = 0L;
               }
            }
         }
      } else {
         this.field_4072 = null;
      }

   }

   // $FF: renamed from: fs (int) void
   public void method_6330(int var1) {
      this.field_4051 = new HashSet();
      this.field_4051.add(Integer.valueOf(var1));
      this.field_4046 = 0;
      this.field_4053 = 0;
   }

   // $FF: renamed from: bt (int) void
   void method_6331(int var1) {
      try {
         this.field_4038.clear();
         this.field_4038.addAll(this.field_4062);
         this.field_4038.addAll(this.field_4048);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mc.bt(" + ')');
      }
   }

   // $FF: renamed from: j (int) void
   void method_6332(int var1) {
      try {
         if(class_183.field_2249 != null) {
            this.field_4042 = this.field_4043;
         } else {
            if(this.field_4042 < this.field_4043) {
               if(var1 <= 1608501515) {
                  return;
               }

               this.field_4042 = Math.min(this.field_4043, this.field_4042 / 30.0F + this.field_4042);
            }

            if(this.field_4042 > this.field_4043) {
               if(var1 <= 1608501515) {
                  throw new IllegalStateException();
               }

               this.field_4042 = Math.max(this.field_4043, this.field_4042 - this.field_4042 / 30.0F);
            }

         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mc.j(" + ')');
      }
   }

   // $FF: renamed from: ac (int) void
   public void method_6333(int var1) {
      try {
         this.field_4044 = 1429368139;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mc.ac(" + ')');
      }
   }

   // $FF: renamed from: b (int, int, boolean, int) void
   final void method_6334(int var1, int var2, boolean var3, int var4) {
      try {
         this.field_4065 = var1 * -313724057;
         this.field_4039 = -1674748369 * var2;
         class_87.method_1516((byte)1);
         if(var3) {
            if(var4 >= -905615080) {
               return;
            }

            this.method_6335((byte)-37);
         }

      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "mc.b(" + ')');
      }
   }

   // $FF: renamed from: d (byte) void
   final void method_6335(byte var1) {
      try {
         this.field_4057 = -1498924457;
         this.field_4056 = -1280570873;
         this.field_4055 = -1728924767;
         this.field_4054 = 545785517;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mc.d(" + ')');
      }
   }

   // $FF: renamed from: s (int) boolean
   boolean method_6336(int var1) {
      try {
         boolean var10000;
         if(-1 != this.field_4040 * -1917021433) {
            if(var1 == 1294926493) {
               throw new IllegalStateException();
            }

            if(608372165 * this.field_4075 != -1) {
               if(var1 == 1294926493) {
                  throw new IllegalStateException();
               }

               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mc.s(" + ')');
      }
   }

   // $FF: renamed from: u (int, int, int, int) fo
   public class_230 method_6337(int var1, int var2, int var3, int var4) {
      try {
         Iterator var5 = this.field_4058.values().iterator();

         class_230 var6;
         do {
            if(!var5.hasNext()) {
               return null;
            }

            if(var4 == -1974002255) {
               throw new IllegalStateException();
            }

            var6 = (class_230)var5.next();
         } while(!var6.method_4388(var1, var2, var3, -1800856455));

         return var6;
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "mc.u(" + ')');
      }
   }

   // $FF: renamed from: l (int, int, int, boolean, int) void
   public void method_6338(int var1, int var2, int var3, boolean var4, int var5) {
      try {
         class_230 var6 = this.method_6337(var1, var2, var3, -437395298);
         if(null == var6) {
            if(var5 == 584425341) {
               throw new IllegalStateException();
            }

            if(!var4) {
               return;
            }

            if(var5 == 584425341) {
               return;
            }

            var6 = this.field_4033;
         }

         boolean var7;
         label56: {
            var7 = false;
            if(var6 == this.field_4035) {
               if(var5 == 584425341) {
                  throw new IllegalStateException();
               }

               if(!var4) {
                  break label56;
               }

               if(var5 == 584425341) {
                  throw new IllegalStateException();
               }
            }

            this.field_4035 = var6;
            this.method_6406(var6, -652584652);
            var7 = true;
         }

         if(!var7) {
            if(var5 == 584425341) {
               return;
            }

            if(!var4) {
               return;
            }

            if(var5 == 584425341) {
               throw new IllegalStateException();
            }
         }

         this.method_6345(var1, var2, var3, 1764750343);
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "mc.l(" + ')');
      }
   }

   // $FF: renamed from: o (int, int) void
   public void method_6339(int var1, int var2) {
      try {
         class_230 var3 = this.method_6356(var1, -139751965);
         if(var3 != null) {
            if(var2 >= 929092845) {
               throw new IllegalStateException();
            }

            this.method_6406(var3, -652584652);
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "mc.o(" + ')');
      }
   }

   // $FF: renamed from: c (byte) int
   public int method_6340(byte var1) {
      try {
         if(this.field_4034 == null) {
            if(var1 <= 13) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return this.field_4034.method_4370(-2104990133);
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mc.c(" + ')');
      }
   }

   // $FF: renamed from: dj (int, int, int) void
   void method_6341(int var1, int var2, int var3) {
      if(this.field_4034 != null) {
         int[] var4 = this.field_4034.method_4367(var1, var2, var3, (byte)39);
         if(null == var4) {
            var4 = this.field_4034.method_4367(this.field_4034.method_4381(-1515011937), this.field_4034.method_4380(1160841029), this.field_4034.method_4366(-1590985483), (byte)-86);
         }

         this.method_6334(var4[0] - this.field_4034.method_4376(1057202329) * 64, var4[1] - this.field_4034.method_4378((byte)-25) * 64, true, -980648173);
         this.field_4040 = 1918997833;
         this.field_4075 = -1751527693;
         this.field_4042 = this.method_6352(this.field_4034.method_4375(-940576476), 397334458);
         this.field_4043 = this.field_4042;
         this.field_4069 = null;
         this.field_4070 = null;
         this.field_4021.method_4239((short)768);
      }
   }

   // $FF: renamed from: ff (boolean) void
   public void method_6342(boolean var1) {
      this.field_4030 = !var1;
   }

   // $FF: renamed from: a (fo, int) void
   void method_6343(class_230 var1, int var2) {
      try {
         this.field_4034 = var1;
         class_221 var10001 = new class_221;
         var10001.method_4268(this.field_4031, this.field_4059, this.field_4066, this.field_4032);
         this.field_4021 = var10001;
         this.field_4037.method_6307(this.field_4034.method_4372((byte)-51), (byte)87);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "mc.a(" + ')');
      }
   }

   // $FF: renamed from: ds (int, int, int, int, int, int) boolean
   boolean method_6344(int var1, int var2, int var3, int var4, int var5, int var6) {
      return null == this.field_4074?true:(var1 == this.field_4074.field_508 && this.field_4074.field_500 == var2?(this.field_4041 * -1475310013 != this.field_4021.field_2515 * -978895597?true:(-451939943 * this.field_4036 != client.field_1493 * -106098945?true:(var3 <= 0 && var4 <= 0?var3 + var1 < var5 || var4 + var2 < var6:true))):true);
   }

   // $FF: renamed from: m (int, int, int, int) void
   void method_6345(int var1, int var2, int var3, int var4) {
      try {
         if(this.field_4034 == null) {
            if(var4 == 171073169) {
               throw new IllegalStateException();
            }
         } else {
            int[] var5 = this.field_4034.method_4367(var1, var2, var3, (byte)-18);
            if(null == var5) {
               if(var4 == 171073169) {
                  throw new IllegalStateException();
               }

               var5 = this.field_4034.method_4367(this.field_4034.method_4381(-1473064469), this.field_4034.method_4380(1792528249), this.field_4034.method_4366(-202586272), (byte)-64);
            }

            this.method_6334(var5[0] - this.field_4034.method_4376(1057202329) * 64, var5[1] - this.field_4034.method_4378((byte)-6) * 64, true, -1122278202);
            this.field_4040 = 1918997833;
            this.field_4075 = -1751527693;
            this.field_4042 = this.method_6352(this.field_4034.method_4375(-1426603184), 397334458);
            this.field_4043 = this.field_4042;
            this.field_4069 = null;
            this.field_4070 = null;
            this.field_4021.method_4239((short)768);
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "mc.m(" + ')');
      }
   }

   // $FF: renamed from: x (int, int, int, int, int, int) void
   public void method_6346(int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         int[] var7 = new int[4];
         class_65.method_655(var7);
         class_65.method_694(var1, var2, var1 + var3, var2 + var4);
         class_65.method_681(var1, var2, var3, var4, -16777216);
         int var8 = this.field_4037.method_6302(-192788125);
         if(var8 < 100) {
            this.method_6413(var1, var2, var3, var4, var8, 176616611);
         } else {
            if(!this.field_4021.method_4245(831698872)) {
               if(var6 == 461631309) {
                  return;
               }

               this.field_4021.method_4238(this.field_4023, this.field_4034.method_4372((byte)-29), client.field_1416, (byte)-19);
               if(!this.field_4021.method_4245(831698872)) {
                  if(var6 == 461631309) {
                     throw new IllegalStateException();
                  }

                  return;
               }
            }

            if(this.field_4051 != null) {
               if(var6 == 461631309) {
                  throw new IllegalStateException();
               }

               this.field_4053 += -1211656495;
               if(this.field_4053 * 1851163185 % (this.field_4049 * -1112417039) == 0) {
                  if(var6 == 461631309) {
                     throw new IllegalStateException();
                  }

                  this.field_4053 = 0;
                  this.field_4046 += -1626276559;
               }

               if(this.field_4046 * 930560977 >= 1572937001 * this.field_4044) {
                  if(var6 == 461631309) {
                     throw new IllegalStateException();
                  }

                  if(!this.field_4050) {
                     if(var6 == 461631309) {
                        throw new IllegalStateException();
                     }

                     this.field_4051 = null;
                  }
               }
            }

            int var9 = (int)Math.ceil((double)((float)var3 / this.field_4042));
            int var10 = (int)Math.ceil((double)((float)var4 / this.field_4042));
            this.field_4021.method_4240(this.field_4065 * 832010327 - var9 / 2, this.field_4039 * -1742821169 - var10 / 2, this.field_4065 * 832010327 + var9 / 2, -1742821169 * this.field_4039 + var10 / 2, var1, var2, var3 + var1, var2 + var4, 181464110);
            if(!this.field_4030) {
               if(var6 == 461631309) {
                  throw new IllegalStateException();
               }

               boolean var11 = false;
               if(var5 - this.field_4067 * -366242899 > 100) {
                  if(var6 == 461631309) {
                     throw new IllegalStateException();
                  }

                  this.field_4067 = 1547126821 * var5;
                  var11 = true;
               }

               this.field_4021.method_4253(this.field_4065 * 832010327 - var9 / 2, this.field_4039 * -1742821169 - var10 / 2, var9 / 2 + 832010327 * this.field_4065, var10 / 2 + -1742821169 * this.field_4039, var1, var2, var1 + var3, var2 + var4, this.field_4038, this.field_4051, 1851163185 * this.field_4053, -1112417039 * this.field_4049, var11, -1554077956);
            }

            this.method_6348(var1, var2, var3, var4, var9, var10, -511459104);
            if(class_373.method_6616(-1439151024)) {
               if(var6 == 461631309) {
                  throw new IllegalStateException();
               }

               if(this.field_4068) {
                  if(var6 == 461631309) {
                     throw new IllegalStateException();
                  }

                  if(null != this.field_4072) {
                     this.field_4078.method_869("Coord: " + this.field_4072, 10 + class_65.field_489, 20 + class_65.field_487, 16776960, -1);
                  }
               }
            }

            this.field_4073 = var9 * 1583257571;
            this.field_4045 = -1647763857 * var10;
            this.field_4025 = -1219792949 * var1;
            this.field_4047 = var2 * 962963005;
            class_65.method_690(var7);
         }
      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12, "mc.x(" + ')');
      }
   }

   // $FF: renamed from: z (int, int, int, int, int, int, int) boolean
   boolean method_6347(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if(null == this.field_4074) {
            return true;
         } else {
            if(var1 == this.field_4074.field_508) {
               if(this.field_4074.field_500 == var2) {
                  if(this.field_4041 * -330827285 != this.field_4021.field_2515 * -978895597) {
                     if(var7 != -787270257) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }

                  if(-451939943 * this.field_4036 != client.field_1493 * -106098945) {
                     if(var7 != -787270257) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }

                  if(var3 <= 0) {
                     if(var7 != -787270257) {
                        throw new IllegalStateException();
                     }

                     if(var4 <= 0) {
                        if(var3 + var1 >= var5) {
                           if(var7 != -787270257) {
                              throw new IllegalStateException();
                           }

                           if(var4 + var2 >= var6) {
                              return false;
                           }

                           if(var7 != -787270257) {
                              throw new IllegalStateException();
                           }
                        }

                        return true;
                     }

                     if(var7 != -787270257) {
                        throw new IllegalStateException();
                     }
                  }

                  return true;
               }

               if(var7 != -787270257) {
                  throw new IllegalStateException();
               }
            }

            return true;
         }
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "mc.z(" + ')');
      }
   }

   // $FF: renamed from: w (int, int, int, int, int, int, int) void
   void method_6348(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if(null != class_183.field_2249) {
            int var8 = 512 / (-1957791194 * this.field_4021.field_2515);
            int var9 = var3 + 512;
            int var10 = var4 + 512;
            float var11 = 1.0F;
            var9 = (int)((float)var9 / var11);
            var10 = (int)((float)var10 / var11);
            int var12 = this.method_6361(-1282088585) - var5 / 2 - var8;
            int var13 = this.method_6477(874729117) - var6 / 2 - var8;
            int var14 = var1 - (var12 + var8 - this.field_4076 * 420522837) * -978895597 * this.field_4021.field_2515;
            int var15 = var2 - (var8 - (var13 - this.field_4077 * 789017035)) * this.field_4021.field_2515 * -978895597;
            if(this.method_6347(var9, var10, var14, var15, var3, var4, -787270257)) {
               if(var7 != -511459104) {
                  throw new IllegalStateException();
               }

               label53: {
                  if(null != this.field_4074) {
                     if(var7 != -511459104) {
                        return;
                     }

                     if(var9 == this.field_4074.field_508) {
                        if(var7 != -511459104) {
                           return;
                        }

                        if(var10 == this.field_4074.field_500) {
                           Arrays.fill(this.field_4074.field_502, 0);
                           break label53;
                        }
                     }
                  }

                  class_67 var10001 = new class_67;
                  var10001.method_754(var9, var10);
                  this.field_4074 = var10001;
               }

               this.field_4076 = (this.method_6361(-1338016692) - var5 / 2 - var8) * -1369572867;
               this.field_4077 = (this.method_6477(1756032640) - var6 / 2 - var8) * 666577891;
               this.field_4041 = this.field_4021.field_2515 * 1460279161;
               class_183.field_2249.method_5321(420522837 * this.field_4076, 789017035 * this.field_4077, this.field_4074, (float)(this.field_4041 * -330827285) / var11, -7099286);
               this.field_4036 = client.field_1493 * -692972457;
               var14 = var1 - (var8 + var12 - 420522837 * this.field_4076) * this.field_4021.field_2515 * -978895597;
               var15 = var2 - this.field_4021.field_2515 * -978895597 * (var8 - (var13 - 789017035 * this.field_4077));
            }

            class_65.method_665(var1, var2, var3, var4, 0, 128);
            if(1.0F == var11) {
               if(var7 != -511459104) {
                  throw new IllegalStateException();
               }

               this.field_4074.method_796(var14, var15, 192);
            } else {
               this.field_4074.method_780(var14, var15, (int)(var11 * (float)var9), (int)((float)var10 * var11), 192);
            }
         }

      } catch (RuntimeException var16) {
         throw class_223.method_4281(var16, "mc.w(" + ')');
      }
   }

   // $FF: renamed from: ec () boolean
   public boolean method_6349() {
      return this.field_4037.method_6297(1249544403);
   }

   // $FF: renamed from: h (int, byte) void
   public void method_6350(int var1, byte var2) {
      try {
         this.field_4043 = this.method_6352(var1, 397334458);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "mc.h(" + ')');
      }
   }

   // $FF: renamed from: dp () void
   public void method_6351() {
      this.field_4037.method_6299((byte)-27);
   }

   // $FF: renamed from: i (int, int) float
   float method_6352(int var1, int var2) {
      try {
         if(var1 == 25) {
            if(var2 != 397334458) {
               throw new IllegalStateException();
            } else {
               return 1.0F;
            }
         } else if(var1 == 37) {
            if(var2 != 397334458) {
               throw new IllegalStateException();
            } else {
               return 1.5F;
            }
         } else if(50 == var1) {
            if(var2 != 397334458) {
               throw new IllegalStateException();
            } else {
               return 2.0F;
            }
         } else {
            return 75 == var1?3.0F:(100 == var1?4.0F:8.0F);
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "mc.i(" + ')');
      }
   }

   // $FF: renamed from: ae (byte) int
   public int method_6353(byte var1) {
      try {
         if(1.0D == (double)this.field_4043) {
            if(var1 <= 3) {
               throw new IllegalStateException();
            } else {
               return 25;
            }
         } else if((double)this.field_4043 == 1.5D) {
            if(var1 <= 3) {
               throw new IllegalStateException();
            } else {
               return 37;
            }
         } else if(2.0D == (double)this.field_4043) {
            if(var1 <= 3) {
               throw new IllegalStateException();
            } else {
               return 50;
            }
         } else if((double)this.field_4043 == 3.0D) {
            if(var1 <= 3) {
               throw new IllegalStateException();
            } else {
               return 75;
            }
         } else {
            return 4.0D == (double)this.field_4043?100:200;
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mc.ae(" + ')');
      }
   }

   // $FF: renamed from: cr (int, int, int, boolean) void
   public void method_6354(int var1, int var2, int var3, boolean var4) {
      class_230 var5 = this.method_6337(var1, var2, var3, 1873668880);
      if(null == var5) {
         if(!var4) {
            return;
         }

         var5 = this.field_4033;
      }

      boolean var6 = false;
      if(var5 != this.field_4035 || var4) {
         this.field_4035 = var5;
         this.method_6406(var5, -652584652);
         var6 = true;
      }

      if(var6 || var4) {
         this.method_6345(var1, var2, var3, -92418776);
      }

   }

   // $FF: renamed from: dh (int) float
   float method_6355(int var1) {
      return var1 == 25?1.0F:(var1 == -2011205659?1.5F:(-16288522 == var1?2.0F:(2083640510 == var1?3.0F:(100 == var1?4.0F:8.0F))));
   }

   // $FF: renamed from: al (int, int) fo
   public class_230 method_6356(int var1, int var2) {
      try {
         Iterator var3 = this.field_4058.values().iterator();

         class_230 var4;
         do {
            if(!var3.hasNext()) {
               return null;
            }

            if(var2 >= 19136899) {
               throw new IllegalStateException();
            }

            var4 = (class_230)var3.next();
         } while(var4.method_4370(-1246851797) != var1);

         if(var2 >= 19136899) {
            throw new IllegalStateException();
         } else {
            return var4;
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "mc.al(" + ')');
      }
   }

   // $FF: renamed from: af (int) void
   public void method_6357(int var1) {
      try {
         this.field_4051 = null;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mc.af(" + ')');
      }
   }

   // $FF: renamed from: ai (int, int, byte) void
   public void method_6358(int var1, int var2, byte var3) {
      try {
         if(null != this.field_4034) {
            this.method_6334(var1 - this.field_4034.method_4376(1057202329) * 64, var2 - this.field_4034.method_4378((byte)-79) * 64, true, -1902271456);
            this.field_4040 = 1918997833;
            this.field_4075 = -1751527693;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "mc.ai(" + ')');
      }
   }

   // $FF: renamed from: bq (int, int, int, int, int, int, int) void
   public void method_6359(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if(this.field_4037.method_6297(1884360538)) {
            int var8 = (int)Math.ceil((double)((float)var3 / this.field_4042));
            int var9 = (int)Math.ceil((double)((float)var4 / this.field_4042));
            List var10 = this.field_4021.method_4244(this.field_4065 * 832010327 - var8 / 2 - 1, this.field_4039 * -1742821169 - var9 / 2 - 1, 1 + 832010327 * this.field_4065 + var8 / 2, 1 + var9 / 2 + -1742821169 * this.field_4039, var1, var2, var3, var4, var5, var6, 1176251494);
            if(var10.isEmpty()) {
               if(var7 == 1618402435) {
                  throw new IllegalStateException();
               }
            } else {
               Iterator var11 = var10.iterator();

               boolean var14;
               do {
                  if(!var11.hasNext()) {
                     return;
                  }

                  if(var7 == 1618402435) {
                     return;
                  }

                  class_218 var12 = (class_218)var11.next();
                  class_75 var13 = class_116.method_2248(var12.method_4205(2145110635), 1647125333);
                  var14 = false;

                  for(int var15 = this.field_4063.length - 1; var15 >= 0; --var15) {
                     if(null != var13.field_610[var15]) {
                        if(var7 == 1618402435) {
                           throw new IllegalStateException();
                        }

                        class_247.method_4712(var13.field_610[var15], var13.field_611, this.field_4063[var15], var12.method_4205(2147437438), var12.field_2480.method_5156(-738811910), var12.field_2482.method_5156(-738811910), -1600713156);
                        var14 = true;
                     }
                  }
               } while(!var14);

               if(var7 == 1618402435) {
                  throw new IllegalStateException();
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class_223.method_4281(var16, "mc.bq(" + ')');
      }
   }

   // $FF: renamed from: ag (int, int, int, int) void
   public void method_6360(int var1, int var2, int var3, int var4) {
      try {
         if(null == this.field_4034) {
            if(var4 != 1982259081) {
               throw new IllegalStateException();
            }
         } else {
            int[] var5 = this.field_4034.method_4367(var1, var2, var3, (byte)-98);
            if(var5 != null) {
               if(var4 != 1982259081) {
                  throw new IllegalStateException();
               }

               this.method_6358(var5[0], var5[1], (byte)17);
            }

         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "mc.ag(" + ')');
      }
   }

   // $FF: renamed from: ax (int) int
   public int method_6361(int var1) {
      try {
         if(null == this.field_4034) {
            if(var1 >= 118108632) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return this.field_4065 * 832010327 + this.field_4034.method_4376(1057202329) * 64;
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mc.ax(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_6362() {
      field_4026 = class_373.field_4118;
      field_4027 = class_373.field_4115;
      field_4028 = class_373.field_4119;
   }

   // $FF: renamed from: dm () void
   public void method_6363() {
      this.field_4037.method_6299((byte)-72);
   }

   // $FF: renamed from: am (int) int
   public int method_6364(int var1) {
      try {
         return -713333301 * this.field_4073;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mc.am(" + ')');
      }
   }

   // $FF: renamed from: az (int) int
   public int method_6365(int var1) {
      try {
         return this.field_4045 * 1104674959;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mc.az(" + ')');
      }
   }

   // $FF: renamed from: gq (int) boolean
   public boolean method_6366(int var1) {
      return !this.field_4060.contains(Integer.valueOf(var1));
   }

   // $FF: renamed from: do (int, int, int, int, int, int) boolean
   boolean method_6367(int var1, int var2, int var3, int var4, int var5, int var6) {
      return null == this.field_4074?true:(var1 == this.field_4074.field_508 && this.field_4074.field_500 == var2?(this.field_4041 * -330827285 != this.field_4021.field_2515 * -978895597?true:(-451939943 * this.field_4036 != client.field_1493 * -106098945?true:(var3 <= 0 && var4 <= 0?var3 + var1 < var5 || var4 + var2 < var6:true))):true);
   }

   // $FF: renamed from: at (int, byte) void
   public void method_6368(int var1, byte var2) {
      try {
         if(var1 >= 1) {
            if(var2 <= 0) {
               throw new IllegalStateException();
            }

            this.field_4049 = 1858442257 * var1;
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "mc.at(" + ')');
      }
   }

   // $FF: renamed from: ah (int) void
   public void method_6369(int var1) {
      try {
         this.field_4049 = -1567167662;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mc.ah(" + ')');
      }
   }

   // $FF: renamed from: dr (int, int, int) void
   void method_6370(int var1, int var2, int var3) {
      if(this.field_4034 != null) {
         int[] var4 = this.field_4034.method_4367(var1, var2, var3, (byte)-28);
         if(null == var4) {
            var4 = this.field_4034.method_4367(this.field_4034.method_4381(-1820256094), this.field_4034.method_4380(2050107551), this.field_4034.method_4366(-718802738), (byte)-66);
         }

         this.method_6334(var4[0] - this.field_4034.method_4376(1057202329) * 64, var4[1] - this.field_4034.method_4378((byte)-27) * 64, true, -1077142439);
         this.field_4040 = 1918997833;
         this.field_4075 = -1751527693;
         this.field_4042 = this.method_6352(this.field_4034.method_4375(-745248178), 397334458);
         this.field_4043 = this.field_4042;
         this.field_4069 = null;
         this.field_4070 = null;
         this.field_4021.method_4239((short)768);
      }
   }

   // $FF: renamed from: aq (int, int) void
   public void method_6371(int var1, int var2) {
      try {
         this.field_4051 = new HashSet();
         this.field_4051.add(Integer.valueOf(var1));
         this.field_4046 = 0;
         this.field_4053 = 0;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "mc.aq(" + ')');
      }
   }

   // $FF: renamed from: cs (int, int, int, boolean) void
   public void method_6372(int var1, int var2, int var3, boolean var4) {
      class_230 var5 = this.method_6337(var1, var2, var3, -326935866);
      if(null == var5) {
         if(!var4) {
            return;
         }

         var5 = this.field_4033;
      }

      boolean var6 = false;
      if(var5 != this.field_4035 || var4) {
         this.field_4035 = var5;
         this.method_6406(var5, -652584652);
         var6 = true;
      }

      if(var6 || var4) {
         this.method_6345(var1, var2, var3, 595958645);
      }

   }

   // $FF: renamed from: au (byte) boolean
   public boolean method_6373(byte var1) {
      try {
         boolean var10000;
         if(!this.field_4030) {
            if(var1 == 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mc.au(" + ')');
      }
   }

   // $FF: renamed from: bf (int, int, boolean, boolean) void
   public void method_6374(int var1, int var2, boolean var3, boolean var4) {
      long var5 = class_87.method_1516((byte)1);
      this.method_6480(var1, var2, var4, var5);
      if(!this.method_6336(-396003202) && (var4 || var3)) {
         if(var4) {
            this.field_4056 = var1 * -1154474066;
            this.field_4057 = var2 * -2106337263;
            this.field_4054 = 563716917 * this.field_4065;
            this.field_4055 = -7484037 * this.field_4039;
         }

         if(-1 != this.field_4054 * 154077344) {
            int var7 = var1 - -1912368162 * this.field_4056;
            int var8 = var2 - -1142772071 * this.field_4057;
            this.method_6334(951497435 * this.field_4054 - (int)((float)var7 / this.field_4043), 1274586489 * this.field_4055 + (int)((float)var8 / this.field_4043), false, -1545620048);
         }
      } else {
         this.method_6335((byte)-20);
      }

      if(var4) {
         this.field_4064 = var5 * -3031588181185157501L;
         this.field_4071 = var1 * -1638283545;
         this.field_4052 = var2 * 1936904862;
      }

   }

   // $FF: renamed from: ay (int, boolean, int) void
   public void method_6375(int var1, boolean var2, int var3) {
      try {
         if(!var2) {
            this.field_4062.add(Integer.valueOf(var1));
         } else {
            this.field_4062.remove(Integer.valueOf(var1));
         }

         this.method_6331(2115531770);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "mc.ay(" + ')');
      }
   }

   // $FF: renamed from: ej (int, int, int) void
   public void method_6376(int var1, int var2, int var3) {
      if(this.field_4034 != null) {
         int[] var4 = this.field_4034.method_4367(var1, var2, var3, (byte)-3);
         if(null != var4) {
            this.method_6437(var4[0], var4[1], 704726635);
         }

      }
   }

   // $FF: renamed from: eb () int
   public int method_6377() {
      return null == this.field_4034?-1:this.field_4065 * 832010327 + this.field_4034.method_4376(1057202329) * 373085380;
   }

   // $FF: renamed from: an (int, byte) boolean
   public boolean method_6378(int var1, byte var2) {
      try {
         return !this.field_4062.contains(Integer.valueOf(var1));
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "mc.an(" + ')');
      }
   }

   // $FF: renamed from: bd (int, int) boolean
   public boolean method_6379(int var1, int var2) {
      try {
         boolean var10000;
         if(!this.field_4060.contains(Integer.valueOf(var1))) {
            if(var2 <= -1647356039) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "mc.bd(" + ')');
      }
   }

   // $FF: renamed from: e (int) fo
   public class_230 method_6380(int var1) {
      try {
         return this.field_4034;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mc.e(" + ')');
      }
   }

   // $FF: renamed from: fx (int, boolean) void
   public void method_6381(int var1, boolean var2) {
      if(!var2) {
         this.field_4060.add(Integer.valueOf(var1));
      } else {
         this.field_4060.remove(Integer.valueOf(var1));
      }

      for(int var3 = 0; var3 < -617825071 * class_331.field_3858; ++var3) {
         if(class_116.method_2248(var3, 1647125333) != null && class_116.method_2248(var3, 1647125333).field_621 * 482350019 == var1) {
            int var4 = class_116.method_2248(var3, 1647125333).field_607 * -298295867;
            if(!var2) {
               this.field_4048.add(Integer.valueOf(var4));
            } else {
               this.field_4048.remove(Integer.valueOf(var4));
            }
         }
      }

      this.method_6331(1715946404);
   }

   // $FF: renamed from: bu (int, ii, int) ii
   public class_280 method_6382(int var1, class_280 var2, int var3) {
      try {
         if(!this.field_4037.method_6297(460592037)) {
            if(var3 >= -896583148) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if(!this.field_4021.method_4245(831698872)) {
            if(var3 >= -896583148) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if(!this.field_4034.method_4387(var2.field_3236 * -2092998769, var2.field_3235 * 349527629, -1197679631)) {
            if(var3 >= -896583148) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            HashMap var4 = this.field_4021.method_4246(1724645516);
            List var5 = (List)var4.get(Integer.valueOf(var1));
            if(null != var5) {
               if(var3 >= -896583148) {
                  throw new IllegalStateException();
               }

               if(!var5.isEmpty()) {
                  class_218 var6 = null;
                  int var7 = -1;
                  Iterator var8 = var5.iterator();

                  while(var8.hasNext()) {
                     if(var3 >= -896583148) {
                        throw new IllegalStateException();
                     }

                     class_218 var9 = (class_218)var8.next();
                     int var10 = var9.field_2482.field_3236 * -2092998769 - -2092998769 * var2.field_3236;
                     int var11 = 349527629 * var9.field_2482.field_3235 - var2.field_3235 * 349527629;
                     int var12 = var11 * var11 + var10 * var10;
                     if(var12 == 0) {
                        if(var3 >= -896583148) {
                           throw new IllegalStateException();
                        }

                        return var9.field_2482;
                     }

                     if(var12 >= var7) {
                        if(var3 >= -896583148) {
                           throw new IllegalStateException();
                        }

                        if(var6 != null) {
                           continue;
                        }
                     }

                     var6 = var9;
                     var7 = var12;
                  }

                  return var6.field_2482;
               }

               if(var3 >= -896583148) {
                  throw new IllegalStateException();
               }
            }

            return null;
         }
      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13, "mc.bu(" + ')');
      }
   }

   // $FF: renamed from: bl (int, int, ii, ii, int) void
   public void method_6383(int var1, int var2, class_280 var3, class_280 var4, int var5) {
      try {
         class_45 var10000 = new class_45;
         var10000.method_105();
         class_45 var6 = var10000;
         class_250 var9 = new class_250;
         var9.method_4721(var2, var3, var4);
         class_250 var7 = var9;
         var6.method_520(new Object[]{var7}, 1143010333);
         switch(var1) {
         case 1008:
            var6.method_519(10, 566555821);
            break;
         case 1009:
            var6.method_519(11, -2058392684);
            break;
         case 1010:
            var6.method_519(12, -1120315567);
            break;
         case 1011:
            var6.method_519(13, -95938054);
            break;
         case 1012:
            var6.method_519(14, -415837080);
         }

         class_203.method_4099(var6, (byte)1);
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "mc.bl(" + ')');
      }
   }

   // $FF: renamed from: ce () fo
   public class_230 method_6384() {
      return this.field_4034;
   }

   // $FF: renamed from: bm (int) gq
   public class_218 method_6385(int var1) {
      try {
         if(null == this.field_4070) {
            if(var1 >= 659756609) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            class_218 var2;
            do {
               if(!this.field_4070.hasNext()) {
                  return null;
               }

               if(var1 >= 659756609) {
                  throw new IllegalStateException();
               }

               var2 = (class_218)this.field_4070.next();
            } while(var2.method_4205(2145068591) == -1);

            if(var1 >= 659756609) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "mc.bm(" + ')');
      }
   }

   // $FF: renamed from: <init> () void
   public void method_6386() {
      super();
      this.field_4040 = 1918997833;
      this.field_4075 = -1751527693;
      this.field_4073 = -1583257571;
      this.field_4045 = 1647763857;
      this.field_4025 = 1219792949;
      this.field_4047 = -962963005;
      this.field_4044 = 1429368139;
      this.field_4049 = -1567167662;
      this.field_4050 = false;
      this.field_4051 = null;
      this.field_4046 = 1626276559;
      this.field_4053 = 1211656495;
      this.field_4054 = 545785517;
      this.field_4055 = -1728924767;
      this.field_4056 = -1280570873;
      this.field_4057 = -1498924457;
      this.field_4029 = true;
      this.field_4062 = new HashSet();
      this.field_4060 = new HashSet();
      this.field_4048 = new HashSet();
      this.field_4038 = new HashSet();
      this.field_4030 = false;
      this.field_4067 = 0;
      this.field_4063 = new int[]{1008, 1009, 1010, 1011, 1012};
      this.field_4061 = new HashSet();
      this.field_4072 = null;
      this.field_4068 = false;
      this.field_4076 = 1369572867;
      this.field_4077 = -666577891;
      this.field_4036 = 1193618775;
   }

   // $FF: renamed from: bz (jv, jv, jv, kt, java.util.HashMap, op[]) void
   public void method_6387(class_306 var1, class_306 var2, class_306 var3, class_69 var4, HashMap var5, class_66[] var6) {
      this.field_4031 = var6;
      this.field_4023 = var1;
      this.field_4066 = var2;
      this.field_4032 = var3;
      this.field_4078 = var4;
      this.field_4059 = new HashMap();
      this.field_4059.put(class_232.field_2594, var5.get(field_4026));
      this.field_4059.put(class_232.field_2595, var5.get(field_4027));
      this.field_4059.put(class_232.field_2596, var5.get(field_4028));
      class_361 var10001 = new class_361;
      var10001.method_6304(var1);
      this.field_4037 = var10001;
      int var7 = this.field_4023.method_5399(class_254.field_2874.field_2873, -514084749);
      int[] var8 = this.field_4023.method_5392(var7, (byte)8);
      this.field_4058 = new HashMap(var8.length);

      for(int var9 = 0; var9 < var8.length; ++var9) {
         class_28 var10000 = new class_28;
         var10000.method_178(this.field_4023.method_5381(var7, var8[var9], -26460885));
         class_28 var10 = var10000;
         class_230 var12 = new class_230;
         var12.method_4404();
         class_230 var11 = var12;
         var11.method_4363(var10, var8[var9], -1839665578);
         this.field_4058.put(var11.method_4372((byte)-58), var11);
         if(var11.method_4371((byte)1)) {
            this.field_4033 = var11;
         }
      }

      this.method_6406(this.field_4033, -652584652);
      this.field_4035 = null;
   }

   // $FF: renamed from: bh () void
   public void method_6388() {
      class_233.field_2604.method_5007(5);
   }

   // $FF: renamed from: bs () void
   public void method_6389() {
      class_233.field_2604.method_5007(5);
   }

   // $FF: renamed from: br (int, int, boolean, int, int, int, int) void
   public void method_6390(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if(this.field_4037.method_6297(634361208)) {
         this.method_6332(1807683413);
         this.method_6512((byte)68);
         if(var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.field_4042));
            int var9 = (int)Math.ceil((double)((float)var7 / this.field_4042));
            List var10 = this.field_4021.method_4244(832010327 * this.field_4065 - var8 / 2 - 1, -1742821169 * this.field_4039 - var9 / 2 - 1, this.field_4065 * 832010327 + var8 / 2 + 1, 1 + this.field_4039 * -1582007914 + var9 / 2, var4, var5, var6, var7, var1, var2, 497013709);
            HashSet var11 = new HashSet();

            Iterator var12;
            class_218 var13;
            class_45 var14;
            class_250 var15;
            class_45 var10000;
            class_250 var16;
            for(var12 = var10.iterator(); var12.hasNext(); class_203.method_4099(var14, (byte)1)) {
               var13 = (class_218)var12.next();
               var11.add(var13);
               var10000 = new class_45;
               var10000.method_105();
               var14 = var10000;
               var16 = new class_250;
               var16.method_4721(var13.method_4205(2146412336), var13.field_2480, var13.field_2482);
               var15 = var16;
               var14.method_520(new Object[]{var15, Integer.valueOf(var1), Integer.valueOf(var2)}, 778478602);
               if(this.field_4061.contains(var13)) {
                  var14.method_519(17, 732918825);
               } else {
                  var14.method_519(15, 1621003160);
               }
            }

            var12 = this.field_4061.iterator();

            while(var12.hasNext()) {
               var13 = (class_218)var12.next();
               if(!var11.contains(var13)) {
                  var10000 = new class_45;
                  var10000.method_105();
                  var14 = var10000;
                  var16 = new class_250;
                  var16.method_4721(var13.method_4205(2147315168), var13.field_2480, var13.field_2482);
                  var15 = var16;
                  var14.method_520(new Object[]{var15, Integer.valueOf(var1), Integer.valueOf(var2)}, 1312515593);
                  var14.method_519(16, -1536046676);
                  class_203.method_4099(var14, (byte)1);
               }
            }

            this.field_4061 = var11;
         }
      }
   }

   // $FF: renamed from: v (jv, jv, jv, kt, java.util.HashMap, op[], int) void
   public void method_6391(class_306 var1, class_306 var2, class_306 var3, class_69 var4, HashMap var5, class_66[] var6, int var7) {
      try {
         this.field_4031 = var6;
         this.field_4023 = var1;
         this.field_4066 = var2;
         this.field_4032 = var3;
         this.field_4078 = var4;
         this.field_4059 = new HashMap();
         this.field_4059.put(class_232.field_2594, var5.get(field_4026));
         this.field_4059.put(class_232.field_2595, var5.get(field_4027));
         this.field_4059.put(class_232.field_2596, var5.get(field_4028));
         class_361 var10001 = new class_361;
         var10001.method_6304(var1);
         this.field_4037 = var10001;
         int var8 = this.field_4023.method_5399(class_254.field_2874.field_2873, -1008280168);
         int[] var9 = this.field_4023.method_5392(var8, (byte)8);
         this.field_4058 = new HashMap(var9.length);

         for(int var10 = 0; var10 < var9.length; ++var10) {
            if(var7 != 1276633974) {
               throw new IllegalStateException();
            }

            class_28 var10000 = new class_28;
            var10000.method_178(this.field_4023.method_5381(var8, var9[var10], -26460885));
            class_28 var11 = var10000;
            class_230 var14 = new class_230;
            var14.method_4404();
            class_230 var12 = var14;
            var12.method_4363(var11, var9[var10], -1949118640);
            this.field_4058.put(var12.method_4372((byte)-62), var12);
            if(var12.method_4371((byte)1)) {
               if(var7 != 1276633974) {
                  return;
               }

               this.field_4033 = var12;
            }
         }

         this.method_6406(this.field_4033, -652584652);
         this.field_4035 = null;
      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13, "mc.v(" + ')');
      }
   }

   // $FF: renamed from: ge () gq
   public class_218 method_6392() {
      if(!this.field_4037.method_6297(1380398181)) {
         return null;
      } else if(!this.field_4021.method_4245(831698872)) {
         return null;
      } else {
         HashMap var1 = this.field_4021.method_4246(-332035977);
         this.field_4069 = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.field_4069.addAll(var3);
         }

         this.field_4070 = this.field_4069.iterator();
         return this.method_6385(-1021936639);
      }
   }

   // $FF: renamed from: be (int, int, boolean, long) void
   void method_6393(int var1, int var2, boolean var3, long var4) {
      if(null != this.field_4034) {
         int var6 = (int)((float)(this.field_4065 * 832010327) + ((float)(var1 - -1229865882 * this.field_4025) - (float)this.method_6364(-254099309) * this.field_4042 / 2.0F) / this.field_4042);
         int var7 = (int)((float)(this.field_4039 * -1160065687) - ((float)(var2 - -530472683 * this.field_4047) - (float)this.method_6365(1407368258) * this.field_4042 / 2.0F) / this.field_4042);
         this.field_4072 = this.field_4034.method_4399(var6 + this.field_4034.method_4376(1057202329) * 944089071, var7 + this.field_4034.method_4378((byte)-102) * -402481068, -987630220);
         if(null != this.field_4072 && var3) {
            if(class_373.method_6616(-1249035339) && class_145.field_1840[82] && class_145.field_1840[81]) {
               class_117.method_2253(this.field_4072.field_3236 * -2092998769, 349527629 * this.field_4072.field_3235, this.field_4072.field_3234 * 351369485, false, 1101744264);
            } else {
               boolean var8 = true;
               if(this.field_4029) {
                  int var9 = var1 - this.field_4071 * 1480322263;
                  int var10 = var2 - this.field_4052 * -1806305504;
                  if(var4 - this.field_4064 * 5467077858169346091L > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                     var8 = false;
                  }
               }

               if(var8) {
                  class_40 var11 = class_112.method_2238(class_266.field_3080, client.field_1463.field_2384, (byte)8);
                  var11.field_263.method_176(this.field_4072.method_5156(-738811910), -384729718);
                  client.field_1463.method_4079(var11, -1743666490);
                  this.field_4064 = 0L;
               }
            }
         }
      } else {
         this.field_4072 = null;
      }

   }

   // $FF: renamed from: bb () void
   void method_6394() {
      if(this.method_6336(1125432847)) {
         int var1 = this.field_4040 * -1917021433 - 832010327 * this.field_4065;
         int var2 = this.field_4075 * -799723777 - -1742821169 * this.field_4039;
         if(0 != var1) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if(0 != var2) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         this.method_6334(971419982 * this.field_4065 + var1, var2 + this.field_4039 * -172065070, true, -1106581934);
         if(-1917021433 * this.field_4040 == this.field_4065 * 832010327 && this.field_4039 * -1742821169 == this.field_4075 * 608372165) {
            this.field_4040 = 1918997833;
            this.field_4075 = -1751527693;
         }

      }
   }

   // $FF: renamed from: ea () boolean
   public boolean method_6395() {
      return this.field_4037.method_6297(574668714);
   }

   // $FF: renamed from: bp () void
   void method_6396() {
      if(class_183.field_2249 != null) {
         this.field_4042 = this.field_4043;
      } else {
         if(this.field_4042 < this.field_4043) {
            this.field_4042 = Math.min(this.field_4043, this.field_4042 / 30.0F + this.field_4042);
         }

         if(this.field_4042 > this.field_4043) {
            this.field_4042 = Math.max(this.field_4043, this.field_4042 - this.field_4042 / 30.0F);
         }

      }
   }

   // $FF: renamed from: bn () void
   void method_6397() {
      if(class_183.field_2249 != null) {
         this.field_4042 = this.field_4043;
      } else {
         if(this.field_4042 < this.field_4043) {
            this.field_4042 = Math.min(this.field_4043, this.field_4042 / 30.0F + this.field_4042);
         }

         if(this.field_4042 > this.field_4043) {
            this.field_4042 = Math.max(this.field_4043, this.field_4042 - this.field_4042 / 30.0F);
         }

      }
   }

   // $FF: renamed from: fa (boolean) void
   public void method_6398(boolean var1) {
      this.field_4050 = var1;
   }

   // $FF: renamed from: bw () void
   void method_6399() {
      if(class_183.field_2249 != null) {
         this.field_4042 = this.field_4043;
      } else {
         if(this.field_4042 < this.field_4043) {
            this.field_4042 = Math.min(this.field_4043, this.field_4042 / 30.0F + this.field_4042);
         }

         if(this.field_4042 > this.field_4043) {
            this.field_4042 = Math.max(this.field_4043, this.field_4042 - this.field_4042 / 30.0F);
         }

      }
   }

   // $FF: renamed from: dw () void
   public void method_6400() {
      this.field_4037.method_6299((byte)-93);
   }

   // $FF: renamed from: ed (int) fo
   public class_230 method_6401(int var1) {
      Iterator var2 = this.field_4058.values().iterator();

      class_230 var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (class_230)var2.next();
      } while(var3.method_4370(-1321454627) != var1);

      return var3;
   }

   // $FF: renamed from: bk (int, int, boolean) void
   final void method_6402(int var1, int var2, boolean var3) {
      this.field_4065 = var1 * -313724057;
      this.field_4039 = -992856088 * var2;
      class_87.method_1516((byte)1);
      if(var3) {
         this.method_6335((byte)-14);
      }

   }

   // $FF: renamed from: bg (int, int, boolean) void
   final void method_6403(int var1, int var2, boolean var3) {
      this.field_4065 = var1 * -313724057;
      this.field_4039 = -1674748369 * var2;
      class_87.method_1516((byte)1);
      if(var3) {
         this.method_6335((byte)37);
      }

   }

   // $FF: renamed from: by (int, int, boolean) void
   final void method_6404(int var1, int var2, boolean var3) {
      this.field_4065 = var1 * -313724057;
      this.field_4039 = -1674748369 * var2;
      class_87.method_1516((byte)1);
      if(var3) {
         this.method_6335((byte)-63);
      }

   }

   // $FF: renamed from: bc () void
   final void method_6405() {
      this.field_4057 = -1498924457;
      this.field_4056 = -1280570873;
      this.field_4055 = -1728924767;
      this.field_4054 = 545785517;
   }

   // $FF: renamed from: g (fo, int) void
   void method_6406(class_230 var1, int var2) {
      try {
         if(null != this.field_4034) {
            if(var2 != -652584652) {
               return;
            }

            if(this.field_4034 == var1) {
               if(var2 != -652584652) {
                  throw new IllegalStateException();
               }

               return;
            }
         }

         this.method_6343(var1, 1690698622);
         this.method_6345(-1, -1, -1, 1792557700);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "mc.g(" + ')');
      }
   }

   // $FF: renamed from: cm () boolean
   boolean method_6407() {
      return -1 != this.field_4040 * -1917021433 && -1097842068 * this.field_4075 != -1;
   }

   // $FF: renamed from: cv () boolean
   boolean method_6408() {
      return -1 != this.field_4040 * 2101906226 && 608372165 * this.field_4075 != -1;
   }

   // $FF: renamed from: aj (int) ii
   public class_280 method_6409(int var1) {
      try {
         if(null == this.field_4034) {
            if(var1 != -1013146399) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return this.field_4034.method_4399(this.method_6361(-959081655), this.method_6477(595647063), 109272415);
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mc.aj(" + ')');
      }
   }

   // $FF: renamed from: ci (int, int, int) fo
   public class_230 method_6410(int var1, int var2, int var3) {
      Iterator var4 = this.field_4058.values().iterator();

      class_230 var5;
      do {
         if(!var4.hasNext()) {
            return null;
         }

         var5 = (class_230)var4.next();
      } while(!var5.method_4388(var1, var2, var3, -1892209208));

      return var5;
   }

   // $FF: renamed from: ct (int, int, int) fo
   public class_230 method_6411(int var1, int var2, int var3) {
      Iterator var4 = this.field_4058.values().iterator();

      class_230 var5;
      do {
         if(!var4.hasNext()) {
            return null;
         }

         var5 = (class_230)var4.next();
      } while(!var5.method_4388(var1, var2, var3, -1643127446));

      return var5;
   }

   // $FF: renamed from: cq (int, int, int) fo
   public class_230 method_6412(int var1, int var2, int var3) {
      Iterator var4 = this.field_4058.values().iterator();

      class_230 var5;
      do {
         if(!var4.hasNext()) {
            return null;
         }

         var5 = (class_230)var4.next();
      } while(!var5.method_4388(var1, var2, var3, -1658154072));

      return var5;
   }

   // $FF: renamed from: q (int, int, int, int, int, int) void
   void method_6413(int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         byte var7 = 20;
         int var8 = var1 + var3 / 2;
         int var9 = var2 + var4 / 2 - 18 - var7;
         class_65.method_681(var1, var2, var3, var4, -16777216);
         class_65.method_670(var8 - 152, var9, 304, 34, -65536);
         class_65.method_681(var8 - 150, 2 + var9, 3 * var5, 30, -65536);
         this.field_4078.method_872(class_305.field_3703, var8, var7 + var9, -1, -1);
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10, "mc.q(" + ')');
      }
   }

   // $FF: renamed from: cf (int, int, int, boolean) void
   public void method_6414(int var1, int var2, int var3, boolean var4) {
      class_230 var5 = this.method_6337(var1, var2, var3, 1220402678);
      if(null == var5) {
         if(!var4) {
            return;
         }

         var5 = this.field_4033;
      }

      boolean var6 = false;
      if(var5 != this.field_4035 || var4) {
         this.field_4035 = var5;
         this.method_6406(var5, -652584652);
         var6 = true;
      }

      if(var6 || var4) {
         this.method_6345(var1, var2, var3, -1616209261);
      }

   }

   // $FF: renamed from: cn (int, int, int, boolean) void
   public void method_6415(int var1, int var2, int var3, boolean var4) {
      class_230 var5 = this.method_6337(var1, var2, var3, 1696402835);
      if(null == var5) {
         if(!var4) {
            return;
         }

         var5 = this.field_4033;
      }

      boolean var6 = false;
      if(var5 != this.field_4035 || var4) {
         this.field_4035 = var5;
         this.method_6406(var5, -652584652);
         var6 = true;
      }

      if(var6 || var4) {
         this.method_6345(var1, var2, var3, 54441773);
      }

   }

   // $FF: renamed from: av (int, int) void
   public void method_6416(int var1, int var2) {
      try {
         if(var1 >= 1) {
            this.field_4044 = -955199719 * var1;
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "mc.av(" + ')');
      }
   }

   // $FF: renamed from: cg (int, int, int, boolean) void
   public void method_6417(int var1, int var2, int var3, boolean var4) {
      class_230 var5 = this.method_6337(var1, var2, var3, 1365147619);
      if(null == var5) {
         if(!var4) {
            return;
         }

         var5 = this.field_4033;
      }

      boolean var6 = false;
      if(var5 != this.field_4035 || var4) {
         this.field_4035 = var5;
         this.method_6406(var5, -652584652);
         var6 = true;
      }

      if(var6 || var4) {
         this.method_6345(var1, var2, var3, -1560189854);
      }

   }

   // $FF: renamed from: y (int, int, boolean, boolean, int) void
   public void method_6418(int var1, int var2, boolean var3, boolean var4, int var5) {
      try {
         long var6;
         label55: {
            var6 = class_87.method_1516((byte)1);
            this.method_6480(var1, var2, var4, var6);
            if(!this.method_6336(-2015544194)) {
               label59: {
                  if(var5 == 800370630) {
                     throw new IllegalStateException();
                  }

                  if(!var4) {
                     if(!var3) {
                        break label59;
                     }

                     if(var5 == 800370630) {
                        return;
                     }
                  }

                  if(var4) {
                     this.field_4056 = var1 * 1280570873;
                     this.field_4057 = var2 * 1498924457;
                     this.field_4054 = 563716917 * this.field_4065;
                     this.field_4055 = 1761679569 * this.field_4039;
                  }

                  if(-1 != this.field_4054 * 951497435) {
                     if(var5 == 800370630) {
                        return;
                     }

                     int var8 = var1 - 1506589769 * this.field_4056;
                     int var9 = var2 - -1142772071 * this.field_4057;
                     this.method_6334(951497435 * this.field_4054 - (int)((float)var8 / this.field_4043), 1329336223 * this.field_4055 + (int)((float)var9 / this.field_4043), false, -1576285424);
                  }
                  break label55;
               }
            }

            this.method_6335((byte)-68);
         }

         if(var4) {
            if(var5 == 800370630) {
               throw new IllegalStateException();
            }

            this.field_4064 = var6 * -3031588181185157501L;
            this.field_4071 = var1 * -1638283545;
            this.field_4052 = var2 * 827409175;
         }

      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10, "mc.y(" + ')');
      }
   }

   // $FF: renamed from: ck (int) void
   public void method_6419(int var1) {
      class_230 var2 = this.method_6356(var1, -833711322);
      if(var2 != null) {
         this.method_6406(var2, -652584652);
      }

   }

   // $FF: renamed from: cj (int) void
   public void method_6420(int var1) {
      class_230 var2 = this.method_6356(var1, -221990177);
      if(var2 != null) {
         this.method_6406(var2, -652584652);
      }

   }

   // $FF: renamed from: cc () int
   public int method_6421() {
      return this.field_4034 == null?-1:this.field_4034.method_4370(-822921577);
   }

   // $FF: renamed from: cu () int
   public int method_6422() {
      return this.field_4034 == null?-1:this.field_4034.method_4370(-576457307);
   }

   // $FF: renamed from: cz () int
   public int method_6423() {
      return this.field_4034 == null?-1:this.field_4034.method_4370(-374774375);
   }

   // $FF: renamed from: ap (int) void
   public void method_6424(int var1) {
      try {
         this.field_4037.method_6299((byte)-69);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mc.ap(" + ')');
      }
   }

   // $FF: renamed from: et (int, int, int) void
   public void method_6425(int var1, int var2, int var3) {
      if(null != this.field_4034) {
         int[] var4 = this.field_4034.method_4367(var1, var2, var3, (byte)21);
         if(var4 != null) {
            this.method_6358(var4[0], var4[1], (byte)105);
         }

      }
   }

   // $FF: renamed from: ch (fo) void
   void method_6426(class_230 var1) {
      if(null == this.field_4034 || this.field_4034 != var1) {
         this.method_6343(var1, 1690698622);
         this.method_6345(-1, -1, -1, 1083727000);
      }
   }

   // $FF: renamed from: co (int) void
   public void method_6427(int var1) {
      class_230 var2 = this.method_6356(var1, -724994550);
      if(var2 != null) {
         this.method_6406(var2, -652584652);
      }

   }

   // $FF: renamed from: cx (fo) void
   void method_6428(class_230 var1) {
      if(null == this.field_4034 || this.field_4034 != var1) {
         this.method_6343(var1, 1690698622);
         this.method_6345(-1, -1, -1, -340057221);
      }
   }

   // $FF: renamed from: di (int, int, int, int, int) void
   public void method_6429(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = new int[4];
      class_65.method_655(var6);
      class_65.method_694(var1, var2, var1 + var3, var2 + var4);
      class_65.method_681(var1, var2, var3, var4, -16777216);
      int var7 = this.field_4037.method_6302(-192788125);
      if(var7 < 100) {
         this.method_6413(var1, var2, var3, var4, var7, -818446692);
      } else {
         if(!this.field_4021.method_4245(831698872)) {
            this.field_4021.method_4238(this.field_4023, this.field_4034.method_4372((byte)-66), client.field_1416, (byte)-30);
            if(!this.field_4021.method_4245(831698872)) {
               return;
            }
         }

         if(this.field_4051 != null) {
            this.field_4053 += -1211656495;
            if(this.field_4053 * 1851163185 % (this.field_4049 * -1112417039) == 0) {
               this.field_4053 = 0;
               this.field_4046 += -1626276559;
            }

            if(this.field_4046 * 930560977 >= 1572937001 * this.field_4044 && !this.field_4050) {
               this.field_4051 = null;
            }
         }

         int var8 = (int)Math.ceil((double)((float)var3 / this.field_4042));
         int var9 = (int)Math.ceil((double)((float)var4 / this.field_4042));
         this.field_4021.method_4240(this.field_4065 * 832010327 - var8 / 2, this.field_4039 * -1742821169 - var9 / 2, this.field_4065 * 832010327 + var8 / 2, -1742821169 * this.field_4039 + var9 / 2, var1, var2, var3 + var1, var2 + var4, 318409556);
         if(!this.field_4030) {
            boolean var10 = false;
            if(var5 - this.field_4067 * -366242899 > 100) {
               this.field_4067 = 1547126821 * var5;
               var10 = true;
            }

            this.field_4021.method_4253(this.field_4065 * 832010327 - var8 / 2, this.field_4039 * -1742821169 - var9 / 2, var8 / 2 + 832010327 * this.field_4065, var9 / 2 + -1742821169 * this.field_4039, var1, var2, var1 + var3, var2 + var4, this.field_4038, this.field_4051, 1851163185 * this.field_4053, -1112417039 * this.field_4049, var10, -1554077956);
         }

         this.method_6348(var1, var2, var3, var4, var8, var9, -511459104);
         if(class_373.method_6616(-1237193969) && this.field_4068 && null != this.field_4072) {
            this.field_4078.method_869("Coord: " + this.field_4072, 10 + class_65.field_489, 20 + class_65.field_487, 16776960, -1);
         }

         this.field_4073 = var8 * 1583257571;
         this.field_4045 = -1647763857 * var9;
         this.field_4025 = -1219792949 * var1;
         this.field_4047 = var2 * 962963005;
         class_65.method_690(var6);
      }
   }

   // $FF: renamed from: cl (fo) void
   void method_6430(class_230 var1) {
      this.field_4034 = var1;
      class_221 var10001 = new class_221;
      var10001.method_4268(this.field_4031, this.field_4059, this.field_4066, this.field_4032);
      this.field_4021 = var10001;
      this.field_4037.method_6307(this.field_4034.method_4372((byte)-78), (byte)121);
   }

   // $FF: renamed from: cw (fo, ii, ii, boolean) void
   public void method_6431(class_230 var1, class_280 var2, class_280 var3, boolean var4) {
      if(null != var1) {
         if(null == this.field_4034 || this.field_4034 != var1) {
            this.method_6343(var1, 1690698622);
         }

         if(!var4 && this.field_4034.method_4388(-1820038389 * var2.field_3234, var2.field_3236 * -2092998769, var2.field_3235 * -1223214854, -1900412919)) {
            this.method_6345(-689562447 * var2.field_3234, -2092998769 * var2.field_3236, 528899439 * var2.field_3235, 662653543);
         } else {
            this.method_6345(-1820038389 * var3.field_3234, var3.field_3236 * 322400910, var3.field_3235 * 349527629, -867235578);
         }

      }
   }

   // $FF: renamed from: db (fo, ii, ii, boolean) void
   public void method_6432(class_230 var1, class_280 var2, class_280 var3, boolean var4) {
      if(null != var1) {
         if(null == this.field_4034 || this.field_4034 != var1) {
            this.method_6343(var1, 1690698622);
         }

         if(!var4 && this.field_4034.method_4388(-1820038389 * var2.field_3234, var2.field_3236 * -1469387877, var2.field_3235 * 2068765343, -1597577150)) {
            this.method_6345(-1820038389 * var2.field_3234, -2092998769 * var2.field_3236, 349527629 * var2.field_3235, -1286494282);
         } else {
            this.method_6345(1533315014 * var3.field_3234, var3.field_3236 * 1580004785, var3.field_3235 * 349527629, 935744919);
         }

      }
   }

   // $FF: renamed from: aw (int, byte) void
   public void method_6433(int var1, byte var2) {
      try {
         this.field_4051 = new HashSet();
         this.field_4046 = 0;
         this.field_4053 = 0;

         for(int var3 = 0; var3 < class_331.field_3858 * -617825071; ++var3) {
            if(var2 == 14) {
               throw new IllegalStateException();
            }

            if(class_116.method_2248(var3, 1647125333) == null) {
               if(var2 == 14) {
                  return;
               }
            } else if(class_116.method_2248(var3, 1647125333).field_621 * 41328569 == var1) {
               if(var2 == 14) {
                  throw new IllegalStateException();
               }

               this.field_4051.add(Integer.valueOf(class_116.method_2248(var3, 1647125333).field_607 * -298295867));
            }
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "mc.aw(" + ')');
      }
   }

   // $FF: renamed from: gf (int, ii) ii
   public class_280 method_6434(int var1, class_280 var2) {
      if(!this.field_4037.method_6297(1012634772)) {
         return null;
      } else if(!this.field_4021.method_4245(831698872)) {
         return null;
      } else if(!this.field_4034.method_4387(var2.field_3236 * -2092998769, var2.field_3235 * -455557778, 644663778)) {
         return null;
      } else {
         HashMap var3 = this.field_4021.method_4246(-158587895);
         List var4 = (List)var3.get(Integer.valueOf(var1));
         if(null != var4 && !var4.isEmpty()) {
            class_218 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();

            while(var7.hasNext()) {
               class_218 var8 = (class_218)var7.next();
               int var9 = var8.field_2482.field_3236 * -1883625718 - -2092998769 * var2.field_3236;
               int var10 = 1698703272 * var8.field_2482.field_3235 - var2.field_3235 * 349527629;
               int var11 = var10 * var10 + var9 * var9;
               if(var11 == 0) {
                  return var8.field_2482;
               }

               if(var11 < var6 || var5 == null) {
                  var5 = var8;
                  var6 = var11;
               }
            }

            return var5.field_2482;
         } else {
            return null;
         }
      }
   }

   // $FF: renamed from: bx (int, int, boolean, long) void
   void method_6435(int var1, int var2, boolean var3, long var4) {
      if(null != this.field_4034) {
         int var6 = (int)((float)(this.field_4065 * 832010327) + ((float)(var1 - -1688617501 * this.field_4025) - (float)this.method_6364(-524339162) * this.field_4042 / 2.0F) / this.field_4042);
         int var7 = (int)((float)(this.field_4039 * -1742821169) - ((float)(var2 - 1650771334 * this.field_4047) - (float)this.method_6365(-713888536) * this.field_4042 / 2.0F) / this.field_4042);
         this.field_4072 = this.field_4034.method_4399(var6 + this.field_4034.method_4376(1057202329) * -1726023041, var7 + this.field_4034.method_4378((byte)-30) * -352153465, -1695546140);
         if(null != this.field_4072 && var3) {
            if(class_373.method_6616(-992736468) && class_145.field_1840[82] && class_145.field_1840[1755975483]) {
               class_117.method_2253(this.field_4072.field_3236 * 1909607644, -289553315 * this.field_4072.field_3235, this.field_4072.field_3234 * -295892712, false, 1162543357);
            } else {
               boolean var8 = true;
               if(this.field_4029) {
                  int var9 = var1 - this.field_4071 * 1122847776;
                  int var10 = var2 - this.field_4052 * -559799129;
                  if(var4 - this.field_4064 * 5467077858169346091L > 500L || var9 < -723037604 || var9 > 25 || var10 < -25 || var10 > 25) {
                     var8 = false;
                  }
               }

               if(var8) {
                  class_40 var11 = class_112.method_2238(class_266.field_3080, client.field_1463.field_2384, (byte)8);
                  var11.field_263.method_176(this.field_4072.method_5156(-738811910), -1046443100);
                  client.field_1463.method_4079(var11, -2006710633);
                  this.field_4064 = 0L;
               }
            }
         }
      } else {
         this.field_4072 = null;
      }

   }

   // $FF: renamed from: t (int, int, int, int, byte) void
   public void method_6436(int var1, int var2, int var3, int var4, byte var5) {
      try {
         if(this.field_4037.method_6297(1018725786)) {
            if(!this.field_4021.method_4245(831698872)) {
               this.field_4021.method_4238(this.field_4023, this.field_4034.method_4372((byte)-22), client.field_1416, (byte)-9);
               if(!this.field_4021.method_4245(831698872)) {
                  if(var5 >= 0) {
                     throw new IllegalStateException();
                  }

                  return;
               }
            }

            this.field_4021.method_4242(var1, var2, var3, var4, this.field_4051, this.field_4053 * 1851163185, -1112417039 * this.field_4049, -397966592);
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "mc.t(" + ')');
      }
   }

   // $FF: renamed from: ad (int, int, int) void
   public void method_6437(int var1, int var2, int var3) {
      try {
         if(null != this.field_4034) {
            if(var3 != 704726635) {
               throw new IllegalStateException();
            }

            if(this.field_4034.method_4387(var1, var2, 621143817)) {
               this.field_4040 = (var1 - this.field_4034.method_4376(1057202329) * 64) * -1918997833;
               this.field_4075 = (var2 - this.field_4034.method_4378((byte)-15) * 64) * 1751527693;
               return;
            }

            if(var3 != 704726635) {
               return;
            }
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "mc.ad(" + ')');
      }
   }

   // $FF: renamed from: dk (int, int, int, int, int) void
   public void method_6438(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = new int[4];
      class_65.method_655(var6);
      class_65.method_694(var1, var2, var1 + var3, var2 + var4);
      class_65.method_681(var1, var2, var3, var4, -16777216);
      int var7 = this.field_4037.method_6302(-192788125);
      if(var7 < 100) {
         this.method_6413(var1, var2, var3, var4, var7, 1509687782);
      } else {
         if(!this.field_4021.method_4245(831698872)) {
            this.field_4021.method_4238(this.field_4023, this.field_4034.method_4372((byte)-122), client.field_1416, (byte)65);
            if(!this.field_4021.method_4245(831698872)) {
               return;
            }
         }

         if(this.field_4051 != null) {
            this.field_4053 += -1211656495;
            if(this.field_4053 * 1851163185 % (this.field_4049 * -1112417039) == 0) {
               this.field_4053 = 0;
               this.field_4046 += -1626276559;
            }

            if(this.field_4046 * 930560977 >= 1572937001 * this.field_4044 && !this.field_4050) {
               this.field_4051 = null;
            }
         }

         int var8 = (int)Math.ceil((double)((float)var3 / this.field_4042));
         int var9 = (int)Math.ceil((double)((float)var4 / this.field_4042));
         this.field_4021.method_4240(this.field_4065 * 832010327 - var8 / 2, this.field_4039 * -1742821169 - var9 / 2, this.field_4065 * 832010327 + var8 / 2, -1742821169 * this.field_4039 + var9 / 2, var1, var2, var3 + var1, var2 + var4, -453963132);
         if(!this.field_4030) {
            boolean var10 = false;
            if(var5 - this.field_4067 * -366242899 > 100) {
               this.field_4067 = 1547126821 * var5;
               var10 = true;
            }

            this.field_4021.method_4253(this.field_4065 * 832010327 - var8 / 2, this.field_4039 * -1742821169 - var9 / 2, var8 / 2 + 832010327 * this.field_4065, var9 / 2 + -1742821169 * this.field_4039, var1, var2, var1 + var3, var2 + var4, this.field_4038, this.field_4051, 1851163185 * this.field_4053, -1112417039 * this.field_4049, var10, -1554077956);
         }

         this.method_6348(var1, var2, var3, var4, var8, var9, -511459104);
         if(class_373.method_6616(-707352572) && this.field_4068 && null != this.field_4072) {
            this.field_4078.method_869("Coord: " + this.field_4072, 10 + class_65.field_489, 20 + class_65.field_487, 16776960, -1);
         }

         this.field_4073 = var8 * 1583257571;
         this.field_4045 = -1647763857 * var9;
         this.field_4025 = -1219792949 * var1;
         this.field_4047 = var2 * 962963005;
         class_65.method_690(var6);
      }
   }

   // $FF: renamed from: fy (int, boolean) void
   public void method_6439(int var1, boolean var2) {
      if(!var2) {
         this.field_4062.add(Integer.valueOf(var1));
      } else {
         this.field_4062.remove(Integer.valueOf(var1));
      }

      this.method_6331(1393497226);
   }

   // $FF: renamed from: cd () boolean
   boolean method_6440() {
      return -1 != this.field_4040 * -1917021433 && 608372165 * this.field_4075 != -1;
   }

   // $FF: renamed from: df (int, int, int, int) void
   public void method_6441(int var1, int var2, int var3, int var4) {
      if(this.field_4037.method_6297(1706250799)) {
         if(!this.field_4021.method_4245(831698872)) {
            this.field_4021.method_4238(this.field_4023, this.field_4034.method_4372((byte)-60), client.field_1416, (byte)77);
            if(!this.field_4021.method_4245(831698872)) {
               return;
            }
         }

         this.field_4021.method_4242(var1, var2, var3, var4, this.field_4051, this.field_4053 * -142821187, -1112417039 * this.field_4049, -397966592);
      }
   }

   // $FF: renamed from: dg (int, int, int, int, int) void
   void method_6442(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var1 + var3 / 2;
      int var8 = var2 + var4 / 2 - 18 - var6;
      class_65.method_681(var1, var2, var3, var4, -16777216);
      class_65.method_670(var7 - 422881713, var8, 1624025079, 1130818925, -65536);
      class_65.method_681(var7 - 150, 2 + var8, 3 * var5, 30, -65536);
      this.field_4078.method_872(class_305.field_3703, var7, var6 + var8, -1, -1);
   }

   // $FF: renamed from: dy (int) void
   public void method_6443(int var1) {
      this.field_4043 = this.method_6352(var1, 397334458);
   }

   // $FF: renamed from: dd (int) void
   public void method_6444(int var1) {
      this.field_4043 = this.method_6352(var1, 397334458);
   }

   // $FF: renamed from: da (int) void
   public void method_6445(int var1) {
      this.field_4043 = this.method_6352(var1, 397334458);
   }

   // $FF: renamed from: dx (int) void
   public void method_6446(int var1) {
      this.field_4043 = this.method_6352(var1, 397334458);
   }

   // $FF: renamed from: ak (boolean, int) void
   public void method_6447(boolean var1, int var2) {
      try {
         boolean var10001;
         if(!var1) {
            if(var2 == -568440353) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.field_4030 = var10001;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "mc.ak(" + ')');
      }
   }

   // $FF: renamed from: du (int, int, int, int, int) void
   void method_6448(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var1 + var3 / 2;
      int var8 = var2 + var4 / 2 - 18 - var6;
      class_65.method_681(var1, var2, var3, var4, -16777216);
      class_65.method_670(var7 - 152, var8, -696569282, 1367238922, -65536);
      class_65.method_681(var7 - 1990727977, 2 + var8, 3 * var5, 30, -999632241);
      this.field_4078.method_872(class_305.field_3703, var7, var6 + var8, -1, -1);
   }

   // $FF: renamed from: f (int, int, boolean, int, int, int, int, int) void
   public void method_6449(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if(!this.field_4037.method_6297(1213842170)) {
            if(var8 == 1655798039) {
               throw new IllegalStateException();
            }
         } else {
            this.method_6332(1756925450);
            this.method_6512((byte)110);
            if(!var3) {
               if(var8 != 1655798039) {
                  ;
               }
            } else {
               int var9 = (int)Math.ceil((double)((float)var6 / this.field_4042));
               int var10 = (int)Math.ceil((double)((float)var7 / this.field_4042));
               List var11 = this.field_4021.method_4244(832010327 * this.field_4065 - var9 / 2 - 1, -1742821169 * this.field_4039 - var10 / 2 - 1, this.field_4065 * 832010327 + var9 / 2 + 1, 1 + this.field_4039 * -1742821169 + var10 / 2, var4, var5, var6, var7, var1, var2, 533098241);
               HashSet var12 = new HashSet();

               Iterator var13;
               class_218 var14;
               class_45 var15;
               class_45 var10000;
               class_250 var16;
               class_250 var18;
               for(var13 = var11.iterator(); var13.hasNext(); class_203.method_4099(var15, (byte)1)) {
                  if(var8 == 1655798039) {
                     throw new IllegalStateException();
                  }

                  var14 = (class_218)var13.next();
                  var12.add(var14);
                  var10000 = new class_45;
                  var10000.method_105();
                  var15 = var10000;
                  var18 = new class_250;
                  var18.method_4721(var14.method_4205(2145882550), var14.field_2480, var14.field_2482);
                  var16 = var18;
                  var15.method_520(new Object[]{var16, Integer.valueOf(var1), Integer.valueOf(var2)}, 880052354);
                  if(this.field_4061.contains(var14)) {
                     if(var8 == 1655798039) {
                        throw new IllegalStateException();
                     }

                     var15.method_519(17, -628241601);
                  } else {
                     var15.method_519(15, -954596761);
                  }
               }

               var13 = this.field_4061.iterator();

               while(var13.hasNext()) {
                  if(var8 == 1655798039) {
                     throw new IllegalStateException();
                  }

                  var14 = (class_218)var13.next();
                  if(!var12.contains(var14)) {
                     if(var8 == 1655798039) {
                        throw new IllegalStateException();
                     }

                     var10000 = new class_45;
                     var10000.method_105();
                     var15 = var10000;
                     var18 = new class_250;
                     var18.method_4721(var14.method_4205(2145838819), var14.field_2480, var14.field_2482);
                     var16 = var18;
                     var15.method_520(new Object[]{var16, Integer.valueOf(var1), Integer.valueOf(var2)}, 62994102);
                     var15.method_519(16, 2128265601);
                     class_203.method_4099(var15, (byte)1);
                  }
               }

               this.field_4061 = var12;
            }
         }
      } catch (RuntimeException var17) {
         throw class_223.method_4281(var17, "mc.f(" + ')');
      }
   }

   // $FF: renamed from: dn (int, int, int, int, int) void
   void method_6450(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var1 + var3 / 2;
      int var8 = var2 + var4 / 2 - 18 - var6;
      class_65.method_681(var1, var2, var3, var4, -1782189326);
      class_65.method_670(var7 - 152, var8, -883071278, 34, -65536);
      class_65.method_681(var7 - 865534404, 2 + var8, 3 * var5, 30, -65536);
      this.field_4078.method_872(class_305.field_3703, var7, var6 + var8, -1, -1);
   }

   // $FF: renamed from: ev () void
   public void method_6451() {
      this.field_4044 = 1429368139;
   }

   // $FF: renamed from: dl (int) float
   float method_6452(int var1) {
      return var1 == 25?1.0F:(var1 == 37?1.5F:(50 == var1?2.0F:(75 == var1?3.0F:(100 == var1?4.0F:8.0F))));
   }

   // $FF: renamed from: dq () int
   public int method_6453() {
      return 1.0D == (double)this.field_4043?25:((double)this.field_4043 == 1.5D?-565401144:(2.0D == (double)this.field_4043?2104338370:((double)this.field_4043 == 3.0D?75:(4.0D == (double)this.field_4043?100:-1051666186))));
   }

   // $FF: renamed from: ar (int, int, int, int) void
   public void method_6454(int var1, int var2, int var3, int var4) {
      try {
         if(this.field_4034 == null) {
            if(var4 != Integer.MIN_VALUE) {
               throw new IllegalStateException();
            }
         } else {
            int[] var5 = this.field_4034.method_4367(var1, var2, var3, (byte)-63);
            if(null != var5) {
               if(var4 != Integer.MIN_VALUE) {
                  throw new IllegalStateException();
               }

               this.method_6437(var5[0], var5[1], 704726635);
            }

         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "mc.ar(" + ')');
      }
   }

   // $FF: renamed from: dz (fo, ii, ii, boolean) void
   public void method_6455(class_230 var1, class_280 var2, class_280 var3, boolean var4) {
      if(null != var1) {
         if(null == this.field_4034 || this.field_4034 != var1) {
            this.method_6343(var1, 1690698622);
         }

         if(!var4 && this.field_4034.method_4388(64907899 * var2.field_3234, var2.field_3236 * 639049640, var2.field_3235 * 349527629, -1484455414)) {
            this.method_6345(-1820038389 * var2.field_3234, -2092998769 * var2.field_3236, 660863303 * var2.field_3235, 1658460714);
         } else {
            this.method_6345(-1820038389 * var3.field_3234, var3.field_3236 * 238358892, var3.field_3235 * 349527629, -466243017);
         }

      }
   }

   // $FF: renamed from: ab (int) boolean
   public boolean method_6456(int var1) {
      try {
         return this.field_4037.method_6297(1419369800);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mc.ab(" + ')');
      }
   }

   // $FF: renamed from: ex (int, int) void
   public void method_6457(int var1, int var2) {
      if(null != this.field_4034 && this.field_4034.method_4387(var1, var2, -2022165985)) {
         this.field_4040 = (var1 - this.field_4034.method_4376(1057202329) * 64) * -1918997833;
         this.field_4075 = (var2 - this.field_4034.method_4378((byte)-14) * 64) * 1751527693;
      }
   }

   // $FF: renamed from: ao (boolean, int) void
   public void method_6458(boolean var1, int var2) {
      try {
         this.field_4050 = var1;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "mc.ao(" + ')');
      }
   }

   // $FF: renamed from: fn () boolean
   public boolean method_6459() {
      return !this.field_4030;
   }

   // $FF: renamed from: ek () boolean
   public boolean method_6460() {
      return this.field_4037.method_6297(1020554866);
   }

   // $FF: renamed from: eu () boolean
   public boolean method_6461() {
      return this.field_4037.method_6297(659119927);
   }

   // $FF: renamed from: ez (int) fo
   public class_230 method_6462(int var1) {
      Iterator var2 = this.field_4058.values().iterator();

      class_230 var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (class_230)var2.next();
      } while(var3.method_4370(-907000841) != var1);

      return var3;
   }

   // $FF: renamed from: el (int, int, int) void
   public void method_6463(int var1, int var2, int var3) {
      if(this.field_4034 != null) {
         int[] var4 = this.field_4034.method_4367(var1, var2, var3, (byte)-11);
         if(null != var4) {
            this.method_6437(var4[0], var4[1], 704726635);
         }

      }
   }

   // $FF: renamed from: ep (int) fo
   public class_230 method_6464(int var1) {
      Iterator var2 = this.field_4058.values().iterator();

      class_230 var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (class_230)var2.next();
      } while(var3.method_4370(-1532277498) != var1);

      return var3;
   }

   // $FF: renamed from: aa (int, boolean, int) void
   public void method_6465(int var1, boolean var2, int var3) {
      try {
         if(!var2) {
            if(var3 == 129356965) {
               throw new IllegalStateException();
            }

            this.field_4060.add(Integer.valueOf(var1));
         } else {
            this.field_4060.remove(Integer.valueOf(var1));
         }

         for(int var4 = 0; var4 < -617825071 * class_331.field_3858; ++var4) {
            if(var3 == 129356965) {
               throw new IllegalStateException();
            }

            if(class_116.method_2248(var4, 1647125333) == null) {
               if(var3 == 129356965) {
                  throw new IllegalStateException();
               }
            } else if(class_116.method_2248(var4, 1647125333).field_621 * 41328569 == var1) {
               if(var3 == 129356965) {
                  throw new IllegalStateException();
               }

               int var5 = class_116.method_2248(var4, 1647125333).field_607 * -298295867;
               if(!var2) {
                  if(var3 == 129356965) {
                     throw new IllegalStateException();
                  }

                  this.field_4048.add(Integer.valueOf(var5));
               } else {
                  this.field_4048.remove(Integer.valueOf(var5));
               }
            }
         }

         this.method_6331(1293716442);
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "mc.aa(" + ')');
      }
   }

   // $FF: renamed from: ew (int, int) void
   public void method_6466(int var1, int var2) {
      if(null != this.field_4034) {
         this.method_6334(var1 - this.field_4034.method_4376(1057202329) * 64, var2 - this.field_4034.method_4378((byte)-9) * 64, true, -1560252051);
         this.field_4040 = 1918997833;
         this.field_4075 = -1751527693;
      }
   }

   // $FF: renamed from: dt (int, int, int, int, int) void
   void method_6467(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var1 + var3 / 2;
      int var8 = var2 + var4 / 2 - 18 - var6;
      class_65.method_681(var1, var2, var3, var4, -16777216);
      class_65.method_670(var7 - 152, var8, 304, 34, -65536);
      class_65.method_681(var7 - 150, 2 + var8, 3 * var5, 30, -65536);
      this.field_4078.method_872(class_305.field_3703, var7, var6 + var8, -1, -1);
   }

   // $FF: renamed from: ey () int
   public int method_6468() {
      return -713333301 * this.field_4073;
   }

   // $FF: renamed from: ee () int
   public int method_6469() {
      return -713333301 * this.field_4073;
   }

   // $FF: renamed from: dv (int, int, int, int) void
   public void method_6470(int var1, int var2, int var3, int var4) {
      if(this.field_4037.method_6297(1646181086)) {
         if(!this.field_4021.method_4245(831698872)) {
            this.field_4021.method_4238(this.field_4023, this.field_4034.method_4372((byte)-52), client.field_1416, (byte)-46);
            if(!this.field_4021.method_4245(831698872)) {
               return;
            }
         }

         this.field_4021.method_4242(var1, var2, var3, var4, this.field_4051, this.field_4053 * 1281225272, -1112417039 * this.field_4049, -397966592);
      }
   }

   // $FF: renamed from: er () int
   public int method_6471() {
      return null == this.field_4034?-1:this.field_4065 * -1910336099 + this.field_4034.method_4376(1057202329) * -329211936;
   }

   // $FF: renamed from: en () int
   public int method_6472() {
      return this.field_4034 == null?-1:-1742821169 * this.field_4039 + this.field_4034.method_4378((byte)-26) * 64;
   }

   // $FF: renamed from: ef () int
   public int method_6473() {
      return this.field_4034 == null?-1:-1742821169 * this.field_4039 + this.field_4034.method_4378((byte)-24) * 64;
   }

   // $FF: renamed from: em () int
   public int method_6474() {
      return this.field_4034 == null?-1:-1742821169 * this.field_4039 + this.field_4034.method_4378((byte)-11) * 64;
   }

   // $FF: renamed from: es () int
   public int method_6475() {
      return -713333301 * this.field_4073;
   }

   // $FF: renamed from: ca (fo) void
   void method_6476(class_230 var1) {
      this.field_4034 = var1;
      class_221 var10001 = new class_221;
      var10001.method_4268(this.field_4031, this.field_4059, this.field_4066, this.field_4032);
      this.field_4021 = var10001;
      this.field_4037.method_6307(this.field_4034.method_4372((byte)-38), (byte)59);
   }

   // $FF: renamed from: as (int) int
   public int method_6477(int var1) {
      try {
         if(this.field_4034 == null) {
            if(var1 <= 551383109) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return -1742821169 * this.field_4039 + this.field_4034.method_4378((byte)-111) * 64;
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "mc.as(" + ')');
      }
   }

   // $FF: renamed from: eh (int) void
   public void method_6478(int var1) {
      if(var1 >= 1) {
         this.field_4044 = -955199719 * var1;
      }

   }

   // $FF: renamed from: ei () void
   public void method_6479() {
      this.field_4044 = 1429368139;
   }

   // $FF: renamed from: p (int, int, boolean, long) void
   void method_6480(int var1, int var2, boolean var3, long var4) {
      try {
         if(null != this.field_4034) {
            int var6 = (int)((float)(this.field_4065 * 832010327) + ((float)(var1 - -1688617501 * this.field_4025) - (float)this.method_6364(1641590896) * this.field_4042 / 2.0F) / this.field_4042);
            int var7 = (int)((float)(this.field_4039 * -1742821169) - ((float)(var2 - -530472683 * this.field_4047) - (float)this.method_6365(-227030851) * this.field_4042 / 2.0F) / this.field_4042);
            this.field_4072 = this.field_4034.method_4399(var6 + this.field_4034.method_4376(1057202329) * 64, var7 + this.field_4034.method_4378((byte)-74) * 64, -1073728046);
            if(null != this.field_4072 && var3) {
               if(class_373.method_6616(-1695498302) && class_145.field_1840[82] && class_145.field_1840[81]) {
                  class_117.method_2253(this.field_4072.field_3236 * -2092998769, 349527629 * this.field_4072.field_3235, this.field_4072.field_3234 * -1820038389, false, 1614956445);
               } else {
                  boolean var8 = true;
                  if(this.field_4029) {
                     int var9 = var1 - this.field_4071 * 1480322263;
                     int var10 = var2 - this.field_4052 * -559799129;
                     if(var4 - this.field_4064 * 5467077858169346091L > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                        var8 = false;
                     }
                  }

                  if(var8) {
                     class_40 var12 = class_112.method_2238(class_266.field_3080, client.field_1463.field_2384, (byte)8);
                     var12.field_263.method_176(this.field_4072.method_5156(-738811910), -1205675141);
                     client.field_1463.method_4079(var12, -2037092047);
                     this.field_4064 = 0L;
                  }
               }
            }
         } else {
            this.field_4072 = null;
         }

      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11, "mc.p(" + ')');
      }
   }

   // $FF: renamed from: eq () void
   public void method_6481() {
      this.field_4044 = 1429368139;
   }

   // $FF: renamed from: bo () void
   void method_6482() {
      if(class_183.field_2249 != null) {
         this.field_4042 = this.field_4043;
      } else {
         if(this.field_4042 < this.field_4043) {
            this.field_4042 = Math.min(this.field_4043, this.field_4042 / 30.0F + this.field_4042);
         }

         if(this.field_4042 > this.field_4043) {
            this.field_4042 = Math.max(this.field_4043, this.field_4042 - this.field_4042 / 30.0F);
         }

      }
   }

   // $FF: renamed from: fc () void
   public void method_6483() {
      this.field_4049 = -1567167662;
   }

   // $FF: renamed from: dc (int, int, int, int, int) void
   public void method_6484(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = new int[4];
      class_65.method_655(var6);
      class_65.method_694(var1, var2, var1 + var3, var2 + var4);
      class_65.method_681(var1, var2, var3, var4, -16777216);
      int var7 = this.field_4037.method_6302(-192788125);
      if(var7 < 100) {
         this.method_6413(var1, var2, var3, var4, var7, 1752570159);
      } else {
         if(!this.field_4021.method_4245(831698872)) {
            this.field_4021.method_4238(this.field_4023, this.field_4034.method_4372((byte)-12), client.field_1416, (byte)25);
            if(!this.field_4021.method_4245(831698872)) {
               return;
            }
         }

         if(this.field_4051 != null) {
            this.field_4053 += -1211656495;
            if(this.field_4053 * 1851163185 % (this.field_4049 * -1112417039) == 0) {
               this.field_4053 = 0;
               this.field_4046 += -1626276559;
            }

            if(this.field_4046 * 930560977 >= 1572937001 * this.field_4044 && !this.field_4050) {
               this.field_4051 = null;
            }
         }

         int var8 = (int)Math.ceil((double)((float)var3 / this.field_4042));
         int var9 = (int)Math.ceil((double)((float)var4 / this.field_4042));
         this.field_4021.method_4240(this.field_4065 * 832010327 - var8 / 2, this.field_4039 * -1742821169 - var9 / 2, this.field_4065 * 832010327 + var8 / 2, -1742821169 * this.field_4039 + var9 / 2, var1, var2, var3 + var1, var2 + var4, 1427660192);
         if(!this.field_4030) {
            boolean var10 = false;
            if(var5 - this.field_4067 * -366242899 > 100) {
               this.field_4067 = 1547126821 * var5;
               var10 = true;
            }

            this.field_4021.method_4253(this.field_4065 * 832010327 - var8 / 2, this.field_4039 * -1742821169 - var9 / 2, var8 / 2 + 832010327 * this.field_4065, var9 / 2 + -1742821169 * this.field_4039, var1, var2, var1 + var3, var2 + var4, this.field_4038, this.field_4051, 1851163185 * this.field_4053, -1112417039 * this.field_4049, var10, -1554077956);
         }

         this.method_6348(var1, var2, var3, var4, var8, var9, -511459104);
         if(class_373.method_6616(-1376178142) && this.field_4068 && null != this.field_4072) {
            this.field_4078.method_869("Coord: " + this.field_4072, 10 + class_65.field_489, 20 + class_65.field_487, 16776960, -1);
         }

         this.field_4073 = var8 * 1583257571;
         this.field_4045 = -1647763857 * var9;
         this.field_4025 = -1219792949 * var1;
         this.field_4047 = var2 * 962963005;
         class_65.method_690(var6);
      }
   }

   // $FF: renamed from: ft (int) void
   public void method_6485(int var1) {
      this.field_4051 = new HashSet();
      this.field_4051.add(Integer.valueOf(var1));
      this.field_4046 = 0;
      this.field_4053 = 0;
   }

   // $FF: renamed from: cb () fo
   public class_230 method_6486() {
      return this.field_4034;
   }

   // $FF: renamed from: fp (int) void
   public void method_6487(int var1) {
      this.field_4051 = new HashSet();
      this.field_4046 = 0;
      this.field_4053 = 0;

      for(int var2 = 0; var2 < class_331.field_3858 * -617825071; ++var2) {
         if(class_116.method_2248(var2, 1647125333) != null && class_116.method_2248(var2, 1647125333).field_621 * 41328569 == var1) {
            this.field_4051.add(Integer.valueOf(class_116.method_2248(var2, 1647125333).field_607 * -298295867));
         }
      }

   }

   // $FF: renamed from: fe (int) void
   public void method_6488(int var1) {
      this.field_4051 = new HashSet();
      this.field_4046 = 0;
      this.field_4053 = 0;

      for(int var2 = 0; var2 < class_331.field_3858 * -446660027; ++var2) {
         if(class_116.method_2248(var2, 1647125333) != null && class_116.method_2248(var2, 1647125333).field_621 * 41328569 == var1) {
            this.field_4051.add(Integer.valueOf(class_116.method_2248(var2, 1647125333).field_607 * -1675152653));
         }
      }

   }

   // $FF: renamed from: fb () void
   public void method_6489() {
      this.field_4051 = null;
   }

   // $FF: renamed from: fo () void
   public void method_6490() {
      this.field_4051 = null;
   }

   // $FF: renamed from: fq (boolean) void
   public void method_6491(boolean var1) {
      this.field_4030 = !var1;
   }

   // $FF: renamed from: gb () void
   void method_6492() {
      this.field_4038.clear();
      this.field_4038.addAll(this.field_4062);
      this.field_4038.addAll(this.field_4048);
   }

   // $FF: renamed from: fw (boolean) void
   public void method_6493(boolean var1) {
      this.field_4030 = !var1;
   }

   // $FF: renamed from: fj (int, boolean) void
   public void method_6494(int var1, boolean var2) {
      if(!var2) {
         this.field_4062.add(Integer.valueOf(var1));
      } else {
         this.field_4062.remove(Integer.valueOf(var1));
      }

      this.method_6331(1240787872);
   }

   // $FF: renamed from: bi () void
   void method_6495() {
      if(this.method_6336(-2144225185)) {
         int var1 = this.field_4040 * -1917021433 - 832010327 * this.field_4065;
         int var2 = this.field_4075 * 608372165 - -1742821169 * this.field_4039;
         if(0 != var1) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if(0 != var2) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         this.method_6334(832010327 * this.field_4065 + var1, var2 + this.field_4039 * -1742821169, true, -953772069);
         if(-1917021433 * this.field_4040 == this.field_4065 * 832010327 && this.field_4039 * -1742821169 == this.field_4075 * 608372165) {
            this.field_4040 = 1918997833;
            this.field_4075 = -1751527693;
         }

      }
   }

   // $FF: renamed from: fi (int, boolean) void
   public void method_6496(int var1, boolean var2) {
      if(!var2) {
         this.field_4062.add(Integer.valueOf(var1));
      } else {
         this.field_4062.remove(Integer.valueOf(var1));
      }

      this.method_6331(1454132963);
   }

   // $FF: renamed from: cp (int, int, int) fo
   public class_230 method_6497(int var1, int var2, int var3) {
      Iterator var4 = this.field_4058.values().iterator();

      class_230 var5;
      do {
         if(!var4.hasNext()) {
            return null;
         }

         var5 = (class_230)var4.next();
      } while(!var5.method_4388(var1, var2, var3, -1529992094));

      return var5;
   }

   // $FF: renamed from: ba (int, int, boolean, long) void
   void method_6498(int var1, int var2, boolean var3, long var4) {
      if(null != this.field_4034) {
         int var6 = (int)((float)(this.field_4065 * 832010327) + ((float)(var1 - -1688617501 * this.field_4025) - (float)this.method_6364(-1423950918) * this.field_4042 / 2.0F) / this.field_4042);
         int var7 = (int)((float)(this.field_4039 * -1742821169) - ((float)(var2 - -530472683 * this.field_4047) - (float)this.method_6365(118194455) * this.field_4042 / 2.0F) / this.field_4042);
         this.field_4072 = this.field_4034.method_4399(var6 + this.field_4034.method_4376(1057202329) * 64, var7 + this.field_4034.method_4378((byte)-47) * 64, -1693798652);
         if(null != this.field_4072 && var3) {
            if(class_373.method_6616(-1400642810) && class_145.field_1840[82] && class_145.field_1840[81]) {
               class_117.method_2253(this.field_4072.field_3236 * -2092998769, 349527629 * this.field_4072.field_3235, this.field_4072.field_3234 * -1820038389, false, 1874238605);
            } else {
               boolean var8 = true;
               if(this.field_4029) {
                  int var9 = var1 - this.field_4071 * 1480322263;
                  int var10 = var2 - this.field_4052 * -559799129;
                  if(var4 - this.field_4064 * 5467077858169346091L > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                     var8 = false;
                  }
               }

               if(var8) {
                  class_40 var11 = class_112.method_2238(class_266.field_3080, client.field_1463.field_2384, (byte)8);
                  var11.field_263.method_176(this.field_4072.method_5156(-738811910), 910679052);
                  client.field_1463.method_4079(var11, -1789689095);
                  this.field_4064 = 0L;
               }
            }
         }
      } else {
         this.field_4072 = null;
      }

   }

   // $FF: renamed from: fm (int, boolean) void
   public void method_6499(int var1, boolean var2) {
      if(!var2) {
         this.field_4060.add(Integer.valueOf(var1));
      } else {
         this.field_4060.remove(Integer.valueOf(var1));
      }

      for(int var3 = 0; var3 < -617825071 * class_331.field_3858; ++var3) {
         if(class_116.method_2248(var3, 1647125333) != null && class_116.method_2248(var3, 1647125333).field_621 * 41328569 == var1) {
            int var4 = class_116.method_2248(var3, 1647125333).field_607 * -298295867;
            if(!var2) {
               this.field_4048.add(Integer.valueOf(var4));
            } else {
               this.field_4048.remove(Integer.valueOf(var4));
            }
         }
      }

      this.method_6331(2055013026);
   }

   // $FF: renamed from: fu (int, boolean) void
   public void method_6500(int var1, boolean var2) {
      if(!var2) {
         this.field_4060.add(Integer.valueOf(var1));
      } else {
         this.field_4060.remove(Integer.valueOf(var1));
      }

      for(int var3 = 0; var3 < -617825071 * class_331.field_3858; ++var3) {
         if(class_116.method_2248(var3, 1647125333) != null && class_116.method_2248(var3, 1647125333).field_621 * 1970588278 == var1) {
            int var4 = class_116.method_2248(var3, 1647125333).field_607 * -503567288;
            if(!var2) {
               this.field_4048.add(Integer.valueOf(var4));
            } else {
               this.field_4048.remove(Integer.valueOf(var4));
            }
         }
      }

      this.method_6331(1931107521);
   }

   // $FF: renamed from: fh () boolean
   public boolean method_6501() {
      return !this.field_4030;
   }

   // $FF: renamed from: fd () boolean
   public boolean method_6502() {
      return !this.field_4030;
   }

   // $FF: renamed from: fv () boolean
   public boolean method_6503() {
      return !this.field_4030;
   }

   // $FF: renamed from: de () int
   public int method_6504() {
      return 1.0D == (double)this.field_4043?25:((double)this.field_4043 == 1.5D?37:(2.0D == (double)this.field_4043?854976312:((double)this.field_4043 == 3.0D?75:(4.0D == (double)this.field_4043?100:-1178374880))));
   }

   // $FF: renamed from: fr (int) boolean
   public boolean method_6505(int var1) {
      return !this.field_4062.contains(Integer.valueOf(var1));
   }

   // $FF: renamed from: fk (int) boolean
   public boolean method_6506(int var1) {
      return !this.field_4062.contains(Integer.valueOf(var1));
   }

   // $FF: renamed from: gg (int) boolean
   public boolean method_6507(int var1) {
      return !this.field_4060.contains(Integer.valueOf(var1));
   }

   // $FF: renamed from: gi (int) boolean
   public boolean method_6508(int var1) {
      return !this.field_4060.contains(Integer.valueOf(var1));
   }

   // $FF: renamed from: gw (int) boolean
   public boolean method_6509(int var1) {
      return !this.field_4060.contains(Integer.valueOf(var1));
   }

   // $FF: renamed from: fz (int) void
   public void method_6510(int var1) {
      if(var1 >= 1) {
         this.field_4049 = 1672792917 * var1;
      }

   }

   // $FF: renamed from: gz () void
   void method_6511() {
      this.field_4038.clear();
      this.field_4038.addAll(this.field_4062);
      this.field_4038.addAll(this.field_4048);
   }

   // $FF: renamed from: r (byte) void
   void method_6512(byte var1) {
      try {
         if(!this.method_6336(1260818751)) {
            if(var1 > 0) {
               ;
            }
         } else {
            int var2 = this.field_4040 * -1917021433 - 832010327 * this.field_4065;
            int var3 = this.field_4075 * 608372165 - -1742821169 * this.field_4039;
            if(0 != var2) {
               if(var1 <= 0) {
                  throw new IllegalStateException();
               }

               var2 /= Math.min(8, Math.abs(var2));
            }

            if(0 != var3) {
               if(var1 <= 0) {
                  throw new IllegalStateException();
               }

               var3 /= Math.min(8, Math.abs(var3));
            }

            this.method_6334(832010327 * this.field_4065 + var2, var3 + this.field_4039 * -1742821169, true, -1839676169);
            if(-1917021433 * this.field_4040 == this.field_4065 * 832010327) {
               if(var1 <= 0) {
                  throw new IllegalStateException();
               }

               if(this.field_4039 * -1742821169 == this.field_4075 * 608372165) {
                  if(var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  this.field_4040 = 1918997833;
                  this.field_4075 = -1751527693;
               }
            }

         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "mc.r(" + ')');
      }
   }

   // $FF: renamed from: gs (int, int, int, int, int, int) void
   public void method_6513(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(this.field_4037.method_6297(2145164261)) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.field_4042));
         int var8 = (int)Math.ceil((double)((float)var4 / this.field_4042));
         List var9 = this.field_4021.method_4244(this.field_4065 * 1147797525 - var7 / 2 - 1, this.field_4039 * -484111751 - var8 / 2 - 1, 1 + 832010327 * this.field_4065 + var7 / 2, 1 + var8 / 2 + -1167330894 * this.field_4039, var1, var2, var3, var4, var5, var6, 1483016338);
         if(!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if(!var10.hasNext()) {
                  return;
               }

               class_218 var11 = (class_218)var10.next();
               class_75 var12 = class_116.method_2248(var11.method_4205(2145040079), 1647125333);
               var13 = false;

               for(int var14 = this.field_4063.length - 1; var14 >= 0; --var14) {
                  if(null != var12.field_610[var14]) {
                     class_247.method_4712(var12.field_610[var14], var12.field_611, this.field_4063[var14], var11.method_4205(2145597626), var11.field_2480.method_5156(-738811910), var11.field_2482.method_5156(-738811910), -1740817538);
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   // $FF: renamed from: gv (int, int, int, int, int, int) void
   public void method_6514(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(this.field_4037.method_6297(-45513495)) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.field_4042));
         int var8 = (int)Math.ceil((double)((float)var4 / this.field_4042));
         List var9 = this.field_4021.method_4244(this.field_4065 * 832010327 - var7 / 2 - 1, this.field_4039 * -1742821169 - var8 / 2 - 1, 1 + 1459760912 * this.field_4065 + var7 / 2, 1 + var8 / 2 + -1742821169 * this.field_4039, var1, var2, var3, var4, var5, var6, 1045929541);
         if(!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if(!var10.hasNext()) {
                  return;
               }

               class_218 var11 = (class_218)var10.next();
               class_75 var12 = class_116.method_2248(var11.method_4205(2146672835), 1647125333);
               var13 = false;

               for(int var14 = this.field_4063.length - 1; var14 >= 0; --var14) {
                  if(null != var12.field_610[var14]) {
                     class_247.method_4712(var12.field_610[var14], var12.field_611, this.field_4063[var14], var11.method_4205(2146530485), var11.field_2480.method_5156(-738811910), var11.field_2482.method_5156(-738811910), -1294724756);
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   // $FF: renamed from: gm (int, int, int, int, int, int) void
   public void method_6515(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(this.field_4037.method_6297(1302641685)) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.field_4042));
         int var8 = (int)Math.ceil((double)((float)var4 / this.field_4042));
         List var9 = this.field_4021.method_4244(this.field_4065 * 832010327 - var7 / 2 - 1, this.field_4039 * -1742821169 - var8 / 2 - 1, 1 + 125973563 * this.field_4065 + var7 / 2, 1 + var8 / 2 + -1742821169 * this.field_4039, var1, var2, var3, var4, var5, var6, 1706689788);
         if(!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if(!var10.hasNext()) {
                  return;
               }

               class_218 var11 = (class_218)var10.next();
               class_75 var12 = class_116.method_2248(var11.method_4205(2147030291), 1647125333);
               var13 = false;

               for(int var14 = this.field_4063.length - 1; var14 >= 0; --var14) {
                  if(null != var12.field_610[var14]) {
                     class_247.method_4712(var12.field_610[var14], var12.field_611, this.field_4063[var14], var11.method_4205(2146905523), var11.field_2480.method_5156(-738811910), var11.field_2482.method_5156(-738811910), -1247219988);
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   // $FF: renamed from: go (int, ii) ii
   public class_280 method_6516(int var1, class_280 var2) {
      if(!this.field_4037.method_6297(1866004496)) {
         return null;
      } else if(!this.field_4021.method_4245(831698872)) {
         return null;
      } else if(!this.field_4034.method_4387(var2.field_3236 * -2092998769, var2.field_3235 * 349527629, 1448598809)) {
         return null;
      } else {
         HashMap var3 = this.field_4021.method_4246(2003899126);
         List var4 = (List)var3.get(Integer.valueOf(var1));
         if(null != var4 && !var4.isEmpty()) {
            class_218 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();

            while(var7.hasNext()) {
               class_218 var8 = (class_218)var7.next();
               int var9 = var8.field_2482.field_3236 * -2092998769 - -2092998769 * var2.field_3236;
               int var10 = 349527629 * var8.field_2482.field_3235 - var2.field_3235 * 349527629;
               int var11 = var10 * var10 + var9 * var9;
               if(var11 == 0) {
                  return var8.field_2482;
               }

               if(var11 < var6 || var5 == null) {
                  var5 = var8;
                  var6 = var11;
               }
            }

            return var5.field_2482;
         } else {
            return null;
         }
      }
   }

   // $FF: renamed from: bv (byte) gq
   public class_218 method_6517(byte var1) {
      try {
         if(!this.field_4037.method_6297(205278649)) {
            if(var1 != 1) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if(!this.field_4021.method_4245(831698872)) {
            if(var1 != 1) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            HashMap var2 = this.field_4021.method_4246(1102019303);
            this.field_4069 = new LinkedList();
            Iterator var3 = var2.values().iterator();

            while(var3.hasNext()) {
               if(var1 != 1) {
                  throw new IllegalStateException();
               }

               List var4 = (List)var3.next();
               this.field_4069.addAll(var4);
            }

            this.field_4070 = this.field_4069.iterator();
            return this.method_6385(-703883772);
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "mc.bv(" + ')');
      }
   }

   // $FF: renamed from: gu (int, int, ii, ii) void
   public void method_6518(int var1, int var2, class_280 var3, class_280 var4) {
      class_45 var10000 = new class_45;
      var10000.method_105();
      class_45 var5 = var10000;
      class_250 var7 = new class_250;
      var7.method_4721(var2, var3, var4);
      class_250 var6 = var7;
      var5.method_520(new Object[]{var6}, 1906910483);
      switch(var1) {
      case 1008:
         var5.method_519(10, 857135720);
         break;
      case 1009:
         var5.method_519(11, -1778309770);
         break;
      case 1010:
         var5.method_519(12, 1145258600);
         break;
      case 1011:
         var5.method_519(13, -1189818596);
         break;
      case 1012:
         var5.method_519(14, 1213295720);
      }

      class_203.method_4099(var5, (byte)1);
   }

   // $FF: renamed from: gx () gq
   public class_218 method_6519() {
      if(!this.field_4037.method_6297(1287317241)) {
         return null;
      } else if(!this.field_4021.method_4245(831698872)) {
         return null;
      } else {
         HashMap var1 = this.field_4021.method_4246(-924512539);
         this.field_4069 = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.field_4069.addAll(var3);
         }

         this.field_4070 = this.field_4069.iterator();
         return this.method_6385(108813374);
      }
   }

   // $FF: renamed from: gj () gq
   public class_218 method_6520() {
      if(!this.field_4037.method_6297(-5678270)) {
         return null;
      } else if(!this.field_4021.method_4245(831698872)) {
         return null;
      } else {
         HashMap var1 = this.field_4021.method_4246(1378908484);
         this.field_4069 = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.field_4069.addAll(var3);
         }

         this.field_4070 = this.field_4069.iterator();
         return this.method_6385(-1479263067);
      }
   }

   // $FF: renamed from: k (fo, ii, ii, boolean, int) void
   public void method_6521(class_230 var1, class_280 var2, class_280 var3, boolean var4, int var5) {
      try {
         if(null == var1) {
            if(var5 <= -361615376) {
               throw new IllegalStateException();
            }
         } else {
            label43: {
               if(null != this.field_4034) {
                  if(var5 <= -361615376) {
                     throw new IllegalStateException();
                  }

                  if(this.field_4034 == var1) {
                     break label43;
                  }

                  if(var5 <= -361615376) {
                     throw new IllegalStateException();
                  }
               }

               this.method_6343(var1, 1690698622);
            }

            if(!var4) {
               if(this.field_4034.method_4388(-1820038389 * var2.field_3234, var2.field_3236 * -2092998769, var2.field_3235 * 349527629, -1853150284)) {
                  this.method_6345(-1820038389 * var2.field_3234, -2092998769 * var2.field_3236, 349527629 * var2.field_3235, 296392422);
                  return;
               }

               if(var5 <= -361615376) {
                  throw new IllegalStateException();
               }
            }

            this.method_6345(-1820038389 * var3.field_3234, var3.field_3236 * -2092998769, var3.field_3235 * 349527629, -476010158);
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "mc.k(" + ')');
      }
   }

   // $FF: renamed from: gt () gq
   public class_218 method_6522() {
      if(null == this.field_4070) {
         return null;
      } else {
         class_218 var1;
         do {
            if(!this.field_4070.hasNext()) {
               return null;
            }

            var1 = (class_218)this.field_4070.next();
         } while(var1.method_4205(2147246618) == -1);

         return var1;
      }
   }
}
