
// $FF: renamed from: fw
public class class_227 extends class_226 {

   // $FF: renamed from: dc int
   static final int field_2561 = 21;
   // $FF: renamed from: v int
   int field_2562;
   // $FF: renamed from: f int
   int field_2563;
   // $FF: renamed from: y int
   int field_2564;
   // $FF: renamed from: ee int
   static int field_2565;
   // $FF: renamed from: n int
   int field_2566;


   // $FF: renamed from: r (int) int
   int method_4322() {
      try {
         return this.field_2564 * -1464921775;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: o () int
   int method_4323() {
      return 323264566 * this.field_2562;
   }

   // $FF: renamed from: z () int
   int method_4324() {
      return 2120333981 * this.field_2563;
   }

   public boolean equals(Object var1) {
      try {
         if(!(var1 instanceof class_227)) {
            return false;
         } else {
            class_227 var2 = (class_227)var1;
            return this.field_2547 * 1253594293 == 1253594293 * var2.field_2547 && this.field_2548 * 174092143 == var2.field_2548 * 174092143?2120333981 * this.field_2563 == var2.field_2563 * 2120333981 && -1464921775 * var2.field_2564 == -1464921775 * this.field_2564:false;
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: h () int
   int method_4325() {
      return this.field_2564 * -1464921775;
   }

   // $FF: renamed from: f (int) int
   int method_4326() {
      try {
         return -1553419655 * this.field_2562;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: y (int) int
   int method_4327() {
      try {
         return 558324401 * this.field_2566;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: p (int) int
   int method_4328() {
      try {
         return 2120333981 * this.field_2563;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: <init> () void
   class_227() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: eg (java.lang.Object) boolean
   public boolean method_4329(Object var1) {
      if(!(var1 instanceof class_227)) {
         return false;
      } else {
         class_227 var2 = (class_227)var1;
         return this.field_2547 * 1253594293 == 1253594293 * var2.field_2547 && this.field_2548 * 174092143 == var2.field_2548 * 174092143?2120333981 * this.field_2563 == var2.field_2563 * 2120333981 && -1464921775 * var2.field_2564 == -1464921775 * this.field_2564:false;
      }
   }

   // $FF: renamed from: eo (java.lang.Object) boolean
   public boolean method_4330(Object var1) {
      if(!(var1 instanceof class_227)) {
         return false;
      } else {
         class_227 var2 = (class_227)var1;
         return this.field_2547 * -1844150738 == 1253594293 * var2.field_2547 && this.field_2548 * 1043463334 == var2.field_2548 * -1687479257?2120333981 * this.field_2563 == var2.field_2563 * 1423713289 && 1018305406 * var2.field_2564 == -809165521 * this.field_2564:false;
      }
   }

   // $FF: renamed from: fl (java.lang.Object) boolean
   public boolean method_4331(Object var1) {
      if(!(var1 instanceof class_227)) {
         return false;
      } else {
         class_227 var2 = (class_227)var1;
         return this.field_2547 * 1253594293 == 1253594293 * var2.field_2547 && this.field_2548 * 174092143 == var2.field_2548 * 174092143?2120333981 * this.field_2563 == var2.field_2563 * 2120333981 && -1464921775 * var2.field_2564 == -1464921775 * this.field_2564:false;
      }
   }

   // $FF: renamed from: j (nd) void
   void method_4301(Buffer var1) {
      this.field_2550 = Math.min(-1482547443 * this.field_2550, 4) * 1942472645;
      this.field_2553 = new short[1][64][64];
      this.field_2554 = new short[this.field_2550 * -1482547443][64][64];
      this.field_2557 = new byte[this.field_2550 * -1482547443][64][64];
      this.field_2555 = new byte[this.field_2550 * -1482547443][64][64];
      this.field_2546 = new class_223[-1482547443 * this.field_2550][64][64][];
      int var2 = var1.readUnsignedByte();
      if(var2 != class_229.field_2568.field_2567 * 1748165695) {
         throw new IllegalStateException("");
      } else {
         int var3 = var1.readUnsignedByte();
         int var4 = var1.readUnsignedByte();
         int var5 = var1.readUnsignedByte();
         int var6 = var1.readUnsignedByte();
         if(var3 == this.field_2547 * 1253594293 && var4 == 174092143 * this.field_2548 && var5 == 2120333981 * this.field_2563 && var6 == -1464921775 * this.field_2564) {
            for(int var7 = 0; var7 < 8; ++var7) {
               for(int var8 = 0; var8 < 8; ++var8) {
                  this.method_4295(this.field_2563 * -217197336 + var7, this.field_2564 * 1165527688 + var8, var1, -1600463237);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   // $FF: renamed from: n (nd, int) void
   void method_4306(Buffer var1, int var2) {
      try {
         this.field_2550 = Math.min(-1482547443 * this.field_2550, 4) * 1942472645;
         this.field_2553 = new short[1][64][64];
         this.field_2554 = new short[this.field_2550 * -1482547443][64][64];
         this.field_2557 = new byte[this.field_2550 * -1482547443][64][64];
         this.field_2555 = new byte[this.field_2550 * -1482547443][64][64];
         this.field_2546 = new class_223[-1482547443 * this.field_2550][64][64][];
         int var3 = var1.readUnsignedByte();
         if(var3 != class_229.field_2568.field_2567 * 1748165695) {
            if(var2 == 1223315238) {
               throw new IllegalStateException("");
            }
         } else {
            int var4 = var1.readUnsignedByte();
            int var5 = var1.readUnsignedByte();
            int var6 = var1.readUnsignedByte();
            int var7 = var1.readUnsignedByte();
            if(var4 == this.field_2547 * 1253594293) {
               if(var2 != 1223315238) {
                  return;
               }

               if(var5 == 174092143 * this.field_2548) {
                  if(var2 != 1223315238) {
                     throw new IllegalStateException();
                  }

                  if(var6 == 2120333981 * this.field_2563) {
                     if(var2 != 1223315238) {
                        throw new IllegalStateException();
                     }

                     if(var7 == -1464921775 * this.field_2564) {
                        for(int var8 = 0; var8 < 8; ++var8) {
                           if(var2 != 1223315238) {
                              throw new IllegalStateException();
                           }

                           for(int var9 = 0; var9 < 8; ++var9) {
                              if(var2 != 1223315238) {
                                 throw new IllegalStateException();
                              }

                              this.method_4295(this.field_2563 * -217197336 + var8, this.field_2564 * 1165527688 + var9, var1, -1770639424);
                           }
                        }

                        return;
                     }

                     if(var2 != 1223315238) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }

            throw new IllegalStateException("");
         }
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }

   public int abu() {
      return this.field_2547 * 1253594293 | 174092143 * this.field_2548 << 8 | 2120333981 * this.field_2563 << 16 | -1464921775 * this.field_2564 << 24;
   }

   // $FF: renamed from: a () int
   int method_4332() {
      return 558324401 * this.field_2566;
   }

   // $FF: renamed from: b (nd) void
   void method_4333(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if(var2 != class_234.field_2619.field_2623 * 1539271557) {
         throw new IllegalStateException("");
      } else {
         this.field_2549 = var1.readUnsignedByte() * -1831942399;
         this.field_2550 = var1.readUnsignedByte() * 1942472645;
         this.field_2545 = var1.readShort() * 285091249;
         this.field_2552 = var1.readShort() * 1680609155;
         this.field_2562 = var1.readUnsignedByte() * 941299657;
         this.field_2566 = var1.readUnsignedByte() * -1488409007;
         this.field_2547 = var1.readShort() * 38861213;
         this.field_2548 = var1.readShort() * 317312911;
         this.field_2563 = var1.readUnsignedByte() * 728931253;
         this.field_2564 = var1.readUnsignedByte() * 1984616369;
         this.field_2560 = var1.method_147(1161669027) * 30935495;
         this.field_2556 = var1.method_147(742859949) * -836156663;
      }
   }

   // $FF: renamed from: d (nd) void
   void method_4334(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if(var2 != class_234.field_2619.field_2623 * 1539271557) {
         throw new IllegalStateException("");
      } else {
         this.field_2549 = var1.readUnsignedByte() * -1831942399;
         this.field_2550 = var1.readUnsignedByte() * 1942472645;
         this.field_2545 = var1.readShort() * 285091249;
         this.field_2552 = var1.readShort() * 1680609155;
         this.field_2562 = var1.readUnsignedByte() * 941299657;
         this.field_2566 = var1.readUnsignedByte() * -1488409007;
         this.field_2547 = var1.readShort() * 38861213;
         this.field_2548 = var1.readShort() * 317312911;
         this.field_2563 = var1.readUnsignedByte() * 728931253;
         this.field_2564 = var1.readUnsignedByte() * 1984616369;
         this.field_2560 = var1.method_147(17843660) * 30935495;
         this.field_2556 = var1.method_147(1576265889) * -836156663;
      }
   }

   // $FF: renamed from: s (nd) void
   void method_4335(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if(var2 != class_234.field_2619.field_2623 * 1539271557) {
         throw new IllegalStateException("");
      } else {
         this.field_2549 = var1.readUnsignedByte() * -1831942399;
         this.field_2550 = var1.readUnsignedByte() * 1942472645;
         this.field_2545 = var1.readShort() * 285091249;
         this.field_2552 = var1.readShort() * 1680609155;
         this.field_2562 = var1.readUnsignedByte() * 941299657;
         this.field_2566 = var1.readUnsignedByte() * -1488409007;
         this.field_2547 = var1.readShort() * 38861213;
         this.field_2548 = var1.readShort() * 317312911;
         this.field_2563 = var1.readUnsignedByte() * 728931253;
         this.field_2564 = var1.readUnsignedByte() * 1984616369;
         this.field_2560 = var1.method_147(285045611) * 30935495;
         this.field_2556 = var1.method_147(8360908) * -836156663;
      }
   }

   // $FF: renamed from: u (nd) void
   void method_4336(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if(var2 != class_234.field_2619.field_2623 * 1539271557) {
         throw new IllegalStateException("");
      } else {
         this.field_2549 = var1.readUnsignedByte() * -1831942399;
         this.field_2550 = var1.readUnsignedByte() * 468818975;
         this.field_2545 = var1.readShort() * -808644614;
         this.field_2552 = var1.readShort() * -97283794;
         this.field_2562 = var1.readUnsignedByte() * 941299657;
         this.field_2566 = var1.readUnsignedByte() * -232077342;
         this.field_2547 = var1.readShort() * 1060642183;
         this.field_2548 = var1.readShort() * -28760384;
         this.field_2563 = var1.readUnsignedByte() * 728931253;
         this.field_2564 = var1.readUnsignedByte() * -364951115;
         this.field_2560 = var1.method_147(1081750299) * 30935495;
         this.field_2556 = var1.method_147(1218113770) * -836156663;
      }
   }

   // $FF: renamed from: l (nd) void
   void method_4337(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if(var2 != class_234.field_2619.field_2623 * -1152034788) {
         throw new IllegalStateException("");
      } else {
         this.field_2549 = var1.readUnsignedByte() * -1831942399;
         this.field_2550 = var1.readUnsignedByte() * 1942472645;
         this.field_2545 = var1.readShort() * -967469833;
         this.field_2552 = var1.readShort() * -431766615;
         this.field_2562 = var1.readUnsignedByte() * 941299657;
         this.field_2566 = var1.readUnsignedByte() * 399783491;
         this.field_2547 = var1.readShort() * 1598075074;
         this.field_2548 = var1.readShort() * 317312911;
         this.field_2563 = var1.readUnsignedByte() * 728931253;
         this.field_2564 = var1.readUnsignedByte() * 1984616369;
         this.field_2560 = var1.method_147(199090442) * 30935495;
         this.field_2556 = var1.method_147(1536186071) * -836156663;
      }
   }

   // $FF: renamed from: q () int
   int method_4338() {
      return this.field_2564 * -1464921775;
   }

   // $FF: renamed from: c () int
   int method_4339() {
      return 1162402626 * this.field_2562;
   }

   // $FF: renamed from: e () int
   int method_4340() {
      return -1553419655 * this.field_2562;
   }

   // $FF: renamed from: g () int
   int method_4341() {
      return 558324401 * this.field_2566;
   }

   public int aco() {
      return this.field_2547 * 1253594293 | 174092143 * this.field_2548 << 8 | 2120333981 * this.field_2563 << 16 | -1464921775 * this.field_2564 << 24;
   }

   // $FF: renamed from: k () int
   int method_4342() {
      return 558324401 * this.field_2566;
   }

   // $FF: renamed from: m () int
   int method_4343() {
      return 558324401 * this.field_2566;
   }

   // $FF: renamed from: x () int
   int method_4344() {
      return -1901771609 * this.field_2566;
   }

   public int abl() {
      return this.field_2547 * -1503068087 | 627256775 * this.field_2548 << 8 | 2120333981 * this.field_2563 << 16 | -466406330 * this.field_2564 << 24;
   }

   // $FF: renamed from: w () int
   int method_4345() {
      return 2120333981 * this.field_2563;
   }

   // $FF: renamed from: t () int
   int method_4346() {
      return this.field_2564 * -1464921775;
   }

   // $FF: renamed from: i () int
   int method_4347() {
      return this.field_2564 * -1464921775;
   }

   public int hashCode() {
      try {
         return this.field_2547 * 1253594293 | 174092143 * this.field_2548 << 8 | 2120333981 * this.field_2563 << 16 | -1464921775 * this.field_2564 << 24;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: v (nd, int) void
   void method_4348(Buffer var1, int var2) {
      try {
         int var3 = var1.readUnsignedByte();
         if(var3 != class_234.field_2619.field_2623 * 1539271557) {
            if(var2 <= -1398598152) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("");
            }
         } else {
            this.field_2549 = var1.readUnsignedByte() * -1831942399;
            this.field_2550 = var1.readUnsignedByte() * 1942472645;
            this.field_2545 = var1.readShort() * 285091249;
            this.field_2552 = var1.readShort() * 1680609155;
            this.field_2562 = var1.readUnsignedByte() * 941299657;
            this.field_2566 = var1.readUnsignedByte() * -1488409007;
            this.field_2547 = var1.readShort() * 38861213;
            this.field_2548 = var1.readShort() * 317312911;
            this.field_2563 = var1.readUnsignedByte() * 728931253;
            this.field_2564 = var1.readUnsignedByte() * 1984616369;
            this.field_2560 = var1.method_147(870055012) * 30935495;
            this.field_2556 = var1.method_147(882966360) * -836156663;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: v (int) jw[]
   static class_313[] method_4349() {
      try {
         return new class_313[]{class_313.field_3762, class_313.field_3761};
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }
}
