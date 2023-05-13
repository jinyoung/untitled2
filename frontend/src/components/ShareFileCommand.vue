<template>

    <v-card outlined>
        <v-card-title>
            ShareFile
        </v-card-title>

        <v-card-text>
            <string offline label="FileId" v-model="value.fileId" :editMode="editMode" @change="change"/>
            <string offline label="FileAccess" v-model="value.fileAccess" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="shareFile"
            >
                ShareFile
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'ShareFileCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.fileId = {};
            this.value.fileAccess = {};
        },
        watch: {
        },
        methods: {
            shareFile() {
                this.$emit('shareFile', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

