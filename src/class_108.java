
// $FF: renamed from: ay
public class class_108 extends class_104 {

   // $FF: renamed from: y int
   int field_1257;
   // $FF: renamed from: n kx
   class_335 field_1258;
   // $FF: renamed from: f int
   int field_1259;
   // $FF: renamed from: v kx
   class_335 field_1260;


   // $FF: renamed from: am (int) void
   public final synchronized void method_1948(int var1) {
      do {
         if(this.field_1257 < 0) {
            this.method_2204(var1);
            return;
         }

         if(this.field_1259 + var1 < this.field_1257) {
            this.field_1259 += var1;
            this.method_2204(var1);
            return;
         }

         int var2 = this.field_1257 - this.field_1259;
         this.method_2204(var2);
         var1 -= var2;
         this.field_1259 += var2;
         this.method_2209();
         class_102 var3 = (class_102)this.field_1258.method_5944();
         synchronized(var3) {
            int var5 = var3.method_1914(this);
            if(var5 < 0) {
               var3.field_1187 = 0;
               this.method_2200(var3);
            } else {
               var3.field_1187 = var5;
               this.method_2201(var3.field_10, var3);
            }
         }
      } while(var1 != 0);

   }

   // $FF: renamed from: v (bm) void
   public final synchronized void method_2198(class_104 var1) {
      this.field_1260.method_5970(var1);
   }

   // $FF: renamed from: n (bm) void
   public final synchronized void method_2199(class_104 var1) {
      var1.method_108();
   }

   // $FF: renamed from: ae () bm
   protected class_104 method_1939() {
      return (class_104)this.field_1260.method_5944();
   }

   // $FF: renamed from: j () bm
   protected class_104 method_1931() {
      return (class_104)this.field_1260.method_5944();
   }

   // $FF: renamed from: p (bf) void
   void method_2200(class_102 var1) {
      var1.method_108();
      var1.method_1913();
      class_27 var2 = this.field_1258.field_3875.field_10;
      if(var2 == this.field_1258.field_3875) {
         this.field_1257 = -1;
      } else {
         this.field_1257 = ((class_102)var2).field_1187;
      }

   }

   // $FF: renamed from: y (mw, bf) void
   void method_2201(class_27 var1, class_102 var2) {
      while(var1 != this.field_1258.field_3875 && ((class_102)var1).field_1187 <= var2.field_1187) {
         var1 = var1.field_10;
      }

      class_335.method_5941(var2, var1);
      this.field_1257 = ((class_102)this.field_1258.field_3875.field_10).field_1187;
   }

   // $FF: renamed from: r () bm
   protected class_104 method_1947() {
      return (class_104)this.field_1260.method_5972();
   }

   // $FF: renamed from: b () int
   protected int method_1935() {
      return 0;
   }

   // $FF: renamed from: u (int) void
   public final synchronized void method_1933(int var1) {
      do {
         if(this.field_1257 < 0) {
            this.method_2204(var1);
            return;
         }

         if(this.field_1259 + var1 < this.field_1257) {
            this.field_1259 += var1;
            this.method_2204(var1);
            return;
         }

         int var2 = this.field_1257 - this.field_1259;
         this.method_2204(var2);
         var1 -= var2;
         this.field_1259 += var2;
         this.method_2209();
         class_102 var3 = (class_102)this.field_1258.method_5944();
         synchronized(var3) {
            int var5 = var3.method_1914(this);
            if(var5 < 0) {
               var3.field_1187 = 0;
               this.method_2200(var3);
            } else {
               var3.field_1187 = var5;
               this.method_2201(var3.field_10, var3);
            }
         }
      } while(var1 != 0);

   }

   // $FF: renamed from: l (int) void
   void method_2204(int var1) {
      for(class_104 var2 = (class_104)this.field_1260.method_5944(); var2 != null; var2 = (class_104)this.field_1260.method_5972()) {
         var2.method_1933(var1);
      }

   }

   // $FF: renamed from: <init> () void
   public class_108() {
      super();
      class_335 var10001 = new class_335();
      this.field_1260 = var10001;
      var10001 = new class_335();
      this.field_1258 = var10001;
      this.field_1259 = 0;
      this.field_1257 = -1;
   }

   // $FF: renamed from: f () void
   void method_2209() {
      if(this.field_1259 > 0) {
         for(class_102 var1 = (class_102)this.field_1258.method_5944(); var1 != null; var1 = (class_102)this.field_1258.method_5972()) {
            var1.field_1187 -= this.field_1259;
         }

         this.field_1257 -= this.field_1259;
         this.field_1259 = 0;
      }

   }

   // $FF: renamed from: s (int[], int, int) void
   void method_2214(int[] var1, int var2, int var3) {
      for(class_104 var4 = (class_104)this.field_1260.method_5944(); var4 != null; var4 = (class_104)this.field_1260.method_5972()) {
         var4.method_1936(var1, var2, var3);
      }

   }

   // $FF: renamed from: q () bm
   protected class_104 method_1938() {
      return (class_104)this.field_1260.method_5944();
   }

   // $FF: renamed from: ar (int[], int, int) void
   public final synchronized void method_1946(int[] var1, int var2, int var3) {
      do {
         if(this.field_1257 < 0) {
            this.method_2214(var1, var2, var3);
            return;
         }

         if(this.field_1259 + var3 < this.field_1257) {
            this.field_1259 += var3;
            this.method_2214(var1, var2, var3);
            return;
         }

         int var4 = this.field_1257 - this.field_1259;
         this.method_2214(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field_1259 += var4;
         this.method_2209();
         class_102 var5 = (class_102)this.field_1258.method_5944();
         synchronized(var5) {
            int var7 = var5.method_1914(this);
            if(var7 < 0) {
               var5.field_1187 = 0;
               this.method_2200(var5);
            } else {
               var5.field_1187 = var7;
               this.method_2201(var5.field_10, var5);
            }
         }
      } while(var3 != 0);

   }

   // $FF: renamed from: ap () bm
   protected class_104 method_1934() {
      return (class_104)this.field_1260.method_5972();
   }

   // $FF: renamed from: ab () int
   protected int method_1942() {
      return 0;
   }

   // $FF: renamed from: i () bm
   protected class_104 method_1937() {
      return (class_104)this.field_1260.method_5944();
   }

   // $FF: renamed from: ad () int
   protected int method_1944() {
      return 0;
   }

   // $FF: renamed from: az (int) void
   public final synchronized void method_1949(int var1) {
      do {
         if(this.field_1257 < 0) {
            this.method_2204(var1);
            return;
         }

         if(this.field_1259 + var1 < this.field_1257) {
            this.field_1259 += var1;
            this.method_2204(var1);
            return;
         }

         int var2 = this.field_1257 - this.field_1259;
         this.method_2204(var2);
         var1 -= var2;
         this.field_1259 += var2;
         this.method_2209();
         class_102 var3 = (class_102)this.field_1258.method_5944();
         synchronized(var3) {
            int var5 = var3.method_1914(this);
            if(var5 < 0) {
               var3.field_1187 = 0;
               this.method_2200(var3);
            } else {
               var3.field_1187 = var5;
               this.method_2201(var3.field_10, var3);
            }
         }
      } while(var1 != 0);

   }

   // $FF: renamed from: ai (int[], int, int) void
   public final synchronized void method_1945(int[] var1, int var2, int var3) {
      do {
         if(this.field_1257 < 0) {
            this.method_2214(var1, var2, var3);
            return;
         }

         if(this.field_1259 + var3 < this.field_1257) {
            this.field_1259 += var3;
            this.method_2214(var1, var2, var3);
            return;
         }

         int var4 = this.field_1257 - this.field_1259;
         this.method_2214(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field_1259 += var4;
         this.method_2209();
         class_102 var5 = (class_102)this.field_1258.method_5944();
         synchronized(var5) {
            int var7 = var5.method_1914(this);
            if(var7 < 0) {
               var5.field_1187 = 0;
               this.method_2200(var5);
            } else {
               var5.field_1187 = var7;
               this.method_2201(var5.field_10, var5);
            }
         }
      } while(var3 != 0);

   }

   // $FF: renamed from: aj (int) void
   public final synchronized void method_1950(int var1) {
      do {
         if(this.field_1257 < 0) {
            this.method_2204(var1);
            return;
         }

         if(this.field_1259 + var1 < this.field_1257) {
            this.field_1259 += var1;
            this.method_2204(var1);
            return;
         }

         int var2 = this.field_1257 - this.field_1259;
         this.method_2204(var2);
         var1 -= var2;
         this.field_1259 += var2;
         this.method_2209();
         class_102 var3 = (class_102)this.field_1258.method_5944();
         synchronized(var3) {
            int var5 = var3.method_1914(this);
            if(var5 < 0) {
               var3.field_1187 = 0;
               this.method_2200(var3);
            } else {
               var3.field_1187 = var5;
               this.method_2201(var3.field_10, var3);
            }
         }
      } while(var1 != 0);

   }

   // $FF: renamed from: d (int[], int, int) void
   public final synchronized void method_1943(int[] var1, int var2, int var3) {
      do {
         if(this.field_1257 < 0) {
            this.method_2214(var1, var2, var3);
            return;
         }

         if(this.field_1259 + var3 < this.field_1257) {
            this.field_1259 += var3;
            this.method_2214(var1, var2, var3);
            return;
         }

         int var4 = this.field_1257 - this.field_1259;
         this.method_2214(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field_1259 += var4;
         this.method_2209();
         class_102 var5 = (class_102)this.field_1258.method_5944();
         synchronized(var5) {
            int var7 = var5.method_1914(this);
            if(var7 < 0) {
               var5.field_1187 = 0;
               this.method_2200(var5);
            } else {
               var5.field_1187 = var7;
               this.method_2201(var5.field_10, var5);
            }
         }
      } while(var3 != 0);

   }

   // $FF: renamed from: al () int
   protected int method_1941() {
      return 0;
   }

}
