import java.io.IOException;

// $FF: renamed from: gh
public class class_245 implements class_7 {

   // $FF: renamed from: f int
   int field_2709;
   // $FF: renamed from: n kx
   class_335 field_2710;
   // $FF: renamed from: j int
   int field_2711;
   // $FF: renamed from: y int
   int field_2712;
   // $FF: renamed from: r jv
   class_306 field_2713;
   // $FF: renamed from: v gf[]
   class_42[] field_2714;
   // $FF: renamed from: p double
   double field_2715;
    // $FF: renamed from: hy oh[]
   static class_67[] field_2718;


    // $FF: renamed from: t (int) boolean
   public boolean method_43() {
      return 861354963 * this.field_2711 == 64;
   }

   // $FF: renamed from: v (int) int
   public int method_4691(int var1) {
      try {
         int var2 = 0;
         int var3 = 0;
         class_42[] var4 = this.field_2714;

         for(int var5 = 0; var5 < var4.length; ++var5) {
            class_42 var6 = var4[var5];
            if(var6 != null) {
               if(var1 <= -2083476425) {
                  throw new IllegalStateException();
               }

               if(null != var6.field_301) {
                  var2 += var6.field_301.length;
                  int[] var7 = var6.field_301;

                  for(int var8 = 0; var8 < var7.length; ++var8) {
                     if(var1 <= -2083476425) {
                        throw new IllegalStateException();
                     }

                     int var9 = var7[var8];
                     if(this.field_2713.method_5429(var9, (byte)0)) {
                        ++var3;
                     }
                  }
               }
            }
         }

         if(var2 == 0) {
            if(var1 <= -2083476425) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return 100 * var3 / var2;
         }
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }

   // $FF: renamed from: n (double) void
   public void method_4692(double var1) {
      try {
         this.field_2715 = var1;
         this.method_4703((short)128);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: f (int, int) int[]
   public int[] method_42(int var1, int var2) {
      try {
         class_42 var3 = this.field_2714[var1];
         if(null != var3) {
            if(null != var3.field_307) {
               if(var2 != -455909856) {
                  throw new IllegalStateException();
               }

               this.field_2710.method_5970(var3);
               var3.field_308 = true;
               return var3.field_307;
            }

            boolean var4 = var3.method_484(this.field_2715, 861354963 * this.field_2711, this.field_2713);
            if(var4) {
               if(var2 != -455909856) {
                  throw new IllegalStateException();
               }

               if(0 == 530672939 * this.field_2712) {
                  if(var2 != -455909856) {
                     throw new IllegalStateException();
                  }

                  class_42 var5 = (class_42)this.field_2710.method_5943();
                  var5.method_490();
               } else {
                  this.field_2712 -= -509875837;
               }

               this.field_2710.method_5970(var3);
               var3.field_308 = true;
               return var3.field_307;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: y (int, int) int
   public int method_31(int var1, int var2) {
      try {
         if(null != this.field_2714[var1]) {
            if(var2 >= 1806885133) {
               throw new IllegalStateException();
            } else {
               return this.field_2714[var1].field_299;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: p (int, byte) boolean
   public boolean method_41(int var1) {
      try {
         return this.field_2714[var1].field_306;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: j (int, int) boolean
   public boolean method_33(int var2) {
      try {
         boolean var10000;
         if(861354963 * this.field_2711 == 64) {
            if(var2 <= -449898975) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

    // $FF: renamed from: b (int, int) void
   public void method_4694(int var1, int var2) {
      try {
         for(int var3 = 0; var3 < this.field_2714.length; ++var3) {
            if(var2 == -389670079) {
               return;
            }

            class_42 var4 = this.field_2714[var3];
            if(var4 != null) {
               if(var2 == -389670079) {
                  throw new IllegalStateException();
               }

               if(0 != var4.field_305) {
                  if(var2 == -389670079) {
                     throw new IllegalStateException();
                  }

                  if(var4.field_308) {
                     if(var2 == -389670079) {
                        throw new IllegalStateException();
                     }

                     var4.method_485(var1);
                     var4.field_308 = false;
                  }
               }
            }
         }

      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

    // $FF: renamed from: c (int) int[]
   public int[] method_39(int var1) {
      class_42 var2 = this.field_2714[var1];
      if(null != var2) {
         if(null != var2.field_307) {
            this.field_2710.method_5970(var2);
            var2.field_308 = true;
            return var2.field_307;
         }

         boolean var3 = var2.method_484(this.field_2715, 109509686 * this.field_2711, this.field_2713);
         if(var3) {
            if(0 == 530672939 * this.field_2712) {
               class_42 var4 = (class_42)this.field_2710.method_5943();
               var4.method_490();
            } else {
               this.field_2712 -= 1445717949;
            }

            this.field_2710.method_5970(var2);
            var2.field_308 = true;
            return var2.field_307;
         }
      }

      return null;
   }

   // $FF: renamed from: e (int) int[]
   public int[] method_32(int var1) {
      class_42 var2 = this.field_2714[var1];
      if(null != var2) {
         if(null != var2.field_307) {
            this.field_2710.method_5970(var2);
            var2.field_308 = true;
            return var2.field_307;
         }

         boolean var3 = var2.method_484(this.field_2715, 861354963 * this.field_2711, this.field_2713);
         if(var3) {
            if(0 == 530672939 * this.field_2712) {
               class_42 var4 = (class_42)this.field_2710.method_5943();
               var4.method_490();
            } else {
               this.field_2712 -= -509875837;
            }

            this.field_2710.method_5970(var2);
            var2.field_308 = true;
            return var2.field_307;
         }
      }

      return null;
   }

   // $FF: renamed from: g (int) int[]
   public int[] method_36(int var1) {
      class_42 var2 = this.field_2714[var1];
      if(null != var2) {
         if(null != var2.field_307) {
            this.field_2710.method_5970(var2);
            var2.field_308 = true;
            return var2.field_307;
         }

         boolean var3 = var2.method_484(this.field_2715, 861354963 * this.field_2711, this.field_2713);
         if(var3) {
            if(0 == 530672939 * this.field_2712) {
               class_42 var4 = (class_42)this.field_2710.method_5943();
               var4.method_490();
            } else {
               this.field_2712 -= -509875837;
            }

            this.field_2710.method_5970(var2);
            var2.field_308 = true;
            return var2.field_307;
         }
      }

      return null;
   }

    // $FF: renamed from: k (int) int
   public int method_38(int var1) {
      return null != this.field_2714[var1]?this.field_2714[var1].field_299:0;
   }

   // $FF: renamed from: m (int) int
   public int method_30(int var1) {
      return null != this.field_2714[var1]?this.field_2714[var1].field_299:0;
   }

   // $FF: renamed from: x (int) boolean
   public boolean method_40(int var1) {
      return this.field_2714[var1].field_306;
   }

   // $FF: renamed from: z (int) boolean
   public boolean method_37(int var1) {
      return this.field_2714[var1].field_306;
   }

   // $FF: renamed from: w (int) boolean
   public boolean method_35() {
      return -1356026801 * this.field_2711 == 310300792;
   }

   // $FF: renamed from: <init> (jv, jv, int, double, int) void
   public class_245(class_306 var1, class_306 var2, int var3, double var4, int var6) {
      super();
      try {
         class_335 var10001 = new class_335();
         this.field_2710 = var10001;
         this.field_2712 = 0;
         this.field_2715 = 1.0D;
         this.field_2711 = 1894395264;
         this.field_2713 = var2;
         this.field_2709 = 2057951963 * var3;
         this.field_2712 = this.field_2709 * 117958777;
         this.field_2715 = var4;
         this.field_2711 = -1696476069 * var6;
         int[] var7 = var1.method_5392(0, (byte)8);
         int var8 = var7.length;
         this.field_2714 = new class_42[var1.method_5393(0)];

         for(int var9 = 0; var9 < var8; ++var9) {
            Buffer var10000 = new Buffer(var1.method_5381(0, var7[var9]));
            Buffer var10 = var10000;
            class_42[] var12 = this.field_2714;
            int var13 = var7[var9];
            class_42 var10002 = new class_42(var10);
            var12[var13] = var10002;
         }

      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11);
      }
   }

    // $FF: renamed from: r (short) void
   public void method_4703(short var1) {
      try {
         for(int var2 = 0; var2 < this.field_2714.length; ++var2) {
            if(var1 != 128) {
               throw new IllegalStateException();
            }

            if(this.field_2714[var2] != null) {
               if(var1 != 128) {
                  return;
               }

               this.field_2714[var2].method_490();
            }
         }

         class_335 var10001 = new class_335();
         this.field_2710 = var10001;
         this.field_2712 = this.field_2709 * 117958777;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

    // $FF: renamed from: a (int) int
   public int method_34(int var1) {
      return null != this.field_2714[var1]?this.field_2714[var1].field_299:0;
   }

   // $FF: renamed from: v (int, int, int) boolean
   public static boolean method_4708(int var0, int var1, int var2) {
      try {
         boolean var10000;
         if((var0 >> var1 + 1 & 1) != 0) {
            if(var2 == 1540244921) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: hg (boolean, int) void
   static final void method_4709(boolean var0, int var1) {
      try {
         class_46.method_536(-1808857292);
         client.field_1463.field_2372 += -1196966475;
         if(239536285 * client.field_1463.field_2372 < 50) {
            if(var1 >= 1580986367) {
               throw new IllegalStateException();
            }

            if(!var0) {
               if(var1 >= 1580986367) {
                  throw new IllegalStateException();
               }

               return;
            }
         }

         client.field_1463.field_2372 = 0;
         if(!client.field_1522 && client.field_1463.method_4083() != null) {
            if(var1 >= 1580986367) {
               throw new IllegalStateException();
            }

            class_40 var2 = class_112.newPacket(ClientOpcode.OPCODE_18, client.field_1463.isaac, (byte)8);
            client.field_1463.method_4079(var2);

            try {
               client.field_1463.method_4076(-1875758370);
            } catch (IOException var4) {
               client.field_1522 = true;
            }
         }

      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }
}
