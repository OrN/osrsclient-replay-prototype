
// $FF: renamed from: cb
public class class_163 implements Runnable {

   // $FF: renamed from: y int[]
   int[] field_2026;
   // $FF: renamed from: n java.lang.Object
   Object field_2027;
   // $FF: renamed from: f int
   int field_2028;
   // $FF: renamed from: j long[]
   long[] field_2029;
   // $FF: renamed from: p int[]
   int[] field_2030;
   // $FF: renamed from: v boolean
   boolean field_2031;
   // $FF: renamed from: q int
   static final int field_2032 = 26;
   // $FF: renamed from: ak int
   static final int field_2033 = 57;
   // $FF: renamed from: ri bd
   static class_139 field_2034;


   public void run() {
      try {
         while(this.field_2031) {
            Object var1 = this.field_2027;
            synchronized(this.field_2027) {
               if(-1046460859 * this.field_2028 < 500) {
                  this.field_2026[-1046460859 * this.field_2028] = -678881683 * class_131.field_1722;
                  this.field_2030[this.field_2028 * -1046460859] = 1903378733 * class_131.field_1703;
                  this.field_2029[this.field_2028 * -1046460859] = -7947308061041944289L * class_131.field_1712;
                  this.field_2028 += 492756109;
               }
            }

            long var8 = 49L;

            try {
               Thread.sleep(var8);
            } catch (InterruptedException var5) {
               ;
            }

            try {
               Thread.sleep(1L);
            } catch (InterruptedException var4) {
               ;
            }
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "cb.run(" + ')');
      }
   }

   // $FF: renamed from: y (int) em[]
   static class_212[] method_3418(int var0) {
      try {
         return new class_212[]{class_212.field_2435, class_212.field_2432, class_212.field_2433};
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "cb.y(" + ')');
      }
   }

   // $FF: renamed from: by () void
   public void method_3419() {
      while(this.field_2031) {
         Object var1 = this.field_2027;
         synchronized(this.field_2027) {
            if(-1046460859 * this.field_2028 < 500) {
               this.field_2026[-1046460859 * this.field_2028] = -678881683 * class_131.field_1722;
               this.field_2030[this.field_2028 * -1046460859] = 1903378733 * class_131.field_1703;
               this.field_2029[this.field_2028 * -1046460859] = -7947308061041944289L * class_131.field_1712;
               this.field_2028 += 492756109;
            }
         }

         long var7 = 49L;

         try {
            Thread.sleep(var7);
         } catch (InterruptedException var5) {
            ;
         }

         try {
            Thread.sleep(1L);
         } catch (InterruptedException var4) {
            ;
         }
      }

   }

   // $FF: renamed from: bc () void
   public void method_3420() {
      while(this.field_2031) {
         Object var1 = this.field_2027;
         synchronized(this.field_2027) {
            if(-1046460859 * this.field_2028 < 376033378) {
               this.field_2026[-1046460859 * this.field_2028] = -70668678 * class_131.field_1722;
               this.field_2030[this.field_2028 * -1046460859] = -1464003718 * class_131.field_1703;
               this.field_2029[this.field_2028 * -1250628805] = -7947308061041944289L * class_131.field_1712;
               this.field_2028 += -712106700;
            }
         }

         long var7 = 49L;

         try {
            Thread.sleep(var7);
         } catch (InterruptedException var5) {
            ;
         }

         try {
            Thread.sleep(1L);
         } catch (InterruptedException var4) {
            ;
         }
      }

   }

   // $FF: renamed from: il (int, int) java.lang.String
   static String method_3421(int var0, int var1) {
      try {
         if(var0 < 0) {
            return "";
         } else if(client.field_1560[var0].length() > 0) {
            if(var1 >= 990546621) {
               throw new IllegalStateException();
            } else {
               return client.field_1631[var0] + class_305.field_3566 + client.field_1560[var0];
            }
         } else {
            return client.field_1631[var0];
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "cb.il(" + ')');
      }
   }

   // $FF: renamed from: p (int, int, int, int) void
   static final void method_3422(int var0, int var1, int var2, int var3) {
      try {
         int var4;
         for(var4 = 0; var4 < 8; ++var4) {
            if(var3 == 1551757290) {
               throw new IllegalStateException();
            }

            for(int var5 = 0; var5 < 8; ++var5) {
               if(var3 == 1551757290) {
                  throw new IllegalStateException();
               }

               class_166.field_2078[var0][var4 + var1][var5 + var2] = 0;
            }
         }

         if(var1 > 0) {
            if(var3 == 1551757290) {
               throw new IllegalStateException();
            }

            for(var4 = 1; var4 < 8; ++var4) {
               if(var3 == 1551757290) {
                  throw new IllegalStateException();
               }

               class_166.field_2078[var0][var1][var4 + var2] = class_166.field_2078[var0][var1 - 1][var4 + var2];
            }
         }

         if(var2 > 0) {
            if(var3 == 1551757290) {
               throw new IllegalStateException();
            }

            for(var4 = 1; var4 < 8; ++var4) {
               if(var3 == 1551757290) {
                  throw new IllegalStateException();
               }

               class_166.field_2078[var0][var4 + var1][var2] = class_166.field_2078[var0][var1 + var4][var2 - 1];
            }
         }

         if(var1 > 0) {
            if(var3 == 1551757290) {
               throw new IllegalStateException();
            }

            if(class_166.field_2078[var0][var1 - 1][var2] != 0) {
               if(var3 == 1551757290) {
                  throw new IllegalStateException();
               }

               class_166.field_2078[var0][var1][var2] = class_166.field_2078[var0][var1 - 1][var2];
               return;
            }
         }

         if(var2 > 0) {
            if(var3 == 1551757290) {
               throw new IllegalStateException();
            }

            if(class_166.field_2078[var0][var1][var2 - 1] != 0) {
               if(var3 == 1551757290) {
                  throw new IllegalStateException();
               }

               class_166.field_2078[var0][var1][var2] = class_166.field_2078[var0][var1][var2 - 1];
               return;
            }
         }

         if(var1 > 0) {
            if(var3 == 1551757290) {
               throw new IllegalStateException();
            }

            if(var2 > 0) {
               if(var3 == 1551757290) {
                  throw new IllegalStateException();
               }

               if(class_166.field_2078[var0][var1 - 1][var2 - 1] != 0) {
                  if(var3 == 1551757290) {
                     throw new IllegalStateException();
                  }

                  class_166.field_2078[var0][var1][var2] = class_166.field_2078[var0][var1 - 1][var2 - 1];
               }
            }
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "cb.p(" + ')');
      }
   }

   // $FF: renamed from: kc (int) void
   static final void method_3423(int var0) {
      try {
         class_362.method_6317((byte)1);
         if(null != class_233.field_2617) {
            if(var0 <= -26460885) {
               throw new IllegalStateException();
            }

            class_233.field_2617.method_6160(1091935656);
         }

      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "cb.kc(" + ')');
      }
   }

   // $FF: renamed from: <init> () void
   void method_3424() {
      try {
         super();
         this.field_2031 = true;
         this.field_2027 = new Object();
         this.field_2028 = 0;
         this.field_2026 = new int[500];
         this.field_2030 = new int[500];
         this.field_2029 = new long[500];
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "cb.<init>(" + ')');
      }
   }
}
