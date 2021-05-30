
// $FF: renamed from: ey
public class class_73 extends class_59 {

   // $FF: renamed from: p int
   public int field_582;
   // $FF: renamed from: r int
   public int field_583;
   // $FF: renamed from: f int
   int field_584;
   // $FF: renamed from: y int
   public int field_585;
   // $FF: renamed from: v jv
   static class_306 field_586;
   // $FF: renamed from: j int
   public int field_587;
   // $FF: renamed from: n hz
   static class_272 field_588;
   // $FF: renamed from: g int
   public static final int field_589 = 32;
   // $FF: renamed from: ae byte
   static final byte field_590 = 127;


   // $FF: renamed from: c (int) ey
   public static class_73 method_1093(int var0) {
      class_73 var1 = (class_73)field_588.method_5065((long)var0);
      if(null != var1) {
         return var1;
      } else {
         byte[] var2 = field_586.method_5381(1, var0);
         class_73 var10000 = new class_73();
         var1 = var10000;
         if(var2 != null) {
            class_28 var10001 = new class_28(var2);
            var1.method_1095(var10001, (byte)101);
         }

         var1.method_1109();
         field_588.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: a () void
   void method_1094() {
      this.method_1097(-554438721 * this.field_584, (byte)61);
   }

   // $FF: renamed from: y (nd, int, byte) void
   void method_1095(class_28 var1, byte var3) {
      try {
         while(true) {
            int var4 = var1.method_130();
            if(0 == var4) {
               if(var3 <= 1) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.method_1096(var1, var4, -1482547443);
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: p (nd, int, int, int) void
   void method_1096(class_28 var1, int var2, int var4) {
      try {
         if(var2 == 1) {
            if(var4 != -1482547443) {
               throw new IllegalStateException();
            }

            this.field_584 = var1.method_134() * 66870217;
         }

      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: j (int, byte) void
   void method_1097(int var1, byte var2) {
      try {
         double var3 = (double)(var1 >> 16 & 255) / 256.0D;
         double var5 = (double)(var1 >> 8 & 255) / 256.0D;
         double var7 = (double)(var1 & 255) / 256.0D;
         double var9 = var3;
         if(var5 < var3) {
            if(var2 == 1) {
               return;
            }

            var9 = var5;
         }

         if(var7 < var9) {
            if(var2 == 1) {
               throw new IllegalStateException();
            }

            var9 = var7;
         }

         double var11 = var3;
         if(var5 > var3) {
            if(var2 == 1) {
               return;
            }

            var11 = var5;
         }

         if(var7 > var11) {
            if(var2 == 1) {
               return;
            }

            var11 = var7;
         }

         double var13 = 0.0D;
         double var15 = 0.0D;
         double var17 = (var9 + var11) / 2.0D;
         if(var9 != var11) {
            if(var2 == 1) {
               throw new IllegalStateException();
            }

            if(var17 < 0.5D) {
               if(var2 == 1) {
                  throw new IllegalStateException();
               }

               var15 = (var11 - var9) / (var11 + var9);
            }

            if(var17 >= 0.5D) {
               if(var2 == 1) {
                  throw new IllegalStateException();
               }

               var15 = (var11 - var9) / (2.0D - var11 - var9);
            }

            if(var3 == var11) {
               if(var2 == 1) {
                  throw new IllegalStateException();
               }

               var13 = (var5 - var7) / (var11 - var9);
            } else if(var11 == var5) {
               if(var2 == 1) {
                  throw new IllegalStateException();
               }

               var13 = 2.0D + (var7 - var3) / (var11 - var9);
            } else if(var7 == var11) {
               if(var2 == 1) {
                  throw new IllegalStateException();
               }

               var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
         }

         var13 /= 6.0D;
         this.field_582 = 219796751 * (int)(var15 * 256.0D);
         this.field_587 = (int)(var17 * 256.0D) * 1986505691;
         if(this.field_582 * 1777498607 < 0) {
            if(var2 == 1) {
               return;
            }

            this.field_582 = 0;
         } else if(1777498607 * this.field_582 > 255) {
            if(var2 == 1) {
               throw new IllegalStateException();
            }

            this.field_582 = 213596657;
         }

         if(1425037395 * this.field_587 < 0) {
            if(var2 == 1) {
               return;
            }

            this.field_587 = 0;
         } else if(1425037395 * this.field_587 > 255) {
            if(var2 == 1) {
               throw new IllegalStateException();
            }

            this.field_587 = -247189723;
         }

         if(var17 > 0.5D) {
            if(var2 == 1) {
               throw new IllegalStateException();
            }

            this.field_583 = -2006806845 * (int)((1.0D - var17) * var15 * 512.0D);
         } else {
            this.field_583 = (int)(512.0D * var15 * var17) * -2006806845;
         }

         if(this.field_583 * 1828983275 < 1) {
            this.field_583 = -2006806845;
         }

         this.field_585 = (int)(var13 * (double)(1828983275 * this.field_583)) * 990426839;
      } catch (RuntimeException var19) {
         throw class_223.method_4281(var19);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_272 var10000 = new class_272(64);
      field_588 = var10000;
   }

   // $FF: renamed from: b (jv) void
   public static void method_1099(class_306 var0) {
      field_586 = var0;
   }

   // $FF: renamed from: d (jv) void
   public static void method_1100(class_306 var0) {
      field_586 = var0;
   }

   // $FF: renamed from: x (nd, int) void
   void method_1101(class_28 var1) {
      while(true) {
         int var3 = var1.method_130();
         if(0 == var3) {
            return;
         }

         this.method_1096(var1, var3, -1482547443);
      }
   }

   // $FF: renamed from: u (jv) void
   public static void method_1102(class_306 var0) {
      field_586 = var0;
   }

   // $FF: renamed from: l (int) ey
   public static class_73 method_1103(int var0) {
      class_73 var1 = (class_73)field_588.method_5065((long)var0);
      if(null != var1) {
         return var1;
      } else {
         byte[] var2 = field_586.method_5381(1, var0);
         class_73 var10000 = new class_73();
         var1 = var10000;
         if(var2 != null) {
            class_28 var10001 = new class_28(var2);
            var1.method_1095(var10001, (byte)68);
         }

         var1.method_1109();
         field_588.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: o (int) ey
   public static class_73 method_1104(int var0) {
      class_73 var1 = (class_73)field_588.method_5065((long)var0);
      if(null != var1) {
         return var1;
      } else {
         byte[] var2 = field_586.method_5381(1, var0);
         class_73 var10000 = new class_73();
         var1 = var10000;
         if(var2 != null) {
            class_28 var10001 = new class_28(var2);
            var1.method_1095(var10001, (byte)10);
         }

         var1.method_1109();
         field_588.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: h (int) void
   void method_1105(int var1) {
      double var2 = (double)(var1 >> 16 & 20012113) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if(var4 < var2) {
         var8 = var4;
      }

      if(var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if(var4 > var2) {
         var10 = var4;
      }

      if(var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var8 + var10) / 2.0D;
      if(var8 != var10) {
         if(var16 < 0.5D) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if(var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if(var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if(var10 == var4) {
            var12 = 2.0D + (var6 - var2) / (var10 - var8);
         } else if(var6 == var10) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      var12 /= 6.0D;
      this.field_582 = 219796751 * (int)(var14 * 256.0D);
      this.field_587 = (int)(var16 * 256.0D) * 1191030660;
      if(this.field_582 * 370758324 < 0) {
         this.field_582 = 0;
      } else if(1392395167 * this.field_582 > 255) {
         this.field_582 = 213596657;
      }

      if(1425037395 * this.field_587 < 0) {
         this.field_587 = 0;
      } else if(1262780472 * this.field_587 > 255) {
         this.field_587 = 86727568;
      }

      if(var16 > 0.5D) {
         this.field_583 = -1486653205 * (int)((1.0D - var16) * var14 * 512.0D);
      } else {
         this.field_583 = (int)(512.0D * var14 * var16) * -2006806845;
      }

      if(this.field_583 * 1828983275 < 1) {
         this.field_583 = -2006806845;
      }

      this.field_585 = (int)(var12 * (double)(1828983275 * this.field_583)) * 990426839;
   }

   // $FF: renamed from: k () void
   void method_1106() {
      this.method_1097(-72962439 * this.field_584, (byte)9);
   }

   // $FF: renamed from: g (int) ey
   public static class_73 method_1107(int var0) {
      class_73 var1 = (class_73)field_588.method_5065((long)var0);
      if(null != var1) {
         return var1;
      } else {
         byte[] var2 = field_586.method_5381(1, var0);
         class_73 var10000 = new class_73();
         var1 = var10000;
         if(var2 != null) {
            class_28 var10001 = new class_28(var2);
            var1.method_1095(var10001, (byte)26);
         }

         var1.method_1109();
         field_588.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: w (nd, int, int) void
   void method_1108(class_28 var1, int var2) {
      if(var2 == 1) {
         this.field_584 = var1.method_134() * 66870217;
      }

   }

   // $FF: renamed from: f (int) void
   void method_1109() {
      try {
         this.method_1097(-72962439 * this.field_584, (byte)46);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: m () void
   void method_1110() {
      this.method_1097(-72962439 * this.field_584, (byte)99);
   }

   // $FF: renamed from: s (jv) void
   public static void method_1111(class_306 var0) {
      field_586 = var0;
   }

   // $FF: renamed from: e (int) ey
   public static class_73 method_1112(int var0) {
      class_73 var1 = (class_73)field_588.method_5065((long)var0);
      if(null != var1) {
         return var1;
      } else {
         byte[] var2 = field_586.method_5381(1, var0);
         class_73 var10000 = new class_73();
         var1 = var10000;
         if(var2 != null) {
            class_28 var10001 = new class_28(var2);
            var1.method_1095(var10001, (byte)6);
         }

         var1.method_1109();
         field_588.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: <init> () void
   class_73() {
      super();
      try {
         this.field_584 = 0;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: t (nd, int, int) void
   void method_1113(class_28 var1, int var2) {
      if(var2 == 1) {
         this.field_584 = var1.method_134() * 66870217;
      }

   }

   // $FF: renamed from: z (nd, int) void
   void method_1114(class_28 var1) {
      while(true) {
         int var3 = var1.method_130();
         if(0 == var3) {
            return;
         }

         this.method_1096(var1, var3, -1482547443);
      }
   }

   // $FF: renamed from: q (int) void
   void method_1115(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if(var4 < var2) {
         var8 = var4;
      }

      if(var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if(var4 > var2) {
         var10 = var4;
      }

      if(var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var8 + var10) / 2.0D;
      if(var8 != var10) {
         if(var16 < 0.5D) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if(var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if(var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if(var10 == var4) {
            var12 = 2.0D + (var6 - var2) / (var10 - var8);
         } else if(var6 == var10) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      var12 /= 6.0D;
      this.field_582 = 219796751 * (int)(var14 * 256.0D);
      this.field_587 = (int)(var16 * 256.0D) * 1986505691;
      if(this.field_582 * 1777498607 < 0) {
         this.field_582 = 0;
      } else if(1777498607 * this.field_582 > 255) {
         this.field_582 = 213596657;
      }

      if(1425037395 * this.field_587 < 0) {
         this.field_587 = 0;
      } else if(1425037395 * this.field_587 > 255) {
         this.field_587 = -247189723;
      }

      if(var16 > 0.5D) {
         this.field_583 = -2006806845 * (int)((1.0D - var16) * var14 * 512.0D);
      } else {
         this.field_583 = (int)(512.0D * var14 * var16) * -2006806845;
      }

      if(this.field_583 * 1828983275 < 1) {
         this.field_583 = -2006806845;
      }

      this.field_585 = (int)(var12 * (double)(1828983275 * this.field_583)) * 990426839;
   }

   // $FF: renamed from: i () void
   public static void method_1116() {
      field_588.method_5074();
   }

   // $FF: renamed from: v (java.lang.CharSequence, int) java.lang.String
   public static String method_1117(CharSequence var0, int var1) {
      try {
         int var2 = var0.length();
         StringBuilder var3 = new StringBuilder(var2);

         for(int var4 = 0; var4 < var2; ++var4) {
            if(var1 >= 1681658130) {
               throw new IllegalStateException();
            }

            char var5;
            label111: {
               var5 = var0.charAt(var4);
               if(var5 >= 97) {
                  if(var1 >= 1681658130) {
                     throw new IllegalStateException();
                  }

                  if(var5 <= 122) {
                     break label111;
                  }

                  if(var1 >= 1681658130) {
                     throw new IllegalStateException();
                  }
               }

               if(var5 >= 65) {
                  if(var5 <= 90) {
                     break label111;
                  }

                  if(var1 >= 1681658130) {
                     throw new IllegalStateException();
                  }
               }

               if(var5 >= 48) {
                  if(var1 >= 1681658130) {
                     throw new IllegalStateException();
                  }

                  if(var5 <= 57) {
                     break label111;
                  }

                  if(var1 >= 1681658130) {
                     throw new IllegalStateException();
                  }
               }

               if(var5 != 46 && 45 != var5 && 42 != var5) {
                  if(var1 >= 1681658130) {
                     throw new IllegalStateException();
                  }

                  if(var5 != 95) {
                     if(32 == var5) {
                        if(var1 >= 1681658130) {
                           throw new IllegalStateException();
                        }

                        var3.append('+');
                     } else {
                        byte var6 = class_263.method_4995(var5, (byte)85);
                        var3.append('%');
                        int var7 = var6 >> 4 & 15;
                        if(var7 >= 10) {
                           if(var1 >= 1681658130) {
                              throw new IllegalStateException();
                           }

                           var3.append((char)(var7 + 55));
                        } else {
                           var3.append((char)(var7 + 48));
                        }

                        var7 = var6 & 15;
                        if(var7 >= 10) {
                           if(var1 >= 1681658130) {
                              throw new IllegalStateException();
                           }

                           var3.append((char)(55 + var7));
                        } else {
                           var3.append((char)(48 + var7));
                        }
                     }
                     continue;
                  }

                  if(var1 >= 1681658130) {
                     throw new IllegalStateException();
                  }
               }
            }

            var3.append(var5);
         }

         return var3.toString();
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }
}
