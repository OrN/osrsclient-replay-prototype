
// $FF: renamed from: x
public class class_180 {

   // $FF: renamed from: n long
   long field_2231;
   // $FF: renamed from: j int
   static final int field_2232 = 3;
   // $FF: renamed from: v long
   long field_2233;
   // $FF: renamed from: f ki
   class_323 field_2234;
   // $FF: renamed from: x int
   static final int field_2235 = 20;
   // $FF: renamed from: r int
   static final int field_2236 = 4;
   // $FF: renamed from: p int
   static final int field_2237 = 2;
   // $FF: renamed from: ba op
   static class_66 field_2238;
   // $FF: renamed from: ah int
   static final int field_2239 = 44;
   // $FF: renamed from: ky int
   static final int field_2240 = 2048;
   // $FF: renamed from: ai int
   static final int field_2241 = 2;


   // $FF: renamed from: <init> (nd) void
   public class_180(Buffer var1) {
      super();
      try {
         this.field_2231 = 7853368797710486943L;
         class_323 var10001 = new class_323();
         this.field_2234 = var10001;
         this.method_3816(var1, -1275623765);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: n (y, int) void
   public void method_3813(class_44 var1, int var2) {
      try {
         if(var1.field_9 == -7800373263393014969L * this.field_2233) {
            if(var2 != 205429833) {
               throw new IllegalStateException();
            }

            if(var1.field_319 * -8222609313489775677L == this.field_2231 * 2996578654687834529L) {
               for(class_51 var3 = (class_51)this.field_2234.method_5700(); var3 != null; var3 = (class_51)this.field_2234.method_5702()) {
                  if(var2 != 205429833) {
                     throw new IllegalStateException();
                  }

                  var3.method_569(var1, -1846892157);
               }

               var1.field_319 += 1641196620496598251L;
               return;
            }

            if(var2 != 205429833) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: j (y) void
   public void method_3814(class_44 var1) {
      if(var1.field_9 == -7800373263393014969L * this.field_2233 && var1.field_319 * -8222609313489775677L == this.field_2231 * 2996578654687834529L) {
         for(class_51 var2 = (class_51)this.field_2234.method_5700(); var2 != null; var2 = (class_51)this.field_2234.method_5702()) {
            var2.method_569(var1, -1500926709);
         }

         var1.field_319 += 1641196620496598251L;
      } else {
         throw new RuntimeException("");
      }
   }

   // $FF: renamed from: f (nd) void
   void method_3815(Buffer var1) {
      this.field_2233 = var1.readLong() * -195396748607488393L;
      this.field_2231 = var1.readLong() * -7853368797710486943L;

      for(int var2 = var1.readUnsignedByte(); 0 != var2; var2 = var1.readUnsignedByte()) {
         Object var3;
         if(1 == var2) {
            class_53 var10000 = new class_53(this);
            var3 = var10000;
         } else if(var2 == 4) {
            class_56 var4 = new class_56(this);
            var3 = var4;
         } else if(var2 == 3) {
            class_54 var5 = new class_54(this);
            var3 = var5;
         } else if(var2 == 2) {
            class_52 var6 = new class_52(this);
            var3 = var6;
         } else {
            if(var2 != 5) {
               throw new RuntimeException("");
            }

            class_55 var7 = new class_55(this);
            var3 = var7;
         }

         ((class_51)var3).method_571(var1, -1561694336);
         this.field_2234.method_5697((class_27)var3);
      }

   }

   // $FF: renamed from: v (nd, int) void
   void method_3816(Buffer var1, int var2) {
      try {
         this.field_2233 = var1.readLong() * -195396748607488393L;
         this.field_2231 = var1.readLong() * -7853368797710486943L;

         for(int var3 = var1.readUnsignedByte(); 0 != var3; var3 = var1.readUnsignedByte()) {
            if(var2 == 1798909345) {
               throw new IllegalStateException();
            }

            Object var4;
            if(1 == var3) {
               class_53 var10000 = new class_53(this);
               var4 = var10000;
            } else if(var3 == 4) {
               class_56 var6 = new class_56(this);
               var4 = var6;
            } else if(var3 == 3) {
               if(var2 == 1798909345) {
                  throw new IllegalStateException();
               }

               class_54 var7 = new class_54(this);
               var4 = var7;
            } else if(var3 == 2) {
               if(var2 == 1798909345) {
                  throw new IllegalStateException();
               }

               class_52 var8 = new class_52(this);
               var4 = var8;
            } else {
               if(var3 != 5) {
                  throw new RuntimeException("");
               }

               if(var2 == 1798909345) {
                  throw new IllegalStateException();
               }

               class_55 var9 = new class_55(this);
               var4 = var9;
            }

            ((class_51)var4).method_571(var1, 68071115);
            this.field_2234.method_5697((class_27)var4);
         }

      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: p (nd) void
   void method_3817(Buffer var1) {
      this.field_2233 = var1.readLong() * -195396748607488393L;
      this.field_2231 = var1.readLong() * -7853368797710486943L;

      for(int var2 = var1.readUnsignedByte(); 0 != var2; var2 = var1.readUnsignedByte()) {
         Object var3;
         if(1 == var2) {
            class_53 var10000 = new class_53(this);
            var3 = var10000;
         } else if(var2 == 4) {
            class_56 var4 = new class_56(this);
            var3 = var4;
         } else if(var2 == 3) {
            class_54 var5 = new class_54(this);
            var3 = var5;
         } else if(var2 == 2) {
            class_52 var6 = new class_52(this);
            var3 = var6;
         } else {
            if(var2 != 5) {
               throw new RuntimeException("");
            }

            class_55 var7 = new class_55(this);
            var3 = var7;
         }

         ((class_51)var3).method_571(var1, -780437664);
         this.field_2234.method_5697((class_27)var3);
      }

   }

   // $FF: renamed from: y (nd) void
   void method_3818(Buffer var1) {
      this.field_2233 = var1.readLong() * -195396748607488393L;
      this.field_2231 = var1.readLong() * -7853368797710486943L;

      for(int var2 = var1.readUnsignedByte(); 0 != var2; var2 = var1.readUnsignedByte()) {
         Object var3;
         if(1 == var2) {
            class_53 var10000 = new class_53(this);
            var3 = var10000;
         } else if(var2 == 4) {
            class_56 var4 = new class_56(this);
            var3 = var4;
         } else if(var2 == 3) {
            class_54 var5 = new class_54(this);
            var3 = var5;
         } else if(var2 == 2) {
            class_52 var6 = new class_52(this);
            var3 = var6;
         } else {
            if(var2 != 5) {
               throw new RuntimeException("");
            }

            class_55 var7 = new class_55(this);
            var3 = var7;
         }

         ((class_51)var3).method_571(var1, -1134681264);
         this.field_2234.method_5697((class_27)var3);
      }

   }

   // $FF: renamed from: r (y) void
   public void method_3819(class_44 var1) {
      if(var1.field_9 == -7800373263393014969L * this.field_2233 && var1.field_319 * -8222609313489775677L == this.field_2231 * 2996578654687834529L) {
         for(class_51 var2 = (class_51)this.field_2234.method_5700(); var2 != null; var2 = (class_51)this.field_2234.method_5702()) {
            var2.method_569(var1, 1760144128);
         }

         var1.field_319 += 1641196620496598251L;
      } else {
         throw new RuntimeException("");
      }
   }

   // $FF: renamed from: h (bh, int) void
   public static final void method_3820(class_3 var0) {
      try {
         class_126.field_1372 = var0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }
}
