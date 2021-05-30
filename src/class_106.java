
// $FF: renamed from: hp
public class class_106 extends class_104 {

   // $FF: renamed from: v md
   class_364 field_1213;
   // $FF: renamed from: n int
   int field_1214;
   // $FF: renamed from: j int[]
   int[] field_1215;
   // $FF: renamed from: t int[]
   int[] field_1216;
   // $FF: renamed from: p int[]
   int[] field_1217;
   // $FF: renamed from: oz dw
   static class_5 field_1218;
   // $FF: renamed from: r int[]
   int[] field_1219;
   // $FF: renamed from: ap ir
   class_285 field_1220;
   // $FF: renamed from: d int[]
   int[] field_1221;
   // $FF: renamed from: s int[]
   int[] field_1222;
   // $FF: renamed from: u int[]
   int[] field_1223;
   // $FF: renamed from: z int[]
   int[] field_1224;
    // $FF: renamed from: x int[]
   int[] field_1226;
   // $FF: renamed from: i iq[][]
   class_36[][] field_1227;
   // $FF: renamed from: w int[]
   int[] field_1228;
   // $FF: renamed from: ae iq[][]
   class_36[][] field_1229;
   // $FF: renamed from: h int[]
   int[] field_1230;
   // $FF: renamed from: q int[]
   int[] field_1231;
   // $FF: renamed from: l int[]
   int[] field_1232;
   // $FF: renamed from: f int
   int field_1233;
   // $FF: renamed from: y int[]
   int[] field_1234;
   // $FF: renamed from: ab boolean
   boolean field_1235;
   // $FF: renamed from: al int
   int field_1236;
   // $FF: renamed from: ad int
   int field_1237;
   // $FF: renamed from: ai long
   long field_1238;
   // $FF: renamed from: ar long
   long field_1239;
   // $FF: renamed from: ag ih
   class_105 field_1240;
   // $FF: renamed from: b int[]
   int[] field_1241;


   // $FF: renamed from: ct (int, int, int) void
   void method_1961(int var1, int var2, int var3) {}

   // $FF: renamed from: l (int) void
   public synchronized void method_1962(int var1) {
      try {
         this.field_1220.method_5226();
         this.method_1982(1017241688);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "hp.l(" + ')');
      }
   }

   // $FF: renamed from: n (int) int
   int method_1963(int var1) {
      try {
         return -386188103 * this.field_1214;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "hp.n(" + ')');
      }
   }

   // $FF: renamed from: f (ie, jv, bu, int, int) boolean
   public synchronized boolean method_1964(class_39 var1, class_306 var2, class_157 var3, int var4, int var5) {
      try {
         var1.method_457();
         boolean var6 = true;
         int[] var7 = null;
         if(var4 > 0) {
            if(var5 == -763163629) {
               throw new IllegalStateException();
            }

            var7 = new int[]{var4};
         }

         for(class_33 var8 = (class_33)var1.field_260.method_6531(); var8 != null; var8 = (class_33)var1.field_260.method_6527()) {
            int var9 = (int)var8.field_9;
            class_38 var10 = (class_38)this.field_1213.method_6523((long)var9);
            if(var10 == null) {
               if(var5 == -763163629) {
                  throw new IllegalStateException();
               }

               var10 = class_81.method_1347(var2, var9, -1662391635);
               if(var10 == null) {
                  if(var5 == -763163629) {
                     throw new IllegalStateException();
                  }

                  var6 = false;
                  continue;
               }

               this.field_1213.method_6525(var10, (long)var9);
            }

            if(!var10.method_445(var3, var8.field_59, var7, 122660467)) {
               if(var5 == -763163629) {
                  throw new IllegalStateException();
               }

               var6 = false;
            }
         }

         if(var6) {
            if(var5 == -763163629) {
               throw new IllegalStateException();
            }

            var1.method_459();
         }

         return var6;
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11, "hp.f(" + ')');
      }
   }

   // $FF: renamed from: p (int) void
   synchronized void method_1966(int var1) {
      try {
         for(class_38 var2 = (class_38)this.field_1213.method_6531(); var2 != null; var2 = (class_38)this.field_1213.method_6527()) {
            if(var1 <= -27903763) {
               throw new IllegalStateException();
            }

            var2.method_108();
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "hp.p(" + ')');
      }
   }

   // $FF: renamed from: s (ie, boolean, int) void
   public synchronized void method_1967(class_39 var1, boolean var2, int var3) {
      try {
         this.method_1962(-1600803049);
         this.field_1220.method_5233(var1.field_259);
         this.field_1235 = var2;
         this.field_1238 = 0L;
         int var4 = this.field_1220.method_5196();

         for(int var5 = 0; var5 < var4; ++var5) {
            if(var3 <= -49471100) {
               return;
            }

            this.field_1220.method_5197(var5);
            this.field_1220.method_5212(var5);
            this.field_1220.method_5224(var5);
         }

         this.field_1236 = this.field_1220.method_5205() * -1710679561;
         this.field_1237 = this.field_1220.field_3263[this.field_1236 * -398624825] * 100570539;
         this.field_1239 = this.field_1220.method_5216(this.field_1237 * 495959299) * 3686421231377222827L;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "hp.s(" + ')');
      }
   }

   // $FF: renamed from: ao (iq, byte) int
   int method_1968(class_36 var1, byte var2) {
      try {
         int var3 = 215164221 * var1.field_76 + (var1.field_77 * 1897214019 * var1.field_75 * -1146128297 >> 12);
         var3 += (this.field_1222[var1.field_81 * -1025207361] - 8192) * this.field_1228[var1.field_81 * -1025207361] >> 12;
         class_262 var4 = var1.field_70;
         int var5;
         if(-75268449 * var4.field_2922 > 0) {
            label49: {
               if(var4.field_2927 * 1263113975 <= 0) {
                  if(var2 != 1) {
                     throw new IllegalStateException();
                  }

                  if(this.field_1223[-1025207361 * var1.field_81] <= 0) {
                     break label49;
                  }

                  if(var2 != 1) {
                     throw new IllegalStateException();
                  }
               }

               var5 = var4.field_2927 * 1263113975 << 2;
               int var6 = var4.field_2928 * -1029030671 << 1;
               if(var1.field_83 * 726334989 < var6) {
                  if(var2 != 1) {
                     throw new IllegalStateException();
                  }

                  var5 = var5 * var1.field_83 * 726334989 / var6;
               }

               var5 += this.field_1223[var1.field_81 * -1025207361] >> 7;
               double var7 = Math.sin(0.01227184630308513D * (double)(var1.field_84 * 1237883869 & 511));
               var3 += (int)((double)var5 * var7);
            }
         }

         var5 = (int)((double)(256 * var1.field_86.field_1262) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var3) / (double)(class_139.field_1793 * 1631160541) + 0.5D);
         int var10000;
         if(var5 < 1) {
            if(var2 != 1) {
               throw new IllegalStateException();
            }

            var10000 = 1;
         } else {
            var10000 = var5;
         }

         return var10000;
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9, "hp.ao(" + ')');
      }
   }

   // $FF: renamed from: o (int) boolean
   public synchronized boolean method_1969(int var1) {
      try {
         return this.field_1220.method_5195();
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "hp.o(" + ')');
      }
   }

   // $FF: renamed from: m (int, int, int, byte) void
   void method_1971(int var1, int var2, int var3, byte var4) {
      try {
         class_36 var5 = this.field_1227[var1][var2];
         if(var5 == null) {
            if(var4 <= 13) {
               throw new IllegalStateException();
            }
         } else {
            this.field_1227[var1][var2] = null;
            if(0 != (this.field_1226[var1] & 2)) {
               if(var4 <= 13) {
                  throw new IllegalStateException();
               }

               for(class_36 var6 = (class_36)this.field_1240.field_1210.method_5944(); null != var6; var6 = (class_36)this.field_1240.field_1210.method_5972()) {
                  if(var4 <= 13) {
                     return;
                  }

                  if(-1025207361 * var6.field_81 == var5.field_81 * -1025207361) {
                     if(var4 <= 13) {
                        throw new IllegalStateException();
                     }

                     if(var6.field_71 * 1951740649 < 0) {
                        if(var4 <= 13) {
                           throw new IllegalStateException();
                        }

                        if(var5 != var6) {
                           if(var4 <= 13) {
                              return;
                           }

                           var5.field_71 = 0;
                           break;
                        }
                     }
                  }
               }
            } else {
               var5.field_71 = 0;
            }

         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "hp.m(" + ')');
      }
   }

   // $FF: renamed from: g (int, int, int) void
   void method_1972(int var1, int var2, int var3) {
      try {
         if(this.field_1241[var1] != var2) {
            this.field_1241[var1] = var2;

            for(int var4 = 0; var4 < 128; ++var4) {
               if(var3 <= -145310383) {
                  throw new IllegalStateException();
               }

               this.field_1229[var1][var4] = null;
            }
         }

      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "hp.g(" + ')');
      }
   }

   // $FF: renamed from: a (int, int, int, int) void
   void method_1973(int var1, int var2, int var3, int var4) {
      try {
         this.method_1971(var1, var2, 64, (byte)123);
         if(0 != (this.field_1226[var1] & 2)) {
            if(var4 != 1345766655) {
               return;
            }

            for(class_36 var5 = (class_36)this.field_1240.field_1210.method_5945(); null != var5; var5 = (class_36)this.field_1240.field_1210.method_5947()) {
               if(var4 != 1345766655) {
                  throw new IllegalStateException();
               }

               if(var5.field_81 * -1025207361 == var1) {
                  if(var4 != 1345766655) {
                     return;
                  }

                  if(var5.field_71 * 1951740649 < 0) {
                     if(var4 != 1345766655) {
                        throw new IllegalStateException();
                     }

                     this.field_1227[var1][-723940785 * var5.field_72] = null;
                     this.field_1227[var1][var2] = var5;
                     int var6 = (var5.field_77 * 1897214019 * -1146128297 * var5.field_75 >> 12) + var5.field_76 * 215164221;
                     var5.field_76 += (var2 - var5.field_72 * -723940785 << 8) * 945347093;
                     var5.field_75 = 817165159 * (var6 - 215164221 * var5.field_76);
                     var5.field_77 = 1237757952;
                     var5.field_72 = var2 * -1571468113;
                     return;
                  }
               }
            }
         }

         class_38 var10 = (class_38)this.field_1213.method_6523((long)this.field_1241[var1]);
         if(null != var10) {
            class_110 var11 = var10.field_251[var2];
            if(var11 != null) {
               class_36 var10000 = new class_36();
               class_36 var7 = var10000;
               var7.field_81 = 1226398783 * var1;
               var7.field_68 = var10;
               var7.field_86 = var11;
               var7.field_70 = var10.field_250[var2];
               var7.field_69 = var10.field_256[var2] * -764449191;
               var7.field_72 = -1571468113 * var2;
               var7.field_73 = 397717415 * (var10.field_255 * 222358093 * var3 * var3 * var10.field_253[var2] + 1024 >> 11);
               var7.field_74 = -737521707 * (var10.field_254[var2] & 255);
               var7.field_76 = ((var2 << 8) - (var10.field_252[var2] & 32767)) * 945347093;
               var7.field_78 = 0;
               var7.field_79 = 0;
               var7.field_87 = 0;
               var7.field_71 = -1679082841;
               var7.field_82 = 0;
               if(this.field_1216[var1] == 0) {
                  if(var4 != 1345766655) {
                     throw new IllegalStateException();
                  }

                  var7.field_85 = class_107.method_2072(var11, this.method_1968(var7, (byte)1), this.method_1987(var7, -2006876017), this.method_1988(var7, 434664739));
               } else {
                  var7.field_85 = class_107.method_2072(var11, this.method_1968(var7, (byte)1), 0, this.method_1988(var7, 397296779));
                  this.method_1974(var7, var10.field_252[var2] < 0, (byte)-14);
               }

               if(var10.field_252[var2] < 0) {
                  if(var4 != 1345766655) {
                     throw new IllegalStateException();
                  }

                  var7.field_85.method_2074(-1);
               }

               if(var7.field_69 * -2143225367 >= 0) {
                  if(var4 != 1345766655) {
                     throw new IllegalStateException();
                  }

                  class_36 var8 = this.field_1229[var1][-2143225367 * var7.field_69];
                  if(null != var8) {
                     if(var4 != 1345766655) {
                        return;
                     }

                     if(var8.field_71 * 1951740649 < 0) {
                        if(var4 != 1345766655) {
                           return;
                        }

                        this.field_1227[var1][-723940785 * var8.field_72] = null;
                        var8.field_71 = 0;
                     }
                  }

                  this.field_1229[var1][var7.field_69 * -2143225367] = var7;
               }

               this.field_1240.field_1210.method_5939(var7);
               this.field_1227[var1][var2] = var7;
            }
         }
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9, "hp.a(" + ')');
      }
   }

   // $FF: renamed from: k (iq, boolean, byte) void
   void method_1974(class_36 var1, boolean var2, byte var3) {
      try {
         int var5;
         label33: {
            int var4 = var1.field_86.field_1266.length;
            if(var2) {
               if(var3 == 0) {
                  throw new IllegalStateException();
               }

               if(var1.field_86.field_1263) {
                  if(var3 == 0) {
                     throw new IllegalStateException();
                  }

                  int var6 = var4 + var4 - var1.field_86.field_1264;
                  var5 = (int)((long)this.field_1216[-1025207361 * var1.field_81] * (long)var6 >> 6);
                  var4 <<= 8;
                  if(var5 >= var4) {
                     if(var3 == 0) {
                        return;
                     }

                     var5 = var4 + var4 - 1 - var5;
                     var1.field_85.method_2107(true);
                  }
                  break label33;
               }
            }

            var5 = (int)((long)var4 * (long)this.field_1216[-1025207361 * var1.field_81] >> 6);
         }

         var1.field_85.method_2113(var5);
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "hp.k(" + ')');
      }
   }

   // $FF: renamed from: x (int, int, int, int) void
   void method_1976(int var1, int var2, int var3, int var4) {
      try {
         ;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "hp.x(" + ')');
      }
   }

   // $FF: renamed from: w (int, int, byte) void
   void method_1978(int var1, int var2, byte var3) {
      try {
         this.field_1222[var1] = var2;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "hp.w(" + ')');
      }
   }

   // $FF: renamed from: t (int, int) void
   void method_1979(int var1, int var2) {
      try {
         for(class_36 var3 = (class_36)this.field_1240.field_1210.method_5944(); null != var3; var3 = (class_36)this.field_1240.field_1210.method_5972()) {
            if(var2 <= -332664643) {
               return;
            }

            if(var1 >= 0) {
               if(var1 != var3.field_81 * -1025207361) {
                  continue;
               }

               if(var2 <= -332664643) {
                  return;
               }
            }

            if(var3.field_85 != null) {
               var3.field_85.method_2083(1631160541 * class_139.field_1793 / 100);
               if(var3.field_85.method_2087()) {
                  if(var2 <= -332664643) {
                     return;
                  }

                  this.field_1240.field_1211.method_2198(var3.field_85);
               }

               var3.method_394((byte)-83);
            }

            if(1951740649 * var3.field_71 < 0) {
               if(var2 <= -332664643) {
                  throw new IllegalStateException();
               }

               this.field_1227[var3.field_81 * -1025207361][var3.field_72 * -723940785] = null;
            }

            var3.method_108();
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "hp.t(" + ')');
      }
   }

   // $FF: renamed from: ci (int, int, int) void
   void method_1980(int var1, int var2, int var3) {}

   // $FF: renamed from: ax (int) void
   void method_1982(int var1) {
      try {
         this.method_1979(-1, 2477568);
         this.method_1986(-1, -1043884473);

         int var2;
         for(var2 = 0; var2 < 16; ++var2) {
            this.field_1241[var2] = this.field_1219[var2];
         }

         for(var2 = 0; var2 < 16; ++var2) {
            if(var1 == -16853095) {
               throw new IllegalStateException();
            }

            this.field_1221[var2] = this.field_1219[var2] & -128;
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "hp.ax(" + ')');
      }
   }

   // $FF: renamed from: av (int, byte) void
   void method_1984(int var1, byte var2) {
      try {
         if((this.field_1226[var1] & 4) != 0) {
            if(var2 <= 1) {
               throw new IllegalStateException();
            }

            for(class_36 var3 = (class_36)this.field_1240.field_1210.method_5944(); null != var3; var3 = (class_36)this.field_1240.field_1210.method_5972()) {
               if(var2 <= 1) {
                  throw new IllegalStateException();
               }

               if(-1025207361 * var3.field_81 == var1) {
                  if(var2 <= 1) {
                     throw new IllegalStateException();
                  }

                  var3.field_80 = 0;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "hp.av(" + ')');
      }
   }

   // $FF: renamed from: v (int, int) void
   public synchronized void method_1985(int var1, int var2) {
      try {
         this.field_1214 = var1 * 1320814985;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "hp.v(" + ')');
      }
   }

   // $FF: renamed from: h (int, int) void
   void method_1986(int var1, int var2) {
      try {
         if(var1 >= 0) {
            this.field_1234[var1] = 12800;
            this.field_1217[var1] = 8192;
            this.field_1215[var1] = 16383;
            this.field_1222[var1] = 8192;
            this.field_1223[var1] = 0;
            this.field_1232[var1] = 8192;
            this.method_1990(var1, 1658989122);
            this.method_1984(var1, (byte)119);
            this.field_1226[var1] = 0;
            this.field_1224[var1] = 32767;
            this.field_1228[var1] = 256;
            this.field_1216[var1] = 0;
            this.method_2013(var1, 8192, 498737337);
         } else if(var2 != -1043884473) {
            throw new IllegalStateException();
         } else {
            for(var1 = 0; var1 < 16; ++var1) {
               this.method_1986(var1, -1043884473);
            }

         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "hp.h(" + ')');
      }
   }

   // $FF: renamed from: <init> () void
   public class_106() {
      super();
      try {
         this.field_1214 = -1173780224;
         this.field_1233 = -926606400;
         this.field_1234 = new int[16];
         this.field_1217 = new int[16];
         this.field_1215 = new int[16];
         this.field_1219 = new int[16];
         this.field_1241 = new int[16];
         this.field_1221 = new int[16];
         this.field_1222 = new int[16];
         this.field_1223 = new int[16];
         this.field_1232 = new int[16];
         this.field_1226 = new int[16];
         this.field_1224 = new int[16];
         this.field_1228 = new int[16];
         this.field_1216 = new int[16];
         this.field_1230 = new int[16];
         this.field_1231 = new int[16];
         this.field_1227 = new class_36[16][128];
         this.field_1229 = new class_36[16][128];
         class_285 var10001 = new class_285();
         this.field_1220 = var10001;
         class_105 var2 = new class_105(this);
         this.field_1240 = var2;
         class_364 var3 = new class_364(128);
         this.field_1213 = var3;
         this.method_1982(1700163653);
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "hp.<init>(" + ')');
      }
   }

   // $FF: renamed from: aq (iq, int) int
   int method_1987(class_36 var1, int var2) {
      try {
         class_262 var3 = var1.field_70;
         int var4 = this.field_1234[-1025207361 * var1.field_81] * this.field_1215[-1025207361 * var1.field_81] + 4096 >> 13;
         var4 = 16384 + var4 * var4 >> 15;
         var4 = 16384 + 1566640151 * var1.field_73 * var4 >> 15;
         var4 = 128 + -386188103 * this.field_1214 * var4 >> 8;
         if(-1176756579 * var3.field_2920 > 0) {
            if(var2 >= -1900177351) {
               throw new IllegalStateException();
            }

            var4 = (int)((double)var4 * Math.pow(0.5D, (double)(-1176756579 * var3.field_2920) * (double)(-955818271 * var1.field_78) * 1.953125E-5D) + 0.5D);
         }

         int var5;
         int var6;
         int var7;
         int var8;
         if(null != var3.field_2930) {
            if(var2 >= -1900177351) {
               throw new IllegalStateException();
            }

            var5 = 370154707 * var1.field_79;
            var6 = var3.field_2930[1 + 939918277 * var1.field_87];
            if(939918277 * var1.field_87 < var3.field_2930.length - 2) {
               if(var2 >= -1900177351) {
                  throw new IllegalStateException();
               }

               var7 = (var3.field_2930[939918277 * var1.field_87] & 255) << 8;
               var8 = (var3.field_2930[939918277 * var1.field_87 + 2] & 255) << 8;
               var6 += (var5 - var7) * (var3.field_2930[939918277 * var1.field_87 + 3] - var6) / (var8 - var7);
            }

            var4 = var6 * var4 + 32 >> 6;
         }

         if(1951740649 * var1.field_71 > 0) {
            if(var2 >= -1900177351) {
               throw new IllegalStateException();
            }

            if(var3.field_2921 != null) {
               var5 = 1951740649 * var1.field_71;
               var6 = var3.field_2921[var1.field_82 * -292962099 + 1];
               if(-292962099 * var1.field_82 < var3.field_2921.length - 2) {
                  if(var2 >= -1900177351) {
                     throw new IllegalStateException();
                  }

                  var7 = (var3.field_2921[var1.field_82 * -292962099] & 255) << 8;
                  var8 = (var3.field_2921[2 + var1.field_82 * -292962099] & 255) << 8;
                  var6 += (var5 - var7) * (var3.field_2921[3 + var1.field_82 * -292962099] - var6) / (var8 - var7);
               }

               var4 = var6 * var4 + 32 >> 6;
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9, "hp.aq(" + ')');
      }
   }

   // $FF: renamed from: aw (iq, int) int
   int method_1988(class_36 var1, int var2) {
      try {
         int var3 = this.field_1217[var1.field_81 * -1025207361];
         if(var3 < 8192) {
            if(var2 == -564340749) {
               throw new IllegalStateException();
            } else {
               return var3 * var1.field_74 * 970092925 + 32 >> 6;
            }
         } else {
            return 16384 - ((16384 - var3) * (128 - var1.field_74 * 970092925) + 32 >> 6);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "hp.aw(" + ')');
      }
   }

   // $FF: renamed from: ag (int, int) void
   void method_1989(int var1, int var2) {
      try {
         for(class_36 var3 = (class_36)this.field_1240.field_1210.method_5944(); null != var3; var3 = (class_36)this.field_1240.field_1210.method_5972()) {
            if(var2 != 1363851317) {
               throw new IllegalStateException();
            }

            if(var1 >= 0) {
               if(var1 != -1025207361 * var3.field_81) {
                  continue;
               }

               if(var2 != 1363851317) {
                  throw new IllegalStateException();
               }
            }

            if(var3.field_71 * 1951740649 < 0) {
               if(var2 != 1363851317) {
                  throw new IllegalStateException();
               }

               this.field_1227[-1025207361 * var3.field_81][-723940785 * var3.field_72] = null;
               var3.field_71 = 0;
            }
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "hp.ag(" + ')');
      }
   }

   // $FF: renamed from: r () bm
   protected synchronized class_104 method_1947() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "hp.r(" + ')');
      }
   }

   // $FF: renamed from: as (int, int) void
   void method_1990(int var1, int var2) {
      try {
         if(0 != (this.field_1226[var1] & 2)) {
            if(var2 == -1719591229) {
               throw new IllegalStateException();
            }

            for(class_36 var3 = (class_36)this.field_1240.field_1210.method_5944(); null != var3; var3 = (class_36)this.field_1240.field_1210.method_5972()) {
               if(var2 == -1719591229) {
                  return;
               }

               if(var1 == var3.field_81 * -1025207361) {
                  if(var2 == -1719591229) {
                     return;
                  }

                  if(this.field_1227[var1][-723940785 * var3.field_72] == null) {
                     if(var2 == -1719591229) {
                        throw new IllegalStateException();
                     }

                     if(var3.field_71 * 1951740649 < 0) {
                        if(var2 == -1719591229) {
                           return;
                        }

                        var3.field_71 = 0;
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "hp.as(" + ')');
      }
   }

   // $FF: renamed from: d (int[], int, int) void
   protected synchronized void method_1943(int[] var1, int var2, int var3) {
      try {
         if(this.field_1220.method_5195()) {
            int var4 = this.field_1220.field_3262 * this.field_1233 * 759378439 / (class_139.field_1793 * 1631160541);

            do {
               long var5 = 8283552259153278903L * this.field_1238 + (long)var3 * (long)var4;
               if(5710666307152973315L * this.field_1239 - var5 >= 0L) {
                  this.field_1238 = 3238896406058653191L * var5;
                  break;
               }

               int var7 = (int)((this.field_1239 * 5710666307152973315L - 8283552259153278903L * this.field_1238 + (long)var4 - 1L) / (long)var4);
               this.field_1238 += (long)var4 * (long)var7 * 3238896406058653191L;
               this.field_1240.method_1943(var1, var2, var7);
               var2 += var7;
               var3 -= var7;
               this.method_1991(981767255);
            } while(this.field_1220.method_5195());
         }

         this.field_1240.method_1943(var1, var2, var3);
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "hp.d(" + ')');
      }
   }

   // $FF: renamed from: u (int) void
   protected synchronized void method_1933(int var1) {
      try {
         if(this.field_1220.method_5195()) {
            int var2 = this.field_1233 * 759378439 * this.field_1220.field_3262 / (1631160541 * class_139.field_1793);

            do {
               long var3 = 8283552259153278903L * this.field_1238 + (long)var2 * (long)var1;
               if(5710666307152973315L * this.field_1239 - var3 >= 0L) {
                  this.field_1238 = var3 * 3238896406058653191L;
                  break;
               }

               int var5 = (int)(((long)var2 + (5710666307152973315L * this.field_1239 - 8283552259153278903L * this.field_1238) - 1L) / (long)var2);
               this.field_1238 += (long)var5 * (long)var2 * 3238896406058653191L;
               this.field_1240.method_1933(var5);
               var1 -= var5;
               this.method_1991(981767255);
            } while(this.field_1220.method_5195());
         }

         this.field_1240.method_1933(var1);
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "hp.u(" + ')');
      }
   }

   // $FF: renamed from: af (int) void
   void method_1991(int var1) {
      try {
         int var2 = -398624825 * this.field_1236;
         int var3 = 495959299 * this.field_1237;
         long var4 = 5710666307152973315L * this.field_1239;

         label78:
         while(true) {
            if(var3 != this.field_1237 * 495959299) {
               this.field_1236 = var2 * -1710679561;
               this.field_1237 = var3 * 100570539;
               this.field_1239 = 3686421231377222827L * var4;
               return;
            }

            if(var1 != 981767255) {
               throw new IllegalStateException();
            }

            while(this.field_1220.field_3263[var2] == var3) {
               if(var1 != 981767255) {
                  throw new IllegalStateException();
               }

               this.field_1220.method_5197(var2);
               int var6 = this.field_1220.method_5201(var2);
               if(var6 == 1) {
                  if(var1 != 981767255) {
                     throw new IllegalStateException();
                  }

                  this.field_1220.method_5229();
                  this.field_1220.method_5224(var2);
                  if(!this.field_1220.method_5220()) {
                     if(var1 != 981767255) {
                        throw new IllegalStateException();
                     }
                  } else {
                     if(!this.field_1235) {
                        break label78;
                     }

                     if(var1 != 981767255) {
                        throw new IllegalStateException();
                     }

                     if(var3 == 0) {
                        break label78;
                     }

                     if(var1 != 981767255) {
                        return;
                     }

                     this.field_1220.method_5207(var4);
                  }
                  break;
               }

               if(0 != (var6 & 128)) {
                  if(var1 != 981767255) {
                     throw new IllegalStateException();
                  }

                  this.method_1995(var6, (byte)1);
               }

               this.field_1220.method_5212(var2);
               this.field_1220.method_5224(var2);
            }

            var2 = this.field_1220.method_5205();
            var3 = this.field_1220.field_3263[var2];
            var4 = this.field_1220.method_5216(var3);
         }

         this.method_1982(1820956261);
         this.field_1220.method_5226();
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "hp.af(" + ')');
      }
   }

   // $FF: renamed from: ak (iq, byte) boolean
   boolean method_1992(class_36 var1, byte var2) {
      try {
         if(var1.field_85 == null) {
            if(var2 == 4) {
               throw new IllegalStateException();
            } else {
               if(1951740649 * var1.field_71 >= 0) {
                  if(var2 == 4) {
                     throw new IllegalStateException();
                  }

                  var1.method_108();
                  if(var1.field_69 * -2143225367 > 0) {
                     if(var2 == 4) {
                        throw new IllegalStateException();
                     }

                     if(this.field_1229[-1025207361 * var1.field_81][var1.field_69 * -2143225367] == var1) {
                        if(var2 == 4) {
                           throw new IllegalStateException();
                        }

                        this.field_1229[-1025207361 * var1.field_81][var1.field_69 * -2143225367] = null;
                     }
                  }
               }

               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "hp.ak(" + ')');
      }
   }

   // $FF: renamed from: ay (iq, int[], int, int, int) boolean
   boolean method_1993(class_36 var1, int[] var2, int var3, int var4, int var5) {
      try {
         var1.field_67 = class_139.field_1793 * 1631160541 / 100 * -2059069367;
         if(var1.field_71 * 1951740649 >= 0) {
            label236: {
               if(var5 >= -1474932203) {
                  throw new IllegalStateException();
               }

               if(var1.field_85 != null) {
                  if(!var1.field_85.method_2078()) {
                     break label236;
                  }

                  if(var5 >= -1474932203) {
                     throw new IllegalStateException();
                  }
               }

               var1.method_394((byte)-88);
               var1.method_108();
               if(var1.field_69 * -2143225367 > 0) {
                  if(var5 >= -1474932203) {
                     throw new IllegalStateException();
                  }

                  if(this.field_1229[-1025207361 * var1.field_81][var1.field_69 * -2143225367] == var1) {
                     if(var5 >= -1474932203) {
                        throw new IllegalStateException();
                     }

                     this.field_1229[-1025207361 * var1.field_81][var1.field_69 * -2143225367] = null;
                  }
               }

               return true;
            }
         }

         int var6 = var1.field_77 * 1897214019;
         if(var6 > 0) {
            var6 -= (int)(16.0D * Math.pow(2.0D, (double)this.field_1232[-1025207361 * var1.field_81] * 4.921259842519685E-4D) + 0.5D);
            if(var6 < 0) {
               if(var5 >= -1474932203) {
                  throw new IllegalStateException();
               }

               var6 = 0;
            }

            var1.field_77 = -1533764501 * var6;
         }

         var1.field_85.method_2171(this.method_1968(var1, (byte)1));
         class_262 var7 = var1.field_70;
         boolean var8 = false;
         var1.field_83 += 609517765;
         var1.field_84 += 1555286699 * var7.field_2922;
         double var9 = 5.086263020833333E-6D * (double)((var1.field_77 * 1897214019 * var1.field_75 * -1146128297 >> 12) + (var1.field_72 * -723940785 - 60 << 8));
         if(-1176756579 * var7.field_2920 > 0) {
            if(var5 >= -1474932203) {
               throw new IllegalStateException();
            }

            if(1149162475 * var7.field_2925 > 0) {
               if(var5 >= -1474932203) {
                  throw new IllegalStateException();
               }

               var1.field_78 += (int)(128.0D * Math.pow(2.0D, var9 * (double)(var7.field_2925 * 1149162475)) + 0.5D) * -1184996063;
            } else {
               var1.field_78 += -1355640704;
            }
         }

         if(var7.field_2930 != null) {
            if(var5 >= -1474932203) {
               throw new IllegalStateException();
            }

            if(var7.field_2926 * -2020328807 > 0) {
               if(var5 >= -1474932203) {
                  throw new IllegalStateException();
               }

               var1.field_79 += (int)(128.0D * Math.pow(2.0D, (double)(var7.field_2926 * -2020328807) * var9) + 0.5D) * -1297704101;
            } else {
               var1.field_79 += 1397599616;
            }

            while(var1.field_87 * 939918277 < var7.field_2930.length - 2) {
               if(var5 >= -1474932203) {
                  throw new IllegalStateException();
               }

               if(370154707 * var1.field_79 <= (var7.field_2930[var1.field_87 * 939918277 + 2] & 255) << 8) {
                  break;
               }

               if(var5 >= -1474932203) {
                  throw new IllegalStateException();
               }

               var1.field_87 += -1712781798;
            }

            if(var7.field_2930.length - 2 == 939918277 * var1.field_87) {
               if(var5 >= -1474932203) {
                  throw new IllegalStateException();
               }

               if(var7.field_2930[var1.field_87 * 939918277 + 1] == 0) {
                  if(var5 >= -1474932203) {
                     throw new IllegalStateException();
                  }

                  var8 = true;
               }
            }
         }

         if(var1.field_71 * 1951740649 >= 0) {
            if(var5 >= -1474932203) {
               throw new IllegalStateException();
            }

            if(var7.field_2921 != null && 0 == (this.field_1226[-1025207361 * var1.field_81] & 1)) {
               label239: {
                  if(var5 >= -1474932203) {
                     throw new IllegalStateException();
                  }

                  if(var1.field_69 * -2143225367 >= 0) {
                     if(var5 >= -1474932203) {
                        throw new IllegalStateException();
                     }

                     if(var1 == this.field_1229[-1025207361 * var1.field_81][var1.field_69 * -2143225367]) {
                        break label239;
                     }

                     if(var5 >= -1474932203) {
                        throw new IllegalStateException();
                     }
                  }

                  if(-540295213 * var7.field_2924 > 0) {
                     if(var5 >= -1474932203) {
                        throw new IllegalStateException();
                     }

                     var1.field_71 += (int)(128.0D * Math.pow(2.0D, (double)(-540295213 * var7.field_2924) * var9) + 0.5D) * 1679082841;
                  } else {
                     var1.field_71 += 174238848;
                  }

                  while(-292962099 * var1.field_82 < var7.field_2921.length - 2) {
                     if(var5 >= -1474932203) {
                        throw new IllegalStateException();
                     }

                     if(var1.field_71 * 1951740649 <= (var7.field_2921[2 + -292962099 * var1.field_82] & 255) << 8) {
                        break;
                     }

                     if(var5 >= -1474932203) {
                        throw new IllegalStateException();
                     }

                     var1.field_82 += -977774582;
                  }

                  if(var1.field_82 * -292962099 == var7.field_2921.length - 2) {
                     if(var5 >= -1474932203) {
                        throw new IllegalStateException();
                     }

                     var8 = true;
                  }
               }
            }
         }

         if(var8) {
            if(var5 >= -1474932203) {
               throw new IllegalStateException();
            } else {
               var1.field_85.method_2083(var1.field_67 * 730487289);
               if(null != var2) {
                  if(var5 >= -1474932203) {
                     throw new IllegalStateException();
                  }

                  var1.field_85.method_1943(var2, var3, var4);
               } else {
                  var1.field_85.method_1933(var4);
               }

               if(var1.field_85.method_2087()) {
                  if(var5 >= -1474932203) {
                     throw new IllegalStateException();
                  }

                  this.field_1240.field_1211.method_2198(var1.field_85);
               }

               var1.method_394((byte)-86);
               if(1951740649 * var1.field_71 >= 0) {
                  if(var5 >= -1474932203) {
                     throw new IllegalStateException();
                  }

                  var1.method_108();
                  if(-2143225367 * var1.field_69 > 0) {
                     if(var5 >= -1474932203) {
                        throw new IllegalStateException();
                     }

                     if(var1 == this.field_1229[var1.field_81 * -1025207361][-2143225367 * var1.field_69]) {
                        if(var5 >= -1474932203) {
                           throw new IllegalStateException();
                        }

                        this.field_1229[var1.field_81 * -1025207361][var1.field_69 * -2143225367] = null;
                     }
                  }
               }

               return true;
            }
         } else {
            var1.field_85.method_2195(730487289 * var1.field_67, this.method_1987(var1, -2121980978), this.method_1988(var1, -1483701319));
            return false;
         }
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11, "hp.ay(" + ')');
      }
   }

   // $FF: renamed from: q () bm
   protected synchronized class_104 method_1938() {
      return this.field_1240;
   }

   // $FF: renamed from: gp (int) boolean
   static boolean method_1994(int var0) {
      try {
         boolean var10000;
         if((client.field_1584 * -1493328845 & 8) != 0) {
            if(var0 >= 85735080) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "hp.gp(" + ')');
      }
   }

   // $FF: renamed from: ae () bm
   protected synchronized class_104 method_1939() {
      return this.field_1240;
   }

   // $FF: renamed from: ap () bm
   protected synchronized class_104 method_1934() {
      return null;
   }

   // $FF: renamed from: ab () int
   protected synchronized int method_1942() {
      return 0;
   }

   // $FF: renamed from: al () int
   protected synchronized int method_1941() {
      return 0;
   }

   // $FF: renamed from: ad () int
   protected synchronized int method_1944() {
      return 0;
   }

   // $FF: renamed from: ai (int[], int, int) void
   protected synchronized void method_1945(int[] var1, int var2, int var3) {
      if(this.field_1220.method_5195()) {
         int var4 = this.field_1220.field_3262 * this.field_1233 * 759378439 / (class_139.field_1793 * 1631160541);

         do {
            long var5 = 8283552259153278903L * this.field_1238 + (long)var3 * (long)var4;
            if(5710666307152973315L * this.field_1239 - var5 >= 0L) {
               this.field_1238 = 3238896406058653191L * var5;
               break;
            }

            int var7 = (int)((this.field_1239 * 5710666307152973315L - 8283552259153278903L * this.field_1238 + (long)var4 - 1L) / (long)var4);
            this.field_1238 += (long)var4 * (long)var7 * 3238896406058653191L;
            this.field_1240.method_1943(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method_1991(981767255);
         } while(this.field_1220.method_5195());
      }

      this.field_1240.method_1943(var1, var2, var3);
   }

   // $FF: renamed from: ac (int, byte) void
   void method_1995(int var1, byte var2) {
      try {
         int var3 = var1 & 240;
         int var4;
         int var5;
         int var6;
         if(128 == var3) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            var6 = var1 >> 16 & 127;
            this.method_1971(var4, var5, var6, (byte)58);
         } else if(var3 == 144) {
            if(var2 == 1) {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               var6 = var1 >> 16 & 127;
               if(var6 > 0) {
                  this.method_1973(var4, var5, var6, 1345766655);
               } else {
                  this.method_1971(var4, var5, 64, (byte)91);
               }

            }
         } else if(160 == var3) {
            if(var2 != 1) {
               throw new IllegalStateException();
            } else {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               var6 = var1 >> 16 & 127;
               this.method_1976(var4, var5, var6, -366047626);
            }
         } else if(176 == var3) {
            if(var2 != 1) {
               throw new IllegalStateException();
            } else {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               var6 = var1 >> 16 & 127;
               if(var5 == 0) {
                  if(var2 != 1) {
                     throw new IllegalStateException();
                  }

                  this.field_1221[var4] = (this.field_1221[var4] & -2080769) + (var6 << 14);
               }

               if(32 == var5) {
                  if(var2 != 1) {
                     return;
                  }

                  this.field_1221[var4] = (this.field_1221[var4] & -16257) + (var6 << 7);
               }

               if(1 == var5) {
                  if(var2 != 1) {
                     throw new IllegalStateException();
                  }

                  this.field_1223[var4] = (this.field_1223[var4] & -16257) + (var6 << 7);
               }

               if(33 == var5) {
                  if(var2 != 1) {
                     throw new IllegalStateException();
                  }

                  this.field_1223[var4] = (this.field_1223[var4] & -128) + var6;
               }

               if(var5 == 5) {
                  if(var2 != 1) {
                     throw new IllegalStateException();
                  }

                  this.field_1232[var4] = (var6 << 7) + (this.field_1232[var4] & -16257);
               }

               if(var5 == 37) {
                  if(var2 != 1) {
                     throw new IllegalStateException();
                  }

                  this.field_1232[var4] = (this.field_1232[var4] & -128) + var6;
               }

               if(7 == var5) {
                  if(var2 != 1) {
                     throw new IllegalStateException();
                  }

                  this.field_1234[var4] = (this.field_1234[var4] & -16257) + (var6 << 7);
               }

               if(var5 == 39) {
                  if(var2 != 1) {
                     return;
                  }

                  this.field_1234[var4] = var6 + (this.field_1234[var4] & -128);
               }

               if(10 == var5) {
                  if(var2 != 1) {
                     throw new IllegalStateException();
                  }

                  this.field_1217[var4] = (var6 << 7) + (this.field_1217[var4] & -16257);
               }

               if(var5 == 42) {
                  if(var2 != 1) {
                     throw new IllegalStateException();
                  }

                  this.field_1217[var4] = (this.field_1217[var4] & -128) + var6;
               }

               if(var5 == 11) {
                  if(var2 != 1) {
                     throw new IllegalStateException();
                  }

                  this.field_1215[var4] = (this.field_1215[var4] & -16257) + (var6 << 7);
               }

               if(var5 == 43) {
                  if(var2 != 1) {
                     throw new IllegalStateException();
                  }

                  this.field_1215[var4] = (this.field_1215[var4] & -128) + var6;
               }

               if(64 == var5) {
                  if(var6 >= 64) {
                     this.field_1226[var4] |= 1;
                  } else {
                     this.field_1226[var4] &= -2;
                  }
               }

               if(65 == var5) {
                  if(var2 != 1) {
                     return;
                  }

                  if(var6 >= 64) {
                     if(var2 != 1) {
                        throw new IllegalStateException();
                     }

                     this.field_1226[var4] |= 2;
                  } else {
                     this.method_1990(var4, 1448860582);
                     this.field_1226[var4] &= -3;
                  }
               }

               if(99 == var5) {
                  if(var2 != 1) {
                     return;
                  }

                  this.field_1224[var4] = (var6 << 7) + (this.field_1224[var4] & 127);
               }

               if(var5 == 98) {
                  this.field_1224[var4] = var6 + (this.field_1224[var4] & 16256);
               }

               if(var5 == 101) {
                  this.field_1224[var4] = (this.field_1224[var4] & 127) + 16384 + (var6 << 7);
               }

               if(var5 == 100) {
                  if(var2 != 1) {
                     throw new IllegalStateException();
                  }

                  this.field_1224[var4] = var6 + (this.field_1224[var4] & 16256) + 16384;
               }

               if(120 == var5) {
                  if(var2 != 1) {
                     throw new IllegalStateException();
                  }

                  this.method_1979(var4, 1269345678);
               }

               if(var5 == 121) {
                  this.method_1986(var4, -1043884473);
               }

               if(var5 == 123) {
                  this.method_1989(var4, 1363851317);
               }

               int var7;
               if(6 == var5) {
                  if(var2 != 1) {
                     throw new IllegalStateException();
                  }

                  var7 = this.field_1224[var4];
                  if(var7 == 16384) {
                     this.field_1228[var4] = (var6 << 7) + (this.field_1228[var4] & -16257);
                  }
               }

               if(38 == var5) {
                  if(var2 != 1) {
                     throw new IllegalStateException();
                  }

                  var7 = this.field_1224[var4];
                  if(var7 == 16384) {
                     if(var2 != 1) {
                        throw new IllegalStateException();
                     }

                     this.field_1228[var4] = var6 + (this.field_1228[var4] & -128);
                  }
               }

               if(var5 == 16) {
                  if(var2 != 1) {
                     return;
                  }

                  this.field_1216[var4] = (this.field_1216[var4] & -16257) + (var6 << 7);
               }

               if(48 == var5) {
                  if(var2 != 1) {
                     throw new IllegalStateException();
                  }

                  this.field_1216[var4] = var6 + (this.field_1216[var4] & -128);
               }

               if(81 == var5) {
                  if(var2 != 1) {
                     throw new IllegalStateException();
                  }

                  if(var6 >= 64) {
                     if(var2 != 1) {
                        throw new IllegalStateException();
                     }

                     this.field_1226[var4] |= 4;
                  } else {
                     this.method_1984(var4, (byte)116);
                     this.field_1226[var4] &= -5;
                  }
               }

               if(var5 == 17) {
                  if(var2 != 1) {
                     return;
                  }

                  this.method_2013(var4, (var6 << 7) + (this.field_1230[var4] & -16257), 498737337);
               }

               if(var5 == 49) {
                  if(var2 != 1) {
                     return;
                  }

                  this.method_2013(var4, (this.field_1230[var4] & -128) + var6, 498737337);
               }

            }
         } else if(var3 == 192) {
            if(var2 != 1) {
               throw new IllegalStateException();
            } else {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               this.method_1972(var4, var5 + this.field_1221[var4], -144994641);
            }
         } else if(208 == var3) {
            if(var2 == 1) {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               this.method_2037(var4, var5, 852353128);
            }
         } else if(var3 == 224) {
            if(var2 != 1) {
               throw new IllegalStateException();
            } else {
               var4 = var1 & 15;
               var5 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
               this.method_1978(var4, var5, (byte)-5);
            }
         } else {
            var3 = var1 & 255;
            if(255 == var3) {
               this.method_1982(-1436282726);
            }
         }
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "hp.ac(" + ')');
      }
   }

   // $FF: renamed from: aj (int) void
   protected synchronized void method_1950(int var1) {
      if(this.field_1220.method_5195()) {
         int var2 = this.field_1233 * 759378439 * this.field_1220.field_3262 / (1631160541 * class_139.field_1793);

         do {
            long var3 = 8283552259153278903L * this.field_1238 + (long)var2 * (long)var1;
            if(5710666307152973315L * this.field_1239 - var3 >= 0L) {
               this.field_1238 = var3 * 3238896406058653191L;
               break;
            }

            int var5 = (int)(((long)var2 + (5710666307152973315L * this.field_1239 - 8283552259153278903L * this.field_1238) - 1L) / (long)var2);
            this.field_1238 += (long)var5 * (long)var2 * 3238896406058653191L;
            this.field_1240.method_1933(var5);
            var1 -= var5;
            this.method_1991(981767255);
         } while(this.field_1220.method_5195());
      }

      this.field_1240.method_1933(var1);
   }

   // $FF: renamed from: am (int) void
   protected synchronized void method_1948(int var1) {
      if(this.field_1220.method_5195()) {
         int var2 = this.field_1233 * 759378439 * this.field_1220.field_3262 / (1631160541 * class_139.field_1793);

         do {
            long var3 = 8283552259153278903L * this.field_1238 + (long)var2 * (long)var1;
            if(5710666307152973315L * this.field_1239 - var3 >= 0L) {
               this.field_1238 = var3 * 3238896406058653191L;
               break;
            }

            int var5 = (int)(((long)var2 + (5710666307152973315L * this.field_1239 - 8283552259153278903L * this.field_1238) - 1L) / (long)var2);
            this.field_1238 += (long)var5 * (long)var2 * 3238896406058653191L;
            this.field_1240.method_1933(var5);
            var1 -= var5;
            this.method_1991(981767255);
         } while(this.field_1220.method_5195());
      }

      this.field_1240.method_1933(var1);
   }

   // $FF: renamed from: az (int) void
   protected synchronized void method_1949(int var1) {
      if(this.field_1220.method_5195()) {
         int var2 = this.field_1233 * -853829209 * this.field_1220.field_3262 / (1631160541 * class_139.field_1793);

         do {
            long var3 = 8283552259153278903L * this.field_1238 + (long)var2 * (long)var1;
            if(5710666307152973315L * this.field_1239 - var3 >= 0L) {
               this.field_1238 = var3 * 3238896406058653191L;
               break;
            }

            int var5 = (int)(((long)var2 + (5710666307152973315L * this.field_1239 - 8283552259153278903L * this.field_1238) - 1L) / (long)var2);
            this.field_1238 += (long)var5 * (long)var2 * 3238896406058653191L;
            this.field_1240.method_1933(var5);
            var1 -= var5;
            this.method_1991(981767255);
         } while(this.field_1220.method_5195());
      }

      this.field_1240.method_1933(var1);
   }

   // $FF: renamed from: cp (int, int, int) void
   void method_2005(int var1, int var2, int var3) {}

   // $FF: renamed from: j () bm
   protected synchronized class_104 method_1931() {
      try {
         return this.field_1240;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "hp.j(" + ')');
      }
   }

   // $FF: renamed from: at (int, int, int) void
   void method_2013(int var1, int var2, int var3) {
      try {
         this.field_1230[var1] = var2;
         this.field_1231[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "hp.at(" + ')');
      }
   }

   // $FF: renamed from: ar (int[], int, int) void
   protected synchronized void method_1946(int[] var1, int var2, int var3) {
      if(this.field_1220.method_5195()) {
         int var4 = this.field_1220.field_3262 * this.field_1233 * 759378439 / (class_139.field_1793 * 1631160541);

         do {
            long var5 = 8283552259153278903L * this.field_1238 + (long)var3 * (long)var4;
            if(5710666307152973315L * this.field_1239 - var5 >= 0L) {
               this.field_1238 = 3238896406058653191L * var5;
               break;
            }

            int var7 = (int)((this.field_1239 * 5710666307152973315L - 8283552259153278903L * this.field_1238 + (long)var4 - 1L) / (long)var4);
            this.field_1238 += (long)var4 * (long)var7 * 3238896406058653191L;
            this.field_1240.method_1943(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method_1991(981767255);
         } while(this.field_1220.method_5195());
      }

      this.field_1240.method_1943(var1, var2, var3);
   }

   // $FF: renamed from: by (int, int, int) void
   void method_2020(int var1, int var2, int var3) {
      class_36 var4 = this.field_1227[var1][var2];
      if(var4 != null) {
         this.field_1227[var1][var2] = null;
         if(0 != (this.field_1226[var1] & 2)) {
            for(class_36 var5 = (class_36)this.field_1240.field_1210.method_5944(); null != var5; var5 = (class_36)this.field_1240.field_1210.method_5972()) {
               if(-1025207361 * var5.field_81 == var4.field_81 * -2042570608 && var5.field_71 * 1951740649 < 0 && var4 != var5) {
                  var4.field_71 = 0;
                  break;
               }
            }
         } else {
            var4.field_71 = 0;
         }

      }
   }

   // $FF: renamed from: bc (int, int, int) void
   void method_2021(int var1, int var2, int var3) {
      class_36 var4 = this.field_1227[var1][var2];
      if(var4 != null) {
         this.field_1227[var1][var2] = null;
         if(0 != (this.field_1226[var1] & 2)) {
            for(class_36 var5 = (class_36)this.field_1240.field_1210.method_5944(); null != var5; var5 = (class_36)this.field_1240.field_1210.method_5972()) {
               if(-1025207361 * var5.field_81 == var4.field_81 * -1025207361 && var5.field_71 * 1951740649 < 0 && var4 != var5) {
                  var4.field_71 = 0;
                  break;
               }
            }
         } else {
            var4.field_71 = 0;
         }

      }
   }

   // $FF: renamed from: cd (int, int, int) void
   void method_2022(int var1, int var2, int var3) {
      class_36 var4 = this.field_1227[var1][var2];
      if(var4 != null) {
         this.field_1227[var1][var2] = null;
         if(0 != (this.field_1226[var1] & 2)) {
            for(class_36 var5 = (class_36)this.field_1240.field_1210.method_5944(); null != var5; var5 = (class_36)this.field_1240.field_1210.method_5972()) {
               if(-401012906 * var5.field_81 == var4.field_81 * -1025207361 && var5.field_71 * 1951740649 < 0 && var4 != var5) {
                  var4.field_71 = 0;
                  break;
               }
            }
         } else {
            var4.field_71 = 0;
         }

      }
   }

   // $FF: renamed from: cm (int, int, int) void
   void method_2023(int var1, int var2, int var3) {
      class_36 var4 = this.field_1227[var1][var2];
      if(var4 != null) {
         this.field_1227[var1][var2] = null;
         if(0 != (this.field_1226[var1] & 2)) {
            for(class_36 var5 = (class_36)this.field_1240.field_1210.method_5944(); null != var5; var5 = (class_36)this.field_1240.field_1210.method_5972()) {
               if(-1025207361 * var5.field_81 == var4.field_81 * -1025207361 && var5.field_71 * 1951740649 < 0 && var4 != var5) {
                  var4.field_71 = 0;
                  break;
               }
            }
         } else {
            var4.field_71 = 0;
         }

      }
   }

   // $FF: renamed from: cv (int, int, int) void
   void method_2024(int var1, int var2, int var3) {}

   // $FF: renamed from: cr (int, int) void
   void method_2025(int var1, int var2) {}

   // $FF: renamed from: cq (int, int, int) void
   void method_2028(int var1, int var2, int var3) {}

   // $FF: renamed from: b () int
   protected synchronized int method_1935() {
      try {
         return 0;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "hp.b(" + ')');
      }
   }

   // $FF: renamed from: cf (int, int) void
   void method_2033(int var1, int var2) {}

   // $FF: renamed from: i () bm
   protected synchronized class_104 method_1937() {
      return this.field_1240;
   }

   // $FF: renamed from: z (int, int, int) void
   void method_2037(int var1, int var2, int var3) {
      try {
         ;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "hp.z(" + ')');
      }
   }

   // $FF: renamed from: c (int, int, int) void
   public synchronized void method_2038(int var1, int var2, int var3) {
      try {
         this.method_2048(var1, var2, (byte)-75);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "hp.c(" + ')');
      }
   }

   // $FF: renamed from: e (int, int, byte) void
   void method_2048(int var1, int var2, byte var3) {
      try {
         this.field_1219[var1] = var2;
         this.field_1221[var1] = var2 & -128;
         this.method_1972(var1, var2, -81134935);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "hp.e(" + ')');
      }
   }

   // $FF: renamed from: y (byte) void
   public synchronized void method_2065(byte var1) {
      try {
         for(class_38 var2 = (class_38)this.field_1213.method_6531(); var2 != null; var2 = (class_38)this.field_1213.method_6527()) {
            if(var1 <= 7) {
               return;
            }

            var2.method_446(1514154807);
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "hp.y(" + ')');
      }
   }
}
