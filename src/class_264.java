
// $FF: renamed from: hn
public final class class_264 {

   // $FF: renamed from: y ko
   class_328 field_3030;
   // $FF: renamed from: n int
   int field_3031;
   // $FF: renamed from: f mr
   class_369 field_3032;
   // $FF: renamed from: v int
   int field_3033;
   // $FF: renamed from: p hh
   class_10 field_3034;


   // $FF: renamed from: d (long) java.lang.Object
   public Object method_5000(long var1) {
      class_62 var3 = (class_62)this.field_3032.method_6586(var1);
      if(var3 == null) {
         return null;
      } else {
         Object var4 = var3.method_644();
         if(var4 == null) {
            var3.method_108();
            var3.method_635();
            this.field_3031 += var3.field_481;
            return null;
         } else {
            if(var3.method_646()) {
               class_63 var10000 = new class_63;
               var10000.method_653(var4, var3.field_481);
               class_63 var5 = var10000;
               this.field_3032.method_6588(var5, var3.field_9);
               this.field_3030.method_5797(var5);
               var5.field_470 = 0L;
               var3.method_108();
               var3.method_635();
            } else {
               this.field_3030.method_5797(var3);
               var3.field_470 = 0L;
            }

            return var4;
         }
      }
   }

   // $FF: renamed from: <init> (int, int) void
   public void method_5001(int var1, int var2) {
      super();
      class_328 var10001 = new class_328;
      var10001.method_5803();
      this.field_3030 = var10001;
      this.field_3033 = var1;
      this.field_3031 = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
         ;
      }

      class_369 var4 = new class_369;
      var4.method_6590(var3);
      this.field_3032 = var4;
   }

   // $FF: renamed from: v (long) java.lang.Object
   public Object method_5002(long var1) {
      class_62 var3 = (class_62)this.field_3032.method_6586(var1);
      if(var3 == null) {
         return null;
      } else {
         Object var4 = var3.method_644();
         if(var4 == null) {
            var3.method_108();
            var3.method_635();
            this.field_3031 += var3.field_481;
            return null;
         } else {
            if(var3.method_646()) {
               class_63 var10000 = new class_63;
               var10000.method_653(var4, var3.field_481);
               class_63 var5 = var10000;
               this.field_3032.method_6588(var5, var3.field_9);
               this.field_3030.method_5797(var5);
               var5.field_470 = 0L;
               var3.method_108();
               var3.method_635();
            } else {
               this.field_3030.method_5797(var3);
               var3.field_470 = 0L;
            }

            return var4;
         }
      }
   }

   // $FF: renamed from: o (long) void
   void method_5003(long var1) {
      class_62 var3 = (class_62)this.field_3032.method_6586(var1);
      this.method_5009(var3);
   }

   // $FF: renamed from: p (java.lang.Object, long, int) void
   public void method_5004(Object var1, long var2, int var4) {
      if(var4 > this.field_3033) {
         throw new IllegalStateException();
      } else {
         this.method_5016(var2);
         this.field_3031 -= var4;

         while(this.field_3031 < 0) {
            class_62 var5 = (class_62)this.field_3030.method_5799();
            if(var5 == null) {
               throw new RuntimeException("");
            }

            if(!var5.method_646()) {
               ;
            }

            this.method_5009(var5);
            if(this.field_3034 != null) {
               this.field_3034.method_45(var5.method_644());
            }
         }

         class_63 var10000 = new class_63;
         var10000.method_653(var1, var4);
         class_63 var6 = var10000;
         this.field_3032.method_6588(var6, var2);
         this.field_3030.method_5797(var6);
         var6.field_470 = 0L;
      }
   }

   // $FF: renamed from: y (java.lang.Object, long) void
   public void method_5005(Object var1, long var2) {
      this.method_5004(var1, var2, 1);
   }

   // $FF: renamed from: e (he) void
   void method_5006(class_62 var1) {
      if(var1 != null) {
         var1.method_108();
         var1.method_635();
         this.field_3031 += var1.field_481;
      }

   }

   // $FF: renamed from: j (int) void
   public void method_5007(int var1) {
      for(class_62 var2 = (class_62)this.field_3030.method_5800(); var2 != null; var2 = (class_62)this.field_3030.method_5802()) {
         if(var2.method_646()) {
            if(var2.method_644() == null) {
               var2.method_108();
               var2.method_635();
               this.field_3031 += var2.field_481;
            }
         } else if(++var2.field_470 > (long)var1) {
            class_64 var10000 = new class_64;
            var10000.method_654(var2.method_644(), var2.field_481);
            class_64 var3 = var10000;
            this.field_3032.method_6588(var3, var2.field_9);
            class_328.method_5798(var3, var2);
            var2.method_108();
            var2.method_635();
         }
      }

   }

   // $FF: renamed from: r () void
   public void method_5008() {
      this.field_3030.method_5807();
      this.field_3032.method_6596();
      this.field_3031 = this.field_3033;
   }

   // $FF: renamed from: f (he) void
   void method_5009(class_62 var1) {
      if(var1 != null) {
         var1.method_108();
         var1.method_635();
         this.field_3031 += var1.field_481;
      }

   }

   // $FF: renamed from: b (long) java.lang.Object
   public Object method_5010(long var1) {
      class_62 var3 = (class_62)this.field_3032.method_6586(var1);
      if(var3 == null) {
         return null;
      } else {
         Object var4 = var3.method_644();
         if(var4 == null) {
            var3.method_108();
            var3.method_635();
            this.field_3031 += var3.field_481;
            return null;
         } else {
            if(var3.method_646()) {
               class_63 var10000 = new class_63;
               var10000.method_653(var4, var3.field_481);
               class_63 var5 = var10000;
               this.field_3032.method_6588(var5, var3.field_9);
               this.field_3030.method_5797(var5);
               var5.field_470 = 0L;
               var3.method_108();
               var3.method_635();
            } else {
               this.field_3030.method_5797(var3);
               var3.field_470 = 0L;
            }

            return var4;
         }
      }
   }

   // $FF: renamed from: s (long) void
   void method_5011(long var1) {
      class_62 var3 = (class_62)this.field_3032.method_6586(var1);
      this.method_5009(var3);
   }

   // $FF: renamed from: u (long) void
   void method_5012(long var1) {
      class_62 var3 = (class_62)this.field_3032.method_6586(var1);
      this.method_5009(var3);
   }

   // $FF: renamed from: l (long) void
   void method_5013(long var1) {
      class_62 var3 = (class_62)this.field_3032.method_6586(var1);
      this.method_5009(var3);
   }

   // $FF: renamed from: z (java.lang.Object, long) void
   public void method_5014(Object var1, long var2) {
      this.method_5004(var1, var2, 1);
   }

   // $FF: renamed from: c (long) void
   void method_5015(long var1) {
      class_62 var3 = (class_62)this.field_3032.method_6586(var1);
      this.method_5009(var3);
   }

   // $FF: renamed from: n (long) void
   void method_5016(long var1) {
      class_62 var3 = (class_62)this.field_3032.method_6586(var1);
      this.method_5009(var3);
   }

   // $FF: renamed from: g (he) void
   void method_5017(class_62 var1) {
      if(var1 != null) {
         var1.method_108();
         var1.method_635();
         this.field_3031 += var1.field_481;
      }

   }

   // $FF: renamed from: a (java.lang.Object, long) void
   public void method_5018(Object var1, long var2) {
      this.method_5004(var1, var2, 1);
   }

   // $FF: renamed from: k (java.lang.Object, long) void
   public void method_5019(Object var1, long var2) {
      this.method_5004(var1, var2, 1);
   }

   // $FF: renamed from: m (java.lang.Object, long) void
   public void method_5020(Object var1, long var2) {
      this.method_5004(var1, var2, 1);
   }

   // $FF: renamed from: x (java.lang.Object, long) void
   public void method_5021(Object var1, long var2) {
      this.method_5004(var1, var2, 1);
   }

   // $FF: renamed from: ae () void
   public void method_5022() {
      this.field_3030.method_5807();
      this.field_3032.method_6596();
      this.field_3031 = this.field_3033;
   }

   // $FF: renamed from: w (java.lang.Object, long, int) void
   public void method_5023(Object var1, long var2, int var4) {
      if(var4 > this.field_3033) {
         throw new IllegalStateException();
      } else {
         this.method_5016(var2);
         this.field_3031 -= var4;

         while(this.field_3031 < 0) {
            class_62 var5 = (class_62)this.field_3030.method_5799();
            if(var5 == null) {
               throw new RuntimeException("");
            }

            if(!var5.method_646()) {
               ;
            }

            this.method_5009(var5);
            if(this.field_3034 != null) {
               this.field_3034.method_45(var5.method_644());
            }
         }

         class_63 var10000 = new class_63;
         var10000.method_653(var1, var4);
         class_63 var6 = var10000;
         this.field_3032.method_6588(var6, var2);
         this.field_3030.method_5797(var6);
         var6.field_470 = 0L;
      }
   }

   // $FF: renamed from: t (java.lang.Object, long, int) void
   public void method_5024(Object var1, long var2, int var4) {
      if(var4 > this.field_3033) {
         throw new IllegalStateException();
      } else {
         this.method_5016(var2);
         this.field_3031 -= var4;

         while(this.field_3031 < 0) {
            class_62 var5 = (class_62)this.field_3030.method_5799();
            if(var5 == null) {
               throw new RuntimeException("");
            }

            if(!var5.method_646()) {
               ;
            }

            this.method_5009(var5);
            if(this.field_3034 != null) {
               this.field_3034.method_45(var5.method_644());
            }
         }

         class_63 var10000 = new class_63;
         var10000.method_653(var1, var4);
         class_63 var6 = var10000;
         this.field_3032.method_6588(var6, var2);
         this.field_3030.method_5797(var6);
         var6.field_470 = 0L;
      }
   }

   // $FF: renamed from: h (java.lang.Object, long, int) void
   public void method_5025(Object var1, long var2, int var4) {
      if(var4 > this.field_3033) {
         throw new IllegalStateException();
      } else {
         this.method_5016(var2);
         this.field_3031 -= var4;

         while(this.field_3031 < 0) {
            class_62 var5 = (class_62)this.field_3030.method_5799();
            if(var5 == null) {
               throw new RuntimeException("");
            }

            if(!var5.method_646()) {
               ;
            }

            this.method_5009(var5);
            if(this.field_3034 != null) {
               this.field_3034.method_45(var5.method_644());
            }
         }

         class_63 var10000 = new class_63;
         var10000.method_653(var1, var4);
         class_63 var6 = var10000;
         this.field_3032.method_6588(var6, var2);
         this.field_3030.method_5797(var6);
         var6.field_470 = 0L;
      }
   }

   // $FF: renamed from: <init> (int) void
   public void method_5026(int var1) {
      this.method_5001(var1, var1);
   }

   // $FF: renamed from: i () void
   public void method_5027() {
      this.field_3030.method_5807();
      this.field_3032.method_6596();
      this.field_3031 = this.field_3033;
   }

   // $FF: renamed from: q (int) void
   public void method_5028(int var1) {
      for(class_62 var2 = (class_62)this.field_3030.method_5800(); var2 != null; var2 = (class_62)this.field_3030.method_5802()) {
         if(var2.method_646()) {
            if(var2.method_644() == null) {
               var2.method_108();
               var2.method_635();
               this.field_3031 += var2.field_481;
            }
         } else if(++var2.field_470 > (long)var1) {
            class_64 var10000 = new class_64;
            var10000.method_654(var2.method_644(), var2.field_481);
            class_64 var3 = var10000;
            this.field_3032.method_6588(var3, var2.field_9);
            class_328.method_5798(var3, var2);
            var2.method_108();
            var2.method_635();
         }
      }

   }
}
