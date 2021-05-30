import java.util.Iterator;

// $FF: renamed from: mj
public class class_366 implements Iterator {

   // $FF: renamed from: v mr
   class_369 field_4091;
   // $FF: renamed from: n mw
   class_27 field_4092;
   // $FF: renamed from: f int
   int field_4093;
   // $FF: renamed from: y mw
   class_27 field_4094;


   // $FF: renamed from: n () void
   void method_6554() {
      this.field_4092 = this.field_4091.field_4098[0].field_10;
      this.field_4093 = 1;
      this.field_4094 = null;
   }

   // $FF: renamed from: v () void
   void method_6555() {
      this.field_4092 = this.field_4091.field_4098[0].field_10;
      this.field_4093 = 1;
      this.field_4094 = null;
   }

   // $FF: renamed from: e () void
   public void method_6556() {
      if(this.field_4094 == null) {
         throw new IllegalStateException();
      } else {
         this.field_4094.method_108();
         this.field_4094 = null;
      }
   }

   public boolean hasNext() {
      if(this.field_4092 != this.field_4091.field_4098[this.field_4093 - 1]) {
         return true;
      } else {
         while(this.field_4093 < this.field_4091.field_4099) {
            if(this.field_4091.field_4098[this.field_4093++].field_10 != this.field_4091.field_4098[this.field_4093 - 1]) {
               this.field_4092 = this.field_4091.field_4098[this.field_4093 - 1].field_10;
               return true;
            }

            this.field_4092 = this.field_4091.field_4098[this.field_4093 - 1];
         }

         return false;
      }
   }

   public void remove() {
      if(this.field_4094 == null) {
         throw new IllegalStateException();
      } else {
         this.field_4094.method_108();
         this.field_4094 = null;
      }
   }

   // $FF: renamed from: b () java.lang.Object
   public Object method_6557() {
      class_27 var1;
      if(this.field_4092 != this.field_4091.field_4098[this.field_4093 - 1]) {
         var1 = this.field_4092;
         this.field_4092 = var1.field_10;
         this.field_4094 = var1;
         return var1;
      } else {
         do {
            if(this.field_4093 >= this.field_4091.field_4099) {
               return null;
            }

            var1 = this.field_4091.field_4098[this.field_4093++].field_10;
         } while(var1 == this.field_4091.field_4098[this.field_4093 - 1]);

         this.field_4092 = var1.field_10;
         this.field_4094 = var1;
         return var1;
      }
   }

   public Object next() {
      class_27 var1;
      if(this.field_4092 != this.field_4091.field_4098[this.field_4093 - 1]) {
         var1 = this.field_4092;
         this.field_4092 = var1.field_10;
         this.field_4094 = var1;
         return var1;
      } else {
         do {
            if(this.field_4093 >= this.field_4091.field_4099) {
               return null;
            }

            var1 = this.field_4091.field_4098[this.field_4093++].field_10;
         } while(var1 == this.field_4091.field_4098[this.field_4093 - 1]);

         this.field_4092 = var1.field_10;
         this.field_4094 = var1;
         return var1;
      }
   }

   // $FF: renamed from: s () java.lang.Object
   public Object method_6558() {
      class_27 var1;
      if(this.field_4092 != this.field_4091.field_4098[this.field_4093 - 1]) {
         var1 = this.field_4092;
         this.field_4092 = var1.field_10;
         this.field_4094 = var1;
         return var1;
      } else {
         do {
            if(this.field_4093 >= this.field_4091.field_4099) {
               return null;
            }

            var1 = this.field_4091.field_4098[this.field_4093++].field_10;
         } while(var1 == this.field_4091.field_4098[this.field_4093 - 1]);

         this.field_4092 = var1.field_10;
         this.field_4094 = var1;
         return var1;
      }
   }

   // $FF: renamed from: u () java.lang.Object
   public Object method_6559() {
      class_27 var1;
      if(this.field_4092 != this.field_4091.field_4098[this.field_4093 - 1]) {
         var1 = this.field_4092;
         this.field_4092 = var1.field_10;
         this.field_4094 = var1;
         return var1;
      } else {
         do {
            if(this.field_4093 >= this.field_4091.field_4099) {
               return null;
            }

            var1 = this.field_4091.field_4098[this.field_4093++].field_10;
         } while(var1 == this.field_4091.field_4098[this.field_4093 - 1]);

         this.field_4092 = var1.field_10;
         this.field_4094 = var1;
         return var1;
      }
   }

   // $FF: renamed from: <init> (mr) void
   void method_6560(class_369 var1) {
      super();
      this.field_4094 = null;
      this.field_4091 = var1;
      this.method_6555();
   }

   // $FF: renamed from: o () boolean
   public boolean method_6561() {
      if(this.field_4092 != this.field_4091.field_4098[this.field_4093 - 1]) {
         return true;
      } else {
         while(this.field_4093 < this.field_4091.field_4099) {
            if(this.field_4091.field_4098[this.field_4093++].field_10 != this.field_4091.field_4098[this.field_4093 - 1]) {
               this.field_4092 = this.field_4091.field_4098[this.field_4093 - 1].field_10;
               return true;
            }

            this.field_4092 = this.field_4091.field_4098[this.field_4093 - 1];
         }

         return false;
      }
   }

   // $FF: renamed from: c () boolean
   public boolean method_6562() {
      if(this.field_4092 != this.field_4091.field_4098[this.field_4093 - 1]) {
         return true;
      } else {
         while(this.field_4093 < this.field_4091.field_4099) {
            if(this.field_4091.field_4098[this.field_4093++].field_10 != this.field_4091.field_4098[this.field_4093 - 1]) {
               this.field_4092 = this.field_4091.field_4098[this.field_4093 - 1].field_10;
               return true;
            }

            this.field_4092 = this.field_4091.field_4098[this.field_4093 - 1];
         }

         return false;
      }
   }

   // $FF: renamed from: l () boolean
   public boolean method_6563() {
      if(this.field_4092 != this.field_4091.field_4098[this.field_4093 - 1]) {
         return true;
      } else {
         while(this.field_4093 < this.field_4091.field_4099) {
            if(this.field_4091.field_4098[this.field_4093++].field_10 != this.field_4091.field_4098[this.field_4093 - 1]) {
               this.field_4092 = this.field_4091.field_4098[this.field_4093 - 1].field_10;
               return true;
            }

            this.field_4092 = this.field_4091.field_4098[this.field_4093 - 1];
         }

         return false;
      }
   }

   // $FF: renamed from: g () void
   public void method_6564() {
      if(this.field_4094 == null) {
         throw new IllegalStateException();
      } else {
         this.field_4094.method_108();
         this.field_4094 = null;
      }
   }

   // $FF: renamed from: d () java.lang.Object
   public Object method_6565() {
      class_27 var1;
      if(this.field_4092 != this.field_4091.field_4098[this.field_4093 - 1]) {
         var1 = this.field_4092;
         this.field_4092 = var1.field_10;
         this.field_4094 = var1;
         return var1;
      } else {
         do {
            if(this.field_4093 >= this.field_4091.field_4099) {
               return null;
            }

            var1 = this.field_4091.field_4098[this.field_4093++].field_10;
         } while(var1 == this.field_4091.field_4098[this.field_4093 - 1]);

         this.field_4092 = var1.field_10;
         this.field_4094 = var1;
         return var1;
      }
   }

   // $FF: renamed from: a () void
   public void method_6566() {
      if(this.field_4094 == null) {
         throw new IllegalStateException();
      } else {
         this.field_4094.method_108();
         this.field_4094 = null;
      }
   }
}
