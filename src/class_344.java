
// $FF: renamed from: lt
public class class_344 extends class_343 {

   // $FF: renamed from: p java.lang.String
   public String field_3906;
   // $FF: renamed from: m int
   static final int field_3907 = 200;
   // $FF: renamed from: f lc
   final class_16 field_3908;
   // $FF: renamed from: y java.lang.String
   public String field_3909;
   // $FF: renamed from: b int
   int field_3910;
   // $FF: renamed from: j byte
   public byte field_3911;
   // $FF: renamed from: r int
   public int field_3912;
   // $FF: renamed from: ah int
   static final int field_3913 = 0;
   // $FF: renamed from: v int
   static final int field_3914 = 100;
   // $FF: renamed from: n nc
   final class_375 field_3915;


   // $FF: renamed from: c (nd) void
   public final void method_6143(Buffer var1) {
      this.method_6145(var1.method_139(-391631059));
      long var2 = var1.method_136();
      long var5 = var2;
      String var4;
      int var7;
      if(var2 > 0L && var2 < 6582952005840035281L) {
         if(0L == var2 % 37L) {
            var4 = null;
         } else {
            var7 = 0;

            for(long var8 = var2; var8 != 0L; var8 /= 37L) {
               ++var7;
            }

            StringBuilder var10 = new StringBuilder(var7);

            while(0L != var5) {
               long var11 = var5;
               var5 /= 37L;
               var10.append(class_332.field_3862[(int)(var11 - var5 * 37L)]);
            }

            var4 = var10.reverse().toString();
         }
      } else {
         var4 = null;
      }

      this.method_6163(var4);
      this.field_3911 = var1.method_131();
      var7 = var1.readUnsignedByte();
      if(var7 != 255) {
         this.method_6104();

         for(int var13 = 0; var13 < var7; ++var13) {
            class_359 var10001 = new class_359(var1.method_139(-391631059), this.field_3915);
            class_341 var9 = (class_341)this.method_6069(var10001);
            int var14 = var1.readShort();
            var9.method_6016(var14, (this.field_3910 += 1879730295) * -1952190137 - 1);
            var9.field_3887 = var1.method_131() * -694795321;
            var1.method_139(-391631059);
            this.method_6150(var9, -1651060871);
         }

      }
   }

   // $FF: renamed from: v (byte) lx
   class_338 method_6079() {
      try {
         class_341 var10000 = new class_341();
         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: n (int, int) lx[]
   class_338[] method_6080(int var1) {
      try {
         return new class_341[var1];
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: i (ll) void
   final void method_6144(class_341 var1) {
      if(var1.method_5999().equals(this.field_3908.method_52())) {
         this.field_3912 = var1.field_3887 * 2144056835;
      }

   }

   // $FF: renamed from: b (java.lang.String, int) void
   final void method_6145(String var1) {
      try {
         this.field_3906 = class_239.method_4606(var1, -2020954619);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: d (nd, int) void
   public final void method_6146(Buffer var1, int var2) {
      try {
         String var5;
         int var8;
         label86: {
            this.method_6145(var1.method_139(-391631059));
            long var3 = var1.method_136();
            long var6 = var3;
            if(var3 > 0L) {
               if(var2 >= -1173912475) {
                  throw new IllegalStateException();
               }

               if(var3 < 6582952005840035281L) {
                  if(0L == var3 % 37L) {
                     if(var2 >= -1173912475) {
                        throw new IllegalStateException();
                     }

                     var5 = null;
                  } else {
                     var8 = 0;

                     for(long var9 = var3; var9 != 0L; var9 /= 37L) {
                        if(var2 >= -1173912475) {
                           throw new IllegalStateException();
                        }

                        ++var8;
                     }

                     StringBuilder var11 = new StringBuilder(var8);

                     while(0L != var6) {
                        if(var2 >= -1173912475) {
                           throw new IllegalStateException();
                        }

                        long var12 = var6;
                        var6 /= 37L;
                        var11.append(class_332.field_3862[(int)(var12 - var6 * 37L)]);
                     }

                     var5 = var11.reverse().toString();
                  }
                  break label86;
               }
            }

            var5 = null;
         }

         this.method_6163(var5);
         this.field_3911 = var1.method_131();
         var8 = var1.readUnsignedByte();
         if(var8 == 255) {
            if(var2 >= -1173912475) {
               throw new IllegalStateException();
            }
         } else {
            this.method_6104();

            for(int var15 = 0; var15 < var8; ++var15) {
               if(var2 >= -1173912475) {
                  throw new IllegalStateException();
               }

               class_359 var10001 = new class_359(var1.method_139(-391631059), this.field_3915);
               class_341 var10 = (class_341)this.method_6069(var10001);
               int var16 = var1.readShort();
               var10.method_6016(var16, (this.field_3910 += 1879730295) * -1952190137 - 1);
               var10.field_3887 = var1.method_131() * -694795321;
               var1.method_139(-391631059);
               this.method_6150(var10, -742498306);
            }

         }
      } catch (RuntimeException var14) {
         throw class_223.method_4281(var14);
      }
   }

   // $FF: renamed from: x (nd) void
   public final void method_6147(Buffer var1) {
      class_359 var10000 = new class_359(var1.method_139(-391631059), this.field_3915);
      class_359 var2 = var10000;
      int var3 = var1.readShort();
      byte var4 = var1.method_131();
      boolean var5 = false;
      if(var4 == -128) {
         var5 = true;
      }

      class_341 var6;
      if(var5) {
         if(this.method_6061() == 0) {
            return;
         }

         var6 = (class_341)this.method_6065(var2, (byte)7);
         if(var6 != null && var6.method_6017() == var3) {
            this.method_6068(var6, 149958912);
         }
      } else {
         var1.method_139(-391631059);
         var6 = (class_341)this.method_6065(var2, (byte)7);
         if(var6 == null) {
            if(this.method_6061() > -446111369 * this.field_3901) {
               return;
            }

            var6 = (class_341)this.method_6069(var2);
         }

         var6.method_6016(var3, (this.field_3910 += 1879730295) * -1952190137 - 1);
         var6.field_3887 = -694795321 * var4;
         this.method_6150(var6, -1277219946);
      }

   }

   // $FF: renamed from: u (int) void
   public final void method_6148() {
      try {
         for(int var2 = 0; var2 < this.method_6061(); ++var2) {
            ((class_341)this.method_6071(var2, (byte)-1)).method_6029();
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: s (nd, int) void
   public final void method_6149(Buffer var1, int var2) {
      try {
         class_359 var10000 = new class_359(var1.method_139(-391631059), this.field_3915);
         class_359 var3 = var10000;
         int var4 = var1.readShort();
         byte var5 = var1.method_131();
         boolean var6 = false;
         if(var5 == -128) {
            if(var2 != 817545734) {
               throw new IllegalStateException();
            }

            var6 = true;
         }

         class_341 var7;
         if(var6) {
            if(this.method_6061() == 0) {
               if(var2 != 817545734) {
                  return;
               }

               return;
            }

            var7 = (class_341)this.method_6065(var3, (byte)7);
            if(var7 != null) {
               if(var2 != 817545734) {
                  return;
               }

               if(var7.method_6017() == var4) {
                  if(var2 != 817545734) {
                     throw new IllegalStateException();
                  }

                  this.method_6068(var7, 1934754885);
               }
            }
         } else {
            var1.method_139(-391631059);
            var7 = (class_341)this.method_6065(var3, (byte)7);
            if(var7 == null) {
               if(var2 != 817545734) {
                  return;
               }

               if(this.method_6061() > -446111369 * this.field_3901) {
                  if(var2 != 817545734) {
                     throw new IllegalStateException();
                  }

                  return;
               }

               var7 = (class_341)this.method_6069(var3);
            }

            var7.method_6016(var4, (this.field_3910 += 1879730295) * -1952190137 - 1);
            var7.field_3887 = -694795321 * var5;
            this.method_6150(var7, -263854446);
         }

      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }

   // $FF: renamed from: o (ll, int) void
   final void method_6150(class_341 var1, int var2) {
      try {
         if(var1.method_5999().equals(this.field_3908.method_52())) {
            if(var2 >= -26460885) {
               throw new IllegalStateException();
            }

            this.field_3912 = var1.field_3887 * 1614448745;
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: y () lx
   class_338 method_6059() {
      class_341 var10000 = new class_341();
      return var10000;
   }

   // $FF: renamed from: p (int) lx[]
   class_338[] method_6103(int var1) {
      return new class_341[var1];
   }

   // $FF: renamed from: j (int) lx[]
   class_338[] method_6085(int var1) {
      return new class_341[var1];
   }

   // $FF: renamed from: r (int) lx[]
   class_338[] method_6126(int var1) {
      return new class_341[var1];
   }

   // $FF: renamed from: g (nd) void
   public final void method_6151(Buffer var1) {
      this.method_6145(var1.method_139(-391631059));
      long var2 = var1.method_136();
      long var5 = var2;
      String var4;
      int var7;
      if(var2 > 0L && var2 < 6582952005840035281L) {
         if(0L == var2 % 37L) {
            var4 = null;
         } else {
            var7 = 0;

            for(long var8 = var2; var8 != 0L; var8 /= 37L) {
               ++var7;
            }

            StringBuilder var10 = new StringBuilder(var7);

            while(0L != var5) {
               long var11 = var5;
               var5 /= 37L;
               var10.append(class_332.field_3862[(int)(var11 - var5 * 37L)]);
            }

            var4 = var10.reverse().toString();
         }
      } else {
         var4 = null;
      }

      this.method_6163(var4);
      this.field_3911 = var1.method_131();
      var7 = var1.readUnsignedByte();
      if(var7 != 255) {
         this.method_6104();

         for(int var13 = 0; var13 < var7; ++var13) {
            class_359 var10001 = new class_359(var1.method_139(-391631059), this.field_3915);
            class_341 var9 = (class_341)this.method_6069(var10001);
            int var14 = var1.readShort();
            var9.method_6016(var14, (this.field_3910 += 1879730295) * 2092080294 - 1);
            var9.field_3887 = var1.method_131() * 1350093183;
            var1.method_139(-391631059);
            this.method_6150(var9, -1202730477);
         }

      }
   }

   // $FF: renamed from: a (nd) void
   public final void method_6152(Buffer var1) {
      this.method_6145(var1.method_139(-391631059));
      long var2 = var1.method_136();
      long var5 = var2;
      String var4;
      int var7;
      if(var2 > 0L && var2 < 6582952005840035281L) {
         if(0L == var2 % 37L) {
            var4 = null;
         } else {
            var7 = 0;

            for(long var8 = var2; var8 != 0L; var8 /= 37L) {
               ++var7;
            }

            StringBuilder var10 = new StringBuilder(var7);

            while(0L != var5) {
               long var11 = var5;
               var5 /= 37L;
               var10.append(class_332.field_3862[(int)(var11 - var5 * 37L)]);
            }

            var4 = var10.reverse().toString();
         }
      } else {
         var4 = null;
      }

      this.method_6163(var4);
      this.field_3911 = var1.method_131();
      var7 = var1.readUnsignedByte();
      if(var7 != 606732087) {
         this.method_6104();

         for(int var13 = 0; var13 < var7; ++var13) {
            class_359 var10001 = new class_359(var1.method_139(-391631059), this.field_3915);
            class_341 var9 = (class_341)this.method_6069(var10001);
            int var14 = var1.readShort();
            var9.method_6016(var14, (this.field_3910 += -833130731) * -515556316 - 1);
            var9.field_3887 = var1.method_131() * 199386748;
            var1.method_139(-391631059);
            this.method_6150(var9, -69232885);
         }

      }
   }

   // $FF: renamed from: q (ll) void
   final void method_6153(class_341 var1) {
      if(var1.method_5999().equals(this.field_3908.method_52())) {
         this.field_3912 = var1.field_3887 * 1614448745;
      }

   }

   // $FF: renamed from: t () void
   public final void method_6154() {
      for(int var1 = 0; var1 < this.method_6061(); ++var1) {
         ((class_341)this.method_6071(var1, (byte)-1)).method_6029();
      }

   }

   // $FF: renamed from: k (nd) void
   public final void method_6155(Buffer var1) {
      this.method_6145(var1.method_139(-391631059));
      long var2 = var1.method_136();
      long var5 = var2;
      String var4;
      int var7;
      if(var2 > 0L && var2 < 6582952005840035281L) {
         if(0L == var2 % 37L) {
            var4 = null;
         } else {
            var7 = 0;

            for(long var8 = var2; var8 != 0L; var8 /= 37L) {
               ++var7;
            }

            StringBuilder var10 = new StringBuilder(var7);

            while(0L != var5) {
               long var11 = var5;
               var5 /= 37L;
               var10.append(class_332.field_3862[(int)(var11 - var5 * 37L)]);
            }

            var4 = var10.reverse().toString();
         }
      } else {
         var4 = null;
      }

      this.method_6163(var4);
      this.field_3911 = var1.method_131();
      var7 = var1.readUnsignedByte();
      if(var7 != 255) {
         this.method_6104();

         for(int var13 = 0; var13 < var7; ++var13) {
            class_359 var10001 = new class_359(var1.method_139(-391631059), this.field_3915);
            class_341 var9 = (class_341)this.method_6069(var10001);
            int var14 = var1.readShort();
            var9.method_6016(var14, (this.field_3910 += 1879730295) * -1952190137 - 1);
            var9.field_3887 = var1.method_131() * -694795321;
            var1.method_139(-391631059);
            this.method_6150(var9, -886865154);
         }

      }
   }

   // $FF: renamed from: m (nd) void
   public final void method_6156(Buffer var1) {
      class_359 var10000 = new class_359(var1.method_139(-391631059), this.field_3915);
      class_359 var2 = var10000;
      int var3 = var1.readShort();
      byte var4 = var1.method_131();
      boolean var5 = false;
      if(var4 == -128) {
         var5 = true;
      }

      class_341 var6;
      if(var5) {
         if(this.method_6061() == 0) {
            return;
         }

         var6 = (class_341)this.method_6065(var2, (byte)7);
         if(var6 != null && var6.method_6017() == var3) {
            this.method_6068(var6, 29448978);
         }
      } else {
         var1.method_139(-391631059);
         var6 = (class_341)this.method_6065(var2, (byte)7);
         if(var6 == null) {
            if(this.method_6061() > -446111369 * this.field_3901) {
               return;
            }

            var6 = (class_341)this.method_6069(var2);
         }

         var6.method_6016(var3, (this.field_3910 += 1879730295) * -1952190137 - 1);
         var6.field_3887 = -694795321 * var4;
         this.method_6150(var6, -628776184);
      }

   }

   // $FF: renamed from: e (nd) void
   public final void method_6157(Buffer var1) {
      this.method_6145(var1.method_139(-391631059));
      long var2 = var1.method_136();
      long var5 = var2;
      String var4;
      int var7;
      if(var2 > 0L && var2 < 6582952005840035281L) {
         if(0L == var2 % 37L) {
            var4 = null;
         } else {
            var7 = 0;

            for(long var8 = var2; var8 != 0L; var8 /= 37L) {
               ++var7;
            }

            StringBuilder var10 = new StringBuilder(var7);

            while(0L != var5) {
               long var11 = var5;
               var5 /= 37L;
               var10.append(class_332.field_3862[(int)(var11 - var5 * 37L)]);
            }

            var4 = var10.reverse().toString();
         }
      } else {
         var4 = null;
      }

      this.method_6163(var4);
      this.field_3911 = var1.method_131();
      var7 = var1.readUnsignedByte();
      if(var7 != 788319611) {
         this.method_6104();

         for(int var13 = 0; var13 < var7; ++var13) {
            class_359 var10001 = new class_359(var1.method_139(-391631059), this.field_3915);
            class_341 var9 = (class_341)this.method_6069(var10001);
            int var14 = var1.readShort();
            var9.method_6016(var14, (this.field_3910 += 1906850304) * -1952190137 - 1);
            var9.field_3887 = var1.method_131() * -694795321;
            var1.method_139(-391631059);
            this.method_6150(var9, -613707332);
         }

      }
   }

   // $FF: renamed from: <init> (nc, lc) void
   public class_344(class_375 var1, class_16 var2) {
      super(100);
      try {
         this.field_3909 = null;
         this.field_3906 = null;
         this.field_3910 = 1879730295;
         this.field_3915 = var1;
         this.field_3908 = var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: w () void
   public final void method_6159() {
      for(int var1 = 0; var1 < this.method_6061(); ++var1) {
         ((class_341)this.method_6071(var1, (byte)-1)).method_6029();
      }

   }

   // $FF: renamed from: l (int) void
   public final void method_6160(int var1) {
      try {
         for(int var2 = 0; var2 < this.method_6061(); ++var2) {
            if(var1 <= 901162810) {
               throw new IllegalStateException();
            }

            ((class_341)this.method_6071(var2, (byte)-1)).method_6035();
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: h () void
   public final void method_6161() {
      for(int var1 = 0; var1 < this.method_6061(); ++var1) {
         ((class_341)this.method_6071(var1, (byte)-1)).method_6035();
      }

   }

   // $FF: renamed from: z () void
   public final void method_6162() {
      for(int var1 = 0; var1 < this.method_6061(); ++var1) {
         ((class_341)this.method_6071(var1, (byte)-1)).method_6029();
      }

   }

   // $FF: renamed from: f (java.lang.String, byte) void
   final void method_6163(String var1) {
      try {
         this.field_3909 = class_239.method_4606(var1, -1700106611);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }
}
