
// $FF: renamed from: de
public class class_193 extends class_191 {

   // $FF: renamed from: v long
   long field_2301;


   // $FF: renamed from: y () void
   public void method_3952() {
      this.field_2301 = System.nanoTime() * 4914803548099444557L;
   }

   // $FF: renamed from: v (int) void
   public void method_3950(int var1) {
      try {
         this.field_2301 = System.nanoTime() * 4914803548099444557L;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "de.v(" + ')');
      }
   }

   // $FF: renamed from: n (int, int, int) int
   public int method_3951(int var1, int var2, int var3) {
      try {
         long var4 = (long)var2 * 1000000L;
         long var6 = this.field_2301 * -87747295156547195L - System.nanoTime();
         if(var6 < var4) {
            if(var3 >= -1708422900) {
               throw new IllegalStateException();
            }

            var6 = var4;
         }

         long var8 = var6 / 1000000L;
         long var10;
         if(var8 <= 0L) {
            if(var3 >= -1708422900) {
               throw new IllegalStateException();
            }
         } else if(var8 % 10L == 0L) {
            var10 = var8 - 1L;

            try {
               Thread.sleep(var10);
            } catch (InterruptedException var15) {
               ;
            }

            try {
               Thread.sleep(1L);
            } catch (InterruptedException var14) {
               ;
            }
         } else {
            try {
               Thread.sleep(var8);
            } catch (InterruptedException var13) {
               ;
            }
         }

         var10 = System.nanoTime();

         int var12;
         for(var12 = 0; var12 < 10; this.field_2301 += 631052861300845888L * (long)var1) {
            if(var3 >= -1708422900) {
               throw new IllegalStateException();
            }

            if(var12 >= 1) {
               if(var3 >= -1708422900) {
                  throw new IllegalStateException();
               }

               if(this.field_2301 * -87747295156547195L >= var10) {
                  break;
               }

               if(var3 >= -1708422900) {
                  throw new IllegalStateException();
               }
            }

            ++var12;
         }

         if(this.field_2301 * -87747295156547195L < var10) {
            if(var3 >= -1708422900) {
               throw new IllegalStateException();
            }

            this.field_2301 = var10 * 4914803548099444557L;
         }

         return var12;
      } catch (RuntimeException var16) {
         throw class_223.method_4281(var16, "de.n(" + ')');
      }
   }

   // $FF: renamed from: f (int, int) int
   public int method_3953(int var1, int var2) {
      long var3 = (long)var2 * 1000000L;
      long var5 = this.field_2301 * -87747295156547195L - System.nanoTime();
      if(var5 < var3) {
         var5 = var3;
      }

      long var7 = var5 / 1000000L;
      long var9;
      if(var7 > 0L) {
         if(var7 % 10L == 0L) {
            var9 = var7 - 1L;

            try {
               Thread.sleep(var9);
            } catch (InterruptedException var14) {
               ;
            }

            try {
               Thread.sleep(1L);
            } catch (InterruptedException var13) {
               ;
            }
         } else {
            try {
               Thread.sleep(var7);
            } catch (InterruptedException var12) {
               ;
            }
         }
      }

      var9 = System.nanoTime();

      int var11;
      for(var11 = 0; var11 < 10 && (var11 < 1 || this.field_2301 * -87747295156547195L < var9); this.field_2301 += 631052861300845888L * (long)var1) {
         ++var11;
      }

      if(this.field_2301 * -87747295156547195L < var9) {
         this.field_2301 = var9 * 4914803548099444557L;
      }

      return var11;
   }

   // $FF: renamed from: <init> () void
   public void method_3949() {
      try {
         super.method_3949();
         this.field_2301 = System.nanoTime() * 4914803548099444557L;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "de.<init>(" + ')');
      }
   }

   // $FF: renamed from: p () void
   public void method_3954() {
      this.field_2301 = System.nanoTime() * 4914803548099444557L;
   }

   // $FF: renamed from: j () void
   public void method_3955() {
      this.field_2301 = System.nanoTime() * 4914803548099444557L;
   }
}
