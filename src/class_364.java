
// $FF: renamed from: md
public final class class_364 {

   // $FF: renamed from: f mw
   class_27 field_4079;
   // $FF: renamed from: v int
   int field_4080;
   // $FF: renamed from: n mw[]
   class_27[] field_4081;
   // $FF: renamed from: y mw
   class_27 field_4082;
   // $FF: renamed from: p int
   int field_4083;


   // $FF: renamed from: v (long) mw
   public class_27 method_6523(long var1) {
      class_27 var3 = this.field_4081[(int)(var1 & (long)(this.field_4080 - 1))];

      for(this.field_4079 = var3.field_10; this.field_4079 != var3; this.field_4079 = this.field_4079.field_10) {
         if(this.field_4079.field_9 == var1) {
            class_27 var4 = this.field_4079;
            this.field_4079 = this.field_4079.field_10;
            return var4;
         }
      }

      this.field_4079 = null;
      return null;
   }

   // $FF: renamed from: g () mw
   public class_27 method_6524() {
      this.field_4083 = 0;
      return this.method_6527();
   }

   // $FF: renamed from: n (mw, long) void
   public void method_6525(class_27 var1, long var2) {
      if(var1.field_11 != null) {
         var1.method_108();
      }

      class_27 var4 = this.field_4081[(int)(var2 & (long)(this.field_4080 - 1))];
      var1.field_11 = var4.field_11;
      var1.field_10 = var4;
      var1.field_11.field_10 = var1;
      var1.field_10.field_11 = var1;
      var1.field_9 = var2;
   }

   // $FF: renamed from: m () mw
   public class_27 method_6526() {
      this.field_4083 = 0;
      return this.method_6527();
   }

   // $FF: renamed from: y () mw
   public class_27 method_6527() {
      class_27 var1;
      if(this.field_4083 > 0 && this.field_4082 != this.field_4081[this.field_4083 - 1]) {
         var1 = this.field_4082;
         this.field_4082 = var1.field_10;
         return var1;
      } else {
         do {
            if(this.field_4083 >= this.field_4080) {
               return null;
            }

            var1 = this.field_4081[this.field_4083++].field_10;
         } while(var1 == this.field_4081[this.field_4083 - 1]);

         this.field_4082 = var1.field_10;
         return var1;
      }
   }

   // $FF: renamed from: p (long) mw
   public class_27 method_6528(long var1) {
      class_27 var3 = this.field_4081[(int)(var1 & (long)(this.field_4080 - 1))];

      for(this.field_4079 = var3.field_10; this.field_4079 != var3; this.field_4079 = this.field_4079.field_10) {
         if(this.field_4079.field_9 == var1) {
            class_27 var4 = this.field_4079;
            this.field_4079 = this.field_4079.field_10;
            return var4;
         }
      }

      this.field_4079 = null;
      return null;
   }

   // $FF: renamed from: j (long) mw
   public class_27 method_6529(long var1) {
      class_27 var3 = this.field_4081[(int)(var1 & (long)(this.field_4080 - 1))];

      for(this.field_4079 = var3.field_10; this.field_4079 != var3; this.field_4079 = this.field_4079.field_10) {
         if(this.field_4079.field_9 == var1) {
            class_27 var4 = this.field_4079;
            this.field_4079 = this.field_4079.field_10;
            return var4;
         }
      }

      this.field_4079 = null;
      return null;
   }

   // $FF: renamed from: u (mw, long) void
   public void method_6530(class_27 var1, long var2) {
      if(var1.field_11 != null) {
         var1.method_108();
      }

      class_27 var4 = this.field_4081[(int)(var2 & (long)(this.field_4080 - 1))];
      var1.field_11 = var4.field_11;
      var1.field_10 = var4;
      var1.field_11.field_10 = var1;
      var1.field_10.field_11 = var1;
      var1.field_9 = var2;
   }

   // $FF: renamed from: f () mw
   public class_27 method_6531() {
      this.field_4083 = 0;
      return this.method_6527();
   }

   // $FF: renamed from: d (long) mw
   public class_27 method_6532(long var1) {
      class_27 var3 = this.field_4081[(int)(var1 & (long)(this.field_4080 - 1))];

      for(this.field_4079 = var3.field_10; this.field_4079 != var3; this.field_4079 = this.field_4079.field_10) {
         if(this.field_4079.field_9 == var1) {
            class_27 var4 = this.field_4079;
            this.field_4079 = this.field_4079.field_10;
            return var4;
         }
      }

      this.field_4079 = null;
      return null;
   }

   // $FF: renamed from: s (long) mw
   public class_27 method_6533(long var1) {
      class_27 var3 = this.field_4081[(int)(var1 & (long)(this.field_4080 - 1))];

      for(this.field_4079 = var3.field_10; this.field_4079 != var3; this.field_4079 = this.field_4079.field_10) {
         if(this.field_4079.field_9 == var1) {
            class_27 var4 = this.field_4079;
            this.field_4079 = this.field_4079.field_10;
            return var4;
         }
      }

      this.field_4079 = null;
      return null;
   }

   // $FF: renamed from: t () mw
   public class_27 method_6534() {
      class_27 var1;
      if(this.field_4083 > 0 && this.field_4082 != this.field_4081[this.field_4083 - 1]) {
         var1 = this.field_4082;
         this.field_4082 = var1.field_10;
         return var1;
      } else {
         do {
            if(this.field_4083 >= this.field_4080) {
               return null;
            }

            var1 = this.field_4081[this.field_4083++].field_10;
         } while(var1 == this.field_4081[this.field_4083 - 1]);

         this.field_4082 = var1.field_10;
         return var1;
      }
   }

   // $FF: renamed from: l (mw, long) void
   public void method_6535(class_27 var1, long var2) {
      if(var1.field_11 != null) {
         var1.method_108();
      }

      class_27 var4 = this.field_4081[(int)(var2 & (long)(this.field_4080 - 1))];
      var1.field_11 = var4.field_11;
      var1.field_10 = var4;
      var1.field_11.field_10 = var1;
      var1.field_10.field_11 = var1;
      var1.field_9 = var2;
   }

   // $FF: renamed from: o (mw, long) void
   public void method_6536(class_27 var1, long var2) {
      if(var1.field_11 != null) {
         var1.method_108();
      }

      class_27 var4 = this.field_4081[(int)(var2 & (long)(this.field_4080 - 1))];
      var1.field_11 = var4.field_11;
      var1.field_10 = var4;
      var1.field_11.field_10 = var1;
      var1.field_10.field_11 = var1;
      var1.field_9 = var2;
   }

   // $FF: renamed from: c (mw, long) void
   public void method_6537(class_27 var1, long var2) {
      if(var1.field_11 != null) {
         var1.method_108();
      }

      class_27 var4 = this.field_4081[(int)(var2 & (long)(this.field_4080 - 1))];
      var1.field_11 = var4.field_11;
      var1.field_10 = var4;
      var1.field_11.field_10 = var1;
      var1.field_10.field_11 = var1;
      var1.field_9 = var2;
   }

   // $FF: renamed from: <init> (int) void
   public class_364(int var1) {
      super();
      this.field_4083 = 0;
      this.field_4080 = var1;
      this.field_4081 = new class_27[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class_27[] var10000 = this.field_4081;
         class_27 var10002 = new class_27();
         class_27 var3 = var10000[var2] = var10002;
         var3.field_10 = var3;
         var3.field_11 = var3;
      }

   }

   // $FF: renamed from: b (long) mw
   public class_27 method_6539(long var1) {
      class_27 var3 = this.field_4081[(int)(var1 & (long)(this.field_4080 - 1))];

      for(this.field_4079 = var3.field_10; this.field_4079 != var3; this.field_4079 = this.field_4079.field_10) {
         if(this.field_4079.field_9 == var1) {
            class_27 var4 = this.field_4079;
            this.field_4079 = this.field_4079.field_10;
            return var4;
         }
      }

      this.field_4079 = null;
      return null;
   }

   // $FF: renamed from: r (long) mw
   public class_27 method_6540(long var1) {
      class_27 var3 = this.field_4081[(int)(var1 & (long)(this.field_4080 - 1))];

      for(this.field_4079 = var3.field_10; this.field_4079 != var3; this.field_4079 = this.field_4079.field_10) {
         if(this.field_4079.field_9 == var1) {
            class_27 var4 = this.field_4079;
            this.field_4079 = this.field_4079.field_10;
            return var4;
         }
      }

      this.field_4079 = null;
      return null;
   }

   // $FF: renamed from: k () mw
   public class_27 method_6541() {
      this.field_4083 = 0;
      return this.method_6527();
   }

   // $FF: renamed from: e () mw
   public class_27 method_6542() {
      this.field_4083 = 0;
      return this.method_6527();
   }

   // $FF: renamed from: x () mw
   public class_27 method_6543() {
      class_27 var1;
      if(this.field_4083 > 0 && this.field_4082 != this.field_4081[this.field_4083 - 1]) {
         var1 = this.field_4082;
         this.field_4082 = var1.field_10;
         return var1;
      } else {
         do {
            if(this.field_4083 >= this.field_4080) {
               return null;
            }

            var1 = this.field_4081[this.field_4083++].field_10;
         } while(var1 == this.field_4081[this.field_4083 - 1]);

         this.field_4082 = var1.field_10;
         return var1;
      }
   }

   // $FF: renamed from: z () mw
   public class_27 method_6544() {
      class_27 var1;
      if(this.field_4083 > 0 && this.field_4082 != this.field_4081[this.field_4083 - 1]) {
         var1 = this.field_4082;
         this.field_4082 = var1.field_10;
         return var1;
      } else {
         do {
            if(this.field_4083 >= this.field_4080) {
               return null;
            }

            var1 = this.field_4081[this.field_4083++].field_10;
         } while(var1 == this.field_4081[this.field_4083 - 1]);

         this.field_4082 = var1.field_10;
         return var1;
      }
   }

   // $FF: renamed from: w () mw
   public class_27 method_6545() {
      class_27 var1;
      if(this.field_4083 > 0 && this.field_4082 != this.field_4081[this.field_4083 - 1]) {
         var1 = this.field_4082;
         this.field_4082 = var1.field_10;
         return var1;
      } else {
         do {
            if(this.field_4083 >= this.field_4080) {
               return null;
            }

            var1 = this.field_4081[this.field_4083++].field_10;
         } while(var1 == this.field_4081[this.field_4083 - 1]);

         this.field_4082 = var1.field_10;
         return var1;
      }
   }

   // $FF: renamed from: a () mw
   public class_27 method_6546() {
      this.field_4083 = 0;
      return this.method_6527();
   }

   // $FF: renamed from: h () mw
   public class_27 method_6547() {
      class_27 var1;
      if(this.field_4083 > 0 && this.field_4082 != this.field_4081[this.field_4083 - 1]) {
         var1 = this.field_4082;
         this.field_4082 = var1.field_10;
         return var1;
      } else {
         do {
            if(this.field_4083 >= this.field_4080) {
               return null;
            }

            var1 = this.field_4081[this.field_4083++].field_10;
         } while(var1 == this.field_4081[this.field_4083 - 1]);

         this.field_4082 = var1.field_10;
         return var1;
      }
   }
}
